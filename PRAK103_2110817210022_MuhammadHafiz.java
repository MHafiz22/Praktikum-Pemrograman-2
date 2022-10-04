package prak103_2110817210022_muhammadhafiz;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PRAK103_2110817210022_MuhammadHafiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angkainputan, i = 5;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        angkainputan = keyboard.nextInt();
        
        do {            
            if (angkainputan % 7 != 0){
                if (i == 5){
                   System.out.print(angkainputan);
                } else {
                   System.out.print(", " + angkainputan);
                }
            }
            
            angkainputan = angkainputan - 1;
            i = i - 1;
    
        }   while (i > 0);
    }
}
