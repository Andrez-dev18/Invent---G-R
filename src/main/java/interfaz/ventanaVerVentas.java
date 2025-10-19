package interfaz;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.ControlReportes;
import logica.Controladora;
import logica.DatosReporteGeneral;
import logica.DatosReporteVenta;
import logica.Detalle_Venta;
import logica.venta;

/**
 *
 * @author sergi
 */
public class ventanaVerVentas extends javax.swing.JInternalFrame {

    Controladora control = new Controladora();

    ControlReportes reportes = new ControlReportes();

    DefaultTableModel modelo;
    
    TableRowSorter<DefaultTableModel> sorter;

    private SimpleDateFormat format_date = new SimpleDateFormat("yyyy/MM/d");  //Formato de la fecha para guardar
    private SimpleDateFormat format_show = new SimpleDateFormat("dd/MM/yyyy");  //Formato de la fecha para mostrar

    public ventanaVerVentas() {
        initComponents();
        modelo = (DefaultTableModel) jtableDetalleVentas.getModel();
        DiaFecha();
        cargarFiltroSorter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableDetalleVentas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jlblVentasSemana = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlblVentasDiarias = new javax.swing.JLabel();
        jlblFechaRegistro = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jlabel18 = new javax.swing.JLabel();
        jlblVentaMensual = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jbtnReportePorComprobante = new javax.swing.JButton();
        jtxtNumComprobante = new javax.swing.JTextField();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jtableDetalleVentas.setBackground(new java.awt.Color(255, 255, 255));
        jtableDetalleVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtableDetalleVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Num.Comprobante", "Fecha Venta", "Producto", "Cant. Vendida", "Precio. Uni", "SubTotal", "Total", "Importe", "Cambio", "Cliente", "Vendedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableDetalleVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableDetalleVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableDetalleVentas);
        if (jtableDetalleVentas.getColumnModel().getColumnCount() > 0) {
            jtableDetalleVentas.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1400, 350));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblVentasSemana.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlblVentasSemana.setForeground(new java.awt.Color(112, 112, 112));
        jlblVentasSemana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblVentasSemana.setText("850.500");
        jPanel6.add(jlblVentasSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 20, 210, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Recaudacion De Venta Semanal");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7-dias (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 390, 120));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Recaudacion De Venta Diaria");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jlblVentasDiarias.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlblVentasDiarias.setForeground(new java.awt.Color(112, 112, 112));
        jlblVentasDiarias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblVentasDiarias.setText("1500.00");
        jPanel7.add(jlblVentasDiarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 20, 210, -1));

        jlblFechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jlblFechaRegistro.setText("jLabel3");
        jPanel7.add(jlblFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 80, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario (1).png"))); // NOI18N
        jButton4.setDefaultCapable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, -1));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 390, 120));

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 390, 20));

        jSeparator3.setBackground(new java.awt.Color(51, 222, 26));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 390, 20));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 390, 20));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel18.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jlabel18.setForeground(new java.awt.Color(153, 153, 153));
        jlabel18.setText("Recaudacion De Venta Mensual");
        jPanel10.add(jlabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jlblVentaMensual.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlblVentaMensual.setForeground(new java.awt.Color(112, 112, 112));
        jlblVentaMensual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblVentaMensual.setText("1500");
        jPanel10.add(jlblVentaMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 20, 230, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/30-dias.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 390, 120));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1360, 160));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Registro General De Ventas");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel12.setText("En este apartado puede visualizar la informacion de las ventas y crear reportes*");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cambiar Fecha Reporte"));

        jDateFecha.setDateFormatString("yyyy/MM/d");
        jDateFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setText("Cambiar Fecha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 260, 310, 70));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Reporte por comprobante"));

        jbtnReportePorComprobante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbtnReportePorComprobante.setText("Imprimir ");
        jbtnReportePorComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReportePorComprobanteActionPerformed(evt);
            }
        });

        jtxtNumComprobante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtNumComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnReportePorComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnReportePorComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 270, 70));

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
        jPanel2.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 670, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarVentas();
        //totalProductosVendidos();
        ventasPorSemana();
        totalVentasDiarias();
        ventasPorMes();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jbtnReportePorComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReportePorComprobanteActionPerformed

        String Ncomprobante = jtxtNumComprobante.getText();

        if (!Ncomprobante.isEmpty()) {
            List<Detalle_Venta> listaDetalle = control.traerDetalleVentaPorComprobante(Ncomprobante);

        List<DatosReporteVenta> datosReporteList = new ArrayList<>();

        for (Detalle_Venta dv : listaDetalle) {

            Date fech = dv.getVenta().getFechaVenta();
            String fecha = format_show.format(fech);

            DatosReporteVenta reporte = new DatosReporteVenta(
                    dv.getNumComprobante(),
                    fecha,
                    dv.getVenta().getUnCliente().getNombre(),
                    dv.getVenta().getUnUsuario().getNombre(),
                    dv.getProducto().getId(),
                    dv.getVenta().getCantVenta(),
                    dv.getProducto().getDescripcion(),
                    dv.getVenta().getPrecioUntiario(),
                    dv.getVenta().getSubTotal(),
                    dv.getVenta().getImporte(),
                    dv.getVenta().getCambio(),
                    dv.getMontoTotal()
            );
            datosReporteList.add(reporte);
        }
        reportes.exportarReporteJasper2(datosReporteList);
        }else{
            JOptionPane.showMessageDialog(null, "Por favor ingrese o seleccione un numero de comprobante", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnReportePorComprobanteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ventasPorSemana();
        totalVentasDiarias();
        ventasPorMes();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtableDetalleVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableDetalleVentasMouseClicked
        String Ncomprobante = jtableDetalleVentas.getValueAt(jtableDetalleVentas.getSelectedRow(), 1).toString();
        jtxtNumComprobante.setText(Ncomprobante);
    }//GEN-LAST:event_jtableDetalleVentasMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Date fecha = jDateFecha.getDate();
        String nombreReporte = "REPORTE VENTA DIARIA";
        List<Detalle_Venta> listaDetalle = control.traerDetalleVentaPorFecha(fecha);

        List<DatosReporteGeneral> datosReporte = new ArrayList<>();
        double totalVenta = 0;
        
        for (Detalle_Venta dv : listaDetalle) {
            Date fech = dv.getVenta().getFechaVenta();
            String fechaReporte = format_show.format(fecha);
                 
            totalVenta += dv.getVenta().getSubTotal();

            DatosReporteGeneral reporteGeneral = new DatosReporteGeneral(
                    nombreReporte,
                    fechaReporte,
                    dv.getProducto().getId(),
                    dv.getVenta().getCantVenta(),
                    dv.getProducto().getDescripcion(),
                    dv.getVenta().getPrecioUntiario(),
                    dv.getVenta().getSubTotal(),
                    formatearNumero(totalVenta)
            );
            datosReporte.add(reporteGeneral);
        }
            reportes.exportarReporteVentaGeneral(datosReporte);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Date fecha = jDateFecha.getDate();
        String nombreReporte = "REPORTE VENTA SEMANAL";
        List<Detalle_Venta> listaDetalle = control.traerDetalleVentaPorSemana(fecha);

        List<DatosReporteGeneral> datosReporte = new ArrayList<>();
        double totalVenta = 0;
        
        for (Detalle_Venta dv : listaDetalle) {
            Date fech = dv.getVenta().getFechaVenta();
            String fechaReporte = format_show.format(fecha);
                 
            totalVenta += dv.getVenta().getSubTotal();

            DatosReporteGeneral reporteGeneral = new DatosReporteGeneral(
                    nombreReporte,
                    fechaReporte,
                    dv.getProducto().getId(),
                    dv.getVenta().getCantVenta(),
                    dv.getProducto().getDescripcion(),
                    dv.getVenta().getPrecioUntiario(),
                    dv.getVenta().getSubTotal(),
                    formatearNumero(totalVenta)
            );
            datosReporte.add(reporteGeneral);
        }
            reportes.exportarReporteVentaGeneral(datosReporte);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Date fecha = jDateFecha.getDate();
        String nombreReporte = "REPORTE VENTA MENSUAL";
        List<Detalle_Venta> listaDetalle = control.traerDetalleVentasPorMes(fecha);

        List<DatosReporteGeneral> datosReporte = new ArrayList<>();
        double totalVenta = 0;
        
        for (Detalle_Venta dv : listaDetalle) {
            Date fech = dv.getVenta().getFechaVenta();
            String fechaReporte = format_show.format(fecha);
                 
            totalVenta += dv.getVenta().getSubTotal();

            DatosReporteGeneral reporteGeneral = new DatosReporteGeneral(
                    nombreReporte,
                    fechaReporte,
                    dv.getProducto().getId(),
                    dv.getVenta().getCantVenta(),
                    dv.getProducto().getDescripcion(),
                    dv.getVenta().getPrecioUntiario(),
                    dv.getVenta().getSubTotal(),
                    formatearNumero(totalVenta)
            );
            datosReporte.add(reporteGeneral);
        }
            reportes.exportarReporteVentaGeneral(datosReporte);
    }//GEN-LAST:event_jButton2ActionPerformed

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

//    public void totalProductosVendidos() {
//
//        List<venta> listaVenta = control.traerVenta();
//
//        int totalCantVenta = 0;
//
//        for (venta vt : listaVenta) {
//            totalCantVenta += vt.getCantVenta();
//        }
//        jlblTotalPDVendidos.setText("N° " + totalCantVenta);
//
//    }
    public void totalVentasDiarias() {
        //String fecha = jlblFechaRegistro.getText();
        Date fechaRegistro = jDateFecha.getDate();
        List<venta> listaVentasPorFecha = control.traerVentasPorFecha(fechaRegistro);
        double ventasDiarias = 0;
        for (venta vt : listaVentasPorFecha) {
            ventasDiarias += vt.getSubTotal();
        }
        jlblVentasDiarias.setText("S/." + formatearNumero(ventasDiarias));
    }

    public void ventasPorSemana() {

        //Date fecha = jDateFecha.getDate();
        //String fecha = jlblFechaRegistro.getText();
        Date fechaRegistro = jDateFecha.getDate();
        List<venta> listaVentasPorSemana = control.traerVentasPorSemana(fechaRegistro);
        double ventasPorSemana = 0;
        for (venta vt : listaVentasPorSemana) {
            ventasPorSemana += vt.getSubTotal();
        }
        jlblVentasSemana.setText("S/. " + formatearNumero(ventasPorSemana));

    }

    public void ventasPorMes() {
        Date fecha = jDateFecha.getDate();
        List<venta> listaVentaMes = control.traerVentasPorMes(fecha);

        double ventaMes = 0;

        for (venta vt : listaVentaMes) {
            ventaMes += vt.getSubTotal();
        }
        jlblVentaMensual.setText("S/. " + formatearNumero(ventaMes));
    }

    private double formatearNumero(double numero) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(numero));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jbtnReportePorComprobante;
    private javax.swing.JLabel jlabel18;
    private javax.swing.JLabel jlblFechaRegistro;
    private javax.swing.JLabel jlblVentaMensual;
    private javax.swing.JLabel jlblVentasDiarias;
    private javax.swing.JLabel jlblVentasSemana;
    private javax.swing.JTable jtableDetalleVentas;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtNumComprobante;
    // End of variables declaration//GEN-END:variables

    private void cargarVentas() {
        vaciarTabla();

        List<Detalle_Venta> listaDetalle = control.traerDetalleVentas();
        if (listaDetalle != null) {
            for (Detalle_Venta dv : listaDetalle) {

                Date fech = dv.getVenta().getFechaVenta();
                String fecha = format_show.format(fech);

                Object[] lista = {
                    dv.getIdDetalle(),
                    dv.getNumComprobante(),
                    fecha,
                    dv.getProducto().getDescripcion(),
                    dv.getVenta().getCantVenta(),
                    dv.getVenta().getPrecioUntiario(),
                    dv.getVenta().getSubTotal(),
                    dv.getMontoTotal(),
                    dv.getVenta().getImporte(),
                    dv.getVenta().getCambio(),
                    dv.getVenta().getUnCliente().getNombre(),
                    dv.getVenta().getUnUsuario().getNombre()};

                modelo.addRow(lista);
            }
        }

    }

    public void vaciarTabla() {
        for (int i = jtableDetalleVentas.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void DiaFecha() {
        try {
            //METODO PARA MOSTRAR LA FECHA
            LocalDate now = LocalDate.now();
            int year = now.getYear();
            int day = now.getDayOfMonth();
            int month = now.getMonthValue();
            String[] meses = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "12"};
            jlblFechaRegistro.setText(year + "/" + meses[month - 1] + "/" + day);
            String fecha = jlblFechaRegistro.getText();
            Date fechaRegistro = format_date.parse(fecha);
            jDateFecha.setDate(fechaRegistro);
        } catch (ParseException ex) {
            Logger.getLogger(ventanaVerVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cargarFiltroSorter(){
        jtableDetalleVentas.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modelo);
        jtableDetalleVentas.setRowSorter(sorter);
    }

}
