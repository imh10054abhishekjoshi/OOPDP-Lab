/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as10ques5;


public class As10ques5 {

    
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};
        try{
            System.out.println("Outer try.");
            
            
           try {
                System.out.println("Inner try.");
                int result = divide(10,0);
                System.out.println("ResultL: "+result);
                System.out.println("Inner try ends.");
            }
           catch(ArithmeticException e){
               System.out.println("Eror in inner try.");
           }
           finally{
               System.out.println("Finally method starts.");
           }
           System.out.println(arr[8]);
            
        }
        catch(Exception e){
            System.out.println("Error in outer try block. Because of Array out of bounds"+e.getMessage());
        }
        finally{
            System.out.println("Outer finally executes.");
        }
    }
    public static int divide(int a, int b){
        return a/b;
    }
    
}
