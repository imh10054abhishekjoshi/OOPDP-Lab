/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as7ques4;
class A{
    void msg() {
        System.out.println("A is called here");
    }
}
class B extends A{
     @Override
     void msg() {
        super.msg(); 
        System.out.println("B is called here");
    }
}
public class As7ques4 extends B {
@Override
void msg() {
        super.msg(); 
        System.out.println("C is called here");
    }
    public static void main(String[] args) {
        As7ques4 obj = new As7ques4(); 
        obj.msg(); 
    }
}
