package interfaz;

import static interfaz.Jframe_Admin.ventanaPrincipal;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.Categoria;
import logica.Controladora;
import logica.Entrada;
import logica.Marca;
import logica.Proveedor;

/**
 *
 * @author sergi
 */
public class ventanaEntradas extends javax.swing.JInternalFrame {

    Controladora control = new Controladora();
    private SimpleDateFormat format_date = new SimpleDateFormat("yyyy-MM-dd");  //Formato de la fecha para guardar
    private SimpleDateFormat format_show = new SimpleDateFormat("dd/MM/yyyy");  //Formato de la fecha para mostrar
    DefaultTableModel modelo;
    TableRowSorter<DefaultTableModel> sorter;
    Entrada entrada;

    public ventanaEntradas() {
        initComponents();
        modelo = (DefaultTableModel) jtableEntradas.getModel();
        cargarFiltroSorter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableEntradas = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jtxtProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jtxtStockEntrante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jtxtPrecioCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jfecha = new com.toedter.calendar.JDateChooser();
        jbtnBuscar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jtxtStockActual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jtxtPrecioUnit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jbtnBorrar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jtableEntradas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtableEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Fecha Entrada", "Stock Entrante", "Precio Compra", "Marca", "Categoria", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableEntradasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableEntradas);
        if (jtableEntradas.getColumnModel().getColumnCount() > 0) {
            jtableEntradas.getColumnModel().getColumn(0).setPreferredWidth(5);
            jtableEntradas.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Entrada de Productos");

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel12.setText("En este apartado puede crear, editar y eliminar Entrada de productos*");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 480, 10));

        jtxtProducto.setEditable(false);
        jtxtProducto.setBackground(new java.awt.Color(237, 235, 235));
        jtxtProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtProducto.setForeground(new java.awt.Color(0, 0, 0));
        jtxtProducto.setBorder(null);
        jPanel2.add(jtxtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 480, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre producto*");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 120, 10));

        jtxtStockEntrante.setBackground(new java.awt.Color(237, 235, 235));
        jtxtStockEntrante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtStockEntrante.setForeground(new java.awt.Color(0, 0, 0));
        jtxtStockEntrante.setBorder(null);
        jtxtStockEntrante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtStockEntranteKeyReleased(evt);
            }
        });
        jPanel2.add(jtxtStockEntrante, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 120, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Stock Entrante*");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, 20));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 120, 10));

        jtxtPrecioCompra.setBackground(new java.awt.Color(237, 235, 235));
        jtxtPrecioCompra.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtPrecioCompra.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPrecioCompra.setBorder(null);
        jtxtPrecioCompra.setEnabled(false);
        jPanel2.add(jtxtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 120, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio Compra*");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha Entrada*");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, -1, -1));

        jfecha.setDateFormatString("dd/MM/yyyy");
        jfecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel2.add(jfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 40, 150, 30));

        jbtnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar1.png"))); // NOI18N
        jbtnBuscar.setBorder(null);
        jbtnBuscar.setEnabled(false);
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 50, 50));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 170, 120, 10));

        jtxtStockActual.setBackground(new java.awt.Color(237, 235, 235));
        jtxtStockActual.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtStockActual.setForeground(new java.awt.Color(0, 0, 0));
        jtxtStockActual.setBorder(null);
        jtxtStockActual.setEnabled(false);
        jPanel2.add(jtxtStockActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 140, 120, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Stock Actual");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 120, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 120, 10));

        jtxtPrecioUnit.setEditable(false);
        jtxtPrecioUnit.setBackground(new java.awt.Color(237, 235, 235));
        jtxtPrecioUnit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtPrecioUnit.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPrecioUnit.setBorder(null);
        jPanel2.add(jtxtPrecioUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 120, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Precio. Unit");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

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
        jPanel2.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 930, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jbtnBorrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar(1).png"))); // NOI18N
        jbtnBorrar.setText("Borrar");
        jbtnBorrar.setEnabled(false);
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        jbtnEditar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.setEnabled(false);
        jbtnEditar.setPreferredSize(new java.awt.Dimension(128, 47));
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnRegistrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.setEnabled(false);
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });

        jbtnNuevo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-producto.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(219, 219, 219))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jbtnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNuevo)
                    .addComponent(jbtnRegistrar)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBorrar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtableEntradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableEntradasMouseClicked
        int id = Integer.parseInt(jtableEntradas.getValueAt(jtableEntradas.getSelectedRow(), 0).toString());
        entrada = control.traerEntrada(id);

        jtxtProducto.setText(entrada.getUnProducto().getDescripcion());
        jtxtStockActual.setText("" + entrada.getUnProducto().getStock());
        jtxtPrecioUnit.setText("" + entrada.getUnProducto().getPrecio());
        jtxtStockEntrante.setText("" + entrada.getStockEntrada());
        jtxtPrecioCompra.setText("" + entrada.getPrecioCompra());
        jfecha.setDate(entrada.getFechaEntrada());
        activarControles();
        activarEditAndDelete();
    }//GEN-LAST:event_jtableEntradasMouseClicked

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed

        String producto = jtxtProducto.getText();
        String stockEntradaStr = jtxtStockEntrante.getText();
        String precioEntradaStr = jtxtPrecioCompra.getText();
        Date fecha = jfecha.getDate();

        // Validar que todos los campos estén llenados
        if (producto.isEmpty() || stockEntradaStr.isEmpty() || precioEntradaStr.isEmpty() || fecha == null) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        } else {
            try {
                int stockEntrada = Integer.parseInt(stockEntradaStr);
                double precioEntrada = Double.parseDouble(precioEntradaStr);

                // Validar que los números sean positivos o válidos según tu lógica
                if (stockEntrada <= 0 || precioEntrada <= 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese valores válidos para stock y precio.");
                } else {
                    control.registrarEntrada(producto, stockEntrada, precioEntrada, fecha);
                    JOptionPane.showMessageDialog(null, "ENTRADA REGISTRADA CORRECTAMENTE");
                    cargarEntradas();
                    limpiar();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos para stock y precio.");
            }
        }

    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        String producto = jtxtProducto.getText();
        int stockEntrada = Integer.parseInt(jtxtStockEntrante.getText());
        double precioEntrada = Double.parseDouble(jtxtPrecioCompra.getText());
        Date fecha = jfecha.getDate();
        int stockActual = Integer.parseInt(jtxtStockActual.getText());

        control.editarEntrada(entrada, producto, stockEntrada, precioEntrada, fecha, stockActual);

        JOptionPane.showMessageDialog(null, "Entrada Editada correctamente");

        cargarEntradas();
        limpiar();
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
        if (jtableEntradas.getRowCount() > 0) {
            if (jtableEntradas.getSelectedRow() != -1) {
                int id = Integer.parseInt(jtableEntradas.getValueAt(jtableEntradas.getSelectedRow(), 0).toString());
                String producto = jtxtProducto.getText();
                int stockActual = Integer.parseInt(jtxtStockActual.getText());
                int stockEntrada = Integer.parseInt(jtxtStockEntrante.getText());
                control.borrarEntrada(id, stockActual, stockEntrada, producto);
                cargarEntradas();
                JOptionPane.showMessageDialog(null, "Entrada eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun producto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla esta vacia");
        }
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        ventanaBusquedaProductos busqueda = new ventanaBusquedaProductos();
        centrarVentana(busqueda);
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        activarControles();
        limpiar();
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarEntradas();
//        cargarComboBoxMarca();
//        cargarComboBoxCategoria();
//        cargarComboBoxProveedor();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jtxtStockEntranteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtStockEntranteKeyReleased
        String precioText = jtxtPrecioUnit.getText();
        String stockEntradaText = jtxtStockEntrante.getText();

        if (!precioText.isEmpty() && !stockEntradaText.isEmpty()) {
            try {
                double precio = Double.parseDouble(precioText);
                int stockEntrada = Integer.parseInt(stockEntradaText);

                double precioCompra = precio * stockEntrada;

                jtxtPrecioCompra.setText("" + formatearNumero(precioCompra));
            } catch (NumberFormatException ex) {

            }
        } else {
            jtxtPrecioCompra.setText("");
        }
    }//GEN-LAST:event_jtxtStockEntranteKeyReleased

    private void jtxtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtBuscarMousePressed
        if (jtxtBuscar.getText().equals("Buscar..."))
            jtxtBuscar.setText("");
    }//GEN-LAST:event_jtxtBuscarMousePressed

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        try {
            sorter.setRowFilter(RowFilter.regexFilter(jtxtBuscar.getText()));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    private double formatearNumero(double numero) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(numero));
    }

    public void activarControles() {
        jtxtProducto.setEnabled(true);
        jtxtProducto.requestFocus();
        jtxtStockEntrante.setEnabled(true);
        jtxtPrecioCompra.setEnabled(true);
        jbtnBuscar.setEnabled(true);
        jbtnRegistrar.setEnabled(true);
    }

    public void centrarVentana(JInternalFrame frame) {
        ventanaPrincipal.add(frame);
        Dimension dimension = ventanaPrincipal.getSize();
        Dimension dframe = frame.getSize();
        int x = (dimension.width - dframe.width) / 2;
        int y = (dimension.height - dframe.height) / 2;
        frame.setLocation(x, y);
        frame.setVisible(true);
    }

    public void limpiar() {
        jtxtProducto.setText("");
        jtxtPrecioUnit.setText("");
        jtxtStockEntrante.setText("");
        jtxtPrecioCompra.setText("");
        jtxtStockActual.setText("");
        jfecha.setDate(null);
        DesActivarEditAndDelete();
    }

    public void activarEditAndDelete() {
        jbtnEditar.setEnabled(true);
        jbtnBorrar.setEnabled(true);
        jbtnRegistrar.setEnabled(false);
    }

    public void DesActivarEditAndDelete() {
        jbtnEditar.setEnabled(false);
        jbtnBorrar.setEnabled(false);
        jbtnRegistrar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnRegistrar;
    private com.toedter.calendar.JDateChooser jfecha;
    private javax.swing.JTable jtableEntradas;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtPrecioCompra;
    public static javax.swing.JTextField jtxtPrecioUnit;
    public static javax.swing.JTextField jtxtProducto;
    public static javax.swing.JTextField jtxtStockActual;
    private javax.swing.JTextField jtxtStockEntrante;
    // End of variables declaration//GEN-END:variables

//    public void cargarComboBoxCategoria() {
//         Guarda el valor seleccionado actualmente
//        String seleccionActual = (String) jcbxCategoria.getSelectedItem();
//
//         Borra todos los elementos existentes en el JComboBox
//        jcbxCategoria.removeAllItems();
//
//         Agrega de nuevo el elemento "seleccionar"
//        jcbxCategoria.addItem("Seleccionar");
//
//         Carga las categorías desde la base de datos
//        List<Categoria> categorias = control.traerCategorias();
//
//         Agrega las categorías al JComboBox
//        for (Categoria cate : categorias) {
//            jcbxCategoria.addItem(cate.getNombreCategoria());
//        }
//
//         Restablece el valor seleccionado previamente
//        jcbxCategoria.setSelectedItem(seleccionActual);
//    }
//
//    public void cargarComboBoxProveedor() {
//         Guarda el valor seleccionado actualmente
//        String seleccionActual = (String) jcbxProveedor.getSelectedItem();
//
//         Borra todos los elementos existentes en el JComboBox
//        jcbxProveedor.removeAllItems();
//
//         Agrega de nuevo el elemento "seleccionar"
//        jcbxProveedor.addItem("Seleccionar");
//
//         Carga las categorías desde la base de datos
//        List<Proveedor> listaProveedores = control.traerProveedores();
//
//         Agrega las categorías al JComboBox
//        for (Proveedor provee : listaProveedores) {
//            jcbxProveedor.addItem(provee.getNombreProveedor());
//        }
//
//         Restablece el valor seleccionado previamente
//        jcbxProveedor.setSelectedItem(seleccionActual);
//    }
//
//    public void cargarComboBoxMarca() {
//         Guarda el valor seleccionado actualmente
//        String seleccionActual = (String) jcbxMarca.getSelectedItem();
//
//         Borra todos los elementos existentes en el JComboBox
//        jcbxMarca.removeAllItems();
//
//         Agrega de nuevo el elemento "seleccionar"
//        jcbxMarca.addItem("Seleccionar");
//
//         Carga las categorías desde la base de datos
//        List<Marca> listaMarcas = control.traerMarcas();
//
//         Agrega las categorías al JComboBox
//        for (Marca mc : listaMarcas) {
//            jcbxMarca.addItem(mc.getNombreMarca());
//        }
//
//         Restablece el valor seleccionado previamente
//        jcbxMarca.setSelectedItem(seleccionActual);
//    }
    private void cargarEntradas() {
        vaciarTabla();
        List<Entrada> listaEntradas = control.traerEntradas();

        if (listaEntradas != null) {
            for (Entrada entradas : listaEntradas) {

                Date fecha = entradas.getFechaEntrada();
                String fechaFormat = format_show.format(fecha);

                Object[] lista = {
                    entradas.getId(),
                    entradas.getUnProducto().getDescripcion(),
                    fechaFormat,
                    entradas.getStockEntrada(),
                    entradas.getPrecioCompra(),
                    entradas.getUnProducto().getUnaMarca().getNombreMarca(),
                    entradas.getUnProducto().getUnaCategoria().getNombreCategoria(),
                    entradas.getUnProducto().getUnProveedor().getNombreProveedor()};
                modelo.addRow(lista);
            }
        }

    }

    private void vaciarTabla() {
        for (int i = jtableEntradas.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarFiltroSorter() {
        jtableEntradas.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modelo);
        jtableEntradas.setRowSorter(sorter);
    }

}
