/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as9ques5;
import java.util.Scanner;

public class As9ques5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversedString = "";
        for (int i = input.length() - 1; i >= 0; --i) {
            reversedString += input.charAt(i);
        }
        System.out.println("Reversed string: " + reversedString);
    }
}
