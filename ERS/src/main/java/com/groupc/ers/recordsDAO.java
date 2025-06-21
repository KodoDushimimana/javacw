/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.groupc.ers;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.hsqldb.rights.User;

/**
 *
 * @author micheal
 */

 public class recordsDAO {

    private Connection conn;

    public recordsDAO() {
        conn = DBConnection.getConnection();
        if (conn == null) {
            throw new IllegalStateException("Database connection failed.");
        }
    }

    // Create
    public boolean addRecord(String registrationId, String studentName, String faculty, String projectTitle,
                             String contactNumber, String emailAddress, String projectPrototype) {
        String sql = "INSERT INTO ersStudentReg (\"Registration ID\", \"Student Name\", Faculty, \"Project Title\", \"Contact Number\", \"Email Address\", \"project prototype\") VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, registrationId);
            pst.setString(2, studentName);
            pst.setString(3, faculty);
            pst.setString(4, projectTitle);
            pst.setString(5, contactNumber);
            pst.setString(6, emailAddress);
            pst.setString(7, projectPrototype);
            int rows = pst.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            System.err.println("Error inserting record: " + e.getMessage());
            return false;
        }
    }

    // Read all records
    public List<Student> getAllRecords() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM ersStudentReg";
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Student student = new Student(
                        rs.getString("Registration ID"),
                        rs.getString("Student Name"),
                        rs.getString("Faculty"),
                        rs.getString("Project Title"),
                        rs.getString("Contact Number"),
                        rs.getString("Email Address"),
                        rs.getString("project prototype")
                );
                list.add(student);
            }
        } catch (SQLException e) {
            System.err.println("Error reading records: " + e.getMessage());
        }
        return list;
    }

    // Update record by Registration ID
    public boolean updateRecord(String registrationId, String studentName, String faculty, String projectTitle,
                                String contactNumber, String emailAddress, String projectPrototype) {
        String sql = "UPDATE ersStudentReg SET \"Student Name\" = ?, Faculty = ?, \"Project Title\" = ?, \"Contact Number\" = ?, \"Email Address\" = ?, \"project prototype\" = ? WHERE \"Registration ID\" = ?";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, studentName);
            pst.setString(2, faculty);
            pst.setString(3, projectTitle);
            pst.setString(4, contactNumber);
            pst.setString(5, emailAddress);
            pst.setString(6, projectPrototype);
            pst.setString(7, registrationId);
            int rows = pst.executeUpdate();
            System.out.println("Rows updated: " + rows); // Log how many records were updated
            return rows > 0;
        } catch (SQLException e) {
            System.err.println("Error updating record: " + e.getMessage());
            return false;
        }
    }

    // Delete record by Registration ID
    public boolean deleteRecord(String registrationId) {
        String sql = "DELETE FROM ersStudentReg WHERE \"Registration ID\" = ?";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, registrationId);
            int rows = pst.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            System.err.println("Error deleting record: " + e.getMessage());
            return false;
        }
    }
}