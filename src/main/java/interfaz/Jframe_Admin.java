package interfaz;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import logica.Controladora;
import logica.Usuario;

/**
 *
 * @author sergi
 */
public class Jframe_Admin extends javax.swing.JFrame {

    Controladora control;
    Usuario user;

    public Jframe_Admin(Controladora control, Usuario user) {
        initComponents();
        this.control = control;
        this.user = user;

    }

    public Jframe_Admin() {
    }

    private void startClock() {
        //METODO PARA CARGAR UN RELOJ EN TIEMPO REAL
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Date date = new Date();
                    String currentTime = dateFormat.format(date);
                    jLabel_Hora.setText(currentTime);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public void DiaFecha() {
        //METODO PARA MOSTRAR LA FECHA 
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre",
            "Octubre", "Noviembre", "Diciembre"};
        fecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " del " + year);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaPrincipal = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtxtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jlblRol = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel_Hora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMIProductos = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMSuministros = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMIUsuarios = new javax.swing.JMenuItem();
        jMIClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ventanaPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        ventanaPrincipal.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logodefini.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 890));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jtxtUser.setEditable(false);
        jtxtUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jtxtUser.setText("Ray Nixon");
        jtxtUser.setBorder(null);

        jlblRol.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblRol.setForeground(new java.awt.Color(255, 255, 255));
        jlblRol.setText("Administrador");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rol:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario:");

        fecha.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("fecha");

        jLabel_Hora.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel_Hora.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Hora.setText("HORA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1431, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Hora)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(fecha)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Hora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblRol)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 890, 1920, 120));

        ventanaPrincipal.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ventanaPrincipalLayout = new javax.swing.GroupLayout(ventanaPrincipal);
        ventanaPrincipal.setLayout(ventanaPrincipalLayout);
        ventanaPrincipalLayout.setHorizontalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ventanaPrincipalLayout.setVerticalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu2.png"))); // NOI18N
        jMenu1.setText("Principal");
        jMenu1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jMIProductos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMIProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        jMIProductos.setText("Registrar Productos");
        jMIProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jMIProductos);

        jMenuItem4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/entradas.png"))); // NOI18N
        jMenuItem4.setText("Entradas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grafico-de-barras.png"))); // NOI18N
        jMenuItem11.setText("Metricas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMSuministros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadena-de-suministro.png"))); // NOI18N
        jMSuministros.setText("Suministros");
        jMSuministros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/etiqueta-de-precio.png"))); // NOI18N
        jMenuItem8.setText("Marcas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMSuministros.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categoria.png"))); // NOI18N
        jMenuItem9.setText("Categorias");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMSuministros.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor.png"))); // NOI18N
        jMenuItem10.setText("Proveedores");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMSuministros.add(jMenuItem10);

        jMenuBar1.add(jMSuministros);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carritovender.png"))); // NOI18N
        jMenu2.setText("Ventas");
        jMenu2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/generarVenta.png"))); // NOI18N
        jMenuItem5.setText("Realizar Venta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verVentas.png"))); // NOI18N
        jMenuItem7.setText("Ver Ventas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        jMenu3.setText("Usuarios");
        jMenu3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jMIUsuarios.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMIUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario (2).png"))); // NOI18N
        jMIUsuarios.setText("Usuarios");
        jMIUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIUsuariosActionPerformed(evt);
            }
        });
        jMenu3.add(jMIUsuarios);

        jMIClientes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMIClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        jMIClientes.setText("Clientes");
        jMIClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClientesActionPerformed(evt);
            }
        });
        jMenu3.add(jMIClientes);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ventanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIProductosActionPerformed
        VentanaProductos prueba = new VentanaProductos();
//        ventanaPrincipal.add(prueba);
//        prueba.setVisible(true);
        centrarVentana(prueba);
    }//GEN-LAST:event_jMIProductosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMIUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIUsuariosActionPerformed
        ventanaUsuarios vs = new ventanaUsuarios(control);
        centrarVentana(vs);
    }//GEN-LAST:event_jMIUsuariosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jtxtUser.setText(user.getNombreUsuario());
        this.jlblRol.setText(user.getUnRol().getNombreRol());
        startClock();
        DiaFecha();
        desactivarControles();
    }//GEN-LAST:event_formWindowOpened

    public void desactivarControles() {

        String rol = jlblRol.getText();
        if (rol.equals("Empleado")) {
            controlesEmpleado();
        }
    }

    public void controlesEmpleado() {
        jMIUsuarios.setVisible(false);
        jMSuministros.setVisible(false);
        jMIProductos.setVisible(false);
        //jMIClientes.setVisible(false);
        //jMIClientesEMP.setVisible(true);
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ventanaEntradas vtEntradas = new ventanaEntradas();
        centrarVentana(vtEntradas);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ventanaVenta ventas = new ventanaVenta(user);
        centrarVentana(ventas);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMIClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClientesActionPerformed
        ventanaClientes clientes = new ventanaClientes(user);
        centrarVentana(clientes);
    }//GEN-LAST:event_jMIClientesActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ventanaVerVentas verVentas = new ventanaVerVentas();
        centrarVentana(verVentas);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ventanaMarca marca = new ventanaMarca();
        centrarVentana(marca);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ventanaCategoria categoria = new ventanaCategoria();
        centrarVentana(categoria);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        ventanaProveedor proveedore = new ventanaProveedor();
        centrarVentana(proveedore);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        ventanaMetricaz metricaz = new ventanaMetricaz();
        centrarVentana(metricaz);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Hora;
    private javax.swing.JMenuItem jMIClientes;
    private javax.swing.JMenuItem jMIProductos;
    private javax.swing.JMenuItem jMIUsuarios;
    private javax.swing.JMenu jMSuministros;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlblRol;
    public static javax.swing.JTextField jtxtUser;
    public static javax.swing.JDesktopPane ventanaPrincipal;
    // End of variables declaration//GEN-END:variables
}
