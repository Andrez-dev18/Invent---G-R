package interfaz;

import javax.swing.JOptionPane;
import logica.Controladora;
import logica.Usuario;

public class registro extends javax.swing.JFrame {

    Controladora control = new Controladora();
    
    public registro() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbxRol = new javax.swing.JComboBox<>();
        nombre = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        apellidos = new javax.swing.JLabel();
        jtxtApellidos = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jtxtUsuario = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jtxtDNI_RUC = new javax.swing.JTextField();
        nombre2 = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        jtxtPassword = new javax.swing.JPasswordField();
        btnVolver = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_C4\\src\\main\\java\\img\\LOGO G&R1.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 150, 70));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel2.setText("A continuación registre sus datos para ingresar al sistema:  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Rol*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 42, -1));

        jcbxRol.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Administrador", "Empleado" }));
        getContentPane().add(jcbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 38));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombre.setText("Nombre completo*");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jtxtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtNombre.setBorder(null);
        getContentPane().add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 400, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 400, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 400, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 10));

        apellidos.setBackground(new java.awt.Color(255, 255, 255));
        apellidos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        apellidos.setText("Apellidos completos*");
        getContentPane().add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jtxtApellidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtApellidos.setBorder(null);
        getContentPane().add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 400, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 400, 10));

        jtxtUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtUsuario.setBorder(null);
        getContentPane().add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 400, 30));

        nombre1.setBackground(new java.awt.Color(255, 255, 255));
        nombre1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombre1.setText("Nombre de usuario:");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 102, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 400, 10));

        jtxtDNI_RUC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtDNI_RUC.setBorder(null);
        getContentPane().add(jtxtDNI_RUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 400, 30));

        nombre2.setBackground(new java.awt.Color(255, 255, 255));
        nombre2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombre2.setText("DNI_RUC");
        getContentPane().add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        contraseña.setText("Contraseña*");
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jtxtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtPassword.setBorder(null);
        getContentPane().add(jtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 400, 30));

        btnVolver.setBackground(new java.awt.Color(255, 51, 51));
        btnVolver.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 150, 40));

        btnRegistrarse.setBackground(new java.awt.Color(0, 102, 255));
        btnRegistrarse.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_C4\\src\\main\\java\\img\\registro.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        dispose();
        login lg = new login();
        lg.setVisible(true);
        lg.show();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String nombre = jtxtNombre.getText();
        String apellido = jtxtApellidos.getText();
        String dni_ruc = jtxtDNI_RUC.getText();
        String usuario = jtxtUsuario.getText();
        String contrasenia = String.valueOf(jtxtPassword.getPassword());
        String rol = jcbxRol.getSelectedItem().toString();
               
        control.registrarUsuario(nombre, apellido, dni_ruc, usuario, contrasenia, rol);
        
        //JOptionPane.showMessageDialog(null, rol+ " Registrado");

    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox<String> jcbxRol;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtDNI_RUC;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JPasswordField jtxtPassword;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    // End of variables declaration//GEN-END:variables
}
