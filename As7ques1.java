/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as7ques1;
import java.util.Scanner;
class shape{
    int area;
    public int getArea(int area){
        System.out.println("Area of the shape is: ");
        return area;
    }
}
class Rectangle extends shape{
    int length;
    int width;
   int arearect = length*width;
    public int getArea(int length, int width){
        System.out.println("The area of rectangle is: ");
        int arearect = length*width;
        return arearect;
    }
}
class Box extends Rectangle{
    int height;
    public int getArea(int length, int width, int height){
        System.out.println("Surface area of the box is: ");
        return 2*(length*width + width*height + length*height);
    }
}
public class As7ques1 {

    public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // length = scanner.nextInt();
    // width = scanner.nextInt();
     //height = scanner.nextInt();
     shape s1 = new shape();
     int x,y;
     s1.getArea(0);
     System.out.println(s1.area);
     Rectangle r1 = new Rectangle();
    x= r1.getArea(2,3);
      
      System.out.println(x);
     Box b1 = new Box();
     y= b1.getArea(2,3,4);
     System.out.println(y);
     
    }
    
}
