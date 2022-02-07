import java.util.*;
/**
 * @author Clarynta
 */
public class siswa {
   

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("siapa nama siswa  yang ingin ditampilkan datanya?");
        System.out.println("1:Kelulusan \t2:Extrakurikuler\t3:Perlombaan\t4:Kegiatan");
        System.out.println(" Masukkan kode angka : ");
        int pilihan = sc.nextInt();

        switch (pilihan){
            case 1:
                Kelulusan.nama();
                Kelulusan.kelas();
                Kelulusan.pelajaran();
                break;
            case 2:
                Extrakurikuler.nama();
                Extrakurikuler.kegiatan();
                Extrakurikuler.umur();
                break;
            case 3:
                Perlombaan.nama();
                Perlombaan.lomba();
                Perlombaan.umur();
                break;
            case 4:
                Kegiatan.nama();
                Kegiatan.kegiatan();
                Kegiatan.umur();
                break;
            default:
                System.out.println("Parameter tidak valid");
        }
    }
}

