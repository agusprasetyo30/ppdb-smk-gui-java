/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Backend;

/**
 *
 * @author gokpraz
 */
import java.sql.*;

public class DBhelper {

   private static Connection koneksi;

   public static void conn() {
      if (koneksi == null) {
         try {
            String url = "jdbc:mysql://localhost:3306/ppdb_smk";
            String username = "root";
            String password = "gokpras123";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, username, password);
         } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
         }
      }
   }

   public static int insertQueryById(String query) {
      conn();
      int num = 0;
      int result = -1;
      System.out.println(query);

      try {
         Statement stat = koneksi.createStatement();
         num = stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

         ResultSet res = stat.getGeneratedKeys();

         if (res.next()) {
            result = res.getInt(1);
         }

         res.close();
         stat.close();
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
         result = -1;
      }

      return result;
   }

   public static boolean executeQuery(String query) { // Insert, Update, Delete
      conn();
      boolean result = false;

         System.out.println(query);
      try {

         Statement stat = koneksi.createStatement();
         stat.executeUpdate(query);
         result = true;
         stat.close();
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }
      return result;
   }

   public static ResultSet selectQuery(String query) { // Select data
      conn();
      ResultSet res = null;
//      System.out.println(query);

      try {
         Statement stat = koneksi.createStatement();
         res = stat.executeQuery(query);
      } catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
      }

      return res;
   }
}
