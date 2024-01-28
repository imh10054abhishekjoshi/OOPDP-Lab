/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asoneques6;
import java.util.Scanner;

public class Asoneques6 {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a single word: ");
      String singleword = scanner.next();
      System.out.println("Using next(): " + singleword);
      scanner.nextLine();
      System.out.print("Enter a full line: ");
      String fullline = scanner.nextLine();
      System.out.println("Using nextLine(): " + fullline);
      System.out.print("Enter multiple words: ");
      String word1 = scanner.next();
      String word2 = scanner.next();
      System.out.println("Using next() for multiple words: " + word1 +" " + word2);
      scanner.close();
    }
    
}
