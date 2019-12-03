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

/**
 *
 * @author asus
 */
public class Jurusan implements Action{

   private int id_jurusan;
   private String nama;
   private String singkatan;
   private String keterangan;
   private String foto;
   private double passing_grade;

   public Jurusan() {

   }

   public void setpassing_grade(double passing_grade) {
      this.passing_grade = passing_grade;
   }
   
   public double getpassing_grade() {
      return passing_grade;
   }

   
   public int getId_jurusan() {
      return id_jurusan;
   }

   public void setId_jurusan(int id_jurusan) {
      this.id_jurusan = id_jurusan;
   }

   public String getNama() {
      return nama;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public String getSingkatan() {
      return singkatan;
   }

   public void setSingkatan(String singkatan) {
      this.singkatan = singkatan;
   }

   public String getKeterangan() {
      return keterangan;
   }

   public void setKeterangan(String keterangan) {
      this.keterangan = keterangan;
   }

   public String getFoto() {
      return foto;
   }

   public void setFoto(String foto) {
      this.foto = foto;
   }

   @Override
   public String toString(){
      return this.nama;
   }
   
   public Jurusan getById(int id) { // Menampilkan data bedasarkan ID
      Jurusan jur = new Jurusan();
      ResultSet res = DBhelper.selectQuery("SELECT * FROM jurusan WHERE id_jurusan = '" + id + "'");

      try {
         while (res.next()) {
            jur = new Jurusan();
            jur.setId_jurusan(res.getInt("id_jurusan"));
            jur.setNama(res.getString("nama"));
            jur.setSingkatan(res.getString("singkatan"));
            jur.setKeterangan(res.getString("keterangan"));
            jur.setFoto(res.getString("foto"));
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }

      return jur;
   }

   public ArrayList<Jurusan> getAll() { // Menampilkan semua kategori
      ArrayList<Jurusan> listJurusan = new ArrayList();
      ResultSet res = DBhelper.selectQuery("SELECT * FROM jurusan");
      try {
         while (res.next()) {
            Jurusan jur = new Jurusan();
            jur.setId_jurusan(res.getInt("id_jurusan"));
            jur.setNama(res.getString("nama"));
            jur.setSingkatan(res.getString("singkatan"));
            jur.setKeterangan(res.getString("keterangan"));
            jur.setFoto(res.getString("foto"));
//            jur.setpassing_grade(res.getDouble("passingGrade"));

            listJurusan.add(jur);
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }

      return listJurusan;
   }

   public ArrayList<Jurusan> search(String keyword) { // Searching
      ArrayList<Jurusan> listJurusan = new ArrayList();
      String sql = "SELECT * FROM jurusan WHERE "
        + "nama LIKE '%" + keyword + "%'";
      ResultSet res = DBhelper.selectQuery(sql);
      try {
         while (res.next()) {
            Jurusan jur = new Jurusan();
            jur.setId_jurusan(res.getInt("id_jurusan"));
            jur.setNama(res.getString("nama"));
            jur.setSingkatan(res.getString("singkatan"));
            jur.setKeterangan(res.getString("keterangan"));
            jur.setFoto(res.getString("foto"));

            listJurusan.add(jur);
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }
      return listJurusan;
   }

   @Override
   public void save() { // Method untuk menyimpan dan untuk update data
      String SQL = "INSERT INTO jurusan VALUES ("
        + "" + null + " , '" + this.nama + "','" + this.singkatan + "','" + this.keterangan + "','" + this.foto + "')";
//      this.id_anggota = DBhelper.insertQueryById(SQL);
      DBhelper.executeQuery(SQL);
      System.out.println("Method save sukses");
   }

   @Override
   public void update() {
      String SQL = "UPDATE jurusan SET "
        + "nama = '" + this.nama + "', "
        + "singkatan = '" + this.singkatan + "', "
        + "keterangan = '" + this.keterangan + "', "
        + "foto = '" + this.foto + "', "
//        + "passingGrade = '" + this.passing_grade + " ' "
        + "WHERE id_jurusan = '" + this.id_jurusan + "'";
      DBhelper.executeQuery(SQL);
      System.out.println("Method update sukses");
   }

   @Override
   public void delete() { // Menghapus data
      String SQL = "DELETE FROM jurusan WHERE id_jurusan = '" + this.id_jurusan + "'";
      DBhelper.executeQuery(SQL);
   }
}
