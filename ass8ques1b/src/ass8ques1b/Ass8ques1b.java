/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass8ques1b;
class Outer{
    void outermethod(){
        class Inner{
            void innermethod(){
                System.out.println("Display Inner.");
            }
        }
        Inner obj1 = new Inner();
        obj1.innermethod();
    }
}

public class Ass8ques1b {

    
    public static void main(String[] args) {
        Outer obj2 = new Outer();
        obj2.outermethod();
    }
    
}
