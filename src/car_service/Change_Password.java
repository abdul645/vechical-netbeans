/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package car_service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bilal
 */
public class Change_Password extends javax.swing.JFrame {
    private Connection con;
    private Statement st;

    /**
     * Creates new form Change_Password
     */
    public Change_Password() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tcpass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tnepass = new javax.swing.JPasswordField();
        tncpss = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tncpass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Password");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 30));

        tuser.setBackground(new java.awt.Color(204, 204, 204));
        tuser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(tuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 62, 277, 44));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Current Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        tcpass.setBackground(new java.awt.Color(204, 204, 204));
        tcpass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tcpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcpassActionPerformed(evt);
            }
        });
        jPanel1.add(tcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 148, 277, 44));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("New Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        tnepass.setBackground(new java.awt.Color(204, 204, 204));
        tnepass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(tnepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 234, 277, 42));

        tncpss.setBackground(new java.awt.Color(204, 204, 204));
        tncpss.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(tncpss, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 234, 290, 42));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Enter Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 20));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jButton1.setText("Save Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 277, 40));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 140, 40));

        tncpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/changepss.jpg"))); // NOI18N
        jPanel1.add(tncpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 420));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tcpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcpassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if (tuser.getText().equals("") || tcpass.getText().equals("") || tnepass.getText().equals("") || tncpss.getText().equals("")) {
          JOptionPane.showMessageDialog(null, "Please fill all enteries");
         } else {
            try 
            {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://D:\\java\\DBMS\\Car service.accdb");
                st = con.createStatement();
                int a = st.executeUpdate("update LOGINSIGNUP set PASSWORD ='" + tnepass.getText() + "',CONFIRM_PASSWORD ='" + tncpss.getText() + "' where USER_NAME='"+tuser.getText()+"'");
                if (a > 0) {
                    tuser.setText(null); 
                    tcpass.setText(null);
                    tnepass.setText(null);
                    tncpss.setText(null);
                    tuser.requestFocus();
                    JOptionPane.showMessageDialog(null, "Record saved");
                    dispose();
                 } else {
                    JOptionPane.showMessageDialog(null, "Record not saved");
                }
            }
            catch(Exception e)
        {
            System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       HOME H=new HOME();
       H.show();
       hide();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_Password().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tcpass;
    private javax.swing.JLabel tncpass;
    private javax.swing.JPasswordField tncpss;
    private javax.swing.JPasswordField tnepass;
    private javax.swing.JTextField tuser;
    // End of variables declaration//GEN-END:variables
}