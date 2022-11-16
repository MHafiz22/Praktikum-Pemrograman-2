package praktikum4.soal1;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        String penulis, judul;
        Integer tahun;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Judul: ");
        judul = inputan.nextLine();
        
        System.out.print("Penulis: ");
        penulis = inputan.nextLine();
        
        System.out.print("Tahun Terbit: ");
        tahun = inputan.nextInt();
        
        Buku buku = new Buku(judul, penulis, tahun);
        
        buku.Display();
    }
}

