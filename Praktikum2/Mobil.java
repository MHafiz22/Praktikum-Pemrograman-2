package PRAK202_2110817210022_MuhammadHafiz;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author USER
 */
class Mobil {
    String merek,tahun_keluaran,pemilik;
    int kapasitas,harga,pajak;
    
    DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    
    void setPemilik(String pemilik) {
    this.pemilik = pemilik;
    }

    String getPemilik() {
    return this.pemilik;
    }
    
    public int getPajak(){
    pajak= (int) (harga*2/100);
    return pajak;
    }
    
    void info() {
        formatRp.setCurrencySymbol("");
        formatRp.setMonetaryDecimalSeparator(',');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        System.out.println("Merek Mobil: " + this.merek);
        System.out.println("Harga : Rp. " + rupiah.format(this.harga));
        System.out.println("Tahun Keluaran : " + this.tahun_keluaran);
        System.out.println("Kapasitas : " + this.kapasitas + "cc");
        }
}
