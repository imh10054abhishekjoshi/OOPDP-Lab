/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass8ques5;
abstract class Base1{
    abstract class Base2{
        abstract void display();
    }
}
 class Derived1 extends Base1{
    class Derived2 extends Base2{
        @Override
        void display(){
            System.out.println("Display.");
        }
    }
}

public class Ass8ques5 {

    
    public static void main(String[] args) {
        Derived1 obj = new Derived1();
        Derived1.Derived2 obj1 = obj. new Derived2();
        obj1.display();
    }
    
}
