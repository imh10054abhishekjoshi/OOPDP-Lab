/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as11ques5;
import java.util.Scanner;

public class As11ques5 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        boolean containsS = inputString.contains("s");
        if (containsS) {
            System.out.println("The string contains the letter 's'.");
        } else {
            System.out.println("The string does not contain the letter 's'.");
        }
    }
}
