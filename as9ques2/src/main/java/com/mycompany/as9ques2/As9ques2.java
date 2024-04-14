/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as9ques2;
import java.util.ArrayList;
import java.util.Scanner;

public class As9ques2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter integers for List 1: ");
        String input1 = scanner.nextLine();
        String[] tokens1 = input1.split("\\s+");
        for (String token : tokens1) {
            list1.add(Integer.parseInt(token));
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter integers for List 2: ");
        String input2 = scanner.nextLine();
        String[] tokens2 = input2.split("\\s+");
        for (String token : tokens2) {
            list2.add(Integer.parseInt(token));
        }
        boolean areEqual = list1.equals(list2);
        System.out.println("Are List 1 and List 2 equal? " + (areEqual ? "Yes" : "No"));
        ArrayList<Integer> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);
        System.out.println("Combined List: " + combinedList);
        System.out.print("Enter an integer value to search: ");
        int searchValue = scanner.nextInt();
        boolean containsValue = combinedList.contains(searchValue);
        System.out.println("Is " + searchValue + " present in the combined list? " + (containsValue ? "Yes" : "No"));
    }
}
