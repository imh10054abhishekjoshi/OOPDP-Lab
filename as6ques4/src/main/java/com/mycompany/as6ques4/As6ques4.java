/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as6ques4;
import java.util.Scanner;

public class As6ques4 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("Integer Num: " + intValue);
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("Float Num: " + floatValue);
         System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Double Num: " + doubleValue);
        System.out.print("Enter an integer: ");
        int seqInt = scanner.nextInt();
        System.out.print("Enter a character: ");
        char seqChar = scanner.next().charAt(0);
        System.out.println("Integer: " + seqInt + " Char: " + seqChar);
        System.out.print("Enter a character: ");
        char seqChar2 = scanner.next().charAt(0);
        System.out.print("Enter an integer: ");
        int seqInt2 = scanner.nextInt();
        System.out.println("Char: " + seqChar2 + " Integer: " + seqInt2);
        System.out.print("Enter the side length of a square: ");
        double side = scanner.nextDouble();
        System.out.println("Area of square: " + side * side);
        System.out.print("Enter the length of a rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        System.out.println("Area of rectangle: " + length * breadth);
    }
}
