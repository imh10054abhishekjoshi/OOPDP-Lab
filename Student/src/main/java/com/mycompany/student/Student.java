/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;


public class Student {
String name;
int roll;
double fee;
public Student(){
    this("Default", 0, 0.0);
}
public Student(String name, int roll, double fee){
    this.name = name;
    this.roll = roll;
    this.fee = fee;
}
public void display(){
    System.out.println("Student Name: " + name + "\nStudent Roll: " + roll+ "\nStudent Fee: " +fee);
}
public void show(Student student){
    student.display();
}
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("xyz", 5, 5000.0);
        student1.show(student1);
        student2.show(student2);
    }
}
