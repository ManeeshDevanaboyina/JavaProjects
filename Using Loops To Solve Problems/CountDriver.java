/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdriver;
import java.util.Scanner;
/**
 *
 * @author Carol Spradling
 */
public class CountDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int number;
     
          //declare and intialize coutn to 0
          int count = 0;

          //Instantiate a Scanner object 
          Scanner keyboardInput = new Scanner( System.in );

          //Priming read
          System.out.print( "Enter a number or 0 to quit: " );
          number = keyboardInput.nextInt();

          //Sentinel loop with condition of 0 to exit
          while ( number != 0 )
          {
               //add 1 to count
               count++;

               //Gather more input
               System.out.print( "Enter a number or 0 to quit: " );
               number = keyboardInput.nextInt();
          }

          System.out.println( "There were " + count + " numbers entered" ); 
    }
    
}
