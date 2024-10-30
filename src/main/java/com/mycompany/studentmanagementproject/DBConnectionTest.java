
package com.mycompany.studentmanagementproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_management_system";
        String user = "root";
        String password = "afreen@123!";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Optional
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");
            connection.close();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
        }
    }
}
