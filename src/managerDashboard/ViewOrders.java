/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerDashboard;

import config.UserSession;
import config.config;
import javax.swing.JOptionPane;
import main.login;
import main.landingPage;

/**
 *
 * @author jhond
 */
public class ViewOrders extends javax.swing.JFrame {

    /**
     * Creates new form ViewOrders
     */
    public ViewOrders() {
        if (UserSession.getU_id() == 0) {
            JOptionPane.showMessageDialog(null, "Access Denied! Please Login First.");

            login login = new login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            this.dispose();
            return;
        }

        initComponents();
        this.setLocationRelativeTo(null);
        name.setText(UserSession.getU_name());
        email.setText(UserSession.getU_email());
        config con = new config ();
        con.setProfileIcon(image, UserSession.getImagePath());
        displayOrders();
    }

    void displayOrders() {
        config conf = new config();
        String sql = "SELECT * FROM tbl_order";
        conf.displayData(sql, jTable1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        view = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        remove = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel10.setBackground(new java.awt.Color(44, 62, 80));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        jPanel10.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        name.setBackground(new java.awt.Color(237, 241, 249));
        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(237, 241, 249));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("USER");
        jPanel10.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, 30));

        email.setBackground(new java.awt.Color(237, 241, 249));
        email.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        email.setForeground(new java.awt.Color(237, 241, 249));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("EMAIL");
        jPanel10.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 30));

        line.setForeground(new java.awt.Color(255, 255, 255));
        line.setText("____________________________________");
        jPanel10.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        add.setBackground(new java.awt.Color(237, 241, 249));
        add.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        add.setForeground(new java.awt.Color(236, 240, 241));
        add.setText("Add Supply Order");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        jPanel10.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, 30));

        view.setBackground(new java.awt.Color(237, 241, 249));
        view.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        view.setForeground(new java.awt.Color(236, 240, 241));
        view.setText("View All Supply Order");
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewMouseExited(evt);
            }
        });
        jPanel10.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 190, 30));

        update.setBackground(new java.awt.Color(237, 241, 249));
        update.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        update.setForeground(new java.awt.Color(236, 240, 241));
        update.setText("Update Supply Order");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        jPanel10.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 30));

        remove.setBackground(new java.awt.Color(237, 241, 249));
        remove.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        remove.setForeground(new java.awt.Color(237, 241, 249));
        remove.setText("Remove Order");
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeMouseExited(evt);
            }
        });
        jPanel10.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 190, 30));

        profile.setBackground(new java.awt.Color(237, 241, 249));
        profile.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        profile.setForeground(new java.awt.Color(237, 241, 249));
        profile.setText("Profile");
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        jPanel10.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 190, 30));

        line1.setForeground(new java.awt.Color(255, 255, 255));
        line1.setText("____________________________________");
        jPanel10.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel5.setBackground(new java.awt.Color(237, 241, 249));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 241, 249));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Log Out");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 200, 40));

        jPanel11.setBackground(new java.awt.Color(237, 241, 249));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(237, 241, 249));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(44, 62, 80));
        jLabel2.setText("ORDERS");
        jPanel11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 270, 50));

        jLabel4.setBackground(new java.awt.Color(237, 241, 249));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 241, 249));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel11.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 470, 270));

        jLabel6.setBackground(new java.awt.Color(237, 241, 249));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 62, 80));
        jLabel6.setText("VIEW ALL SUPPLY ORDERS");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 270, 50));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel11.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 190, 30));

        jToggleButton1.setText("SEARCH");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, 30));

        jToggleButton2.setText("DASHBOARD");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel11.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String findings = jTextField1.getText();

        config con = new config();

        String sql = "SELECT o_id WHERE o_id = " + findings;
        con.displayData(sql, jTable1);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String searchText = jTextField1.getText();
        String sql = "SELECT * FROM tbl_order WHERE o_id LIKE ?";
        config conf = new config();
        conf.displayData(sql, jTable1, "%" + searchText);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        Managerdashboard dash = new Managerdashboard();
        dash.setLocationRelativeTo(null);
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        addOrder order = new addOrder();
        order.setLocationRelativeTo(null);
        order.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(new java.awt.Color(26, 188, 156));
        add.setOpaque(true);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_addMouseExited

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        ViewOrders view = new ViewOrders();
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewMouseClicked

    private void viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseEntered
        view.setBackground(new java.awt.Color(26, 188, 156));
        view.setOpaque(true);
    }//GEN-LAST:event_viewMouseEntered

    private void viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseExited
        view.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_viewMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        UpdateOrder update = new UpdateOrder();
        update.setLocationRelativeTo(null);
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(new java.awt.Color(26, 188, 156));
        update.setOpaque(true);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_updateMouseExited

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        DeleteOrder delete = new DeleteOrder();
        delete.setLocationRelativeTo(null);
        delete.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeMouseClicked

    private void removeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseEntered
        remove.setBackground(new java.awt.Color(26, 188, 156));
        remove.setOpaque(true);
    }//GEN-LAST:event_removeMouseEntered

    private void removeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseExited
        remove.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_removeMouseExited

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        profile.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_profileMouseExited

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        profile.setBackground(new java.awt.Color(26, 188, 156));
        profile.setOpaque(true);
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        managerProfile profile = new managerProfile();
        profile.setLocationRelativeTo(null);
        profile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        UserSession.clearSession();

        login out = new login();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setOpaque(true);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_jLabel5MouseExited

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel email;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel line;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel remove;
    private javax.swing.JLabel update;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
