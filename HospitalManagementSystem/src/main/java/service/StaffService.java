package service;

import dbConnection.*;
import mobel.Staff;
import java.sql.*;

public class StaffService {
    public void addStaff(Staff staff) {
        String sql = "INSERT INTO staff(name, role) VALUES(?, ?)";
        try (Connection conn = Dbconnection.getCon();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, staff.getName());
            stmt.setString(2, staff.getRole());
            stmt.executeUpdate();
            System.out.println("Staff added successfully.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
