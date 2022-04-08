/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepabrik;

/**
 *
 * @author celaacl
 */
public interface Pabrik {
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

   @Override
   public void setNama(String namaBaru){
      nama = namaBaru;
   }

   @Override
   public void setAlamat(String alamatBaru){
      alamat = alamatBaru;
   }

   @Override
   public String getNama(){
      return nama;
   }

   @Override
   public String getAlamat(){
      return alamat;
   }
 
   public String getProvinsi(){
      return PROVINSI;
   }

   @Override
   public String toString(){
      return
        "Nama       : "+nama+"\n"+
        "Alamat            : "+alamat+"\n"+
        "Provinsi   : "+PROVINSI+"\n"; 
   }
}
