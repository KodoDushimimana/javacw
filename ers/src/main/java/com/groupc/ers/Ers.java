/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.groupc.ers;

/**
 *
 * @author micheal
 */
public class Ers {

        public static void main(String[] args) {
        // Set the look and feel (optional)
        try {
            javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace(); // Use default look and feel
        }

        // Launch the login form (or home screen)
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}
//