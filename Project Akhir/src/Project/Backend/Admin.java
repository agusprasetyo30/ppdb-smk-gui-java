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
 * @author gokpraz
 */
public class Admin implements Action {

   private int id;
   private String nama;
   private String username;
   private String password;
   private String foto;

   public Admin() {

   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNama() {
      return nama;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getFoto() {
      return foto;
   }

   public void setFoto(String foto) {
      this.foto = foto;
   }

   public boolean loginAdmin(String username, String password) { // Login data
      boolean login = false;
      ResultSet res = DBhelper.selectQuery("SELECT * FROM admin WHERE username = '" + username + "' and password = '" + password + "'");

      try {
         if (res.next()) {
               login = true;
               Admin admin = new Admin();
               admin.setId(res.getInt("id"));
               admin.setNama(res.getString("nama"));
               admin.setUsername(res.getString("username"));
               admin.setPassword(res.getString("password"));
               admin.setFoto(res.getString("foto"));
         } else {
            login = false;
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }
      return login;
   }

   public Admin getByUserPass(String username, String password) { // Menampilkan data bedasarkan ID
      Admin admin = new Admin();
      ResultSet res = DBhelper.selectQuery("SELECT * FROM admin WHERE username = '" + username + "' and password = '" + password + "'");

      try {
         while (res.next()) {
            admin = new Admin();
            admin.setId(res.getInt("id"));
            admin.setNama(res.getString("nama"));
            admin.setUsername(res.getString("username"));
            admin.setPassword(res.getString("password"));
            admin.setFoto(res.getString("foto"));
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }

      return admin;
   }

   public ArrayList<Admin> getAll() { // Menampilkan semua kategori
      ArrayList<Admin> listAdmin = new ArrayList();
      ResultSet res = DBhelper.selectQuery("SELECT * FROM admin");
      try {
         while (res.next()) {
            Admin admin = new Admin();
            admin.setId(res.getInt("id"));
            admin.setNama(res.getString("nama"));
            admin.setUsername(res.getString("username"));
            admin.setPassword(res.getString("password"));
            admin.setFoto(res.getString("foto"));

            listAdmin.add(admin);
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }

      return listAdmin;
   }

   public ArrayList<Admin> search(String keyword) { // Searching
      ArrayList<Admin> listAdmin = new ArrayList();
      String sql = "SELECT * FROM admin WHERE "
        + "nama LIKE '%" + keyword + "%'";
      ResultSet res = DBhelper.selectQuery(sql);
      try {
         while (res.next()) {
            Admin admin = new Admin();
            admin.setId(res.getInt("id"));
            admin.setNama(res.getString("nama"));
            admin.setUsername(res.getString("username"));
            admin.setPassword(res.getString("password"));
            admin.setFoto(res.getString("foto"));

            listAdmin.add(admin);
         }
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }
      return listAdmin;
   }

   @Override
   public void save() { // Method untuk menyimpan dan untuk update data
      String SQL = "INSERT INTO admin VALUES ("
        + "" + null + " , '" + this.nama + "','" + this.username + "','" + this.password + "','" + this.foto + "')";
//      this.id_anggota = DBhelper.insertQueryById(SQL);
      DBhelper.executeQuery(SQL);
      System.out.println("Method save sukses");
   }

   @Override
   public void update() {
      String SQL = "UPDATE admin SET "
        + "nama = '" + this.nama + "', "
        + "username = '" + this.username + "', "
        + "password = '" + this.password + "', "
        + "foto = '" + this.foto + "' "
        + "WHERE id = '" + this.id + "'";
      DBhelper.executeQuery(SQL);
      System.out.println("Method update sukses");
   }

   @Override
   public void delete() { // Menghapus data
      String SQL = "DELETE FROM admin WHERE id = '" + this.id + "'";
      DBhelper.executeQuery(SQL);
   }
   
   public void ubahPassword(){
      String SQL = "UPDATE admin SET "
        + "password = '" + this.password + "' "
        + "WHERE username = '" + this.username + "'";
      DBhelper.executeQuery(SQL);
      System.out.println("Method update sukses");
   }

}
