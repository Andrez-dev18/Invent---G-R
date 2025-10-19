package interfaz;

import java.awt.Color;
import logica.Controladora;
import logica.Usuario;

/**
 *
 * @author sergi
 */
public class login extends javax.swing.JFrame {

    Controladora control = new Controladora();

    public login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtuser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jtxtClave = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnIniciar1 = new javax.swing.JButton();
        jlblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(816, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoLogin.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 0, 393, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel5.setText("BIENVENIDO!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jtxtuser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtuser.setBorder(null);
        jPanel1.add(jtxtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 400, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 400, 10));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel8.setText("CONTRASEÑA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jtxtClave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtClave.setBorder(null);
        jPanel1.add(jtxtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 400, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 400, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 430, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel4.setText("INICIO DE SESION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel9.setText("Nombre Completo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("INICIE SESION PARA INGRESAR A LA APLICACION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jbtnIniciar1.setBackground(new java.awt.Color(0, 102, 255));
        jbtnIniciar1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jbtnIniciar1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnIniciar1.setText("INICIAR SESION");
        jbtnIniciar1.setBorderPainted(false);
        jbtnIniciar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 400, 54));
        jPanel1.add(jlblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 350, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciar1ActionPerformed

        try {
            String usuario = jtxtuser.getText();
            String contrasenia = String.valueOf(jtxtClave.getPassword());

            Usuario user = control.validarUsuario(usuario, contrasenia);

            if (user != null) {
                String rol = user.getUnRol().getNombreRol();

                if (rol.equals("Administrador")) {
                    mostrarAdmin(control, user);
                    dispose();
                    System.out.println(user.getNombreUsuario());
                }
                if (rol.equals("Empleado")) {
                    mostrarEmpleado(control, user);
                    dispose();
                }
            } else {
                jlblMensaje.setText("Usuario o contraseña incorrectos: ");
                jlblMensaje.setForeground(Color.red);
                System.out.println(user.getNombreUsuario());
                //
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtnIniciar1ActionPerformed

    public void mostrarAdmin(Controladora control, Usuario user) {
//        UI_Administrador admin = new UI_Administrador(control, user);
//        admin.setVisible(true);
//        admin.setLocationRelativeTo(null);
        Jframe_Admin vs = new Jframe_Admin(control, user);
        vs.setVisible(true);
        vs.setLocationRelativeTo(null);
        vs.setExtendedState(vs.MAXIMIZED_BOTH);

    }

    public void mostrarEmpleado(Controladora control, Usuario user) {
        Jframe_Admin vs = new Jframe_Admin(control, user);
        vs.setVisible(true);
        vs.setLocationRelativeTo(null);
        vs.setExtendedState(vs.MAXIMIZED_BOTH);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnIniciar1;
    private javax.swing.JLabel jlblMensaje;
    private javax.swing.JPasswordField jtxtClave;
    public static javax.swing.JTextField jtxtuser;
    // End of variables declaration//GEN-END:variables
}
