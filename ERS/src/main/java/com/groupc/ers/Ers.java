/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.groupc.ers;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author micheal
 */
public class Ers {

    public static void main(String[] args) {
        // Set look and feel (optional)
        try {
            javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | 
                IllegalAccessException | 
                InstantiationException | 
                UnsupportedLookAndFeelException e) 
        
        {
        }

        // Test DB connection before launching UI
        DBConnection.getConnection(); // <-- Add this line to test the connection

        // Launch the login form or home screen
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}