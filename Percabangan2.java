/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan2;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class Percabangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Angka");
        int angka = masukan.nextInt();
        if (angka%2==0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
//        String hasil = angka%2==0? "Bilangan Genap" : "Bilangan Ganjil";
//        System.out.println(hasil);
    }
    
}
