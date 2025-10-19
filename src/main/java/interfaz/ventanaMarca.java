package interfaz;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;
import logica.Marca;

/**
 *
 * @author sergi
 */
public class ventanaMarca extends javax.swing.JInternalFrame {

    Controladora control = new Controladora();
    DefaultTableModel modelo;
    Marca marca;

    public ventanaMarca() {
        initComponents();
        modelo = (DefaultTableModel) jtableMarca.getModel();
        jtableMarca.setRowHeight(20);
        cargarMarcas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtableMarca = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jtxtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jbtnRegistrarMarca = new javax.swing.JButton();
        jbtnEdit = new javax.swing.JButton();
        jbtnBorrarMarca = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtableMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Marca Productos"
            }
        ));
        jtableMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMarcaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtableMarca);
        if (jtableMarca.getColumnModel().getColumnCount() > 0) {
            jtableMarca.getColumnModel().getColumn(1).setPreferredWidth(650);
        }

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 630, 200));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar::."));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 102, 255));

        jtxtMarca.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel3.setText("Nombre Marca*");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jtxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 67, -1, 110));

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel12.setText("En este apartado puede crear, editar y eliminar marcas de productos*");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Marcas de productos*");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones::."));

        jbtnRegistrarMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        jbtnRegistrarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarMarcaActionPerformed(evt);
            }
        });

        jbtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jbtnEdit.setEnabled(false);
        jbtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditActionPerformed(evt);
            }
        });

        jbtnBorrarMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar(1).png"))); // NOI18N
        jbtnBorrarMarca.setEnabled(false);
        jbtnBorrarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarMarcaActionPerformed(evt);
            }
        });

        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnRegistrarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBorrarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnBorrarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnRegistrarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 240, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarMarcaActionPerformed

        String marca = jtxtMarca.getText();

        if (!marca.isEmpty()) {
            control.registrarMarca(marca);

            JOptionPane.showMessageDialog(null, "Marca "+marca+" registrada");
            cargarMarcas();
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la marca.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jbtnRegistrarMarcaActionPerformed


    private void jbtnBorrarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarMarcaActionPerformed
        if (jtableMarca.getRowCount() > 0) {
            if (jtableMarca.getSelectedRow() != -1) {
                int id = Integer.parseInt(jtableMarca.getValueAt(jtableMarca.getSelectedRow(), 0).toString());
                String mensaje = control.borrarMarca(id);
                cargarMarcas();
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun proveedor");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla esta vacia");
        }
    }//GEN-LAST:event_jbtnBorrarMarcaActionPerformed

    private void jtableMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableMarcaMouseClicked

        int id = Integer.parseInt(jtableMarca.getValueAt(jtableMarca.getSelectedRow(), 0).toString());

        marca = control.traerMarca(id);
        jtxtMarca.setText(marca.getNombreMarca());
        activarControles();
    }//GEN-LAST:event_jtableMarcaMouseClicked

    private void jbtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditActionPerformed

        String nombreMarca = jtxtMarca.getText();

        if (!nombreMarca.isEmpty()) {
            control.editMarca(marca, nombreMarca);
        JOptionPane.showMessageDialog(null, "Marca Editada");

        cargarMarcas();
        limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la marca.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);    
        }
    }//GEN-LAST:event_jbtnEditActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    public void activarControles() {
        jbtnEdit.setEnabled(true);
        jbtnBorrarMarca.setEnabled(true);
        jbtnRegistrarMarca.setEnabled(false);
    }

    public void limpiar() {
        jbtnEdit.setEnabled(false);
        jbtnBorrarMarca.setEnabled(false);
        jbtnRegistrarMarca.setEnabled(true);
        jtxtMarca.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbtnBorrarMarca;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEdit;
    private javax.swing.JButton jbtnRegistrarMarca;
    private javax.swing.JTable jtableMarca;
    private javax.swing.JTextField jtxtMarca;
    // End of variables declaration//GEN-END:variables

    private void cargarMarcas() {
        vaciarTabla();

        List<Marca> listaMarcas = control.traerMarcas();
        if (listaMarcas != null) {
            for (Marca mc : listaMarcas) {
                Object[] lista = {mc.getId(), mc.getNombreMarca()};
                modelo.addRow(lista);
            }
        }
    }

    private void vaciarTabla() {
        for (int i = jtableMarca.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
