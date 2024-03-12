/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass8ques3;
abstract class Shape{
   abstract double perimeter();
    abstract double area();
}
 class Circle extends Shape{
    int radius = 2;
    double circum;
    double a;
    @Override
    double perimeter(){
       // int radius =  r;
         circum = (2*3.14*radius);
       return circum;
          
    }
    @Override
    double area(){
         a = 3.14*radius*radius;
        return a;
    }
}
class Rectangle extends Shape{
    int length = 2;
    int breadth = 3;
    double p1;
    double a1;
    @Override
    double perimeter(){
        p1 = 2*(length+breadth);
        return p1;
    }
    @Override
    double area(){
        a1 = length*breadth;
        return a1;
    }
}

public class Ass8ques3 {

    
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        int length = 2;
        int breadth = 3;
       double x = r.perimeter();
        System.out.println("The perimeter of rectangle is: " +x);
        double y = r.area();
        System.out.println("The area of rectangle is: " +y);
        Circle c = new Circle();
        int radius = 2;
        double z =c.perimeter();
        System.out.println("Perimeter of circle is: " +z);
        double u = c.area();
        System.out.println("Area of circle is: " +u);
        
    }
    
}
