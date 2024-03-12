/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass8ques4;
interface Person{
   static String name = "abc";
   static int age = 5;
    void display();
    void show();
    
}
class Employee implements Person{
    @Override
    public void display(){
        System.out.println("Display.");
        System.out.println(name);
    }
    @Override
    public void show(){
        System.out.println("Show.");
        System.out.println(age);
    }
}
public class Ass8ques4 {

    
    public static void main(String[] args) {
       Employee obj = new Employee();
       obj.display();
       obj.show();
       
      
           
       };
       
    }
    

