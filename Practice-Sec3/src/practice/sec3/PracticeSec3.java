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
public class PracticeSec3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int time;
        Scanner Hours=new Scanner(System.in);
        System.out.print("Enter hours in 24 hour format :");
        time=Hours.nextInt();
        
        if ((6>=time) && (time<=10)) {
            
            System.out.println("Breakfast is Served");
        }
        else if ((11>=time) && (time<=14)){
            System.out.println("Lunch is Served");
            
        }
        else if ((17>=time) && (time<=20)){
                System.out.println("Lunch is Served");
        }
       
            else
            {
                System.out.println("Cafeteria is closed");
            }
        }
        
        
    }
    

