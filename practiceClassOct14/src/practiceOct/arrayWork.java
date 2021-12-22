/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceOct;
import java.util.*;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class arrayWork {
    
      public static void fillStringArray(String[] par1){
          
          Scanner s1=new Scanner(System.in);
        
        String[] str1Arra=new String[5];
        
        System.out.println("Enter the Array elements");
        
        for(int i=0;i<str1Arra.length;i++){
            System.out.print("Word "+(i+1)+":");
            str1Arra[i]=s1.nextLine();
        }
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
       
        
        String[] str2Arra=new String[5];
        fillStringArray(str2Arra);
        
            System.out.println("Your words:");        
         for(int i=0;i<5;i++){
            System.out.println(str2Arra[i]);
        }
        
        
        
    }
    
}

