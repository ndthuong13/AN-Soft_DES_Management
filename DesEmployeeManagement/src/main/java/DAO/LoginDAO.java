/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author van46
 */
import Encrypt.DES;
import GUI.LoginAdmin.Session;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utils.DataBaseConnection;

public class LoginDAO {

    private static final String SECRET_KEY = "ansecure"; // khóa DES

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            // khởi tạo connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ansoft_employee_db", "root", "123456789");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return conn;
    }

    public boolean login(String username, String password) {
        String encryptedPassword = DES.encrypt(password, SECRET_KEY);
        String sql = "SELECT * FROM users WHERE username=? AND password=?";

        try (Connection conn = DataBaseConnection.getConnection()) {
            if (conn == null) {
                JOptionPane.showMessageDialog(null, "Không thể kết nối cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, username);
                stmt.setString(2, encryptedPassword);

                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    Session.isLoggedIn = true;
                    return true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi truy vấn cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
        Session.isLoggedIn = false;
        return false;
    }

//    public boolean login(String username, String password) {
//        String encryptedPassword = DES.encrypt(password, SECRET_KEY);
//        String sql = "SELECT * FROM users WHERE username=? AND password=?";
//
//        try (Connection conn = DataBaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
//
//            stmt.setString(1, username);
//            stmt.setString(2, encryptedPassword);
//
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                Session.isLoggedIn = true;
//                return true;
//            }
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Không thể kết nối cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
//            return false;
//        }
//        Session.isLoggedIn = false;
//        return false;
//    }
}
