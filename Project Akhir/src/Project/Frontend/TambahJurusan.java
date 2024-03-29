/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Frontend;

import Project.Backend.*;
import Project.Backend.Interface.*;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WINDOWS 10
 */
public class TambahJurusan extends javax.swing.JFrame implements Upload {

   private Image image;

   public TambahJurusan() {
      initComponents();
      tampil_data();
      tampilSimpan();
   }

   @Override
   public BufferedImage resize(Image img, int height, int width) {
      Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
      BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
      Graphics2D g2d = resized.createGraphics();
      g2d.drawImage(tmp, 0, 0, null);
      g2d.dispose();
      return resized;
   }

   @Override
   public ImageIcon ResizeImage(String ImagePath) {
      ImageIcon MyImage = new ImageIcon(ImagePath);
      Image img = MyImage.getImage();
      Image newImg = img.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon image = new ImageIcon(newImg);
      return image;
   }

   public void clearData() {
      txtNamaJurusan.setText("");
      txtSingkatan.setText("");
      txtKeterangan.setText("");
      txtFoto.setText("");
      lblFoto.setIcon(null);
      lblIdJurusan.setText("");
      txtPassing.setText("");
   }

   public void tampilSimpan() {
      btnSimpan.setEnabled(true);
      btnHapus.setEnabled(false);
      btnUbah.setEnabled(false);
      btnBatal.setEnabled(false);
   }

   public void tidakTampilSimpan() {
      btnSimpan.setEnabled(false);
      btnHapus.setEnabled(true);
      btnUbah.setEnabled(true);
      btnBatal.setEnabled(true);
   }

   public void tampil_data() { // Menampilkan data ke tabel
      String[] kolom = {"ID", "Nama Jurusan", "Singkatan", "Keterangan", "Passing Grade"};
      ArrayList<Jurusan> list = new Jurusan().getAll();
      Object rowData[] = new Object[5];

      tbJurusan.setModel(new DefaultTableModel(new Object[][]{}, kolom));

      for (Jurusan jur : list) {
         rowData[0] = jur.getId_jurusan();
         rowData[1] = jur.getNama();
         rowData[2] = jur.getSingkatan();
         rowData[3] = jur.getKeterangan();
         rowData[4] = jur.getpassing_grade();

         ((DefaultTableModel) tbJurusan.getModel()).addRow(rowData); // Menambahkan data ke tabel
      }
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
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      txtNamaJurusan = new javax.swing.JTextField();
      txtSingkatan = new javax.swing.JTextField();
      btnSimpan = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      tbJurusan = new javax.swing.JTable();
      lblFoto = new javax.swing.JLabel();
      jButton2 = new javax.swing.JButton();
      txtFoto = new javax.swing.JTextField();
      jScrollPane2 = new javax.swing.JScrollPane();
      txtKeterangan = new javax.swing.JTextArea();
      btnKembali = new javax.swing.JButton();
      btnUbah = new javax.swing.JButton();
      btnHapus = new javax.swing.JButton();
      btnBatal = new javax.swing.JButton();
      lblIdJurusan = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      txtPassing = new javax.swing.JTextField();

      setTitle("Tambah Jurusan");
      setAlwaysOnTop(true);
      setResizable(false);

      jPanel1.setBackground(new java.awt.Color(169, 224, 49));

      jPanel2.setBackground(new java.awt.Color(0, 0, 0));
      jPanel2.setForeground(new java.awt.Color(255, 255, 255));

      jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setText("Nama Jurusan");

      jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setText("Singkatan");

      jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setText("Keterangan");

      txtNamaJurusan.setBackground(new java.awt.Color(0, 0, 0));
      txtNamaJurusan.setForeground(new java.awt.Color(255, 255, 255));
      txtNamaJurusan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));

      txtSingkatan.setBackground(new java.awt.Color(0, 0, 0));
      txtSingkatan.setForeground(new java.awt.Color(255, 255, 255));
      txtSingkatan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));

      btnSimpan.setBackground(new java.awt.Color(169, 224, 49));
      btnSimpan.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
      btnSimpan.setForeground(new java.awt.Color(0, 0, 0));
      btnSimpan.setText("SIMPAN");
      btnSimpan.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSimpanActionPerformed(evt);
         }
      });

      tbJurusan.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
         },
         new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
         }
      ));
      tbJurusan.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbJurusanMouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(tbJurusan);

      lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));

      jButton2.setBackground(new java.awt.Color(169, 224, 49));
      jButton2.setForeground(new java.awt.Color(0, 0, 0));
      jButton2.setText("...");
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
         }
      });

      txtFoto.setBackground(new java.awt.Color(0, 0, 0));
      txtFoto.setForeground(new java.awt.Color(255, 255, 255));
      txtFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));

      txtKeterangan.setBackground(new java.awt.Color(0, 0, 0));
      txtKeterangan.setColumns(20);
      txtKeterangan.setForeground(new java.awt.Color(255, 255, 255));
      txtKeterangan.setRows(5);
      txtKeterangan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));
      jScrollPane2.setViewportView(txtKeterangan);

      btnKembali.setBackground(new java.awt.Color(169, 224, 49));
      btnKembali.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
      btnKembali.setForeground(new java.awt.Color(0, 0, 0));
      btnKembali.setText("KEMBALI");

      btnUbah.setBackground(new java.awt.Color(169, 224, 49));
      btnUbah.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
      btnUbah.setForeground(new java.awt.Color(0, 0, 0));
      btnUbah.setText("UBAH");
      btnUbah.setEnabled(false);
      btnUbah.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUbahActionPerformed(evt);
         }
      });

      btnHapus.setBackground(new java.awt.Color(169, 224, 49));
      btnHapus.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
      btnHapus.setForeground(new java.awt.Color(0, 0, 0));
      btnHapus.setText("HAPUS");
      btnHapus.setEnabled(false);
      btnHapus.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnHapusActionPerformed(evt);
         }
      });

      btnBatal.setBackground(new java.awt.Color(169, 224, 49));
      btnBatal.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
      btnBatal.setForeground(new java.awt.Color(0, 0, 0));
      btnBatal.setText("BATAL");
      btnBatal.setEnabled(false);
      btnBatal.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBatalActionPerformed(evt);
         }
      });

      lblIdJurusan.setForeground(new java.awt.Color(255, 255, 255));
      lblIdJurusan.setText("untuk-id");

      jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
      jLabel4.setForeground(new java.awt.Color(255, 255, 255));
      jLabel4.setText("Passing Grade");

      txtPassing.setBackground(new java.awt.Color(0, 0, 0));
      txtPassing.setForeground(new java.awt.Color(255, 255, 255));
      txtPassing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jScrollPane1)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassing))
                     .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                           .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel3)
                              .addComponent(jLabel2)
                              .addComponent(jLabel1))
                           .addGap(18, 18, 18)
                           .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                              .addComponent(txtSingkatan)
                              .addComponent(txtNamaJurusan)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                           .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGap(18, 18, 18)
                           .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                  .addGap(32, 32, 32)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                     .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGap(136, 136, 136)
                  .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(lblIdJurusan)))
            .addGap(18, 18, 18))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel1)
                     .addComponent(txtNamaJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(27, 27, 27)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel2)
                     .addComponent(txtSingkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jScrollPane2)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(52, 52, 52))))
               .addComponent(lblFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(23, 23, 23))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel4)
                     .addComponent(txtPassing, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnSimpan)
               .addComponent(btnKembali))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnUbah)
               .addComponent(btnHapus)
               .addComponent(btnBatal)
               .addComponent(lblIdJurusan))
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(33, 33, 33))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
      Jurusan jurusan = new Jurusan();
      jurusan.setNama(txtNamaJurusan.getText());
      jurusan.setSingkatan(txtSingkatan.getText());
      jurusan.setKeterangan(txtKeterangan.getText());
      jurusan.setpassing_grade(Double.valueOf(txtPassing.getText()));
      if (lblFoto.getIcon() != null) {
         try {
            jurusan.setFoto(txtSingkatan.getText() + ".png");
            BufferedImage resized = resize(image, 500, 400);
            File output = new File("/media/gokpraz/Data 2/Data/Kuliah/Semester 3/Pemograman Berbasis Objek (PBO)/Project Akhir/src/images/Jurusan/" + txtSingkatan.getText() + ".png");
            ImageIO.write(resized, "png", output);
         } catch (IOException ex) {
//            Logger.getLogger(CobaUpload.class.getName()).log(Level.SEVERE, null, ex);
         }
      }
      jurusan.save();
      tampil_data();
      clearData();
   }//GEN-LAST:event_btnSimpanActionPerformed

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      JFileChooser chooser = new JFileChooser(System.getProperty("user  .home"));
      chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
      chooser.setFileFilter(new FileNameExtensionFilter("jpg|png|bmp", "jpg", "png", "bmp"));

      if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
         try {
            File file = chooser.getSelectedFile();
            image = ImageIO.read(file);
            String path = file.getAbsolutePath();
            lblFoto.setIcon(ResizeImage(path));
            txtFoto.setText(file.getAbsolutePath());
         } catch (IOException ex) {
//            Logger.getLogger(CobaUpload.class.getName()).log(Level.SEVERE, null, ex);
         }
      }
   }//GEN-LAST:event_jButton2ActionPerformed

   private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
      Jurusan jurusan = new Jurusan();
      jurusan.setId_jurusan(Integer.valueOf(lblIdJurusan.getText()));
      jurusan.setNama(txtNamaJurusan.getText());
      jurusan.setSingkatan(txtSingkatan.getText());
      jurusan.setKeterangan(txtKeterangan.getText());
      jurusan.setFoto(txtSingkatan.getText() + ".png");
      jurusan.setpassing_grade(Double.valueOf(txtPassing.getText()));
//      if (txtFoto.getText().equals("")) {  
//      try {
//         BufferedImage resized = resize(image, 500, 400);
//         File output = new File("/media/gokpraz/Data 2/Data/Kuliah/Semester 3/Pemograman Berbasis Objek (PBO)/Project Akhir/src/images/Jurusan/" + txtSingkatan.getText() + ".png");
//         ImageIO.write(resized, "png", output);
//      } catch (IOException ex) {
////            Logger.getLogger(CobaUpload.class.getName()).log(Level.SEVERE, null, ex);
//      }
//      }
      jurusan.update();
      tampilSimpan();
      tampil_data();
      clearData();
   }//GEN-LAST:event_btnUbahActionPerformed

   private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
      Jurusan jurusan = new Jurusan();
      jurusan.setId_jurusan(Integer.valueOf(lblIdJurusan.getText()));
      jurusan.delete();
      tampil_data();
      tampilSimpan();
      clearData();
   }//GEN-LAST:event_btnHapusActionPerformed

   private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
      tampilSimpan();
      clearData();
   }//GEN-LAST:event_btnBatalActionPerformed

   private void tbJurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbJurusanMouseClicked
      tidakTampilSimpan();

      DefaultTableModel model = (DefaultTableModel) tbJurusan.getModel();
      int row = tbJurusan.getSelectedRow();

      lblIdJurusan.setText(model.getValueAt(row, 0).toString());
      txtNamaJurusan.setText(model.getValueAt(row, 1).toString());
      txtSingkatan.setText(model.getValueAt(row, 2).toString());
      txtKeterangan.setText(model.getValueAt(row, 3).toString());
      txtPassing.setText(model.getValueAt(row, 4).toString());
      try {
         ImageIcon icon = new ImageIcon(new ImageIcon(getClass().getResource("/images/Jurusan/" + txtSingkatan.getText().toUpperCase() + ".png"))
           .getImage().getScaledInstance(190, 240, Image.SCALE_SMOOTH));
         lblFoto.setIcon(icon);
      } catch (Exception e) {
//         System.out.println(e.getMessage());
      }

   }//GEN-LAST:event_tbJurusanMouseClicked

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
         java.util.logging.Logger.getLogger(TambahJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(TambahJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(TambahJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(TambahJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TambahJurusan().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnBatal;
   private javax.swing.JButton btnHapus;
   private javax.swing.JButton btnKembali;
   private javax.swing.JButton btnSimpan;
   private javax.swing.JButton btnUbah;
   private javax.swing.JButton jButton2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JLabel lblFoto;
   private javax.swing.JLabel lblIdJurusan;
   private javax.swing.JTable tbJurusan;
   private javax.swing.JTextField txtFoto;
   private javax.swing.JTextArea txtKeterangan;
   private javax.swing.JTextField txtNamaJurusan;
   private javax.swing.JTextField txtPassing;
   private javax.swing.JTextField txtSingkatan;
   // End of variables declaration//GEN-END:variables

}
