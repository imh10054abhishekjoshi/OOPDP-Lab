/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as10ques7;

import java.util.Scanner;
public class As10ques7 {
public static void method(int age){
    if(age<0)
        throw new IllegalArgumentException("age cannot be less than 0.");
    else
        System.out.println("Age is: "+age);
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            method(age);
        }
        catch(IllegalArgumentException e){
            throw new RuntimeException("May generate runtime exception."+e.getMessage());
        }
    }
    
}
