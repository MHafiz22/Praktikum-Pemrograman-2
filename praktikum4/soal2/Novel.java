package praktikum4.soal2;

/**
 *
 * @author USER
 */
public class Novel extends Buku{
     private String genre, sinopsis;
    
    public Novel(String j, String p, String t, String g, String s) {
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.genre = g;
        this.sinopsis = s;    
    }
    
    String getNovelDetail(){
        return "Data yang baru diinputkan adalah\n"
                + "Sebuah novel bergenre " + genre + " dengan judul \"" + judul + "\".\n"
                + "Novel tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + tahun + ".\n"
                + "Sinopsis : " + sinopsis.substring(0, 59) + "...";
    }
}
