/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Frontend;

import Project.Backend.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Linux
 */
public class DaftarPendaftar extends javax.swing.JFrame {

   /**
    * Creates new form DaftarPendaftar
    */
   public SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
   public SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMMM-yyyy");

   public DaftarPendaftar() {
      initComponents();
      tampil_data();
      tampil_jurusan();
      clearData();
   }

   public void tampil_jurusan() {
      comboJurusan.setModel(new DefaultComboBoxModel(new Jurusan().getAll().toArray()));
   }

   public void clearData() {
      txtCari.setText("Cari bedasarkan nama");
      comboJurusan.setSelectedIndex(0);
   }

   public void tampil_data() { // Menampilkan data ke tabel
      String[] kolom = {"ID Siswa", "Nama", "Tempat/Tanggal Lahir", "Alamat", "Jenis Kelamin", "Asal Sekolah", "Nilai B. Indo",
         "Nilai Matematika", "Nilai B. Inggris", "Nilai IPA", "Rata-rata", "Ambil Jurusan"};
      ArrayList<Siswa> list = new Siswa().getAll();
      Object rowData[] = new Object[12];

      tbSiswa.setModel(new DefaultTableModel(new Object[][]{}, kolom));
      Date date;
      for (Siswa siswa : list) {
         try {
            date = dateFormat.parse(siswa.getTgl_lahir());
            rowData[0] = siswa.getId_siswa();
            rowData[1] = siswa.getNama();
            rowData[2] = siswa.getTempat() + "/" + dateFormat2.format(date);
            rowData[3] = siswa.getAlamat();
            rowData[4] = siswa.getJk();
            rowData[5] = siswa.getAsal_sekolah();
            rowData[6] = siswa.getNilai_bin();
            rowData[7] = siswa.getNilai_mtk();
            rowData[8] = siswa.getNilai_big();
            rowData[9] = siswa.getNilai_ipa();
            rowData[10] = siswa.getRata();
            rowData[11] = siswa.getJurusan().getNama();

            ((DefaultTableModel) tbSiswa.getModel()).addRow(rowData); // Menambahkan data ke tabel

         } catch (ParseException ex) {
            System.out.println(ex.getMessage());
         }
      }
   }

   public void getDataByJurusan(int id_jurusan) { // Menampilkan data bedasarkan jurusan dipilih
      String[] kolom = {"ID Siswa", "Nama", "Tempat/Tanggal Lahir", "Alamat", "Jenis Kelamin", "Asal Sekolah", "Nilai B. Indo",
         "Nilai Matematika", "Nilai B. Inggris", "Nilai IPA", "Rata-rata", "Ambil Jurusan"};
      ArrayList<Siswa> list = new Siswa().getByIdJurusan(id_jurusan);
      Object rowData[] = new Object[12];

      tbSiswa.setModel(new DefaultTableModel(new Object[][]{}, kolom));
      Date date;
      for (Siswa siswa : list) {
         try {
            date = dateFormat.parse(siswa.getTgl_lahir());
            rowData[0] = siswa.getId_siswa();
            rowData[1] = siswa.getNama();
            rowData[2] = siswa.getTempat() + " / " + dateFormat2.format(date);
            rowData[3] = siswa.getAlamat();
            rowData[4] = siswa.getJk();
            rowData[5] = siswa.getAsal_sekolah();
            rowData[6] = siswa.getNilai_bin();
            rowData[7] = siswa.getNilai_mtk();
            rowData[8] = siswa.getNilai_big();
            rowData[9] = siswa.getNilai_ipa();
            rowData[10] = siswa.getRata();
            rowData[11] = siswa.getJurusan().getNama();

            ((DefaultTableModel) tbSiswa.getModel()).addRow(rowData); // Menambahkan data ke tabel

         } catch (ParseException ex) {
            System.out.println(ex.getMessage());
         }
      }
   }

   public void cari_siswa(String nama) { // Menampilkan data bedasarkan jurusan dipilih
      String[] kolom = {"ID Siswa", "Nama", "Tempat/Tanggal Lahir", "Alamat", "Jenis Kelamin", "Asal Sekolah", "Nilai B. Indo",
         "Nilai Matematika", "Nilai B. Inggris", "Nilai IPA", "Rata-rata", "Ambil Jurusan"};
      ArrayList<Siswa> list = new Siswa().getByNamaSiswa(nama);
      Object rowData[] = new Object[12];

      tbSiswa.setModel(new DefaultTableModel(new Object[][]{}, kolom));
      Date date;
      for (Siswa siswa : list) {
         try {
            date = dateFormat.parse(siswa.getTgl_lahir());
            rowData[0] = siswa.getId_siswa();
            rowData[1] = siswa.getNama();
            rowData[2] = siswa.getTempat() + " / " + dateFormat2.format(date);
            rowData[3] = siswa.getAlamat();
            rowData[4] = siswa.getJk();
            rowData[5] = siswa.getAsal_sekolah();
            rowData[6] = siswa.getNilai_bin();
            rowData[7] = siswa.getNilai_mtk();
            rowData[8] = siswa.getNilai_big();
            rowData[9] = siswa.getNilai_ipa();
            rowData[10] = siswa.getRata();
            rowData[11] = siswa.getJurusan().getNama();

            ((DefaultTableModel) tbSiswa.getModel()).addRow(rowData); // Menambahkan data ke tabel

         } catch (ParseException ex) {
            System.out.println(ex.getMessage());
         }
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

      jButton4 = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTextArea1 = new javax.swing.JTextArea();
      jLabel1 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      jPanel3 = new javax.swing.JPanel();
      btnCari = new javax.swing.JButton();
      txtCari = new javax.swing.JTextField();
      comboJurusan = new javax.swing.JComboBox<>();
      jLabel2 = new javax.swing.JLabel();
      btnTampilSemua = new javax.swing.JButton();
      btnTampil = new javax.swing.JButton();
      btnKembali = new javax.swing.JButton();
      jScrollPane2 = new javax.swing.JScrollPane();
      tbSiswa = new javax.swing.JTable();

      jButton4.setText("Jurusan ");

      jTextArea1.setColumns(20);
      jTextArea1.setRows(5);
      jScrollPane1.setViewportView(jTextArea1);

      jLabel1.setText("jLabel1");

      setTitle("Daftar Siswa");
      setAlwaysOnTop(true);
      setResizable(false);

      jPanel1.setBackground(new java.awt.Color(169, 224, 49));

      jPanel3.setBackground(new java.awt.Color(0, 0, 0));

      btnCari.setBackground(new java.awt.Color(169, 224, 49));
      btnCari.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 0, 12)); // NOI18N
      btnCari.setForeground(new java.awt.Color(0, 0, 0));
      btnCari.setText("Cari");
      btnCari.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCariActionPerformed(evt);
         }
      });

      txtCari.setBackground(new java.awt.Color(0, 0, 0));
      txtCari.setForeground(new java.awt.Color(255, 255, 255));
      txtCari.setText("Cari bedasarkan nama");
      txtCari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));
      txtCari.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtCariMouseClicked(evt);
         }
      });

      comboJurusan.setBackground(new java.awt.Color(255, 255, 255));
      comboJurusan.setForeground(new java.awt.Color(0, 0, 0));
      comboJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

      jLabel2.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 1, 14)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setText("Pilih Jurusan");

      btnTampilSemua.setBackground(new java.awt.Color(169, 224, 49));
      btnTampilSemua.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 0, 12)); // NOI18N
      btnTampilSemua.setForeground(new java.awt.Color(0, 0, 0));
      btnTampilSemua.setText("Tampilkan Data pendaftar");
      btnTampilSemua.setToolTipText("Menampilkan semua data siswa yang sudah menginput nilai dan memilih jurusan");
      btnTampilSemua.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTampilSemuaActionPerformed(evt);
         }
      });

      btnTampil.setBackground(new java.awt.Color(169, 224, 49));
      btnTampil.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 0, 12)); // NOI18N
      btnTampil.setForeground(new java.awt.Color(0, 0, 0));
      btnTampil.setText("Tampilkan");
      btnTampil.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTampilActionPerformed(evt);
         }
      });

      btnKembali.setBackground(new java.awt.Color(169, 224, 49));
      btnKembali.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 0, 12)); // NOI18N
      btnKembali.setForeground(new java.awt.Color(0, 0, 0));
      btnKembali.setText("Kembali");
      btnKembali.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnKembaliActionPerformed(evt);
         }
      });

      tbSiswa.setModel(new javax.swing.table.DefaultTableModel(
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
      tbSiswa.setEditingRow(0);
      jScrollPane2.setViewportView(tbSiswa);

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                     .addComponent(jLabel2)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(comboJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(btnTampil)
                     .addGap(93, 93, 93)
                     .addComponent(btnTampilSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18))
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap(14, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(comboJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2)
               .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnTampilSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(11, 11, 11)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnTampilSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilSemuaActionPerformed
      tampil_data();
      clearData();
   }//GEN-LAST:event_btnTampilSemuaActionPerformed

   private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
//      clearData();
      Siswa siswa = new Siswa();
      siswa.setJurusan((Jurusan) comboJurusan.getSelectedItem());
      getDataByJurusan(siswa.getJurusan().getId_jurusan());
   }//GEN-LAST:event_btnTampilActionPerformed

   private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
      this.setVisible(false);
      clearData();
   }//GEN-LAST:event_btnKembaliActionPerformed

   private void txtCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariMouseClicked
      txtCari.setText("");
   }//GEN-LAST:event_txtCariMouseClicked

   private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
      cari_siswa(txtCari.getText());
   }//GEN-LAST:event_btnCariActionPerformed

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
         java.util.logging.Logger.getLogger(DaftarPendaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(DaftarPendaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(DaftarPendaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(DaftarPendaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new DaftarPendaftar().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnCari;
   private javax.swing.JButton btnKembali;
   private javax.swing.JButton btnTampil;
   private javax.swing.JButton btnTampilSemua;
   private javax.swing.JComboBox<String> comboJurusan;
   private javax.swing.JButton jButton4;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JTextArea jTextArea1;
   private javax.swing.JTable tbSiswa;
   private javax.swing.JTextField txtCari;
   // End of variables declaration//GEN-END:variables
}
