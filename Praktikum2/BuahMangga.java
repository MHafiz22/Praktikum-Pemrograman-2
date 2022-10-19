package PRAK201_2110817210022_MuhammadHafiz;

/**
 *
 * @author USER
 */
public class BuahMangga {
    String nama;
    float berat;
    int jumlahbeli,harga;
    
    public BuahMangga(String Nama, float berat, int jumlah, int harga) {
        this.nama = Nama;
        this.berat = berat;
        this.jumlahbeli = jumlah;
        this.harga = harga;
    }
    
    public void info() {
        System.out.println("Nama Mangga : " + nama);
        System.out.println("Berat : " + berat + " kg");
        System.out.println("Jumlah Beli : " + jumlahbeli);
        System.out.println("Total Berat : " + berat*jumlahbeli + " kg");
        System.out.println("Total Harga : Rp." + harga*jumlahbeli);
        System.out.println("");
    }
}