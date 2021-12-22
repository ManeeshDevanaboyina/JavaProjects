/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.sec3;
import java.util.Scanner;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        Scanner last=new Scanner(System.in);
        System.out.print("Enter Last name :");
        String str= last.nextLine(); 
        char letter=str.charAt(0);
        
        
        
        switch(letter){
            case 'P':
                System.out.println("The Discount is 2%");
                break;
            case 'Y':
                System.out.println("The Discount is 2.5%");
                break;
            case 'C':
                System.out.println("The Discount is 2.5%");
                break;
            
            default:
                 System.out.println("The Discount is 1.5%");    
                
    }
        
       
    }
    
}
