package interfaz;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.Controladora;
import logica.Producto;

/**
 *
 * @author sergi
 */
public class BusquedaProductosVenta extends javax.swing.JInternalFrame {

    Controladora control = new Controladora();
    DefaultTableModel modeloProductos;

    TableRowSorter<DefaultTableModel> sorter;

    public BusquedaProductosVenta() {
        initComponents();
        modeloProductos = (DefaultTableModel) jtableProductos.getModel();
        jtableProductos.setRowHeight(20);  
        cargarFiltroSorter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProductos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jbtnAgregarProducto = new javax.swing.JButton();

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

        jtableProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Stock Minimo", "Stock Actual", "Precio", "Marca", "Categoria", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableProductos);
        if (jtableProductos.getColumnModel().getColumnCount() > 0) {
            jtableProductos.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtableProductos.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Busqueda de Productos");

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel12.setText("En este apartado puede realizar la busqueda de productos*");

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyTyped(evt);
            }
        });

        jbtnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar1.png"))); // NOI18N
        jbtnAgregarProducto.setEnabled(false);
        jbtnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(219, 219, 219))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnAgregarProducto)
                            .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProductosMouseClicked

    }//GEN-LAST:event_jtableProductosMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarProductos();
        activarBotonAgregarCliente();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jtxtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtBuscarMousePressed
        if (jtxtBuscar.getText().equals("Buscar..."))
            jtxtBuscar.setText("");
    }//GEN-LAST:event_jtxtBuscarMousePressed

    private void jbtnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarProductoActionPerformed
        ventanaVenta.idProducto = Integer.parseInt(jtableProductos.getValueAt(jtableProductos.getSelectedRow(), 0).toString());
        ventanaVenta.jtxtProducto.setText(jtableProductos.getValueAt(jtableProductos.getSelectedRow(), 1).toString());
        ventanaVenta.jtxtStockDisponible.setText(jtableProductos.getValueAt(jtableProductos.getSelectedRow(), 3).toString());
        ventanaVenta.jtxtPrecioUnitario.setText(jtableProductos.getValueAt(jtableProductos.getSelectedRow(), 4).toString());
        dispose();
    }//GEN-LAST:event_jbtnAgregarProductoActionPerformed

    private void jtxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyTyped


    }//GEN-LAST:event_jtxtBuscarKeyTyped

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        try {
            sorter.setRowFilter(RowFilter.regexFilter(jtxtBuscar.getText()));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    public void activarBotonAgregarCliente() {
        if (jtableProductos.getRowCount() > 0) {
            jbtnAgregarProducto.setEnabled(true);
        } else {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregarProducto;
    private javax.swing.JTable jtableProductos;
    private javax.swing.JTextField jtxtBuscar;
    // End of variables declaration//GEN-END:variables

    private void cargarProductos() {
        vaciarTabla();
        List<Producto> listaProductos = control.traerProductos();

        if (listaProductos != null) {
            for (Producto pd : listaProductos) {
                Object[] lista = {pd.getId(), pd.getDescripcion(), pd.getStockMinimo(), pd.getStock(), pd.getPrecio(),
                    pd.getUnaMarca().getNombreMarca(), pd.getUnaCategoria().getNombreCategoria(), pd.getUnProveedor().getNombreProveedor()};
                modeloProductos.addRow(lista);
            }
        }

    }

    private void vaciarTabla() {
        for (int i = jtableProductos.getRowCount() - 1; i >= 0; i--) {
            modeloProductos.removeRow(i);
        }
    }
    
    private void cargarFiltroSorter(){
        jtableProductos.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modeloProductos);
        jtableProductos.setRowSorter(sorter);
    }
}
