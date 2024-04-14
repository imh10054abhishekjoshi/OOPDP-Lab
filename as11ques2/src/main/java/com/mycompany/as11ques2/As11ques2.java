/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as11ques2;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class As11ques2 {

    public static void main(String[] args) {
         String filePath = "/path/to/your/file"; 
        try {
            Path fileLocation = Paths.get(filePath);
            byte[] fileContent = Files.readAllBytes(fileLocation);
            System.out.println("File content read successfully!");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
