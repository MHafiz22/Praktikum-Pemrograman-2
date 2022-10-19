package PRAK203_2110817210022_MuhammadHafiz;

/**
 *
 * @author USER
 */
//Pada baris ini terjadi error karena ada kesalahan nama class karena class ini berada dalam file pegawai.java maka seharusnya diganti dengan class pegawai
//public class Employee {
public class Pegawai { 
    public String nama;
    //Pada baris ini terjadi error karena ada kesalahan tipe data, seharusnya menggunakan String
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    
    public String getNama() {
        return nama;
    }
    
    public String getAsal() {
        return asal;
    }
    
    //Pada baris ini terjadi error karena ada kesalahan tidak adanya parameter, maka harus ditambahkan agar tidak terjadi error
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
