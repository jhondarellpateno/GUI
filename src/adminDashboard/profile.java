/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminDashboard;

import config.UserSession;
import config.config;
import javax.swing.JOptionPane;
import main.login;
import main.landingPage;

/**
 *
 * @author USER25
 */
public class profile extends javax.swing.JFrame {

    /**
     * Creates new form profile
     */
    public profile() {
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
        config con = new config();
        con.setProfileIcon(image, UserSession.getImagePath());

        if (UserSession.getU_name()
                != null) {
            lblName.setText(UserSession.getU_name());
            lblemail.setText(UserSession.getU_email());
            lblType.setText(UserSession.getU_type());
            lblStatus.setText(UserSession.getU_status());
        }
    }

    private void displayUserData() {
        lblName.setText("Name: " + UserSession.getU_name());
        lblemail.setText("Email: " + UserSession.getU_email());
        lblType.setText("Type: " + UserSession.getU_type());
        lblStatus.setText("Status: " + UserSession.getU_status());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backg = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        back = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        prods = new javax.swing.JLabel();
        accs = new javax.swing.JLabel();
        profs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backg.setBackground(new java.awt.Color(237, 241, 249));
        backg.setForeground(new java.awt.Color(51, 102, 255));
        backg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(237, 241, 249));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 241, 249));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        backg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        name.setBackground(new java.awt.Color(237, 241, 249));
        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(44, 62, 80));
        name.setText("Name:");
        backg.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 60, 50));

        lblName.setBackground(new java.awt.Color(237, 241, 249));
        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("name");
        lblName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNameMouseEntered(evt);
            }
        });
        backg.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 219, 30));

        email.setBackground(new java.awt.Color(237, 241, 249));
        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(44, 62, 80));
        email.setText("Email:");
        backg.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 60, 50));

        lblemail.setBackground(new java.awt.Color(237, 241, 249));
        lblemail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblemail.setText("email");
        lblemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblemailMouseEntered(evt);
            }
        });
        backg.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 219, 30));

        type.setBackground(new java.awt.Color(237, 241, 249));
        type.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        type.setForeground(new java.awt.Color(44, 62, 80));
        type.setText("Type:");
        backg.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 60, 50));

        lblType.setBackground(new java.awt.Color(237, 241, 249));
        lblType.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblType.setText("type");
        lblType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTypeMouseEntered(evt);
            }
        });
        backg.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 219, 30));

        lblStatus.setBackground(new java.awt.Color(237, 241, 249));
        lblStatus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblStatus.setText("status");
        lblStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStatusMouseEntered(evt);
            }
        });
        backg.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 219, 30));

        status.setBackground(new java.awt.Color(237, 241, 249));
        status.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        status.setForeground(new java.awt.Color(44, 62, 80));
        status.setText("Status:");
        backg.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 70, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 62, 80), 3));
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 90, -1, 110));

        backg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 510, 300));

        jToggleButton1.setBackground(new java.awt.Color(44, 62, 80));
        jToggleButton1.setForeground(new java.awt.Color(237, 241, 249));
        jToggleButton1.setText("EDIT PROFILE");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        backg.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 140, 40));

        getContentPane().add(backg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 560, 500));

        back.setBackground(new java.awt.Color(44, 62, 80));
        back.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(237, 241, 249));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(237, 241, 249));
        jLabel16.setText("P");
        back.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel18.setBackground(new java.awt.Color(237, 241, 249));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(237, 241, 249));
        jLabel18.setText("R");
        back.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 30, 50));

        jLabel9.setBackground(new java.awt.Color(237, 241, 249));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(237, 241, 249));
        jLabel9.setText("O");
        back.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 30, 40));

        jLabel14.setBackground(new java.awt.Color(237, 241, 249));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(237, 241, 249));
        jLabel14.setText("F");
        back.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 20, 40));

        jLabel22.setBackground(new java.awt.Color(237, 241, 249));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(237, 241, 249));
        jLabel22.setText("I");
        back.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 30, 30));

        jLabel20.setBackground(new java.awt.Color(237, 241, 249));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(237, 241, 249));
        jLabel20.setText("L");
        back.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 30, 30));

        jLabel15.setBackground(new java.awt.Color(237, 241, 249));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(237, 241, 249));
        jLabel15.setText("E");
        back.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 20, 40));

        jLabel7.setBackground(new java.awt.Color(237, 241, 249));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(237, 241, 249));
        jLabel7.setText("E");
        back.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 20, 40));

        jLabel24.setBackground(new java.awt.Color(237, 241, 249));
        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(237, 241, 249));
        jLabel24.setText("L");
        back.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 30, 30));

        jLabel21.setBackground(new java.awt.Color(237, 241, 249));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(237, 241, 249));
        jLabel21.setText("O");
        back.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 30, 40));

        jLabel19.setBackground(new java.awt.Color(237, 241, 249));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(237, 241, 249));
        jLabel19.setText("R");
        back.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 30, 50));

        jLabel17.setBackground(new java.awt.Color(237, 241, 249));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(237, 241, 249));
        jLabel17.setText("P");
        back.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 30, 50));

        jLabel23.setBackground(new java.awt.Color(237, 241, 249));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(237, 241, 249));
        jLabel23.setText("I");
        back.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 30, 30));

        line1.setForeground(new java.awt.Color(255, 255, 255));
        line1.setText("____________________________________");
        back.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        line.setForeground(new java.awt.Color(255, 255, 255));
        line.setText("____________________________________");
        back.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

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
        back.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 200, 40));

        dashboard.setBackground(new java.awt.Color(237, 241, 249));
        dashboard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(237, 241, 249));
        dashboard.setText("Dashboard");
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        back.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 160, 30));

        prods.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        prods.setForeground(new java.awt.Color(237, 241, 249));
        prods.setText("Products");
        prods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prodsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prodsMouseExited(evt);
            }
        });
        back.add(prods, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 160, 30));

        accs.setBackground(new java.awt.Color(237, 241, 249));
        accs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        accs.setForeground(new java.awt.Color(237, 241, 249));
        accs.setText("Accounts");
        accs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accsMouseExited(evt);
            }
        });
        back.add(accs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, 30));

        profs.setBackground(new java.awt.Color(237, 241, 249));
        profs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        profs.setForeground(new java.awt.Color(237, 241, 249));
        profs.setText("Profile");
        profs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profsMouseExited(evt);
            }
        });
        back.add(profs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 160, 30));

        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void lblNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNameMouseEntered

    private void lblemailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblemailMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblemailMouseEntered

    private void lblTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTypeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTypeMouseEntered

    private void lblStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStatusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblStatusMouseEntered

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        editProf edit = new editProf();
        edit.setLocationRelativeTo(null);
        edit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        Admindashboard dash = new Admindashboard();
        dash.setLocationRelativeTo(null);
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardMouseClicked

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        dashboard.setBackground(new java.awt.Color(26, 188, 156));
        dashboard.setOpaque(true);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        dashboard.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_dashboardMouseExited

    private void prodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodsMouseClicked
        products prod = new products();
        prod.setLocationRelativeTo(null);
        prod.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prodsMouseClicked

    private void prodsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodsMouseEntered
        prods.setBackground(new java.awt.Color(26, 188, 156));
        prods.setOpaque(true);
    }//GEN-LAST:event_prodsMouseEntered

    private void prodsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodsMouseExited
        prods.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_prodsMouseExited

    private void accsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accsMouseClicked
        accounts acc = new accounts();
        acc.setLocationRelativeTo(null);
        acc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_accsMouseClicked

    private void accsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accsMouseEntered
        accs.setBackground(new java.awt.Color(26, 188, 156));
        accs.setOpaque(true);
    }//GEN-LAST:event_accsMouseEntered

    private void accsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accsMouseExited
        accs.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_accsMouseExited

    private void profsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profsMouseClicked
        profile prof = new profile();
        prof.setLocationRelativeTo(null);
        prof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profsMouseClicked

    private void profsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profsMouseEntered
        profs.setBackground(new java.awt.Color(26, 188, 156));
        profs.setOpaque(true);
    }//GEN-LAST:event_profsMouseEntered

    private void profsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profsMouseExited
        profs.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_profsMouseExited

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accs;
    private javax.swing.JPanel back;
    private javax.swing.JPanel backg;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel email;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel line;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel prods;
    private javax.swing.JLabel profs;
    private javax.swing.JLabel status;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
