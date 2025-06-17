/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author van46
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import model.Employee;
import java.util.ArrayList;
import java.util.List;
import utils.DataBaseConnection;

public class EmployeeDAO {

    private static final List<Employee> employees = new ArrayList<>();
    private static int currentId = 1;

    public static boolean addEmployee(Employee emp) {
        String sql = "INSERT INTO employees(full_name, position, department, salary, encrypted_data, secret_key) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DataBaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, emp.getFullName());
            stmt.setString(2, emp.getPosition());
            stmt.setString(3, emp.getDepartment());
            stmt.setDouble(4, emp.getSalary());
            stmt.setString(5, emp.getEncryptedData());
            stmt.setString(6, emp.getSecret_key());  

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;  // trả về true nếu thêm thành công
        } catch (SQLException e) {
            e.printStackTrace();  // hoặc dùng Logger
            return false;
        }
    }

    public static List<Employee> getAllEmployees() {
        
        List<Employee> list = new ArrayList<>();
        try (Connection conn = DataBaseConnection.getConnection(); 
                Statement stmt = conn.createStatement();     
                ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {
         
            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getInt("id"),
                        rs.getString("full_name"),
                        rs.getString("position"),
                        rs.getString("department"),
                        rs.getDouble("salary"),
                        rs.getString("encrypted_data"),
                        rs.getString("secret_key")
                );
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static boolean deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection(); 
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateEmployee(Employee emp) {
        String sql = "UPDATE employees SET full_name = ?, position = ?, department = ?, salary = ?, encrypted_data = ? WHERE id = ?";

        try (Connection conn = DataBaseConnection.getConnection(); 
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, emp.getFullName());
            stmt.setString(2, emp.getPosition());
            stmt.setString(3, emp.getDepartment());
            stmt.setDouble(4, emp.getSalary());
            stmt.setString(5, emp.getEncryptedData());
            stmt.setInt(6, emp.getId()); // Cập nhật theo id

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
