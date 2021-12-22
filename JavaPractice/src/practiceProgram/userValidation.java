/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceProgram;
import java.util.*;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class userValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String password="Secret";
        Scanner value= new Scanner(System.in); 
        int counter=0;
        do{
            System.out.print("Enter the password :");
            String String1= value.nextLine();
            if (String1.equals(password)){
                System.out.println("Access granted.");
                break;
            }
            else{
                System.out.println("Access denied Try again");
            }
            
            counter++;
            
                
        }while(counter<3);
        
        
        
           
    }
    
}
