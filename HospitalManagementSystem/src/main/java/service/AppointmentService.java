package service;

import dbConnection.*;
import mobel.Appointment;
import java.sql.*;

public class AppointmentService {
    public void scheduleAppointment(Appointment appointment) {
        String sql = "INSERT INTO appointments(patient_id, staff_id, datetime) VALUES(?, ?, ?)";
        try (Connection conn = Dbconnection.getCon();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, appointment.getPatientId());
            stmt.setInt(2, appointment.getStaffId());
            stmt.setString(3, appointment.getDateTime().toString());
            stmt.executeUpdate();
            System.out.println("Appointment scheduled successfully.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
