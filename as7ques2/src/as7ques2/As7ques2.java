/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as7ques2;
import java.util.Scanner;
class Circle{
    double radius;
    public double area(double r){
        radius=r;
        System.out.println("Area of circle: ");
        double arcircle = 3.14*radius*radius;
        return arcircle;
    }
    public double setwidth(double width){
        System.out.println("Width: ");
        double w1 = width;
        return w1;
    }
    public double Perimeter(double perimeter){
        System.out.println("The perimeter is: ");
        double p1 = perimeter;
        return p1;
    }
    public double Circumference(double circumference){
        System.out.println("Circumference is: ");
        double c1 = circumference;
        return c1;
    }
}
class Cylinder extends Circle{
    double height;
    public double Volume(double height, double arcircle){
        System.out.println("Vol of cylinder: ");
        double volume = arcircle*height;
        return volume;
    }
}

public class As7ques2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       double radius = scanner.nextDouble();
        System.out.println("Radius is: "+radius);
        Cylinder c1 = new Cylinder();
        Circle d = new Circle();
        d.area(radius);
        double x,y;
        y = c1.area(radius); 
        x = c1.Volume(10,y);
         
        System.out.println(x);
        System.out.println(y);
        
    }
    
}
