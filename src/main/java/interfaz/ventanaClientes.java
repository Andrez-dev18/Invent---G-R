package interfaz;

import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Cliente;
import logica.Controladora;
import logica.Usuario;

/**
 *
 * @author sergi
 */
public class ventanaClientes extends javax.swing.JInternalFrame {

    Controladora control = new Controladora();
    Usuario user;
    DefaultTableModel modelo;
    int id;
    Cliente cliente;
    
    
    public ventanaClientes(Usuario user) {
        initComponents();
        this.user = user;
        modelo = (DefaultTableModel) jtableClientes.getModel();
        jtableClientes.setRowHeight(25);
    }

    public ventanaClientes() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        apellidos = new javax.swing.JLabel();
        jbtnRegistrarUsuario = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jtxtCorreo = new javax.swing.JTextField();
        jbtnEliminarUsuario = new javax.swing.JButton();
        jtxtApellidos = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbtnEditarUsuario = new javax.swing.JButton();
        nombre1 = new javax.swing.JLabel();
        jtxtDNI_RUC = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableClientes = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbtnNuevoUsuario = new javax.swing.JButton();
        jtxtTelefono = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apellidos.setBackground(new java.awt.Color(255, 255, 255));
        apellidos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        apellidos.setText("Apellidos completos*");
        jPanel1.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 182, -1, -1));

        jbtnRegistrarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jbtnRegistrarUsuario.setText("Registrar");
        jbtnRegistrarUsuario.setEnabled(false);
        jbtnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 494, 155, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 370, 400, 10));

        jtxtCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtCorreo.setBorder(null);
        jtxtCorreo.setEnabled(false);
        jPanel1.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 400, 30));

        jbtnEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar(1).png"))); // NOI18N
        jbtnEliminarUsuario.setText("Eliminar");
        jbtnEliminarUsuario.setEnabled(false);
        jbtnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 494, -1, -1));

        jtxtApellidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtApellidos.setBorder(null);
        jtxtApellidos.setEnabled(false);
        jPanel1.add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 200, 400, 30));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombre.setText("Nombre completo*");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 112, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Clientes");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 26, -1, -1));

        jbtnEditarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jbtnEditarUsuario.setText("Editar");
        jbtnEditarUsuario.setEnabled(false);
        jbtnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 494, -1, -1));

        nombre1.setBackground(new java.awt.Color(255, 255, 255));
        nombre1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombre1.setText("Telefono*");
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 322, -1, -1));

        jtxtDNI_RUC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtDNI_RUC.setBorder(null);
        jtxtDNI_RUC.setEnabled(false);
        jPanel1.add(jtxtDNI_RUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 270, 400, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 400, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 300, 400, 10));

        jtableClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "DNI_RUC", "Telefono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableClientes);
        if (jtableClientes.getColumnModel().getColumnCount() > 0) {
            jtableClientes.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 26, 570, 519));

        jSeparator3.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 160, 400, 10));

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel12.setText("En este apartado puede crear, editar y eliminar clientes*");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 54, -1, -1));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        contraseña.setText("Correo Electronico*");
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 398, -1, -1));

        nombre2.setBackground(new java.awt.Color(255, 255, 255));
        nombre2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombre2.setText("DNI_RUC*");
        jPanel1.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 252, -1, -1));

        jtxtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtNombre.setBorder(null);
        jtxtNombre.setEnabled(false);
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 130, 400, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 230, 400, 10));

        jbtnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Crear Usuario.png"))); // NOI18N
        jbtnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 30, -1));

        jtxtTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtTelefono.setBorder(null);
        jtxtTelefono.setEnabled(false);
        jPanel1.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 340, 400, 30));

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

    private void jbtnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarUsuarioActionPerformed
        try {
            String nombre = jtxtNombre.getText();
            String apellido = jtxtApellidos.getText();
            String dni_ruc = jtxtDNI_RUC.getText();
            String telefono = jtxtTelefono.getText();
            String correo = jtxtCorreo.getText();

            if (nombre.isEmpty() || apellido.isEmpty() || dni_ruc.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Porfavor ingrese todos los datos", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

            } else {
                control.registrarCliente(nombre, apellido, dni_ruc, telefono, correo);
                JOptionPane.showMessageDialog(null, "Cliente Registrado");
                cargarClientes();
                limpiar();
            }
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtnRegistrarUsuarioActionPerformed

    private void jbtnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarUsuarioActionPerformed
        if (jtableClientes.getRowCount() > 0) {
            if (jtableClientes.getSelectedRow() != -1) {
                int id = Integer.parseInt(jtableClientes.getValueAt(jtableClientes.getSelectedRow(), 0).toString());
                String mensaje = control.borrarCliente(id);
                JOptionPane.showMessageDialog(null, mensaje);
                cargarClientes();
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono ninguna fila");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay registro en la tabla");
        }
    }//GEN-LAST:event_jbtnEliminarUsuarioActionPerformed

    private void jbtnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarUsuarioActionPerformed
        try {
            String nombre = jtxtNombre.getText();
            String apellido = jtxtApellidos.getText();
            String dni_ruc = jtxtDNI_RUC.getText();
            String telefono = jtxtTelefono.getText();
            String correo = jtxtCorreo.getText();

            if (nombre.isEmpty() || apellido.isEmpty() || dni_ruc.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Porfavor ingrese todos los datos", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

            } else {
                control.editarCliente(cliente, nombre, apellido, dni_ruc, telefono, correo);
                JOptionPane.showMessageDialog(null, "Cliente Editado");
                cargarClientes();
                limpiar();
            }
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtnEditarUsuarioActionPerformed

    private void jtableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableClientesMouseClicked
        id = Integer.parseInt(jtableClientes.getValueAt(jtableClientes.getSelectedRow(), 0).toString());
        cliente = control.traerCliente(id);

        jtxtNombre.setText(cliente.getNombre());
        jtxtApellidos.setText(cliente.getApellido());
        jtxtDNI_RUC.setText(cliente.getDNI_RUC());
        jtxtTelefono.setText(cliente.getTelefono());
        jtxtCorreo.setText(cliente.getEmail());
        
        activarEliminarYEditar();
    }//GEN-LAST:event_jtableClientesMouseClicked

    private void jbtnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoUsuarioActionPerformed
        nuevoUsuarios();
    }//GEN-LAST:event_jbtnNuevoUsuarioActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarClientes();
        desactivarControles();
    }//GEN-LAST:event_formInternalFrameOpened

    public void desactivarControles(){
        String rol = user.getUnRol().getNombreRol();
        
        if (rol.equals("Empleado")) {
            jbtnEditarUsuario.setVisible(false);
            jbtnEliminarUsuario.setVisible(false);
        }
        
    }
    
    private void nuevoUsuarios() {
        jbtnRegistrarUsuario.setEnabled(true);
        jtxtNombre.setEnabled(true);
        jtxtApellidos.setEnabled(true);
        jtxtDNI_RUC.setEnabled(true);
        jtxtCorreo.setEnabled(true);
        jtxtTelefono.setEnabled(true);
        jtxtNombre.requestFocus();
    }
    

    private void activarEliminarYEditar() {
        jbtnEditarUsuario.setEnabled(true);
        jbtnEliminarUsuario.setEnabled(true);
        jbtnRegistrarUsuario.setEnabled(false);
        jtxtNombre.setEnabled(true);
        jtxtApellidos.setEnabled(true);
        jtxtDNI_RUC.setEnabled(true);
        jtxtCorreo.setEnabled(true);
        jtxtNombre.requestFocus();
    }

    public void limpiar(){
        jtxtNombre.setText("");
        jtxtApellidos.setText("");
        jtxtDNI_RUC.setText("");
        jtxtTelefono.setText("");
        jtxtCorreo.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTable jtableClientes;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDNI_RUC;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    // End of variables declaration//GEN-END:variables

    private void cargarClientes() {
        vaciarTabla();
        List<Cliente> listaClientes = control.traerClientes();

        if (listaClientes != null) {
            for (Cliente cl : listaClientes) {
                Object[] lista = {cl.getId(), cl.getNombre(), cl.getApellido(), cl.getDNI_RUC(), cl.getTelefono(), cl.getEmail()};
                modelo.addRow(lista);
            }
        }
    }

    public void vaciarTabla() {
        for (int i = jtableClientes.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

}
