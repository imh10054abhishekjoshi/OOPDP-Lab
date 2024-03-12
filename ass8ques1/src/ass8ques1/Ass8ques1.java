/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass8ques1;
class Outer{
    class Inner{
        void display(){
           System.out.println("Display inner.");
        }
    }
}

public class Ass8ques1 {

    
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        Outer.Inner obj2 = obj1. new Inner();
        obj2.display();
        
    }
    
}
