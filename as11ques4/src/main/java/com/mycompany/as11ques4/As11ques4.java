/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as11ques4;
import java.io.*;


public class As11ques4 {

    public static void main(String[] args) {
         String sourceFilePath = "source.txt"; // Replace with the actual path to source.txt
        String destinationFilePath = "destination.txt"; // Replace with the actual path to destination.txt

        try (
            FileInputStream sourceStream = new FileInputStream(sourceFilePath);
            FileInputStream destinationStream = new FileInputStream(destinationFilePath);
            SequenceInputStream combinedStream = new SequenceInputStream(sourceStream, destinationStream)
        ) {
            int byteValue;
            while ((byteValue = combinedStream.read()) != -1) {
                System.out.print((char) byteValue); // Display the combined content
            }
            System.out.println("\nFiles combined successfully!");
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }
}
