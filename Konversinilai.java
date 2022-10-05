/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversinilai;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class Konversinilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nim, nama, prodi, matkul;
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("NIM : ");
        nim = masukan.nextLine();
        System.out.println("Nama : ");
        nama = masukan.nextLine();
        
        prodi = nim.substring(3,5);
        System.out.println("Program Studi : ");
        switch (prodi) {
            case "52":
                System.out.println("S1 - Teknologi Informasi");
                break;
            case "51":
                System.out.println("S1 - Sistem Informasi");
                break;
            case "31":
                System.out.println("D3 - Sistem Informasi");
                break;
            default:
                System.out.println("Program Studi Tidak Ditemukan");
                break;
        }
        System.out.println("Mata Kuliah : ");
        matkul = masukan.nextLine();
        System.out.println("Masukkan Nilai : ");
        nilai = masukan.nextInt();
        
        if ( 85 >= 100) {
            System.out.println("Predikatmu Adalah = B");
        }else if (75 >= 85 ) {
      System.out.println("Predikatmu Adalah = B");
        }else if (60 >= 75 ) {
      System.out.println("Predikatmu Adalah = C");
        }else if (nilai < 60 ) {
      System.out.println("Predikatmu Adalah = D");
        }else {
            System.out.println("Prediksi Tidak Ditemukan");
        }
    }
    
}
