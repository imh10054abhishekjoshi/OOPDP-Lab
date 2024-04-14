/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as9ques3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class As9ques3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.print("Enter integers: ");
        String intInput = scanner.nextLine();
        String[] intTokens = intInput.split("\\s+");
        for (String token : intTokens) {
            intList.add(Integer.parseInt(token));
        }
         int max = Collections.max(intList);
        int min = Collections.min(intList);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.print("Enter an integer to remove: ");
        int elementToRemove = scanner.nextInt();
        intList.remove(Integer.valueOf(elementToRemove));
        System.out.println("Remaining list: " + intList);
    }
}
