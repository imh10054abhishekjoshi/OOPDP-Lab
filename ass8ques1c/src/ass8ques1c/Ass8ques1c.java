/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass8ques1c;
class Outer{
    static class Inner{
    void display(){
        System.out.println("Display inner.");
    }
}
}

public class Ass8ques1c {

    
    public static void main(String[] args) {
       Outer.Inner obj = new Outer.Inner();
       obj.display();
    }
    
}
