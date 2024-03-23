/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as10ques3;
import java.util.Scanner;

public class As10ques3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Division of each adjacent index: ");
        for(int i = 0; i < size-1; i++){
            try{
               int result = arr[i]/arr[i+1];
                System.out.println("Index "+i+"divided by index "+(i+1)+"is: "+result);
            }
            catch(ArithmeticException e){
                System.out.println("Trying to access index out of bounds.");
            }
        }
        sc.close();
    }
    
}
