/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as7ques5;

class Base {
    public void display() {
        System.out.println("Base class display method called.");
    }
}

class Derived extends Base {
    public void show() {
        System.out.println("Derived class show method called.");
    }
}
public class As7ques5 {

    public static void main(String[] args) {
      Base bobj = new Base();
        Derived dobj = new Derived();
        bobj.display();
        Base baseRefToDerived = dobj;
        baseRefToDerived.display();
        dobj.show();   
    }
}
