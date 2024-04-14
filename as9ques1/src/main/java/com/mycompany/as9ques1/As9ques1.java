/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as9ques1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class As9ques1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.print("Enter integers : ");
        String intInput = scanner.nextLine();
        String[] intTokens = intInput.split("\\s+");
        for (String token : intTokens) {
            intList.add(Integer.parseInt(token));
        }
        intList.add(4);
        intList.add(9);
        System.out.println("Integer Collection: " + intList);
        ArrayList<String> stringList = new ArrayList<>();
        System.out.print("Enter strings (separated by spaces): ");
        String stringInput = scanner.nextLine();
        String[] stringTokens = stringInput.split("\\s+");
        Collections.addAll(stringList, stringTokens);
        stringList.add("Hello");
        stringList.add("World");
         System.out.println("String Collection: " + stringList);
        intList.add(0, 7);
        stringList.add(0, "Java");
        intList.remove(Integer.valueOf(4)); 
        stringList.remove("World");
        Collections.sort(intList);
        Collections.sort(stringList);
        System.out.println("Modified Integer Collection: " + intList);
        System.out.println("Modified String Collection: " + stringList);
    }
}
