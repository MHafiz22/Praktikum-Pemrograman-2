package prak104_2110817210022_muhammadhafiz;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PRAK104_2110817210022_MuhammadHafiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int andi = 0, budi = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Kartu Andi : ");
        int angkaandi1 = keyboard.nextInt();
        int angkaandi2 = keyboard.nextInt();
        int angkaandi3 = keyboard.nextInt();
        
        System.out.println("Kartu Budi : ");
        int angkabudi1 = keyboard.nextInt();
        int angkabudi2 = keyboard.nextInt();
        int angkabudi3 = keyboard.nextInt();
                
        if(angkaandi1 > angkabudi1){
            andi++;
        }else if(angkaandi1 == angkabudi1){
            
        }else{
            budi++;
        }
        
        if(angkaandi2 > angkabudi2){
            andi++;
        }else if(angkaandi2 == angkabudi2){
            
        }else{
            budi++;
        }
        
        if(angkaandi3 > angkabudi3){
            andi++;
        }else if(angkaandi3 == angkabudi3){
            
        }else{
            budi++;
        }
        
        if(andi > budi){
            System.out.println("Andi");
        }else if(andi < budi) {
            System.out.println("Budi");
        }else {
            System.out.println("Seri");
        }
    }
}
