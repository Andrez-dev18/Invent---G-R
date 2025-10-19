package interfaz;

import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.Cliente;
import logica.Controladora;

/**
 *
 * @author sergi
 */
public class BuscarCliente extends javax.swing.JInternalFrame {

    Controladora control = new Controladora();
    DefaultTableModel modelo;

    TableRowSorter<DefaultTableModel> sorter;

    public BuscarCliente() {
        initComponents();
        modelo = (DefaultTableModel) jtableClientes.getModel();
        jtableClientes.setRowHeight(25);
        cargarFiltroSorter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableClientes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jbtnAgregarCliente = new javax.swing.JButton();

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
            jtableClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
            jtableClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Buscar Clientes");

        jtxtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jtxtBuscar.setText("Buscar...");
        jtxtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jtxtBuscar.setCaretColor(new java.awt.Color(0, 102, 255));
        jtxtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtBuscarMousePressed(evt);
            }
        });
        jtxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyReleased(evt);
            }
        });

        jbtnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar1.png"))); // NOI18N
        jbtnAgregarCliente.setEnabled(false);
        jbtnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnAgregarCliente)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnAgregarCliente)
                            .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableClientesMouseClicked
        //        idUsu = Integer.parseInt(jtableUsuarios.getValueAt(jtableUsuarios.getSelectedRow(), 0).toString());
        //        user = control.traerUsuario(idUsu);
        //
        //        jtxtNombre.setText(user.getNombre());
        //        jtxtApellidos.setText(user.getApellido());
        //        jtxtDNI_RUC.setText(user.getDNI_RUC());
        //        jtxtUsuario.setText(user.getNombreUsuario());
        //
        //
        //        jcbxRol.setSelectedItem(user.getUnRol().getNombreRol().toString());
        //        activarEliminarYEditar();
    }//GEN-LAST:event_jtableClientesMouseClicked

    private void jtxtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtBuscarMousePressed
        if (jtxtBuscar.getText().equals("Buscar..."))
            jtxtBuscar.setText("");
    }//GEN-LAST:event_jtxtBuscarMousePressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarClientes();
        activarBotonAgregarCliente();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jbtnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarClienteActionPerformed
        ventanaVenta.jtxtNombreCliente.setText(jtableClientes.getValueAt(jtableClientes.getSelectedRow(), 1).toString());
        ventanaVenta.jtxtDNICliente.setText(jtableClientes.getValueAt(jtableClientes.getSelectedRow(), 3).toString());
        dispose();
    }//GEN-LAST:event_jbtnAgregarClienteActionPerformed

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        try {
            sorter.setRowFilter(RowFilter.regexFilter(jtxtBuscar.getText()));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    public void activarBotonAgregarCliente() {
        if (jtableClientes.getRowCount() > 0) {
            jbtnAgregarCliente.setEnabled(true);
        } else {

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregarCliente;
    private javax.swing.JTable jtableClientes;
    private javax.swing.JTextField jtxtBuscar;
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

    private void cargarFiltroSorter() {
        jtableClientes.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modelo);
        jtableClientes.setRowSorter(sorter);
    }

}
