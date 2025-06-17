/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author micheal
 */

 package com.groupc.ers;

import java.sql.*;

public class DBConnection {
 


    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("org.hsqldb.jdbcDriver");

                // Update path to your extracted .odb folder
                String dbPath = "/Volumes/Micheal/V/OOP/oop_coursework/ers/src/main/java/com/groupc/ers/ers_database"; 
                conn = DriverManager.getConnection("jdbc:hsqldb:" + dbPath, "SA", "");
                System.out.println("Connected to HSQLDB database.");
            } catch (ClassNotFoundException | SQLException e) 
            
            {
            }
        }
        return conn;
    }
}

