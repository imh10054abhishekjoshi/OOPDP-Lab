/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asfourques5;
import java.util.Scanner;

 class Asfourques5 {
double length;
double breadth;
public Asfourques5(){
    this.length = 0.0;
    this.breadth = 0.0;
}
public Asfourques5(double... dimensions){
    if(dimensions.length == 2){
        this.length = dimensions[0];
        this.breadth = dimensions[1];
    } else{
        this.length = dimensions[0];
        this.breadth = dimensions[0];
    }
}
public void calcrectarea(double length, double breadth){
    double area = length*breadth;
    System.out.println("Area of rectangle: " + area);
}
public void calcsqarea(double side){
    double area = side*side;
    System.out.println("The area of square is: " + area);
}
public void dispdata(){
    System.out.println("Length: " + length);
    System.out.println("Breadth: " + breadth);
}
}
public class Shapes{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Asfourques5 shape1 = new Asfourques5();
        shape1.dispdata();
        System.out.println("Enter length and breadth for rectangle: ");
        double rectlength = scanner.nextDouble();
        double rectbreadth = scanner.nextDouble();
        Asfourques5 shape2 = new Asfourques5(rectlength, rectbreadth);
        shape2.calcrectarea(shape2.length, shape2.breadth);
        shape2.dispdata();
        System.out.println("Enter side length for square: ");
        double sqside = scanner.nextDouble();
        Asfourques5 shape3 = new Asfourques5(sqside);
        shape3.calcsqarea(shape3.length);
        shape3.dispdata();
        scanner.close();
        
    }
    
}
