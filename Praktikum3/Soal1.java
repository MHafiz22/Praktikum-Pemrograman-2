package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Soal1 { 
  public static void main(String[] args) { 
      
    Scanner inputDadu = new Scanner(System.in);
    int input = inputDadu.nextInt();
    int total = 0;
    
    LinkedList<Dadu> dadu = new LinkedList<Dadu>();
    for (int i=0; i <= input; i++ ) {
        dadu.add(new Dadu());
        dadu.getLast().acakNilai();
    }
    
    for (int i = 1; i < dadu.size(); i++) {
        System.out.println("Dadu ke-" + i + " bernilai " + dadu.get(i).getNilai());
        total = total + dadu.get(i).getNilai();
    }
    
      System.out.println("Total nilai dadu keseluruhan " + total);
  } 
}
