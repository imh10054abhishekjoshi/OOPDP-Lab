/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as6ques3;


public class As6ques3 {
private String name;
    private int roll;
    private double fee;
    public As6ques3(String name, int roll, double fee) {
        this.name = name;
        this.roll = roll;
        this.fee = fee;
    }
    public As6ques3() {
        this("Unknown", 0, 0.0);
    }
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Fee Amount: $" + fee);
    }
    public void show(Object obj) {
        if (obj instanceof As6ques3) {
            As6ques3 student = (As6ques3) obj;
            System.out.println("Displaying object values using this keyword:");
            student.display();
             } else {
            System.out.println("Invalid object type. Expected Student object.");
        }
    }
    public static void main(String[] args) {
          As6ques3 student1 = new As6ques3("Alice", 101, 1500.0);
        As6ques3 student2 = new As6ques3(); 
        System.out.println("Details of Student 1:");
        student1.display();
        System.out.println("\nDetails of Student 2:");
        student2.show(student2);
    }
    }
    

