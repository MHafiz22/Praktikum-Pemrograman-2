package prak105_2110817210022_muhammadhafiz;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author USER
 */
public class PRAK105_2110817210022_MuhammadHafiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float jarijari, tinggi;
        double volume;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan jari-jari : ");
        jarijari = keyboard.nextFloat();
        
        System.out.print("Masukan tinggi    : ");
        tinggi = keyboard.nextFloat();
        
        volume = 3.14 * jarijari * jarijari * tinggi;
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.println("Volume tabung dengan jari-jari " + jarijari + " cm dan tinggi " + tinggi + " cm adalah " + df.format(volume) + " m3");
    }
}
