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
public class stringCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard=new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter the String1: ");
        str1=keyboard.nextLine();
        System.out.print("Enter the String2: ");
        str2=keyboard.nextLine();
        int len1=str1.length(),len2=str2.length();
        int minlen;
            if(len1<=len2){
                minlen=len1;
                //System.out.println("super");
            }
            else{
                minlen=len2;
                //System.out.println("super1");
            }
            
            for (int i=0;i<=minlen;i++){
              
                Character c1=str1.charAt(i);
                Character c2 =str2.charAt(len2-i-1);
                //System.out.println("super2");
                if (c1==c2){
                    System.out.println("Matching "+c1);
                    //System.out.println("super3");
                    break;      
                }
                else{
                    //System.out.println("super4");
                    continue;
                }
                
                
            }
            
        
    }
    
}
