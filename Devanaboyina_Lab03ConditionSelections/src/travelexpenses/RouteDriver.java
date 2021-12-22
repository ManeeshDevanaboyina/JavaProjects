/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelexpenses;
import java.util.*;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class RouteDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Enter User Details:");        
        Scanner value= new Scanner(System.in); 
        System.out.print("Select the routes from 1, 2 and 3: ");
        int num= value.nextInt(); 
        System.out.print("How many number of passengers: ");
        int numPass=value.nextInt();        
        System.out.print("Are you a member: ");
        boolean mem=value.nextBoolean();
        System.out.print("Are you a first time user: ");
        boolean firstTime=value.nextBoolean();
        System.out.print("Do you have coupon: ");
        boolean coupon=value.nextBoolean();
        System.out.println("***********************");
        
        if (num>0 && num<4){
            if (numPass==0 && mem==true && firstTime==true){
                System.out.println("Passenger number can't be zero.");
                System.out.println("User cannot be a member and first time user at a time.");
                System.out.println("Please try again");
            }else if (numPass==0){
                System.out.println("Passenger number can't be zero.");
                System.out.println("Please try again");
            }else if (mem==true && firstTime==true){
                    System.out.println("User cannot be a member and first time user at a time.");
                    System.out.println("Please try again");       
            }else{
                    RouteCalculator obj1=new RouteCalculator(num,numPass,mem,firstTime,coupon);
                    System.out.println(obj1.toString()+"\n");
                    System.out.println("***********************");
                    System.out.println(obj1.printReceipt());}}
        else{
                System.out.println("Route number should be 1 or 2 or 3");
            if (numPass==0 && mem==true && firstTime==true){
                System.out.println("Passenger number can't be zero.");
                System.out.println("User cannot be a member and first time user at a time.");
                System.out.println("Please try again");
            }else if (numPass==0){
                System.out.println("Passenger number can't be zero.");
                System.out.println("Please try again");
            }else if (mem==true && firstTime==true){
                    System.out.println("User cannot be a member and first time user at a time.");
                    System.out.println("Please try again");       
            }
                    
                    
                    }
}
            
       
        
      
}

























