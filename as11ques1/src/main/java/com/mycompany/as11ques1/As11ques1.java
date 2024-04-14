/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as11ques1;
import java.io.*;
import java.util.Scanner;

public class As11ques1 {

    public static void main(String[] args) {
        try {
            File input = new File("input.txt"); 
            File output = new File("output.txt"); 

            Scanner sc = new Scanner(input);
            PrintWriter printer = new PrintWriter(output);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                printer.println(line);
            }
System.out.println("Lines copied successfully!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found. Please check the file paths.");
        }
    }
}
