/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructer;
import java.util.*;

/**
 *
 * @author S545394
 */
public class Constructer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  String r = "computer";
        String s = "Java";
        String t = "random access memory";
        String x;
        
        x=s.trim().toUpperCase();
        System.out.println(x);
        
*/
 /* int a=5,i;

i=++a + ++a + a++;
i=a++ + ++a + ++a;
a=++a + ++a + a++;

System.out.println(a);
System.out.println(i);*/
 
 /*Scanner keyboard=new Scanner(System.in);
 int[] a=new int[5];
 a[0]=1;
 a[1]=2;
 
 for(int value: a){
     System.out.println(value);*/
 
 // Get the individual test scores.
 
 int[] tests=new int[10];
 Scanner keyboard=new Scanner(System.in);
 for (int index = 0; index < tests.length; index++){     
     System.out.print("Enter test score " + (index + 1) + ": ");
     tests[index] = keyboard.nextInt();      
        }      // Display the test scores.      
        System.out.println();      
        System.out.println("Here are the scores you entered:");      
        for (int index = 0; index < tests.length; index++)         
            System.out.print(tests[index] + " ");   
    }
}

    
       
    
 }

 
 
    
    }
}
