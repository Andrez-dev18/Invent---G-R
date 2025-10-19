package interfaz;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Categoria;
import logica.Controladora;

/**
 *
 * @author sergi
 */
public class ventanaCategoria extends javax.swing.JInternalFrame {

    Controladora control = new Controladora();

    DefaultTableModel modelo;

    Categoria cate;

    public ventanaCategoria() {
        initComponents();
        modelo = (DefaultTableModel) jtableCategoria.getModel();
        jtableCategoria.setRowHeight(20);
        cargarCategoria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableCategoria = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jtxtCategoria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnRegistrarCategoria = new javax.swing.JButton();
        jbtnEdit = new javax.swing.JButton();
        jbtnBorrarCategoria = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Categoria");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre Categoria"
            }
        ));
        jtableCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableCategoriaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtableCategoria);
        if (jtableCategoria.getColumnModel().getColumnCount() > 0) {
            jtableCategoria.getColumnModel().getColumn(1).setPreferredWidth(550);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 630, 200));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar::."));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));

        jtxtCategoria.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel1.setText("Nombre categoria*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jtxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 67, -1, 110));

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel12.setText("En este apartado puede crear, editar y eliminar categorias de los productos*");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Categorias");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones::."));

        jbtnRegistrarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        jbtnRegistrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarCategoriaActionPerformed(evt);
            }
        });

        jbtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jbtnEdit.setEnabled(false);
        jbtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditActionPerformed(evt);
            }
        });

        jbtnBorrarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar(1).png"))); // NOI18N
        jbtnBorrarCategoria.setEnabled(false);
        jbtnBorrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarCategoriaActionPerformed(evt);
            }
        });

        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnRegistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBorrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnBorrarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnRegistrarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 240, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarCategoriaActionPerformed
        String nombreCategoria = jtxtCategoria.getText();

        if (!nombreCategoria.isEmpty()) {
            control.registrarCategoria(nombreCategoria);
            JOptionPane.showMessageDialog(null, "Categoria " + nombreCategoria + " registrada");

            cargarCategoria();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la Categoria.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnRegistrarCategoriaActionPerformed

    private void jbtnBorrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarCategoriaActionPerformed
        if (jtableCategoria.getRowCount() > 0) {
            if (jtableCategoria.getSelectedRow() != -1) {
                int id = Integer.parseInt(jtableCategoria.getValueAt(jtableCategoria.getSelectedRow(), 0).toString());
                String mensaje = control.borrarCateogira(id);
                cargarCategoria();
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun proveedor");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla esta vacia");
        }
    }//GEN-LAST:event_jbtnBorrarCategoriaActionPerformed

    private void jbtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditActionPerformed
        String nombreCategoria = jtxtCategoria.getText();

        if (!nombreCategoria.isEmpty()) {
            control.editCategoria(cate, nombreCategoria);
            JOptionPane.showMessageDialog(null, "Categoria editada");

            cargarCategoria();
            limpiar();
        }else {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la Categoria.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);            
        }
    }//GEN-LAST:event_jbtnEditActionPerformed

    private void jtableCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableCategoriaMouseClicked
        int id = Integer.parseInt(jtableCategoria.getValueAt(jtableCategoria.getSelectedRow(), 0).toString());

        cate = control.traerCategoria(id);

        jtxtCategoria.setText(cate.getNombreCategoria());
        activarControles();
    }//GEN-LAST:event_jtableCategoriaMouseClicked

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    public void activarControles() {
        jbtnEdit.setEnabled(true);
        jbtnBorrarCategoria.setEnabled(true);
        jbtnRegistrarCategoria.setEnabled(false);
    }

    public void limpiar() {
        jbtnEdit.setEnabled(false);
        jbtnBorrarCategoria.setEnabled(false);
        jbtnRegistrarCategoria.setEnabled(true);
        jtxtCategoria.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBorrarCategoria;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEdit;
    private javax.swing.JButton jbtnRegistrarCategoria;
    private javax.swing.JTable jtableCategoria;
    private javax.swing.JTextField jtxtCategoria;
    // End of variables declaration//GEN-END:variables

    private void cargarCategoria() {
        vaciarTabla();
        List<Categoria> listaCategoria = control.traerCategorias();

        if (listaCategoria != null) {
            for (Categoria cate : listaCategoria) {
                Object[] lista = {cate.getId(), cate.getNombreCategoria()};
                modelo.addRow(lista);
            }
        }

    }

    private void vaciarTabla() {
        for (int i = jtableCategoria.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
