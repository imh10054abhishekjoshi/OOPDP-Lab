/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as10ques4;


public class As10ques4 {

    
    public static void main(String[] args) {
       try{
           int[] arr = new int[5];
           System.out.println(arr[10]);
       }
       catch(ArrayIndexOutOfBoundsException e){
           throw new RuntimeException("Error.",e);
       }
    }
    
}
