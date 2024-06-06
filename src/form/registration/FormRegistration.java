/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package form.registration;

import javax.swing.SwingUtilities;

/**
 *
 * @author kiezi
 */
public class FormRegistration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RegistrationForm form = new RegistrationForm();
                form.setVisible(true);
            }
        });
    }
    
}
