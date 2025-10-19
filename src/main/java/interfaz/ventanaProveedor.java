package interfaz;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;
import logica.Proveedor;

/**
 *
 * @author sergi
 */
public class ventanaProveedor extends javax.swing.JInternalFrame {

    Controladora control = new Controladora();
    DefaultTableModel modelo;
    Proveedor prove;

    public ventanaProveedor() {
        initComponents();
        modelo = (DefaultTableModel) jtableProveedor.getModel();
        jtableProveedor.setRowHeight(20);
        cargarProveedores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableProveedor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jtxtProveedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnRegistrarProveedor = new javax.swing.JButton();
        jbtnEdit = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre proveedor"
            }
        ));
        jtableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableProveedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtableProveedor);
        if (jtableProveedor.getColumnModel().getColumnCount() > 0) {
            jtableProveedor.getColumnModel().getColumn(1).setPreferredWidth(550);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 630, 200));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar::."));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));

        jtxtProveedor.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel1.setText("Nombre proveedor*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtxtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jtxtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 67, -1, 110));

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel12.setText("En este apartado puede crear, editar y eliminar proveedores de productos*");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Proveedores");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones::."));

        jbtnRegistrarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        jbtnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarProveedorActionPerformed(evt);
            }
        });

        jbtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jbtnEdit.setEnabled(false);
        jbtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditActionPerformed(evt);
            }
        });

        jbtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar(1).png"))); // NOI18N
        jbtnBorrar.setEnabled(false);
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnRegistrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 240, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarProveedorActionPerformed
        String proveedor = jtxtProveedor.getText();

        if (!proveedor.isEmpty()) {
            control.registrarProveedor(proveedor);

            JOptionPane.showMessageDialog(null, "Proveedor " + proveedor + " registrado");
            cargarProveedores();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del proveedor.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jbtnRegistrarProveedorActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed

        if (jtableProveedor.getRowCount() > 0) {
            if (jtableProveedor.getSelectedRow() != -1) {
                int id = Integer.parseInt(jtableProveedor.getValueAt(jtableProveedor.getSelectedRow(), 0).toString());
                String mensaje = control.borrarProvedor(id);
                cargarProveedores();
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun proveedor");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla esta vacia");
        }
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jtableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProveedorMouseClicked
        int id = Integer.parseInt(jtableProveedor.getValueAt(jtableProveedor.getSelectedRow(), 0).toString());

        prove = control.traerProveedor(id);
        jtxtProveedor.setText(prove.getNombreProveedor());
        activarControles();
    }//GEN-LAST:event_jtableProveedorMouseClicked

    private void jbtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditActionPerformed

        String nombreProveedor = jtxtProveedor.getText();

        if (!nombreProveedor.isEmpty()) {
            control.editProveedor(prove, nombreProveedor);
            JOptionPane.showMessageDialog(null, "Proveedor editado");

            cargarProveedores();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del proveedor.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnEditActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        limpiar();
    }//GEN-LAST:event_SalirActionPerformed

    public void activarControles() {
        jbtnEdit.setEnabled(true);
        jbtnBorrar.setEnabled(true);
        jbtnRegistrarProveedor.setEnabled(false);
    }

    public void limpiar() {
        jbtnEdit.setEnabled(false);
        jbtnBorrar.setEnabled(false);
        jbtnRegistrarProveedor.setEnabled(true);
        jtxtProveedor.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnEdit;
    private javax.swing.JButton jbtnRegistrarProveedor;
    private javax.swing.JTable jtableProveedor;
    private javax.swing.JTextField jtxtProveedor;
    // End of variables declaration//GEN-END:variables

    private void cargarProveedores() {
        vaciarTabla();

        List<Proveedor> listaProveedores = control.traerProveedores();

        if (listaProveedores != null) {
            for (Proveedor provee : listaProveedores) {
                Object[] lista = {provee.getId(), provee.getNombreProveedor()};
                modelo.addRow(lista);
            }
        }

    }

    private void vaciarTabla() {
        for (int i = jtableProveedor.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
