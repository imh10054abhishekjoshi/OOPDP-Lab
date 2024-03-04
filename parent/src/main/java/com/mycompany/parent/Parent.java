/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parent;


class Parents {
void showParent(){
    System.out.println("Father and Mother");
}
}
class Child extends Parents{
    void showChild(){
        System.out.println("Children");
    }
}
public class Parent{
    public static void main(String[] args) {
        Child childobj = new Child();
        childobj.showChild();
        childobj.showParent();
    }
}
