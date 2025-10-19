package interfaz;

import static interfaz.Jframe_Admin.ventanaPrincipal;
import java.awt.Dimension;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.Categoria;
import logica.ControlExcel;
import logica.ControlReportes;
import logica.Controladora;
import logica.DatosReporteProductos;
import logica.Marca;
import logica.Producto;
import logica.Proveedor;

/**
 *
 * @author sergi
 */
public class VentanaProductos extends javax.swing.JInternalFrame {

    Jframe_Admin frame = new Jframe_Admin();
    Producto instanciaProducto;
    Controladora control = new Controladora();
    DefaultTableModel modeloProductos;
    ControlReportes reporte = new ControlReportes();

    TableRowSorter<DefaultTableModel> sorter;

    public VentanaProductos() {
        initComponents();
        modeloProductos = (DefaultTableModel) jtableProductos.getModel();
        jtableProductos.setRowHeight(30);
        cargarFiltroSorter();
        cargarProductos();
        DiaFecha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProductos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jtxtProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jtxtStockMinimo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jtxtStockNormal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jtxtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbxProveedor = new javax.swing.JComboBox<>();
        jbtnAgregarProveedor = new javax.swing.JButton();
        jcbxCategoria = new javax.swing.JComboBox<>();
        jbtnAgregarCategotria = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jbtnExpotarProductos = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jcbxMarca = new javax.swing.JComboBox<>();
        jbtnAgregarMarca = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbtnNuevo = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        jSeparator24 = new javax.swing.JSeparator();
        jtxtBuscar = new javax.swing.JTextField();
        fecha = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Productos");
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
            jtableProductos.getColumnModel().getColumn(0).setPreferredWidth(1);
            jtableProductos.getColumnModel().getColumn(1).setPreferredWidth(250);
            jtableProductos.getColumnModel().getColumn(2).setPreferredWidth(25);
            jtableProductos.getColumnModel().getColumn(3).setPreferredWidth(25);
            jtableProductos.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel12.setText("En este apartado puede crear, editar y eliminar productos*");

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Productos");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar::."));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtProducto.setBackground(new java.awt.Color(237, 235, 235));
        jtxtProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtProducto.setForeground(new java.awt.Color(0, 0, 0));
        jtxtProducto.setBorder(null);
        jtxtProducto.setEnabled(false);
        jPanel4.add(jtxtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 340, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel1.setText("Nombre producto*");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 255));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 120, 10));

        jtxtStockMinimo.setBackground(new java.awt.Color(237, 235, 235));
        jtxtStockMinimo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtStockMinimo.setForeground(new java.awt.Color(0, 0, 0));
        jtxtStockMinimo.setBorder(null);
        jtxtStockMinimo.setEnabled(false);
        jPanel4.add(jtxtStockMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 120, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel2.setText("Stock Minimo*");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 102, 255));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 120, 10));

        jtxtStockNormal.setBackground(new java.awt.Color(237, 235, 235));
        jtxtStockNormal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtStockNormal.setForeground(new java.awt.Color(0, 0, 0));
        jtxtStockNormal.setBorder(null);
        jtxtStockNormal.setEnabled(false);
        jPanel4.add(jtxtStockNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 120, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel3.setText("Stock*");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 102, 255));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 120, 10));

        jtxtPrecio.setBackground(new java.awt.Color(237, 235, 235));
        jtxtPrecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPrecio.setBorder(null);
        jtxtPrecio.setEnabled(false);
        jPanel4.add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 120, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel4.setText("Precio*");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel5.setText("Nombre de marca*");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel6.setText("Categoria*");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel7.setText("Proveedor*");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jcbxProveedor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcbxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jcbxProveedor.setEnabled(false);
        jcbxProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbxProveedorMouseClicked(evt);
            }
        });
        jPanel4.add(jcbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 170, 30));

        jbtnAgregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        jbtnAgregarProveedor.setEnabled(false);
        jbtnAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarProveedorActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnAgregarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 40, 30));

        jcbxCategoria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jcbxCategoria.setEnabled(false);
        jcbxCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbxCategoriaMouseClicked(evt);
            }
        });
        jPanel4.add(jcbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 200, 30));

        jbtnAgregarCategotria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        jbtnAgregarCategotria.setEnabled(false);
        jbtnAgregarCategotria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarCategotriaActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnAgregarCategotria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 40, 30));

        jButton6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        jButton6.setText("Exportar PDF");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 47));

        jbtnExpotarProductos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnExpotarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        jbtnExpotarProductos.setText("Exportar Excel");
        jbtnExpotarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExpotarProductosActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnExpotarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, 47));

        jButton8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton-x.png"))); // NOI18N
        jButton8.setText("Cancelar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, 47));

        jcbxMarca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcbxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jcbxMarca.setEnabled(false);
        jcbxMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbxMarcaMouseClicked(evt);
            }
        });
        jcbxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxMarcaActionPerformed(evt);
            }
        });
        jPanel4.add(jcbxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 30));

        jbtnAgregarMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        jbtnAgregarMarca.setEnabled(false);
        jbtnAgregarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarMarcaActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnAgregarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 40, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones::."));

        jbtnNuevo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-producto.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
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

        jbtnBorrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar(1).png"))); // NOI18N
        jbtnBorrar.setText("Borrar");
        jbtnBorrar.setEnabled(false);
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(jbtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator24.setForeground(new java.awt.Color(0, 153, 255));

        jtxtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jtxtBuscar.setText("Buscar...");
        jtxtBuscar.setBorder(null);
        jtxtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtBuscarFocusLost(evt);
            }
        });
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

        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("jLabel8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtBuscar)
                            .addComponent(jSeparator24))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(947, 947, 947)
                                .addComponent(fecha)
                                .addGap(119, 119, 119))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(884, 884, 884))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jtxtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator24, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        activarControles();
        limpiarControles();
        jbtnEditar.setEnabled(false);
        jbtnBorrar.setEnabled(false);
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    public void activarControles() {
        jtxtProducto.setEnabled(true);
        jtxtProducto.requestFocus();
        jtxtStockMinimo.setEnabled(true);
        jtxtStockNormal.setEnabled(true);
        jtxtPrecio.setEnabled(true);
        jcbxMarca.setEnabled(true);
        jcbxCategoria.setEnabled(true);
        jcbxProveedor.setEnabled(true);
        jbtnAgregarCategotria.setEnabled(true);
        jbtnAgregarProveedor.setEnabled(true);
        jbtnAgregarMarca.setEnabled(true);
        jbtnRegistrar.setEnabled(true);
    }

    public void activiarEditrAndDelete() {
        jbtnEditar.setEnabled(true);
        jbtnBorrar.setEnabled(true);
        jbtnRegistrar.setEnabled(false);
    }

    public void limpiarControles() {
        jtxtProducto.setText("");
        jtxtStockMinimo.setText("");
        jtxtStockNormal.setText("");
        jtxtPrecio.setText("");
        jcbxMarca.setSelectedIndex(0);
        jcbxCategoria.setSelectedIndex(0);
        jcbxProveedor.setSelectedIndex(0);

    }

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
        String producto = jtxtProducto.getText().trim();
        String stockMinimoText = jtxtStockMinimo.getText().trim();
        String stockNormalText = jtxtStockNormal.getText().trim();
        String precioText = jtxtPrecio.getText().trim();
        String marca = jcbxMarca.getSelectedItem().toString();
        String categoria = jcbxCategoria.getSelectedItem().toString();
        String proveedor = jcbxProveedor.getSelectedItem().toString();

        if (producto.isEmpty() || stockMinimoText.isEmpty() || stockNormalText.isEmpty() || precioText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return;
        }

        try {
            int stockMinimo = Integer.parseInt(stockMinimoText);
            int stockNormal = Integer.parseInt(stockNormalText);
            double precio = Double.parseDouble(precioText);

            if (stockMinimo < 0 || stockNormal < 0 || precio <= 0) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese valores positivos para el stock y el precio.");
                return;
            }

            control.registrarProducto(producto, stockMinimo, stockNormal, precio, marca, categoria, proveedor);
            JOptionPane.showMessageDialog(null, "PRODUCTO REGISTRADO FUNCIONÓ.");
            cargarProductos();
            limpiarControles();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese números válidos en los campos de stock y precio.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jbtnAgregarCategotriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarCategotriaActionPerformed
        ventanaCategoria ventanaCate = new ventanaCategoria();
        centrarVentana(ventanaCate);

    }//GEN-LAST:event_jbtnAgregarCategotriaActionPerformed

    private void jbtnAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarProveedorActionPerformed
        ventanaProveedor ventanaProvee = new ventanaProveedor();
        centrarVentana(ventanaProvee);
    }//GEN-LAST:event_jbtnAgregarProveedorActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarComboBoxMarca();
        cargarComboBoxCategoria();
        cargarComboBoxProveedor();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jcbxCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbxCategoriaMouseClicked
        cargarComboBoxCategoria();
    }//GEN-LAST:event_jcbxCategoriaMouseClicked

    private void jcbxProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbxProveedorMouseClicked
        cargarComboBoxProveedor();
    }//GEN-LAST:event_jcbxProveedorMouseClicked

    private void jtxtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBuscarFocusLost
        jtxtBuscar.setText("Buscar...");
    }//GEN-LAST:event_jtxtBuscarFocusLost

    private void jtxtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtBuscarMousePressed
        if (jtxtBuscar.getText().equals("Buscar..."))
            jtxtBuscar.setText("");
    }//GEN-LAST:event_jtxtBuscarMousePressed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
        if (jtableProductos.getRowCount() > 0) {
            if (jtableProductos.getSelectedRow() != -1) {
                int id = Integer.parseInt(jtableProductos.getValueAt(jtableProductos.getSelectedRow(), 0).toString());
                String mensaje = control.borrarProducto(id);
                cargarProductos();
                JOptionPane.showMessageDialog(null, mensaje);
                limpiarControles();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun producto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla esta vacia");
        }
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jtableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProductosMouseClicked
        int id = Integer.parseInt(jtableProductos.getValueAt(jtableProductos.getSelectedRow(), 0).toString());
        instanciaProducto = control.traerProductoEditar(id);

        jtxtProducto.setText(instanciaProducto.getDescripcion());
        jtxtStockMinimo.setText("" + instanciaProducto.getStockMinimo());
        jtxtStockNormal.setText("" + instanciaProducto.getStock());
        jtxtPrecio.setText("" + instanciaProducto.getPrecio());
        jcbxMarca.setSelectedItem("" + instanciaProducto.getUnaMarca().getNombreMarca());
        jcbxCategoria.setSelectedItem(instanciaProducto.getUnaCategoria().getNombreCategoria());
        jcbxProveedor.setSelectedItem(instanciaProducto.getUnProveedor().getNombreProveedor());
        activarControles();
        activiarEditrAndDelete();
    }//GEN-LAST:event_jtableProductosMouseClicked

    private void jcbxMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbxMarcaMouseClicked
        cargarComboBoxMarca();
    }//GEN-LAST:event_jcbxMarcaMouseClicked

    private void jbtnAgregarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarMarcaActionPerformed
        ventanaMarca vtMarca = new ventanaMarca();
        centrarVentana(vtMarca);
    }//GEN-LAST:event_jbtnAgregarMarcaActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        String producto = jtxtProducto.getText();
        String stockMinimoText = jtxtStockMinimo.getText();
        String stockNormalText = jtxtStockNormal.getText();
        String precioText = jtxtPrecio.getText();
        String marca = jcbxMarca.getSelectedItem().toString();
        String categoria = jcbxCategoria.getSelectedItem().toString();
        String proveedor = jcbxProveedor.getSelectedItem().toString();

        if (producto.isEmpty() || stockMinimoText.isEmpty() || stockNormalText.isEmpty() || precioText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
        } else {
            try {
                int stockMinimo = Integer.parseInt(stockMinimoText);
                int stockNormal = Integer.parseInt(stockNormalText);
                double precio = Double.parseDouble(precioText);

                control.editarProductos(instanciaProducto, producto, stockMinimo, stockNormal, precio, marca, categoria, proveedor);

                JOptionPane.showMessageDialog(null, "Producto editado correctamente.");

                cargarProductos();
                limpiarControles();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese valores válidos para stock y precio.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnExpotarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExpotarProductosActionPerformed
        try {
            ControlExcel excel = new ControlExcel();
            excel.exportarExcel(jtableProductos);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtnExpotarProductosActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        limpiarControles();
        jbtnRegistrar.setEnabled(false);
        jbtnEditar.setEnabled(false);
        jbtnBorrar.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        try {
            sorter.setRowFilter(RowFilter.regexFilter(jtxtBuscar.getText()));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        List<Producto> listaProductos = control.traerProductos();

        List<DatosReporteProductos> DatosreporteProductos = new ArrayList<>();
        String fecha = this.fecha.getText();
        int totalProductos = totalProductos();
        int StockTotal = stockTotal();

        for (Producto pd : listaProductos) {

            DatosReporteProductos datosProductos = new DatosReporteProductos(
                    pd.getId(),
                    fecha,
                    pd.getDescripcion(),
                    pd.getStockMinimo(),
                    pd.getStock(),
                    pd.getPrecio(),
                    pd.getUnaMarca().getNombreMarca(),
                    pd.getUnaCategoria().getNombreCategoria(),
                    pd.getUnProveedor().getNombreProveedor(),
                    totalProductos
            );
            DatosreporteProductos.add(datosProductos);
        }
        reporte.exportarReporteProductos(DatosreporteProductos);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jcbxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxMarcaActionPerformed

    public int totalProductos() {
        List<Producto> listaProductos = control.traerProductos();

        int numProductos = 0;

        for (int i = 0; i < listaProductos.size(); i++) {
            numProductos++;
        }
        return numProductos;
    }

    public int stockTotal() {

        List<Producto> listaProductos = control.traerProductos();

        int stockTotal = 0;

        for (Producto pd : listaProductos) {
            stockTotal = pd.getStock();
        }

        return stockTotal;
    }

    public void DiaFecha() {
        //METODO PARA MOSTRAR LA FECHA 
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12"};
        fecha.setText(year + "/" + meses[month - 1] + "/" + day);
    }

    public void cargarComboBoxCategoria() {
        // Guarda el valor seleccionado actualmente
        String seleccionActual = (String) jcbxCategoria.getSelectedItem();

        // Borra todos los elementos existentes en el JComboBox
        jcbxCategoria.removeAllItems();

        // Agrega de nuevo el elemento "seleccionar"
        jcbxCategoria.addItem("Seleccionar");

        // Carga las categorías desde la base de datos
        List<Categoria> categorias = control.traerCategorias();

        // Agrega las categorías al JComboBox
        for (Categoria cate : categorias) {
            jcbxCategoria.addItem(cate.getNombreCategoria());
        }

        // Restablece el valor seleccionado previamente
        jcbxCategoria.setSelectedItem(seleccionActual);
    }

    public void cargarComboBoxProveedor() {
        // Guarda el valor seleccionado actualmente
        String seleccionActual = (String) jcbxProveedor.getSelectedItem();

        // Borra todos los elementos existentes en el JComboBox
        jcbxProveedor.removeAllItems();

        // Agrega de nuevo el elemento "seleccionar"
        jcbxProveedor.addItem("Seleccionar");

        // Carga las categorías desde la base de datos
        List<Proveedor> listaProveedores = control.traerProveedores();

        // Agrega las categorías al JComboBox
        for (Proveedor provee : listaProveedores) {
            jcbxProveedor.addItem(provee.getNombreProveedor());
        }

        // Restablece el valor seleccionado previamente
        jcbxProveedor.setSelectedItem(seleccionActual);
    }

    public void cargarComboBoxMarca() {
        // Guarda el valor seleccionado actualmente
        String seleccionActual = (String) jcbxMarca.getSelectedItem();

        // Borra todos los elementos existentes en el JComboBox
        jcbxMarca.removeAllItems();

        // Agrega de nuevo el elemento "seleccionar"
        jcbxMarca.addItem("Seleccionar");

        // Carga las categorías desde la base de datos
        List<Marca> listaMarcas = control.traerMarcas();

        // Agrega las categorías al JComboBox
        for (Marca mc : listaMarcas) {
            jcbxMarca.addItem(mc.getNombreMarca());
        }

        // Restablece el valor seleccionado previamente
        jcbxMarca.setSelectedItem(seleccionActual);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fecha;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jbtnAgregarCategotria;
    private javax.swing.JButton jbtnAgregarMarca;
    private javax.swing.JButton jbtnAgregarProveedor;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnExpotarProductos;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnRegistrar;
    public static javax.swing.JComboBox<String> jcbxCategoria;
    public static javax.swing.JComboBox<String> jcbxMarca;
    private javax.swing.JComboBox<String> jcbxProveedor;
    private javax.swing.JTable jtableProductos;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtProducto;
    private javax.swing.JTextField jtxtStockMinimo;
    private javax.swing.JTextField jtxtStockNormal;
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

    private void cargarFiltroSorter() {
        jtableProductos.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modeloProductos);
        jtableProductos.setRowSorter(sorter);
    }
}
