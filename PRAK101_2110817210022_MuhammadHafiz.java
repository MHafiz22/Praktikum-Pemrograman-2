/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak101_2110817210022_muhammadhafiz;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PRAK101_2110817210022_MuhammadHafiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namalengkap, tempatlahir, bulan;
        int tanggallahir, bulanlahir, tahunlahir, tinggi;
        float berat;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap : ");
        namalengkap = keyboard.nextLine();

        System.out.print("Masukkan Tempat Lahir : ");
        tempatlahir = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        tanggallahir = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir : ");
        bulanlahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir : ");
        tahunlahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan : ");
        tinggi = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan : ");
        berat = keyboard.nextFloat();
        
        switch (bulanlahir) {
            case 1:
                bulan = "Januari";
                break;
            case 2:
                bulan = "Februari";
                break;
            case 3:
                bulan = "Maret";
                break;
            case 4:
                bulan = "April";
                break;
            case 5:
                bulan = "Mei";
                break;
            case 6:
                bulan = "Juni";
                break;
            case 7:
                bulan = "Juli";
                break;
            case 8:
                bulan = "Agustus";
                break;
            case 9:
                bulan = "September";
                break;
            case 10:
                bulan = "Oktober";
                break;
            case 11:
                bulan = "November";
                break;
            case 12:
                bulan = "Desember";
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("\nData Telah ditambahkan,");
        System.out.println("Nama Lengkap " + namalengkap + ", Lahir di " + tempatlahir + " Pada Tanggal " + tanggallahir + " " + bulan + " " + tahunlahir );
        System.out.println("Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " Kilogram");
    }
    
}
