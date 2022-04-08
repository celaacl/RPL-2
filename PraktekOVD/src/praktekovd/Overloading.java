/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktekovd;

/**
 *
 * @author celaacl
 */
 
public class Overloading {
    //OVERLOADING DENGAN beda tipe data
    
    public void penjumlahan(int x, long y){
       System.out.println(x + y);
    }
    
    public void penjumlahan(long x, int y, double z){
        System.out.println(x + y + z);
    }