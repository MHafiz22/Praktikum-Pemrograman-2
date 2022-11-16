package praktikum4.soal1;

/**
 *
 * @author USER
 */
public class Buku { 
    private String judul, penulis;
    private Integer tahun;

    public Buku(String j, String p, Integer t) {
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
    }
    
    public void Display() {
        System.out.println("\nDetail Buku: ");
        System.out.println("Judul adalah " + judul);
        System.out.println("Penulis adalah " + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }
}
