/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as9ques4;
import java.util.Arrays;
import java.util.Scanner;

public class As9ques4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toLowerCase();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase();
        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
             Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean areAnagrams = Arrays.equals(charArray1, charArray2);
            if (areAnagrams) {
                System.out.println("The strings '" + str1 + "' and '" + str2 + "' are anagrams.");
            } else {
                System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not anagrams.");
            }
        } else {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not anagrams.");
        }
        
    }
}
