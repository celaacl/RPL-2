/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author celaacl
 */
public class NOMORDUA {

    public static void main(String[] args) {
        int nilaisukupertama = 6;
        int selisih = 3;
        int baris = 2;
        int kolom = 4;
        int deret = nilaisukupertama;
        int total = 0;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(deret + "t");

                total += deret;
                deret += selisih;

            }
            System.out.println("");
        }
        System.out.println("Jumlah nilai deret aritmatika diatas adalah = " + total);
    }

}


