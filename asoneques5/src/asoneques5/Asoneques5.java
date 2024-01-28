/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asoneques5;
import java.util.Scanner;
public class Asoneques5 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a double value: ");
        double doublevalue = scanner.nextDouble();
        System.out.print("Enter a long value: ");
        long longvalue = scanner.nextLong();
        float floatresult = (float) doublevalue;
        long longresult = (long) doublevalue;
        int intresult = (int) longvalue;
        System.out.println("a. Converted double to float: " + floatresult);
        System.out.println("b. Converted double to long: " + longresult);
        System.out.println("c. Converted long to int: " + intresult);
        scanner.close();
    }
    
}
