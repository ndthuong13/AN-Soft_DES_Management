    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author van46
 */
import java.sql.*;
import utils.DataBaseConnection;

public class AdminController {
    public static boolean insertNewAdmin(String username, String encryptedPassword, String role, String secret_key) {
        try (Connection conn = DataBaseConnection.getConnection()) {
            String sql = "INSERT INTO users (username, password, role, secret_key) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, encryptedPassword);
            stmt.setString(3, role);
            stmt.setString(4, secret_key);
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            System.err.println("Insert failed: " + e.getMessage());
            return false;
        }
    }
}
