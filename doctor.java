/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ehealthcare;

import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KESHINI B
 */
public class doctor extends javax.swing.JFrame {

    /**
     * Creates new form doctor
     */
    public doctor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jfemale = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jage = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jspecialisation = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jcno = new javax.swing.JTextField();
        jdate = new javax.swing.JComboBox<>();
        jtime = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jdeg = new javax.swing.JTextField();
        jyear = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jphotopath = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("        DOCTOR    REGISTRATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 608, 61));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setText("NAME ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 125, -1));
        jPanel1.add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 132, 260, 50));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setText("GENDER");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 92, -1));

        buttonGroup1.add(jfemale);
        jfemale.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jfemale.setText("FEMALE");
        jPanel1.add(jfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 224, 120, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jRadioButton2.setText("MALE");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 257, 98, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setText("SPECIALISATION:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 170, 30));

        jage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20-30", "30-40", "40-50", "50-60","60-70","70-80" }));
        jage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jage, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 334, 270, 50));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setText("AGE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 65, 30));
        jPanel1.add(jspecialisation, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 459, 270, 40));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 65, 30));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel7.setText("CONTACT NO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 170, 30));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel8.setText("EMAIL ID:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 120, 30));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel9.setText("AVAILABLE DATES:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 720, 200, 30));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel10.setText("TIME AVAILABILITY:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 200, 30));
        jPanel1.add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 531, 270, 40));

        jcno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcnoActionPerformed(evt);
            }
        });
        jcno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcnoKeyPressed(evt);
            }
        });
        jPanel1.add(jcno, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 618, 270, 40));

        jdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-10", "10-20", "20-30" }));
        jdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 711, 270, 40));

        jtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8-10 am", "10-12 noon", "1-3 pm", "3-5pm","5-7pm","7-9pm" }));
        jtime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 150, 250, 50));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel11.setText("YEAR OF GRADUATION:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, 220, 30));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel12.setText("DEGREE:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, 160, 30));
        jPanel1.add(jdeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 250, 250, 50));
        jPanel1.add(jyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 350, 250, 50));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel13.setText("Attach your certificate copy ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 290, 30));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ATTACH");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 287, 100));
        jPanel1.add(jphotopath, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 300, 50));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton2.setText("REGISTER");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 650, 170, 50));

        jButton4.setBackground(new java.awt.Color(204, 0, 51));
        jButton4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton4.setText("CANCEL");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 652, 140, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ehealthcare/java pro pics/patbkk.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 794));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser ph=new JFileChooser();
        ph.showOpenDialog(null);
        File f=ph.getSelectedFile();
        String filename=f.getAbsolutePath();
        jphotopath.setText(filename);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        homepage h1;
        h1 = new homepage();
        h1.setVisible(true);
        h1.pack();
        h1.setLocationRelativeTo(null);
        h1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        String name =jname.getText();
        String spec =jspecialisation.getText();
        String email =jemail.getText();
        String cno =jcno.getText();
        String deg =jdeg.getText();
        String year =jyear.getText();
        
        if(name.equals("")||spec.equals("")||email.isBlank()||cno.isBlank()||deg.isBlank()||year.isBlank())
        {
            JOptionPane.showMessageDialog(null," Please fill all the details ");
        }
        else
        {
       
        try
       {
        Connection con;
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealthcare","root","");
        Statement stmt=con.createStatement();
        //insert of data in server
        String q1="insert into doctorreg values('" +jname.getText()+"','"+jspecialisation.getText()+"','"+jemail.getText()+"','"+jcno.getText()+"','"+jdeg.getText()+"','"+jyear.getText()+"')";
        stmt.executeUpdate(q1);
        JOptionPane.showMessageDialog(null," INSERTED successfully ");
        
    }                                              
    catch(Exception e)
    {
        System.out.println(e);
                JOptionPane.showMessageDialog(null," exception successfully ");
                

    }
    /*    try
       {
        Connection con;
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationpat","root","");
        Statement stmt=con.createStatement();
        //insert of data in server
        String q1="insert into patientreg values('" +jname.getText()+"','"+jAge.getText()+"','"+jWhatsappno.getText()+"','"+jMobileNo.getText()+"','"+jEmail.getText()+"','"+jBloodgroup.getText()+"')";
        stmt.executeUpdate(q1);
        JOptionPane.showMessageDialog(null," INSERTED successfully ");
    }                                              
    catch(Exception e)
    {
        System.out.println(e);
    }*/
        passwordCreate h1;
        h1 = new passwordCreate();
        h1.setVisible(true);
        h1.pack();
        h1.setLocationRelativeTo(null);
        h1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
        
        /* passwordCreate h1;
        h1 = new passwordCreate();
        h1.setVisible(true);
        h1.pack();
        h1.setLocationRelativeTo(null);
        h1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); */
    }//GEN-LAST:event_jButton2MouseClicked

    private void jcnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcnoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jcnoActionPerformed

    private void jcnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcnoKeyPressed
        // TODO add your handling code here:
         String ph=jcno.getText();
        int len=ph.length();
        char c= evt.getKeyChar();
        if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
            if(len<10){
                jcno.setEditable(true);
               }
            else{
                 jcno.setEditable(false);
            }
        }
        else{
                if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                    jcno.setEditable(true);
                
            }
                else{
                    jcno.setEditable(false);
                }
        }
    }//GEN-LAST:event_jcnoKeyPressed

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
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JComboBox<String> jage;
    private javax.swing.JTextField jcno;
    private javax.swing.JComboBox<String> jdate;
    private javax.swing.JTextField jdeg;
    private javax.swing.JTextField jemail;
    private javax.swing.JRadioButton jfemale;
    private javax.swing.JTextField jname;
    private javax.swing.JLabel jphotopath;
    private javax.swing.JTextField jspecialisation;
    private javax.swing.JComboBox<String> jtime;
    private javax.swing.JTextField jyear;
    // End of variables declaration//GEN-END:variables
}