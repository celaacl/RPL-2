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
public class perulanganke1 {

    public static void main (String[] args) {
        int sisi = 4;

        for (int a = 0; a < sisi; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*" + "\t");
            }
            System.out.println("");
        }
    }

}
