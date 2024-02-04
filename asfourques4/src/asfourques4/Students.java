/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asfourques4;
import java.util.Scanner;

 class Student {
private final int studentRoll;
private final String studentName;
private final double[] studentMarks;
public Student(int roll, String name, double[] marks){
    this.studentRoll = roll;
    this.studentName = name;
    this.studentMarks = marks;
}
public void calcavg(){
    double sum = 0;
    for(double mark : studentMarks){
        sum += mark;
    }
    double average = sum / studentMarks.length;
    System.out.println("Student Roll: " + studentRoll);
    System.out.println("Student Name: " + studentName);
    System.out.println("Average Marks: " + average);
}
}
public class Students{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Student 1: ");
        Student student1 = createstu(scanner);
        System.out.println("Enter details for Student 2: ");
        Student student2 = createstu(scanner);
         System.out.println("Enter details for Student 3: ");
         Student student3 = createstu(scanner);
         student1.calcavg();
         student2.calcavg();
         student3.calcavg();
         scanner.close();
    }
    private static Student createstu(Scanner scanner){
        System.out.println("Enter Student Roll: ");
        int roll = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        double[] marks = new double[5];
        System.out.println("Enter marks for 5 subjects: ");
        for(int i = 0; i<5; i++){
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
        return new Student(roll, name, marks);
    }
    
}
