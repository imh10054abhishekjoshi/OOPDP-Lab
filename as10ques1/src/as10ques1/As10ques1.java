/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as10ques1;


public class As10ques1 {
public void finalize(){
    System.out.println("Object collected.");
}
    
    public static void main(String[] args) {
        try{
            As10ques1 obj1 = new As10ques1();
       As10ques1 obj2 = new As10ques1();
        obj1 = obj2;
        obj1 = null;
        obj2 = null;
        System.gc();
        }
        catch(Exception e){
            System.err.println("Exception occured."+e.getMessage());
        }
        finally{
        System.out.println("Close.");
    }
    }
    
}
