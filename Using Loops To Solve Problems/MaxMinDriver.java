/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmindriver;
import java.util.Scanner;
/**
 *
 * @author Carol Spradling
 */
public class MaxMinDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int number;
          int min;
          int max;

          //Instantiate a Scanner object 
          Scanner keyboardInput = new Scanner( System.in );

          //Priming read
          System.out.print( "Enter a number or 0 to quit: " );
          number = keyboardInput.nextInt();

          //remember first number as min
          min = number;

          //remember first number as max
          max = number;

          //Sentinel loop with condition of 0 to exit
          while ( number != 0 )
          {
               //test for lower number
               if (number < min )
               {
                   //keep track of min number
                   min = number;
               }

               //test for higher number
               if (number > max )
               {
                   //keep track of max number
                   max = number;
               }

               //Gather more input
               System.out.print( "Enter a number or 0 to quit: " );
               number = keyboardInput.nextInt();
          }

          //print the min number
          System.out.println( "The smallest number is: " + min );

          //print the max number
          System.out.println( "The largest number is: " + max );
    }
    
}
