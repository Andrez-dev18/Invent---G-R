package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;
import logica.Usuario;

/**
 *
 * @author sergi
 */
public class UI_Administrador extends javax.swing.JFrame {

    Controladora control;
    Usuario user;
    DefaultTableModel modelo;

    public UI_Administrador(Controladora control, Usuario user) {
        initComponents();
        this.control = control;
        this.user = user;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        panelDashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbtnUsuarios = new javax.swing.JButton();
        jbtnPrincipal = new javax.swing.JButton();
        panelcabeza = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtxtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jVentanas = new javax.swing.JTabbedPane();
        jpane1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 10));

        panelDashboard.setBackground(new java.awt.Color(0, 51, 204));
        panelDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_C4\\src\\main\\java\\img\\LOGO G&R1.png")); // NOI18N
        panelDashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 80));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Menu");
        panelDashboard.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jbtnUsuarios.setBackground(new java.awt.Color(51, 102, 255));
        jbtnUsuarios.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jbtnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jbtnUsuarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_C4\\src\\main\\java\\img\\usuario (3).png")); // NOI18N
        jbtnUsuarios.setText("Usuarios");
        jbtnUsuarios.setBorderPainted(false);
        jbtnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnUsuariosMouseExited(evt);
            }
        });
        jbtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUsuariosActionPerformed(evt);
            }
        });
        panelDashboard.add(jbtnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 200, 45));

        jbtnPrincipal.setBackground(new java.awt.Color(51, 102, 255));
        jbtnPrincipal.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jbtnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_C4\\src\\main\\java\\img\\casa.png")); // NOI18N
        jbtnPrincipal.setText("Principal");
        jbtnPrincipal.setBorderPainted(false);
        jbtnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnPrincipalMouseExited(evt);
            }
        });
        jbtnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrincipalActionPerformed(evt);
            }
        });
        panelDashboard.add(jbtnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 165, 200, 45));

        panelPrincipal.add(panelDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 720));

        panelcabeza.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Administrador");

        jtxtUser.setEditable(false);
        jtxtUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtUser.setText("Ray Nixon");
        jtxtUser.setBorder(null);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_C4\\src\\main\\java\\img\\usuario (2).png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_C4\\src\\main\\java\\img\\on.png")); // NOI18N
        jLabel4.setText("Conectado");

        javax.swing.GroupLayout panelcabezaLayout = new javax.swing.GroupLayout(panelcabeza);
        panelcabeza.setLayout(panelcabezaLayout);
        panelcabezaLayout.setHorizontalGroup(
            panelcabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcabezaLayout.createSequentialGroup()
                .addContainerGap(815, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelcabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelcabezaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(panelcabezaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelcabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panelcabezaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17))
        );
        panelcabezaLayout.setVerticalGroup(
            panelcabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcabezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator6)
                .addContainerGap())
            .addGroup(panelcabezaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelcabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelcabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1030, 120));

        jVentanas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpane1Layout = new javax.swing.GroupLayout(jpane1);
        jpane1.setLayout(jpane1Layout);
        jpane1Layout.setHorizontalGroup(
            jpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jpane1Layout.setVerticalGroup(
            jpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        jVentanas.addTab("tab1", jpane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        jVentanas.addTab("tab2", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        jVentanas.addTab("tab3", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        jVentanas.addTab("tab4", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        jVentanas.addTab("tab5", jPanel5);

        panelPrincipal.add(jVentanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 1020, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jtxtUser.setText(user.getNombreUsuario());
    }//GEN-LAST:event_formWindowOpened

    private void jbtnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnUsuariosMouseEntered
        jbtnUsuarios.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_jbtnUsuariosMouseEntered

    private void jbtnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnUsuariosMouseExited
        jbtnUsuarios.setBackground(new Color(51, 102, 255));
    }//GEN-LAST:event_jbtnUsuariosMouseExited

    private void jbtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuariosActionPerformed
        jVentanas.setSelectedIndex(4);
//        cargarUsuarios();
        panelUsuario verUser = new panelUsuario(control);
        verUser.setSize(1020, 569);
        verUser.setLocation(0, 0);

        jPanel5.removeAll();
        jPanel5.add(verUser, BorderLayout.CENTER);
        jPanel5.revalidate();
        jPanel5.repaint();
    }//GEN-LAST:event_jbtnUsuariosActionPerformed

    private void jbtnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPrincipalMouseEntered
        jbtnPrincipal.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_jbtnPrincipalMouseEntered

    private void jbtnPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPrincipalMouseExited
        jbtnPrincipal.setBackground(new Color(51, 102, 255));
    }//GEN-LAST:event_jbtnPrincipalMouseExited

    private void jbtnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrincipalActionPerformed
        jVentanas.setSelectedIndex(0);
        
        panelProductos verProducto = new panelProductos();
        verProducto.setSize(1020, 569);
        verProducto.setLocation(0,0);
        
        jpane1.removeAll();
        jpane1.add(verProducto, BorderLayout.CENTER);
        jpane1.revalidate();
        jpane1.repaint();
        
    }//GEN-LAST:event_jbtnPrincipalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jVentanas;
    private javax.swing.JButton jbtnPrincipal;
    private javax.swing.JButton jbtnUsuarios;
    private javax.swing.JPanel jpane1;
    public static javax.swing.JTextField jtxtUser;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelcabeza;
    // End of variables declaration//GEN-END:variables

    

}
