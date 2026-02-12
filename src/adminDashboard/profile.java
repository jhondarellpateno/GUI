/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminDashboard;

import config.UserSession;
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
        initComponents();
        if (UserSession.getU_id() == 0) {
            JOptionPane.showMessageDialog(this, "Please Login First!");

            login login = new login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            this.dispose();

        }

        if (UserSession.getU_name() != null) {
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
        status = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        approve = new javax.swing.JLabel();
        approve1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backg.setBackground(new java.awt.Color(237, 241, 249));
        backg.setForeground(new java.awt.Color(51, 102, 255));
        backg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status.setBackground(new java.awt.Color(237, 241, 249));
        status.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        status.setForeground(new java.awt.Color(51, 102, 255));
        status.setText("Status:");
        backg.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 70, 50));

        name.setBackground(new java.awt.Color(237, 241, 249));
        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(51, 102, 255));
        name.setText("Name:");
        backg.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 60, 50));

        email.setBackground(new java.awt.Color(237, 241, 249));
        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(51, 102, 255));
        email.setText("Email:");
        backg.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 60, 50));

        type.setBackground(new java.awt.Color(237, 241, 249));
        type.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        type.setForeground(new java.awt.Color(51, 102, 255));
        type.setText("Type:");
        backg.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 60, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        backg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 100, 110));

        jButton1.setText("SELECT IMAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        backg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 120, -1));

        lblStatus.setBackground(new java.awt.Color(237, 241, 249));
        lblStatus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblStatus.setText("status");
        lblStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStatusMouseEntered(evt);
            }
        });
        backg.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 219, 30));

        lblName.setBackground(new java.awt.Color(237, 241, 249));
        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("name");
        lblName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNameMouseEntered(evt);
            }
        });
        backg.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 219, 30));

        lblemail.setBackground(new java.awt.Color(237, 241, 249));
        lblemail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblemail.setText("email");
        lblemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblemailMouseEntered(evt);
            }
        });
        backg.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 219, 30));

        lblType.setBackground(new java.awt.Color(237, 241, 249));
        lblType.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblType.setText("type");
        lblType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTypeMouseEntered(evt);
            }
        });
        backg.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 219, 30));

        jLabel4.setBackground(new java.awt.Color(237, 241, 249));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 241, 249));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        backg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        getContentPane().add(backg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 560, 500));

        back.setBackground(new java.awt.Color(44, 62, 80));
        back.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(237, 241, 249));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(237, 241, 249));
        jLabel7.setText("PROFILE");
        back.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 50));

        jLabel9.setBackground(new java.awt.Color(237, 241, 249));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(237, 241, 249));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(" ADMIN ");
        back.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 50));

        jLabel5.setBackground(new java.awt.Color(237, 241, 249));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 241, 249));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOG OUT");
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
        back.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 412, 230, 30));

        approve.setBackground(new java.awt.Color(237, 241, 249));
        approve.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        approve.setForeground(new java.awt.Color(237, 241, 249));
        approve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        approve.setText("DASHBOARD");
        approve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approveMouseExited(evt);
            }
        });
        back.add(approve, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 30));

        approve1.setBackground(new java.awt.Color(237, 241, 249));
        approve1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        approve1.setForeground(new java.awt.Color(237, 241, 249));
        approve1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        approve1.setText("PROFILE");
        approve1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approve1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approve1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approve1MouseExited(evt);
            }
        });
        back.add(approve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 220, 30));

        jLabel8.setBackground(new java.awt.Color(237, 241, 249));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(237, 241, 249));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ACCOUNTS");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        back.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 220, 30));

        jLabel6.setBackground(new java.awt.Color(237, 241, 249));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(237, 241, 249));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LOG OUT");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        back.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 412, 230, 30));

        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStatusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblStatusMouseEntered

    private void lblNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNameMouseEntered

    private void lblemailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblemailMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblemailMouseEntered

    private void lblTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTypeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTypeMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        landingPage out = new landingPage();
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

    private void approveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMouseClicked
        Admindashboard dash = new Admindashboard();
        dash.setLocationRelativeTo(null);
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_approveMouseClicked

    private void approveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMouseEntered
        approve.setBackground(new java.awt.Color(26, 188, 156));
        approve.setOpaque(true);
    }//GEN-LAST:event_approveMouseEntered

    private void approveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMouseExited
        approve.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_approveMouseExited

    private void approve1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approve1MouseClicked
        profile prof = new profile();
        prof.setLocationRelativeTo(null);
        prof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_approve1MouseClicked

    private void approve1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approve1MouseEntered
        approve1.setBackground(new java.awt.Color(26, 188, 156));
        approve1.setOpaque(true);
    }//GEN-LAST:event_approve1MouseEntered

    private void approve1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approve1MouseExited
        approve1.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_approve1MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        accounts acc = new accounts();
        acc.setLocationRelativeTo(null);
        acc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setBackground(new java.awt.Color(26, 188, 156));
        jLabel8.setOpaque(true);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        landingPage out = new landingPage();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setOpaque(true);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel5.setBackground(new java.awt.Color(44, 62, 80));
    }//GEN-LAST:event_jLabel6MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(profile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel approve;
    private javax.swing.JLabel approve1;
    private javax.swing.JPanel back;
    private javax.swing.JPanel backg;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel name;
    private javax.swing.JLabel status;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
