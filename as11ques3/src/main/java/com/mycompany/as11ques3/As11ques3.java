/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as11ques3;
import java.io.*;

public class As11ques3 {

    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; 
        String destinationFilePath = "destination.txt"; 
        String outputFilePath = "output.txt"; 

        try (
            FileReader sourceReader = new FileReader(sourceFilePath);
            FileReader destinationReader = new FileReader(destinationFilePath);
            FileWriter writer = new FileWriter(outputFilePath)
        ) {
            int ch;
            while ((ch = sourceReader.read()) != -1) {
                writer.write(ch);
                 }
            while ((ch = destinationReader.read()) != -1) {
                writer.write(ch);
            }
            System.out.println("Files copied successfully!");
        } catch (IOException e) {
            System.err.println("Error reading/writing files: " + e.getMessage());
        }
    }
}
