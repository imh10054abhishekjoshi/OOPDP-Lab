/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.as6ques5;

class Wrapper{
     private int value;

   public Wrapper(int initialValue) {
        value = initialValue;
    }

    public int getVal() {
        return value;
    }

    public void setValue(int newValue) {
        value = newValue;
    }

    public void increment() {
        value++;
    }
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
public class As6ques5 {

    public static void main(String[] args) {
        int a = 5;
        double b = 5.65;
        Wrapper aObj = new Wrapper(a);
        Wrapper bObj = new Wrapper((int) b);
         System.out.println("Value of aObj: " + aObj);
        System.out.println("Value of bObj: " + bObj);
        aObj.increment();
        System.out.println("Updated value of aObj: " + aObj);
    }
}
