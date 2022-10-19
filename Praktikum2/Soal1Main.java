package PRAK201_2110817210022_MuhammadHafiz;

/**
 *
 * @author USER
 */
public class Soal1Main {
 public static void main(String[] args) {
        
        BuahMangga arumanis = new BuahMangga(
                "Arumanis", 
                0.3f, 
                13, 
                5000);
        BuahMangga manalagi = new BuahMangga(
                "Manalagi", 
                0.5f, 
                17, 
                7500);
        BuahMangga madu = new BuahMangga(
                "Mangga Madu", 
                0.375f, 
                12, 
                6500);
    
        arumanis.info();
        manalagi.info();
        madu.info();
        
    }
    
    
}