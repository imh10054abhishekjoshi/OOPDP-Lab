/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asfourques1;
import java.util.Scanner;


public class Asfourques1 {

    private int employeeId;
    private String employeeName;
    private String employeeDepartment;
    public void setEmployeeId(int id){
        this.employeeId = id;
    }
    public void setemployeeName(String name){
        this.employeeName = name;
    }
    public void setemployeeDepartment(String department){
    this.employeeDepartment = department;
}
    public int getemployeeId(){
        return this.employeeId;
    }
    public String getemployeeName(){
        return this.employeeName;
    }
    public String getemployeeDepartment(){
        return this.employeeDepartment;
    }
}
 class Main{
    public static void main(String[] args) {
         Asfourques1 employee = new Asfourques1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        employee.setEmployeeId(employeeId);
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        employee.setemployeeName(employeeName);
        System.out.print("Enter Employee Department: ");
        String employeeDepartment = scanner.nextLine();
        employee.setemployeeDepartment(employeeDepartment);
        System.out.println("Employee Details: ");
        System.out.println("Employee ID: " + employee.getemployeeId());
        System.out.println("Employee Name: " + employee.getemployeeName());
        System.out.println("Employee Department: " + employee.getemployeeDepartment());
        scanner.close();
        
        
    }
    
}
