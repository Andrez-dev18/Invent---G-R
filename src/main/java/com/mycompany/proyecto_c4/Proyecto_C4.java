package com.mycompany.proyecto_c4;

import interfaz.login;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author sergi
 */
public class Proyecto_C4 {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            try {
                //estilo segun el sistema
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                // Crear e inicializar tu JFrame
                login login = new login();
                login.setVisible(true);
                login.setLocationRelativeTo(null);

                // Hacer visible tu JFrame
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
        });

    }
}
