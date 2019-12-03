/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Frontend;

import Project.Backend.*;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class UbahPassword extends javax.swing.JFrame {

   /**
    * Creates new form UbahPassword
    */
   public UbahPassword() {
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
      jPanel2 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      cbPassLama = new javax.swing.JCheckBox();
      cbPassBaru = new javax.swing.JCheckBox();
      cbUlangPassBaru = new javax.swing.JCheckBox();
      txtUsername = new javax.swing.JTextField();
      txtPasswordLama = new javax.swing.JPasswordField();
      txtPasswordBaru = new javax.swing.JPasswordField();
      txtTulisPassBaru = new javax.swing.JPasswordField();
      jLabel6 = new javax.swing.JLabel();

      setTitle("Ubah Password");
      setAlwaysOnTop(true);
      setResizable(false);

      jPanel1.setBackground(new java.awt.Color(169, 224, 49));

      jPanel2.setBackground(new java.awt.Color(0, 0, 0));

      jLabel2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setText("Password Lama");

      jLabel3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setText("Password Baru");

      jLabel4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
      jLabel4.setForeground(new java.awt.Color(255, 255, 255));
      jLabel4.setText("Tulis ulang password baru");

      jLabel5.setBackground(new java.awt.Color(0, 204, 204));
      jLabel5.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 1, 20)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(255, 255, 255));
      jLabel5.setText("UBAH PASSWORD");

      jButton1.setBackground(new java.awt.Color(169, 224, 49));
      jButton1.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 1, 14)); // NOI18N
      jButton1.setForeground(new java.awt.Color(0, 0, 0));
      jButton1.setText("KEMBALI");

      jButton2.setBackground(new java.awt.Color(169, 224, 49));
      jButton2.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 1, 14)); // NOI18N
      jButton2.setForeground(new java.awt.Color(0, 0, 0));
      jButton2.setText("SIMPAN");
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
         }
      });

      cbPassLama.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbPassLamaActionPerformed(evt);
         }
      });

      cbPassBaru.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbPassBaruActionPerformed(evt);
         }
      });

      cbUlangPassBaru.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbUlangPassBaruActionPerformed(evt);
         }
      });

      txtUsername.setBackground(new java.awt.Color(0, 0, 0));
      txtUsername.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
      txtUsername.setForeground(new java.awt.Color(255, 255, 255));
      txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));

      txtPasswordLama.setBackground(new java.awt.Color(0, 0, 0));
      txtPasswordLama.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
      txtPasswordLama.setForeground(new java.awt.Color(255, 255, 255));
      txtPasswordLama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));

      txtPasswordBaru.setBackground(new java.awt.Color(0, 0, 0));
      txtPasswordBaru.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
      txtPasswordBaru.setForeground(new java.awt.Color(255, 255, 255));
      txtPasswordBaru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));

      txtTulisPassBaru.setBackground(new java.awt.Color(0, 0, 0));
      txtTulisPassBaru.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
      txtTulisPassBaru.setForeground(new java.awt.Color(255, 255, 255));
      txtTulisPassBaru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));

      jLabel6.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
      jLabel6.setForeground(new java.awt.Color(255, 255, 255));
      jLabel6.setText("Username");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTulisPassBaru, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel2)
                           .addComponent(jLabel3)
                           .addComponent(jLabel6))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                           .addComponent(txtPasswordLama)
                           .addComponent(txtPasswordBaru, javax.swing.GroupLayout.Alignment.TRAILING))))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbPassLama)
                        .addComponent(cbPassBaru, javax.swing.GroupLayout.Alignment.TRAILING))
                     .addComponent(cbUlangPassBaru, javax.swing.GroupLayout.Alignment.TRAILING)))
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGap(159, 159, 159)
                  .addComponent(jLabel5)))
            .addContainerGap())
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(115, 115, 115)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(13, 13, 13)
            .addComponent(jLabel5)
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(cbPassLama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(txtPasswordLama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(txtPasswordBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel3)))
                     .addComponent(cbPassBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtTulisPassBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel4)))
               .addComponent(cbUlangPassBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(25, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

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
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void cbPassLamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPassLamaActionPerformed
      if (cbPassLama.isSelected()) {
         txtPasswordLama.setEchoChar((char) 0);
      } else {
         txtPasswordLama.setEchoChar('*');
      }
   }//GEN-LAST:event_cbPassLamaActionPerformed

   private void cbPassBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPassBaruActionPerformed
      if (cbPassBaru.isSelected()) {
         txtPasswordBaru.setEchoChar((char) 0);
      } else {
         txtPasswordBaru.setEchoChar('*');
      }
   }//GEN-LAST:event_cbPassBaruActionPerformed

   private void cbUlangPassBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUlangPassBaruActionPerformed
      if (cbUlangPassBaru.isSelected()) {
         txtTulisPassBaru.setEchoChar((char) 0);
      } else {
         txtTulisPassBaru.setEchoChar('*');
      }
   }//GEN-LAST:event_cbUlangPassBaruActionPerformed

   public void clearData(){
      txtUsername.setText("");
      txtPasswordBaru.setText("");
      txtPasswordLama.setText("");
      txtTulisPassBaru.setText("");
   }
   
   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String username = txtUsername.getText();
      String passwordLama = txtPasswordLama.getText();
      String passwordBaru = txtPasswordBaru.getText();

      Admin admin = new Admin();

      if (admin.loginAdmin(username, passwordLama)) {
         if (passwordBaru.equals(txtTulisPassBaru.getText())) {
            admin.setUsername(username);
            admin.setPassword(passwordBaru);
            admin.ubahPassword();
            clearData();
         } else {
            JOptionPane.showMessageDialog(null, "Tidak dapat merubah password", "Peringatan", JOptionPane.WARNING_MESSAGE);
            clearData();
         }
      } else {
         JOptionPane.showMessageDialog(null, "Tidak dapat merubah password", "Peringatan", JOptionPane.WARNING_MESSAGE);
         clearData();
      }
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
         java.util.logging.Logger.getLogger(UbahPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(UbahPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(UbahPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(UbahPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new UbahPassword().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JCheckBox cbPassBaru;
   private javax.swing.JCheckBox cbPassLama;
   private javax.swing.JCheckBox cbUlangPassBaru;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPasswordField txtPasswordBaru;
   private javax.swing.JPasswordField txtPasswordLama;
   private javax.swing.JPasswordField txtTulisPassBaru;
   private javax.swing.JTextField txtUsername;
   // End of variables declaration//GEN-END:variables
}
