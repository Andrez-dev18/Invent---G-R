package interfaz;

import static interfaz.Jframe_Admin.ventanaPrincipal;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.ControlReportes;
import logica.Controladora;
import logica.DatosReporteVenta;
import logica.Detalle_Venta;
import logica.Usuario;

/**
 *
 * @author sergi
 */
public class ventanaVenta extends javax.swing.JInternalFrame {

    Controladora control = new Controladora();
    Usuario user;

    ControlReportes reportes = new ControlReportes();

    DefaultTableModel modelo;

    public static int idProducto = 0;
    double importe = 0.0;
    double cambio = 0.0;
    double total = 0.0;

    private SimpleDateFormat format_date = new SimpleDateFormat("yyyy/MM/d");  //Formato de la fecha para guardar
    private SimpleDateFormat format_show = new SimpleDateFormat("dd/MM/yyyy");  //Formato de la fecha para mostrar

    public ventanaVenta(Usuario user) {
        initComponents();
        this.user = user;
        jtableVenta.setRowHeight(20);
        DiaFecha();
        jspinerCantidad.setValue(1);
    }

    public ventanaVenta() {
    }

    public void DiaFecha() {
        //METODO PARA MOSTRAR LA FECHA 
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12"};
        jlblFechaRegistro.setText(year + "/" + meses[month - 1] + "/" + day);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtxtNumComprobante = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtDNICliente = new javax.swing.JTextField();
        jbtnBuscarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtxtNombreCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtProducto = new javax.swing.JTextField();
        jbtnNuevoCliente = new javax.swing.JButton();
        jbtnAgregarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtStockDisponible = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtPrecioUnitario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jspinerCantidad = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jtxtVendedor = new javax.swing.JTextField();
        jbtnAgregarVenta = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jtxtItems = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcbxDescuento = new javax.swing.JComboBox<>();
        jtxtPorcentajeDesc = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableVenta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jtxtImporte = new javax.swing.JTextField();
        jtxtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtxtCambio = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jbtnGenerarVenta = new javax.swing.JButton();
        jbtnPagar = new javax.swing.JButton();
        jlblFechaRegistro = new javax.swing.JLabel();
        Jlabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Ventas");
        setToolTipText("");
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Punto de venta G&R Soluciones");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel12.setText("Venta de articulos tecnologicos");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 90));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, 90));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Num. Comprobante:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jtxtNumComprobante.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jPanel2.add(jtxtNumComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 62, 110, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 110));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DNI CLIENTE:");

        jtxtDNICliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jbtnBuscarCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnBuscarCliente.setText("Buscar");
        jbtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CLIENTE:");

        jtxtNombreCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtNombreCliente.setForeground(new java.awt.Color(0, 102, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PRODUCTO:");

        jtxtProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jbtnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        jbtnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoClienteActionPerformed(evt);
            }
        });

        jbtnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        jbtnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarProductoActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CANT. DISPONIBLE:");

        jtxtStockDisponible.setEditable(false);
        jtxtStockDisponible.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PREC. UNITARIO:");

        jtxtPrecioUnitario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CANTIDAD:");

        jspinerCantidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("VENDEDOR:");

        jtxtVendedor.setEditable(false);
        jtxtVendedor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jbtnAgregarVenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnAgregarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carritovender.png"))); // NOI18N
        jbtnAgregarVenta.setText("Agregar Venta");
        jbtnAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarVentaActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton-x.png"))); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jtxtItems.setEditable(false);
        jtxtItems.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ITEMS AGREGADOS:");

        jLabel16.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Precios:");

        jcbxDescuento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcbxDescuento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aplicar", "Normal", "Precio 1", "Precio 2", "Precio 3" }));
        jcbxDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxDescuentoActionPerformed(evt);
            }
        });

        jtxtPorcentajeDesc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(jtxtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jbtnBuscarCliente)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(19, 19, 19)
                                .addComponent(jbtnAgregarVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(6, 6, 6)
                                .addComponent(jtxtItems, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jbtnAgregarProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtStockDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(5, 5, 5)
                                .addComponent(jtxtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jspinerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbxDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtPorcentajeDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jbtnAgregarProducto)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtxtStockDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jcbxDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jspinerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addComponent(jtxtPorcentajeDesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jtxtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jbtnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnNuevoCliente)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jbtnAgregarVenta))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtItems, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(19, 19, 19))))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 860, 290));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableVenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Cantidad", "Prec. Unitario", "Prec. de venta", "Descuento", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableVenta);
        if (jtableVenta.getColumnModel().getColumnCount() > 0) {
            jtableVenta.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtableVenta.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 840, 200));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("IMPORTE:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        jtxtImporte.setEditable(false);
        jtxtImporte.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel4.add(jtxtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 40));

        jtxtTotal.setEditable(false);
        jtxtTotal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel4.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 160, 48));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CAMBIO:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 20));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("TOTAL A PAGAR:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 150, 50));

        jtxtCambio.setEditable(false);
        jtxtCambio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel4.add(jtxtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 100, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 860, 320));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbtnGenerarVenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/generarVenta.png"))); // NOI18N
        jbtnGenerarVenta.setText("Generar Venta");
        jbtnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerarVentaActionPerformed(evt);
            }
        });

        jbtnPagar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/realizarVenta.png"))); // NOI18N
        jbtnPagar.setText("Pagar");
        jbtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPagarActionPerformed(evt);
            }
        });

        jlblFechaRegistro.setBackground(new java.awt.Color(0, 0, 0));
        jlblFechaRegistro.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblFechaRegistro.setForeground(new java.awt.Color(0, 0, 0));
        jlblFechaRegistro.setText("fecha");

        Jlabel1.setBackground(new java.awt.Color(0, 0, 0));
        Jlabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Jlabel1.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel1.setText("Fecha:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnPagar)
                .addGap(26, 26, 26)
                .addComponent(jbtnGenerarVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                .addComponent(Jlabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblFechaRegistro)
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnPagar)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblFechaRegistro)
                        .addComponent(Jlabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 860, 80));

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

    private void jbtnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoClienteActionPerformed
        BuscarCliente bspd = new BuscarCliente();
        centrarVentana(bspd);
    }//GEN-LAST:event_jbtnNuevoClienteActionPerformed


    private void jbtnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarProductoActionPerformed
        BusquedaProductosVenta bpVenta = new BusquedaProductosVenta();
        centrarVentana(bpVenta);
    }//GEN-LAST:event_jbtnAgregarProductoActionPerformed

    private void jbtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarClienteActionPerformed
        String dniRecivido = jtxtDNICliente.getText();

        String clienteEncontrado = control.traerClientePorDNI(dniRecivido);

        if ("Cliente no encontrado".equals(clienteEncontrado)) {
            jtxtNombreCliente.setForeground(Color.RED);
        } else {
            jtxtNombreCliente.setForeground(Color.BLUE);
        }

        jtxtNombreCliente.setText(clienteEncontrado);

    }//GEN-LAST:event_jbtnBuscarClienteActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        this.jtxtVendedor.setText(user.getNombre());

        int numComprobante = control.traerComprobante();

        jtxtNumComprobante.setText("000" + numComprobante);

        modelo = (DefaultTableModel) jtableVenta.getModel();

    }//GEN-LAST:event_formInternalFrameOpened

    private void jbtnAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarVentaActionPerformed

        String producto = jtxtProducto.getText();
        String cantidadVentaText = jspinerCantidad.getValue().toString();
        String precioUniText = jtxtPrecioUnitario.getText();
        String precioVenta = jcbxDescuento.getSelectedItem().toString();
        String stockDispoText = jtxtStockDisponible.getText();

        if (!producto.isEmpty() && !cantidadVentaText.isEmpty() && !precioUniText.isEmpty()
                && !precioVenta.isEmpty() && !stockDispoText.isEmpty() && !precioVenta.equals("Aplicar")) {
            try {
                int cantidadVenta = Integer.parseInt(cantidadVentaText);
                double precioUni = Double.parseDouble(precioUniText);
                int stockDispo = Integer.parseInt(stockDispoText);

                double PrecioDescuento = aplicarDescuento(precioUni, precioVenta);

                double subtotal = PrecioDescuento * cantidadVenta;

                if (stockDispo < cantidadVenta) {
                    JOptionPane.showMessageDialog(null, "Stock Insuficiente");
                } else {
                    Object[] lista = {idProducto, producto, cantidadVenta, formatearNumero(precioUni), precioVenta, formatearNumero(PrecioDescuento), formatearNumero(subtotal)};

                    modelo.addRow(lista);

                    int items = modelo.getRowCount() + 0;
                    jtxtItems.setText("" + items);

                    int nuevoStock = stockDispo - cantidadVenta;
                    jtxtStockDisponible.setText("" + nuevoStock);

                    total = total + subtotal;
                    jtxtTotal.setText("S/. " + formatearNumero(total));

                    control.restarProducto(producto, cantidadVenta);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos en cantidad y precio.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
        }

    }//GEN-LAST:event_jbtnAgregarVentaActionPerformed

    public double aplicarDescuento(double precio, String descuento) {
        double precioDes = 0;
        switch (descuento) {
            case "Precio 1":
                precioDes = precio * 0.05;
                return formatearNumero(precio - precioDes);
            case "Precio 2":
                precioDes = precio * 0.10;
                return formatearNumero(precio - precioDes);
            case "Precio 3":
                precioDes = precio * 0.15;
                return formatearNumero(precio - precioDes);
            default:
                break;
        }
        return precio;
    }

    private double formatearNumero(double numero) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(numero));
    }

    private void jbtnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarVentaActionPerformed

        boolean validacion = validarCampos();

        if (validacion == true) {
            try {
                double importe = this.importe;
                double cambio = this.cambio;
                String numComprobante = jtxtNumComprobante.getText();
                String cliente = jtxtNombreCliente.getText();
                String vendedor = jtxtVendedor.getText();
                String fecha = jlblFechaRegistro.getText();
                Date fechaRegistro = format_date.parse(fecha);

                List<DatosReporteVenta> datosReporteList = new ArrayList<>();

                for (int i = 0; i < modelo.getRowCount(); i++) {
                    int id = Integer.parseInt(modelo.getValueAt(i, 0).toString());
                    String producto = modelo.getValueAt(i, 1).toString();
                    int cantidad = Integer.parseInt(modelo.getValueAt(i, 2).toString());
                    double precioUni = Double.parseDouble(modelo.getValueAt(i, 3).toString());
                    double subtotal = Double.parseDouble(modelo.getValueAt(i, 6).toString());

                    DatosReporteVenta reporte = new DatosReporteVenta(numComprobante, fecha, cliente, vendedor, id, cantidad, producto, precioUni, subtotal, importe, cambio, total);
                    datosReporteList.add(reporte);
                    control.registrarVenta(cantidad, numComprobante, precioUni, subtotal, total, importe, cambio, fechaRegistro, cliente, vendedor, producto);
                }

                reportes.exportarReporteJasper2(datosReporteList);

                JOptionPane.showMessageDialog(null, "VENTA REGISTRADA");
                limpiarVenta();
                int numcomprobante = Integer.parseInt(jtxtNumComprobante.getText());
                numcomprobante++;
                jtxtNumComprobante.setText("000" + numcomprobante);
            } catch (NumberFormatException | ParseException e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Faltan Campos por llenar");
        }


    }//GEN-LAST:event_jbtnGenerarVentaActionPerformed

    private void jbtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPagarActionPerformed

        try {
            String importeJoption = JOptionPane.showInputDialog("Ingrese la cantidad a pagar");

            if (importeJoption != null && !importeJoption.isEmpty()) {
                importe = Double.parseDouble(importeJoption);

                if (total <= importe) {
                    cambio = importe - total;
                    double pagoN = formatearNumero(importe);
                    double cambioN = formatearNumero(cambio);
                    JOptionPane.showMessageDialog(null, "SÉ PAGO CON S/." + pagoN + "\nY SU CAMBIO ES DE S/." + cambioN);
                    jtxtImporte.setText("S/." + pagoN);
                    jtxtCambio.setText("S/." + cambioN);
                } else {
                    JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jbtnPagarActionPerformed

    private void jcbxDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxDescuentoActionPerformed
        if (jcbxDescuento.getSelectedItem().equals("Precio 1")) {
            jtxtPorcentajeDesc.setText("05%");
        } else if (jcbxDescuento.getSelectedItem().equals("Precio 2")) {
            jtxtPorcentajeDesc.setText("10%");
        } else if (jcbxDescuento.getSelectedItem().equals("Precio 3")) {
            jtxtPorcentajeDesc.setText("15%");
        } else {
            jtxtPorcentajeDesc.setText("00%");
        }
    }//GEN-LAST:event_jcbxDescuentoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        limpiarVenta();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void centrarVentana(JInternalFrame frame) {
        ventanaPrincipal.add(frame);
        Dimension dimension = ventanaPrincipal.getSize();
        Dimension dframe = frame.getSize();
        int x = (dimension.width - dframe.width) / 2;
        int y = (dimension.height - dframe.height) / 2;
        frame.setLocation(x, y);
        frame.setVisible(true);
    }

    public void limpiarVenta() {
        jtxtProducto.setText("");
        jtxtStockDisponible.setText("");
        jtxtPrecioUnitario.setText("");
        jspinerCantidad.setValue(0);
        jcbxDescuento.setSelectedIndex(0);
        jtxtPorcentajeDesc.setText("");
        jtxtDNICliente.setText("");
        jtxtNombreCliente.setText("");
        jtxtItems.setText("");
        jtxtImporte.setText("");
        jtxtCambio.setText("");
        jtxtTotal.setText("");
        modelo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregarProducto;
    private javax.swing.JButton jbtnAgregarVenta;
    private javax.swing.JButton jbtnBuscarCliente;
    private javax.swing.JButton jbtnGenerarVenta;
    private javax.swing.JButton jbtnNuevoCliente;
    private javax.swing.JButton jbtnPagar;
    private javax.swing.JComboBox<String> jcbxDescuento;
    private javax.swing.JLabel jlblFechaRegistro;
    private javax.swing.JSpinner jspinerCantidad;
    private javax.swing.JTable jtableVenta;
    private javax.swing.JTextField jtxtCambio;
    public static javax.swing.JTextField jtxtDNICliente;
    private javax.swing.JTextField jtxtImporte;
    private javax.swing.JTextField jtxtItems;
    public static javax.swing.JTextField jtxtNombreCliente;
    private javax.swing.JTextField jtxtNumComprobante;
    private javax.swing.JTextField jtxtPorcentajeDesc;
    public static javax.swing.JTextField jtxtPrecioUnitario;
    public static javax.swing.JTextField jtxtProducto;
    public static javax.swing.JTextField jtxtStockDisponible;
    private javax.swing.JTextField jtxtTotal;
    private javax.swing.JTextField jtxtVendedor;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() {
        String producto = jtxtProducto.getText();
        String cantidadVentaText = jspinerCantidad.getValue().toString();
        String precioUniText = jtxtPrecioUnitario.getText();
        String stockDispoText = jtxtStockDisponible.getText();
        String numComprobante = jtxtNumComprobante.getText();
        String cliente = jtxtNombreCliente.getText();
        String vendedor = jtxtVendedor.getText();
        String fecha = jlblFechaRegistro.getText();
        String importe = jtxtImporte.getText();
        String cambio = jtxtCambio.getText();
        String totalPagar = jtxtTotal.getText();

        // Verificar si algún campo está vacío
        if (producto.isEmpty() || cantidadVentaText.isEmpty() || precioUniText.isEmpty()
                || stockDispoText.isEmpty() || numComprobante.isEmpty() || cliente.isEmpty()
                || vendedor.isEmpty() || fecha.isEmpty() || importe.isEmpty() || cambio.isEmpty()
                || totalPagar.isEmpty()) {
            return false;
        }

        try {
            // Verificar si los valores numéricos son válidos
            int cantidadVenta = Integer.parseInt(cantidadVentaText);
            double precioUni = Double.parseDouble(precioUniText);
            int stockDispo = Integer.parseInt(stockDispoText);

            // Verificar otros criterios de validación si es necesario
            // Si todos los campos no están vacíos y los valores numéricos son válidos, retornar true
            return true;
        } catch (NumberFormatException e) {
            // Si hay un error al convertir a números, retorna false
            return false;
        }
    }

}
