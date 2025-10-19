package interfaz;

import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;
import logica.Usuario;

public class panelUsuario extends javax.swing.JPanel {

    Controladora control;
    Usuario user;
    DefaultTableModel modeloUsuarios;
    private int idUsu;

    public panelUsuario(Controladora control) {
        initComponents();
        this.control = control;
        modeloUsuarios = (DefaultTableModel) jtableUsuarios.getModel();
        jtableUsuarios.setRowHeight(30);
        cargarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtableUsuarios = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbtnRegistrarUsuario = new javax.swing.JButton();
        jtxtApellidos = new javax.swing.JTextField();
        jbtnEditarUsuario = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        apellidos = new javax.swing.JLabel();
        jbtnEliminarUsuario = new javax.swing.JButton();
        jtxtPassword = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        contraseña = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jbtnNuevoUsuario = new javax.swing.JButton();
        jtxtUsuario = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        jcbxRol = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jtxtDNI_RUC = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 569));

        jtableUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "DNI_RUC", "Usuario", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableUsuarios);
        if (jtableUsuarios.getColumnModel().getColumnCount() > 0) {
            jtableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Usuarios");

        jSeparator5.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 102, 255));

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel12.setText("En este apartado puede crear, editar y eliminar usuarios*");

        nombre2.setBackground(new java.awt.Color(255, 255, 255));
        nombre2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombre2.setText("DNI_RUC");

        jSeparator1.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 255));

        jbtnRegistrarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevoUsuario.png"))); // NOI18N
        jbtnRegistrarUsuario.setText("Registrar");
        jbtnRegistrarUsuario.setEnabled(false);
        jbtnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarUsuarioActionPerformed(evt);
            }
        });

        jtxtApellidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtApellidos.setBorder(null);
        jtxtApellidos.setEnabled(false);

        jbtnEditarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar_1.png"))); // NOI18N
        jbtnEditarUsuario.setText("Editar");
        jbtnEditarUsuario.setEnabled(false);
        jbtnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarUsuarioActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 255));

        apellidos.setBackground(new java.awt.Color(255, 255, 255));
        apellidos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        apellidos.setText("Apellidos completos*");

        jbtnEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar(1).png"))); // NOI18N
        jbtnEliminarUsuario.setText("Eliminar");
        jbtnEliminarUsuario.setEnabled(false);
        jbtnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarUsuarioActionPerformed(evt);
            }
        });

        jtxtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtPassword.setBorder(null);
        jtxtPassword.setEnabled(false);

        jSeparator3.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        contraseña.setText("Contraseña*");

        jtxtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtNombre.setBorder(null);
        jtxtNombre.setEnabled(false);

        jbtnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Crear Usuario.png"))); // NOI18N
        jbtnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoUsuarioActionPerformed(evt);
            }
        });

        jtxtUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtUsuario.setBorder(null);
        jtxtUsuario.setEnabled(false);

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombre.setText("Nombre completo*");

        nombre1.setBackground(new java.awt.Color(255, 255, 255));
        nombre1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombre1.setText("Nombre de usuario:");

        jcbxRol.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Administrador", "Empleado" }));
        jcbxRol.setEnabled(false);

        jSeparator4.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Rol*");

        jtxtDNI_RUC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtDNI_RUC.setBorder(null);
        jtxtDNI_RUC.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnNuevoUsuario))
                    .addComponent(nombre)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidos)
                    .addComponent(jtxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre2)
                    .addComponent(jtxtDNI_RUC, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre1)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseña)
                    .addComponent(jtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEditarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnEliminarUsuario)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnNuevoUsuario))
                        .addGap(12, 12, 12)
                        .addComponent(nombre)
                        .addGap(1, 1, 1)
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(apellidos)
                        .addGap(1, 1, 1)
                        .addComponent(jtxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(nombre2)
                        .addGap(1, 1, 1)
                        .addComponent(jtxtDNI_RUC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(nombre1)
                        .addGap(1, 1, 1)
                        .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(contraseña)
                        .addGap(1, 1, 1)
                        .addComponent(jtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnRegistrarUsuario)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnEditarUsuario)
                                .addComponent(jbtnEliminarUsuario)))
                        .addContainerGap(58, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarUsuarioActionPerformed
        try {
            String nombre = jtxtNombre.getText();
            String apellido = jtxtApellidos.getText();
            String dni_ruc = jtxtDNI_RUC.getText();
            String usuario = jtxtUsuario.getText();
            String contrasenia = String.valueOf(jtxtPassword.getPassword());
            String rol = jcbxRol.getSelectedItem().toString();

            if (nombre.isEmpty() || apellido.isEmpty() || dni_ruc.isEmpty() || usuario.isEmpty() || contrasenia.isEmpty() || rol.equals("SELECCIONAR")) {

                JOptionPane.showMessageDialog(null, "Porfavor ingrese todos los datos", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

            } else {
                control.registrarUsuario(nombre, apellido, dni_ruc, usuario, contrasenia, rol);
                JOptionPane.showMessageDialog(null, rol + " Registrado");
                cargarUsuarios();
            }
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtnRegistrarUsuarioActionPerformed

    private void jbtnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoUsuarioActionPerformed
        nuevoUsuarios();
    }//GEN-LAST:event_jbtnNuevoUsuarioActionPerformed

    private void jbtnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarUsuarioActionPerformed
        String nombre = jtxtNombre.getText();
        String apellido = jtxtApellidos.getText();
        String dni_ruc = jtxtDNI_RUC.getText();
        String usuario = jtxtUsuario.getText();
        String contrasenia = String.valueOf(jtxtPassword.getPassword());
        String rol = jcbxRol.getSelectedItem().toString();

        control.editarUsuario(user, nombre, apellido, dni_ruc, usuario, contrasenia, rol);

        JOptionPane.showMessageDialog(null, rol + " Editado correctamente");

        cargarUsuarios();

    }//GEN-LAST:event_jbtnEditarUsuarioActionPerformed

    private void jbtnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarUsuarioActionPerformed
        if (jtableUsuarios.getRowCount() > 0) {
            if (jtableUsuarios.getSelectedRow() != -1) {
                int id = Integer.parseInt(jtableUsuarios.getValueAt(jtableUsuarios.getSelectedRow(), 0).toString());
                control.borrarUsuario(id);

                JOptionPane.showMessageDialog(null, "Usuario eliminado");
                cargarUsuarios();
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono ninguna fila");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay registro en la tabla");
        }
    }//GEN-LAST:event_jbtnEliminarUsuarioActionPerformed

    private void jtableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableUsuariosMouseClicked
        idUsu = Integer.parseInt(jtableUsuarios.getValueAt(jtableUsuarios.getSelectedRow(), 0).toString());
        user = control.traerUsuario(idUsu);

        jtxtNombre.setText(user.getNombre());
        jtxtApellidos.setText(user.getApellido());
        jtxtDNI_RUC.setText(user.getDNI_RUC());
        jtxtUsuario.setText(user.getNombreUsuario());
        jtxtPassword.setText(user.getContrasenia());

        jcbxRol.setSelectedItem(user.getUnRol().getNombreRol().toString());
        activarEliminarYEditar();
    }//GEN-LAST:event_jtableUsuariosMouseClicked

    public void cargarUsuarios() {
        vaciarTabla();
        List<Usuario> listaUsuarios = control.traerUsuarios();

        if (listaUsuarios != null) {
            for (Usuario user : listaUsuarios) {
                Object[] lista = {user.getId(), user.getNombre(), user.getApellido(), user.getDNI_RUC(),
                    user.getNombreUsuario(), user.getUnRol().getNombreRol()};
                modeloUsuarios.addRow(lista);
            }
        }

    }

    public void vaciarTabla() {
        for (int i = jtableUsuarios.getRowCount() - 1; i >= 0; i--) {
            modeloUsuarios.removeRow(i);
        }
    }

    private void nuevoUsuarios() {
        jbtnRegistrarUsuario.setEnabled(true);
        jtxtNombre.setEnabled(true);
        jtxtApellidos.setEnabled(true);
        jtxtDNI_RUC.setEnabled(true);
        jtxtUsuario.setEnabled(true);
        jtxtPassword.setEnabled(true);
        jcbxRol.setEnabled(true);
        jtxtNombre.requestFocus();
    }
    
    private void activarEliminarYEditar() {
        jbtnEditarUsuario.setEnabled(true);
        jbtnEliminarUsuario.setEnabled(true);
        jbtnRegistrarUsuario.setEnabled(false);
        jtxtNombre.setEnabled(true);
        jtxtApellidos.setEnabled(true);
        jtxtDNI_RUC.setEnabled(true);
        jtxtUsuario.setEnabled(true);
        jtxtPassword.setEnabled(true);
        jcbxRol.setEnabled(true);
        jtxtNombre.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbtnEditarUsuario;
    private javax.swing.JButton jbtnEliminarUsuario;
    private javax.swing.JButton jbtnNuevoUsuario;
    private javax.swing.JButton jbtnRegistrarUsuario;
    private javax.swing.JComboBox<String> jcbxRol;
    private javax.swing.JTable jtableUsuarios;
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
