/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assixques1;


public class Assixques1 {
String name;
int roll;
double fee;
public Assixques1(String name, int roll, double fee){
    this.name = name;
    this.roll = roll;
    this.fee = fee;
}
public void display(){
    System.out.println("Student Name: " + name + "\nStudent Roll: " + roll + "\nStudent Fee: " + fee);
}
    public static void main(String[] args) {
        Assixques1 student1 = new Assixques1("abc", 15, 10000.0);
        Assixques1 student2 = new Assixques1("def", 16, 10000.0);
        student1.display();
        student2.display();
    }
}
