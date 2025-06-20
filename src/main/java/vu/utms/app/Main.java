package vu.utms.app;
import javax.swing.SwingUtilities;
import vu.utms.ui.LoginUI;

/**
 *
 * @author phill
 */
/**
This is the main Class
*/


public class Main {
    public static void main(String[] args) {
        // Always start Swing apps on the EDT
        SwingUtilities.invokeLater(() -> {
            new LoginUI().setVisible(true);
        });
    }
}
