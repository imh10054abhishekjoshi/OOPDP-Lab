/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass8ques2;
abstract class Bike{
    abstract void run();
}
class Honda extends Bike{
    void run(){
        System.out.println("Runs.");
    }
}

public class Ass8ques2 {

    
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
    }
    
}
