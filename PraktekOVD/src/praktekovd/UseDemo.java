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
public class UseDemo {
 

{

public static void UseDemo(String[] args) 

{byte a = 25; 

Overloading obj = new Overloading();

 

// akan menuju ke argumen byte 

obj.show(a); 

 

// String

obj.show("hello");

 

// Int  

obj.show(250); 

 

// Ketika tipe data char tidak

// tersedia, maka tipe data

// yang lebih tinggi dari char

// dalam hal rentang adalah

// int.

obj.show('A');

 

// String 

obj.show("A"); 

 

// Ketika tipe data float

// tidak tersedia dan juga

// bukan merupakan tipe data

// yang lebih tinggi, maka

// pada tahap ini akan terjadi

// error.

obj.show(7.5);}

}
    }
       

