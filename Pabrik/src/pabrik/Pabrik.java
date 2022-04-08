/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pabrik;

/**
 *
 * @author celaacl
 */
public class Pabrik {

    

   static final String PROVINSI = "Jawa Barat";

   public void setNama(String namaBaru);
   public void setAlamat(String alamatBaru);
   public String getNama();
   public String getAlamat();

}
class PabrikSepatu implements Pabrik{
   String nama, alamat;

   public PabrikSepatu(String namaBaru, String alamatBaru){
      nama = namaBaru;
      alamat = alamatBaru;
   }

   public void setNama(String namaBaru){
      nama = namaBaru;
   }

   public void setAlamat(String alamatBaru){
      alamat = alamatBaru;
   }

   public String getNama(){
      return nama;
   }

   public String getAlamat(){
      return alamat;
   }
 
   public String getProvinsi(){
      return PROVINSI;
   }

   public String toString(){
      return
        "Nama       : "+nama+"\n"+
        "Alamat            : "+alamat+"\n"+
        "Provinsi   : "+PROVINSI+"\n"; 
   }
}

public class PabrikBaru{
   public static void main (String[] args) {
      test();
   }

   static void test(){
      PabrikSepatu SupplierSepatu;
      SupplierSepatu = new PabrikSepatu("Adidas","Jalan Merdeka 123");
      System.out.println("Informasi perusahaan : "+"\n"+SupplierSepatu);
   }
}
    
}
