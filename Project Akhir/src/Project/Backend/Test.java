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
public class Test {
   public static void main(String[] args) {
//      Siswa siswa = new Siswa();
//      siswa.setId_siswa("ABCSD");
//      siswa.setNama("Melkan");
//      siswa.setTempat("Randugeneng");
//      siswa.setTgl_lahir("1998-12-12");
//      siswa.setAlamat("Entah slur");
//      siswa.setJk("Laki-laki");
//      siswa.setAsal_sekolah("SMP 1 Palang");
      
//      siswa.saveDataSiswa();
      
      for (Siswa siswa : new Siswa().getAll()) {
         System.out.println(siswa.getNama());
      }
      
   }
}
