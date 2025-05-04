package service;

import dbConnection.*;
import mobel.*;
import java.sql.*;

public class PatientService {
    public void addPatient(Patient patient) {
        String sql = "INSERT INTO patient(id,name, age, gender) VALUES(?,?,?,?)";
        try (Connection conn = Dbconnection.getCon();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(2, patient.getName());
            stmt.setInt(3, patient.getAge());
            stmt.setString(4, patient.getGender());
            stmt.setInt(1, patient.getId());
            stmt.executeUpdate();
            System.out.println("Patient added successfully.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
