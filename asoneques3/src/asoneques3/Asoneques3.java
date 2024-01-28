/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asoneques3;

import java.util.Scanner;
public class Asoneques3 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intvalue = scanner.nextInt();
        System.out.print("Enter a double: ");
        double doublevalue = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter a string: ");
        String stringvalue = scanner.nextLine();
        System.out.println("The values entered by the user:");
        System.out.println("Integer: " + intvalue);
        System.out.println("Double: " + doublevalue);
        System.out.println("String: " + stringvalue);
        scanner.close();
    }
    
}
