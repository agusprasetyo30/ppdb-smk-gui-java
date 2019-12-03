/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Backend;

import Project.Backend.Interface.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gokpraz
 */
public class Siswa implements Action {

   private String id_siswa;
   private String nama;
   private String tempat;
   private String tgl_lahir;
   private String alamat;
   private String jk;
   private String asal_sekolah;
   private double nilai_bin;
   private double nilai_big;
   private double nilai_mtk;
   private double nilai_ipa;
   private double rata;
   private String foto;
   private Jurusan jurusan = new Jurusan();

   public Siswa() {

   }

   public Siswa(String id_siswa) {
      this.id_siswa = id_siswa;
   }

   public String getId_siswa() {
      return id_siswa;
   }

   public void setId_siswa(String id_siswa) {
      this.id_siswa = id_siswa;
   }

   public String getNama() {
      return nama;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public String getTempat() {
      return tempat;
   }

   public void setTempat(String tempat) {
      this.tempat = tempat;
   }

   public String getTgl_lahir() {
      return tgl_lahir;
   }

   public void setTgl_lahir(String tgl_lahir) {
      this.tgl_lahir = tgl_lahir;
   }

   public String getAlamat() {
      return alamat;
   }

   public void setAlamat(String alamat) {
      this.alamat = alamat;
   }

   public String getJk() {
      return jk;
   }

   public void setJk(String jk) {
      this.jk = jk;
   }

   public String getAsal_sekolah() {
      return asal_sekolah;
   }

   public void setAsal_sekolah(String asal_sekolah) {
      this.asal_sekolah = asal_sekolah;
   }

   public double getNilai_bin() {
      return nilai_bin;
   }

   public void setNilai_bin(double nilai_bin) {
      this.nilai_bin = nilai_bin;
   }

   public double getNilai_big() {
      return nilai_big;
   }

   public void setNilai_big(double nilai_big) {
      this.nilai_big = nilai_big;
   }

   public double getNilai_mtk() {
      return nilai_mtk;
   }

   public void setNilai_mtk(double nilai_mtk) {
      this.nilai_mtk = nilai_mtk;
   }

   public double getNilai_ipa() {
      return nilai_ipa;
   }

   public void setNilai_ipa(double nilai_ipa) {
      this.nilai_ipa = nilai_ipa;
   }

   public double getRata() {
      return rata;
   }

   public void setRata(double rata) {
      this.rata = rata;
   }

   public String getFoto() {
      return foto;
   }

   public void setFoto(String foto) {
      this.foto = foto;
   }

   public Jurusan getJurusan() {
      return jurusan;
   }

   public void setJurusan(Jurusan jurusan) {
      this.jurusan = jurusan;
   }

   public boolean loginSiswa(String id_siswa) { // Login data
      boolean login = false;
      ResultSet res = DBhelper.selectQuery("SELECT * FROM siswa WHERE id_siswa = '" + id_siswa + "' and status = '0'");
      Siswa siswa = new Siswa();

      try {
         if (res.next()) {
            if (id_siswa.equalsIgnoreCase(res.getString("id_siswa"))) {
               login = true;
               siswa.setId_siswa(res.getString("id_siswa"));
               siswa.setNama(res.getString("nama"));
               siswa.setTempat(res.getString("tempat"));
               siswa.setTgl_lahir(res.getString("tgl_lahir"));
               siswa.setAlamat(res.getString("alamat"));
               siswa.setJk(res.getString("jenis_kelamin"));
               siswa.setAsal_sekolah(res.getString("asal_sekolah"));
               siswa.setNilai_bin(res.getDouble("nilai_bin"));
               siswa.setNilai_mtk(res.getDouble("nilai_mtk"));
               siswa.setNilai_big(res.getDouble("nilai_big"));
               siswa.setNilai_ipa(res.getDouble("nilai_ipa"));
               siswa.setRata(res.getDouble("rata"));
               siswa.setFoto(res.getString("foto"));
            }
         } else {
            login = false;
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }
      return login;
   }

   public Siswa getById(String id) { // Menampilkan data bedasarkan ID
      Siswa siswa = new Siswa();
      ResultSet res = DBhelper.selectQuery("SELECT * FROM siswa WHERE id_siswa = '" + id + "'");

      try {
         while (res.next()) {
            siswa = new Siswa();
            siswa.setId_siswa(res.getString("id_siswa"));
            siswa.setNama(res.getString("nama"));
            siswa.setTempat(res.getString("tempat"));
            siswa.setTgl_lahir(res.getString("tgl_lahir"));
            siswa.setAlamat(res.getString("alamat"));
            siswa.setJk(res.getString("jenis_kelamin"));
            siswa.setAsal_sekolah(res.getString("asal_sekolah"));
            siswa.setNilai_bin(res.getDouble("nilai_bin"));
            siswa.setNilai_mtk(res.getDouble("nilai_mtk"));
            siswa.setNilai_big(res.getDouble("nilai_big"));
            siswa.setNilai_ipa(res.getDouble("nilai_ipa"));
            siswa.setRata(res.getDouble("rata"));
            siswa.setFoto(res.getString("foto"));
            siswa.getJurusan().setId_jurusan(res.getInt("id_jurusan"));
//            siswa.getJurusan().setNama(res.getString("namaJurusan"));
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }
      return siswa;
   }

   public ArrayList<Siswa> getByIdJurusan(int id_jurusan) { // Menampilkan data bedasarkan jurusan yang dipilih
      ArrayList<Siswa> listSiswa = new ArrayList();
      ResultSet res = DBhelper.selectQuery("SELECT s.*, j.nama as namaJurusan FROM siswa s INNER JOIN jurusan j "
        + " ON s.id_jurusan = j.id_jurusan WHERE status = '1' and s.id_jurusan = '" + id_jurusan + "'");
      try {
         while (res.next()) {
            Siswa siswa = new Siswa();
            siswa.setId_siswa(res.getString("id_siswa"));
            siswa.setNama(res.getString("nama"));
            siswa.setTempat(res.getString("tempat"));
            siswa.setTgl_lahir(res.getString("tgl_lahir"));
            siswa.setAlamat(res.getString("alamat"));
            siswa.setJk(res.getString("jenis_kelamin"));
            siswa.setAsal_sekolah(res.getString("asal_sekolah"));
            siswa.setNilai_bin(res.getDouble("nilai_bin"));
            siswa.setNilai_mtk(res.getDouble("nilai_mtk"));
            siswa.setNilai_big(res.getDouble("nilai_big"));
            siswa.setNilai_ipa(res.getDouble("nilai_ipa"));
            siswa.setRata(res.getDouble("rata"));
            siswa.setFoto(res.getString("foto"));
            siswa.getJurusan().setId_jurusan(res.getInt("id_jurusan"));
            siswa.getJurusan().setNama(res.getString("namaJurusan"));

            listSiswa.add(siswa);

         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }
      return listSiswa;
   }

   public ArrayList<Siswa> getByNamaSiswa(String nama) { // Menampilkan data bedasarkan jurusan yang dipilih
      ArrayList<Siswa> listSiswa = new ArrayList();
      ResultSet res = DBhelper.selectQuery("SELECT s.*, j.nama as namaJurusan FROM siswa s INNER JOIN jurusan j "
        + " ON s.id_jurusan = j.id_jurusan WHERE status = '1' and s.nama LIKE '%" + nama + "%'");
      try {
         while (res.next()) {
            Siswa siswa = new Siswa();
            siswa.setId_siswa(res.getString("id_siswa"));
            siswa.setNama(res.getString("nama"));
            siswa.setTempat(res.getString("tempat"));
            siswa.setTgl_lahir(res.getString("tgl_lahir"));
            siswa.setAlamat(res.getString("alamat"));
            siswa.setJk(res.getString("jenis_kelamin"));
            siswa.setAsal_sekolah(res.getString("asal_sekolah"));
            siswa.setNilai_bin(res.getDouble("nilai_bin"));
            siswa.setNilai_mtk(res.getDouble("nilai_mtk"));
            siswa.setNilai_big(res.getDouble("nilai_big"));
            siswa.setNilai_ipa(res.getDouble("nilai_ipa"));
            siswa.setRata(res.getDouble("rata"));
            siswa.setFoto(res.getString("foto"));
            siswa.getJurusan().setId_jurusan(res.getInt("id_jurusan"));
            siswa.getJurusan().setNama(res.getString("namaJurusan"));

            listSiswa.add(siswa);

         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }
      return listSiswa;
   }
   
   public ArrayList<Siswa> getAll() { // Menampilkan semua kategori
      ArrayList<Siswa> listSiswa = new ArrayList();
      ResultSet res = DBhelper.selectQuery("SELECT s.*, j.nama as namaJurusan FROM siswa s INNER JOIN jurusan j "
        + " ON s.id_jurusan = j.id_jurusan WHERE status = '1' ");
      try {
         while (res.next()) {
            Siswa siswa = new Siswa();
            siswa.setId_siswa(res.getString("id_siswa"));
            siswa.setNama(res.getString("nama"));
            siswa.setTempat(res.getString("tempat"));
            siswa.setTgl_lahir(res.getString("tgl_lahir"));
            siswa.setAlamat(res.getString("alamat"));
            siswa.setJk(res.getString("jenis_kelamin"));
            siswa.setAsal_sekolah(res.getString("asal_sekolah"));
            siswa.setNilai_bin(res.getDouble("nilai_bin"));
            siswa.setNilai_mtk(res.getDouble("nilai_mtk"));
            siswa.setNilai_big(res.getDouble("nilai_big"));
            siswa.setNilai_ipa(res.getDouble("nilai_ipa"));
            siswa.setRata(res.getDouble("rata"));
            siswa.setFoto(res.getString("foto"));
            siswa.getJurusan().setId_jurusan(res.getInt("id_jurusan"));
            siswa.getJurusan().setNama(res.getString("namaJurusan"));

            listSiswa.add(siswa);
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }

      return listSiswa;
   }

   public ArrayList<Siswa> search(String keyword) { // Searching
      ArrayList<Siswa> listSiswa = new ArrayList();
      String sql = "SELECT * FROM siswa WHERE "
        + "nama LIKE '%" + keyword + "%'";
      ResultSet res = DBhelper.selectQuery(sql);
      try {
         while (res.next()) {
            Siswa siswa = new Siswa();
            siswa.setId_siswa(res.getString("id_siswa"));
            siswa.setNama(res.getString("nama"));
            siswa.setTempat(res.getString("tempat"));
            siswa.setTgl_lahir(res.getString("tgl_lahir"));
            siswa.setAlamat(res.getString("alamat"));
            siswa.setJk(res.getString("jenis_kelamin"));
            siswa.setAsal_sekolah(res.getString("asal_sekolah"));
            siswa.setNilai_bin(res.getDouble("nilai_bin"));
            siswa.setNilai_mtk(res.getDouble("nilai_mtk"));
            siswa.setNilai_big(res.getDouble("nilai_big"));
            siswa.setNilai_ipa(res.getDouble("nilai_ipa"));
            siswa.setRata(res.getDouble("rata"));
            siswa.setFoto(res.getString("foto"));

            listSiswa.add(siswa);
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }
      return listSiswa;
   }

   @Override
   public void save() { // Method untuk menyimpan dan untuk update data
      String SQL = "INSERT INTO siswa(id_siswa, nama, tempat, tgl_lahir, alamat, jenis_kelamin, asal_sekolah, foto) VALUES ("
        + "'" + this.id_siswa + "' , '" + this.nama + "','" + this.tempat + "','" + this.tgl_lahir + "','"
        + this.alamat + "','" + this.jk + "','" + this.asal_sekolah + "','" + this.foto + "')";
//      this.id_anggota = DBhelper.insertQueryById(SQL);
      DBhelper.executeQuery(SQL);
      System.out.println("Method save sukses");
   }

   public void saveNilaiSiswa() { // Method untuk menyimpan dan untuk update data
      String SQL = "UPDATE siswa SET "
        + "nilai_bin = '" + this.nilai_bin + "', "
        + "nilai_big = '" + this.nilai_big + "', "
        + "nilai_mtk = '" + this.nilai_mtk + "', "
        + "nilai_ipa = '" + this.nilai_ipa + "', "
        + "rata = '" + this.rata + "', "
        + "status = '" + 1 + "', "
        + "id_jurusan = '" + this.getJurusan().getId_jurusan() + "' "
        + "WHERE id_siswa = '" + this.id_siswa + "'";
      DBhelper.executeQuery(SQL);
      System.out.println("Method update sukses");
   }

   @Override
   public void update() {
      String SQL = "UPDATE siswa SET "
        + "nama = '" + this.nama + "', "
        + "tempat = '" + this.tempat + "', "
        + "tgl_lahir = '" + this.tgl_lahir + "', "
        + "alamat = '" + this.alamat + "', "
        + "jenis_kelamin = '" + this.jk + "', "
        + "asal_sekolah = '" + this.asal_sekolah + "', "
        + "foto = '" + this.foto + "' "
        + "WHERE id = '" + this.id_siswa + "'";
      DBhelper.executeQuery(SQL);
      System.out.println("Method update sukses");
   }

   @Override
   public void delete() { // Menghapus data
      String SQL = "DELETE FROM siswa WHERE id_siswa = '" + this.id_siswa + "'";
      DBhelper.executeQuery(SQL);
   }

}
