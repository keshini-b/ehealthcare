package ehealthcare;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JFrame;

/**
 *
 * @author KESHINI B
 */
public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
    public homepage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
 //   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jservice = new javax.swing.JButton();
        jButtonlogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jaboutus = new javax.swing.JButton();
        jbuttonreg1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(22, 242, 242));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jservice.setBackground(new java.awt.Color(0, 153, 255));
        jservice.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jservice.setForeground(new java.awt.Color(255, 255, 255));
        jservice.setText("Services offered");
        jservice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jservice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jservice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jserviceMouseClicked(evt);
            }
        });
        jservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jserviceActionPerformed(evt);
            }
        });
        getContentPane().add(jservice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 350, 60));

        jButtonlogin.setBackground(new java.awt.Color(0, 153, 255));
        jButtonlogin.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jButtonlogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlogin.setText("Login");
        jButtonlogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 350, 60));

        jLabel3.setFont(new java.awt.Font("Engravers MT", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("          e-healthcare  Management ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 1020, 150));

        jaboutus.setBackground(new java.awt.Color(0, 153, 255));
        jaboutus.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jaboutus.setForeground(new java.awt.Color(255, 255, 255));
        jaboutus.setText("About us");
        jaboutus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jaboutus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jaboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jaboutusMouseClicked(evt);
            }
        });
        jaboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaboutusActionPerformed(evt);
            }
        });
        getContentPane().add(jaboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 350, 60));

        jbuttonreg1.setBackground(new java.awt.Color(0, 153, 255));
        jbuttonreg1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jbuttonreg1.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonreg1.setText("New Registration");
        jbuttonreg1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbuttonreg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonreg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonreg1MouseClicked(evt);
            }
        });
        jbuttonreg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonreg1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 350, 60));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1530, 140));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 60, 60));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 60, 60));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 60, 60));

        jPanel6.setBackground(new java.awt.Color(0, 0, 102));

        jPanel7.setBackground(new java.awt.Color(0, 0, 102));
        jPanel6.add(jPanel7);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 60, 60));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOMES YOU !!!!");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 320, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 440, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ehealthcare/java pro pics/homebk..jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1592, 818));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        login11 lg;
        lg = new login11();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jButtonloginActionPerformed

    private void jserviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jserviceMouseClicked
                                // TODO add your handling code here:
        home1 h1;
        h1 = new home1();
        h1.setVisible(true);
        h1.pack();
        h1.setLocationRelativeTo(null);
        h1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jserviceMouseClicked

    private void jbuttonreg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonreg1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonreg1MouseClicked

    private void jaboutusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutusMouseClicked

    private void jbuttonreg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonreg1ActionPerformed
        // TODO add your handling code here:
         home1 h1;
        h1 = new home1();
        h1.setVisible(true);
        h1.pack();
        h1.setLocationRelativeTo(null);
        h1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbuttonreg1ActionPerformed

    private void jaboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaboutusActionPerformed
        About_us au;
        au = new About_us();
        au.setVisible(true);
        au.pack();
        au.setLocationRelativeTo(null);
        au.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jaboutusActionPerformed

    private void jserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jserviceActionPerformed
        Services s;
        s = new Services();
        s.setVisible(true);
        s.pack();
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jserviceActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jaboutus;
    private javax.swing.JButton jbuttonreg1;
    private javax.swing.JButton jservice;
    // End of variables declaration//GEN-END:variables
}
