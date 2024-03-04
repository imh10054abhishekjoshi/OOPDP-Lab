/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asfiveques2;

class Bird{
    void fly(){
        System.out.println("Bird flies.");
    }
}
class Parrot extends Bird{
    void showColor(){
        System.out.println("Colourful parrot.");
    }
}
class Crow extends Bird{
    void showColor(){
        System.out.println("Black crow.");
    }
}
public class Asfiveques2 {
public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Crow crow = new Crow();
        parrot.fly();
        parrot.showColor();
        crow.fly();
        crow.showColor();
    }
}
