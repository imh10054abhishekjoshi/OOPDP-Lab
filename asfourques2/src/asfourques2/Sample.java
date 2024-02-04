/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asfourques2;


  class Car {
private final String brand;
public Car(){
    this.brand = "Ford";
}
public String getBrand(){
    return brand;
}
}
public class Sample{
    
    public static void main(String[] args) {
     Car mycar = new Car();
     String carbrand = mycar.getBrand();
     System.out.println("Car Brand: " + carbrand);
    }
    
}
