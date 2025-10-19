package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import logica.Controladora;
import logica.Detalle_Venta;
import logica.Producto;
import logica.Usuario;
import logica.venta;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author sergi
 */
public class ventanaMetricaz extends javax.swing.JInternalFrame {

    Controladora control = new Controladora();

    private SimpleDateFormat format_date = new SimpleDateFormat("yyyy/MM/d");  //Formato de la fecha para guardar
    private SimpleDateFormat format_show = new SimpleDateFormat("dd/MM/yyyy");  //Formato de la fecha para mostrar

    public ventanaMetricaz() {
        initComponents();
        DiaFecha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblNProductos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlblNVentas = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlblVentasDiarias = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlblFechaRegistro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jpanelBarras = new javax.swing.JPanel();
        jpizarra = new javax.swing.JPanel();

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Total De Productos En El Sistema");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jlblNProductos.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlblNProductos.setForeground(new java.awt.Color(112, 112, 112));
        jlblNProductos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblNProductos.setText("1500");
        jPanel3.add(jlblNProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 20, 230, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gestion-de-materiales.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 390, 120));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblNVentas.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlblNVentas.setForeground(new java.awt.Color(112, 112, 112));
        jlblNVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblNVentas.setText("850.500");
        jPanel4.add(jlblNVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 20, 210, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Recaudacion De Venta totales");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bolsa-de-dinero.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 390, 120));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Recaudacion De Venta Diaria");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jlblVentasDiarias.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlblVentasDiarias.setForeground(new java.awt.Color(112, 112, 112));
        jlblVentasDiarias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblVentasDiarias.setText("1500.00");
        jPanel5.add(jlblVentasDiarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 20, 210, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7-dias (1).png"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jlblFechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jlblFechaRegistro.setText("jLabel3");
        jPanel5.add(jlblFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 390, 120));

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 390, 20));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 390, 20));

        jSeparator3.setBackground(new java.awt.Color(51, 222, 26));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 390, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1360, 160));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Metricas Generales Del Sistema");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        javax.swing.GroupLayout jpanelBarrasLayout = new javax.swing.GroupLayout(jpanelBarras);
        jpanelBarras.setLayout(jpanelBarrasLayout);
        jpanelBarrasLayout.setHorizontalGroup(
            jpanelBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jpanelBarrasLayout.setVerticalGroup(
            jpanelBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(jpanelBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 790, 490));

        jpizarra.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpizarraLayout = new javax.swing.GroupLayout(jpizarra);
        jpizarra.setLayout(jpizarraLayout);
        jpizarraLayout.setHorizontalGroup(
            jpizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jpizarraLayout.setVerticalGroup(
            jpizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(jpizarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 560, 490));

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

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        graficoBarras();
        graficoCirculo();
        totalProductos();
        totalVentas();
        totalVentasDiarias();       

    }//GEN-LAST:event_formInternalFrameOpened

    public void graficoBarras() {

        List<Map.Entry<Producto, Integer>> productosMasVendidos = control.obtenerProductosMasVendidos();

        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        for (int i = 0; i < productosMasVendidos.size(); i++) {
            Producto producto = productosMasVendidos.get(i).getKey();
            int cantidadVendida = productosMasVendidos.get(i).getValue();
            datos.setValue(cantidadVendida, producto.getDescripcion(), "Producto " + (i + 1));
        }

        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Productos Mas Vendidos",
                "Productos",
                "Cant. Vendida",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        CategoryPlot plot = graficoBarras.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE); // Cambiar el fondo a blanco
        plot.setRangeGridlinePaint(Color.BLACK);

        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(930, 490));

        jpanelBarras.setLayout(new BorderLayout());
        jpanelBarras.add(panel, BorderLayout.NORTH);
        pack();
        repaint();
    }

//    public void graficoCirculo() {
//
//        int num1 = 20;
//        int num2 = 20;
//        int num3 = 60;
//
//        int total = num1 + num2 + num3;
//
//        double porcentaje1 = (double) num1 / total * 100;
//        double porcentaje2 = (double) num2 / total * 100;
//        double porcentaje3 = (double) num3 / total * 100;
//
//        DefaultPieDataset datos = new DefaultPieDataset();
//        datos.setValue("Completadas (" + String.format("%.2f", porcentaje1) + "%)", num1);
//        datos.setValue("Pendientes (" + String.format("%.2f", porcentaje2) + "%)", num2);
//        datos.setValue("Atrasadas (" + String.format("%.2f", porcentaje3) + "%)", num3);
//
//        JFreeChart grafica = ChartFactory.createPieChart(
//                "Porcentaje Grafico", //nombre del grafico
//                datos, //datos
//                true, //nombre de las categorias
//                true,//herramientas
//                false//generacion url
//        );
//
//        if (jpizarra.getComponentCount() > 0) {
//            jpizarra.remove(0);
//        }
//
//        // Personalizar colores de las secciones del gráfico
//        PiePlot plot = (PiePlot) grafica.getPlot();
//        plot.setSectionPaint("Completadas (" + String.format("%.2f", porcentaje1) + "%)", Color.decode("#04E96F"));
//        plot.setSectionPaint("Pendientes (" + String.format("%.2f", porcentaje2) + "%)", Color.decode("#E9E904"));
//        plot.setSectionPaint("Atrasadas (" + String.format("%.2f", porcentaje3) + "%)", Color.decode("#F94634"));
//
//        grafica.setBackgroundPaint(Color.WHITE);
//
//        ChartPanel panel = new ChartPanel(grafica);
//        panel.setMouseWheelEnabled(true);
//        panel.setPreferredSize(new Dimension(420, 490));
//
//        jpizarra.setLayout(new BorderLayout());
//        jpizarra.add(panel, BorderLayout.NORTH);
//        jpizarra.revalidate(); // Actualizar el panel
//
//        pack();
//        repaint();
//    }
    public void graficoCirculo() {
        // Obtener los usuarios con más ventas y la cantidad de ventas que han realizado
        List<Map.Entry<Usuario, Integer>> usuariosMasVentas = control.obtenerUsuariosMasVentas();

        DefaultPieDataset datos = new DefaultPieDataset();

        // Calcular el total de todas las ventas
        int totalVentas = usuariosMasVentas.stream().mapToInt(Map.Entry::getValue).sum();

        // Iterar sobre los usuarios con más ventas y agregar sus datos al dataset del gráfico
        for (int i = 0; i < usuariosMasVentas.size(); i++) {
            Usuario usuario = usuariosMasVentas.get(i).getKey();
            int cantidadVentas = usuariosMasVentas.get(i).getValue();

            // Calcular el porcentaje de ventas para el usuario actual
            double porcentaje = (double) cantidadVentas / totalVentas * 100;

            datos.setValue(usuario.getNombre() + " (" + cantidadVentas + ") - " + String.format("%.2f", porcentaje) + "%", cantidadVentas);
        }

        JFreeChart grafica = ChartFactory.createPieChart(
                "Usuarios con más ventas", // Nombre del gráfico
                datos, // Datos
                true, // Mostrar leyenda
                true, // Mostrar tooltips
                false // No generar URL
        );
        grafica.getPlot().setBackgroundPaint(Color.WHITE);

        // Personalizar colores de las secciones del gráfico
        PiePlot plot = (PiePlot) grafica.getPlot();
        // Puedes personalizar los colores si lo deseas
        // ...

        grafica.setBackgroundPaint(Color.WHITE);

        ChartPanel panel = new ChartPanel(grafica);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(420, 490));

        jpizarra.setLayout(new BorderLayout());
        jpizarra.add(panel, BorderLayout.NORTH);
        jpizarra.revalidate(); // Actualizar el panel

        pack();
        repaint();
    }

    public void totalProductos() {
        List<Producto> listaProductos = control.traerProductos();

        int numProductos = 0;

        for (int i = 0; i < listaProductos.size(); i++) {
            numProductos++;
        }
        jlblNProductos.setText("N° " + numProductos);
    }

    public void totalVentas() {

        List<venta> listaVenta = control.traerVenta();

        double totalVentas = 0;

        for (venta vt : listaVenta) {
            totalVentas += vt.getSubTotal();
        }
        jlblNVentas.setText("S/. " + formatearNumero(totalVentas));
    }

    public void totalVentasDiarias() {
        try {

            String fecha = jlblFechaRegistro.getText();
            Date fechaRegistro = format_date.parse(fecha);

            List<venta> listaVentasPorFecha = control.traerVentasPorFecha(fechaRegistro);

            double ventasDiarias = 0;

            for (venta vt : listaVentasPorFecha) {
                ventasDiarias += vt.getSubTotal();
            }
            jlblVentasDiarias.setText("S/." + formatearNumero(ventasDiarias));

        } catch (ParseException e) {
        }
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

    private double formatearNumero(double numero) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(numero));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlblFechaRegistro;
    private javax.swing.JLabel jlblNProductos;
    private javax.swing.JLabel jlblNVentas;
    private javax.swing.JLabel jlblVentasDiarias;
    private javax.swing.JPanel jpanelBarras;
    private javax.swing.JPanel jpizarra;
    // End of variables declaration//GEN-END:variables
}
