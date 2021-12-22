/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehicleEngine;
import java.util.*;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle v1=new Vehicle(5,50);
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter No of Miles need to travel: ");
        double miles=s1.nextDouble();        
        v1.noOfGears();
        v1.avgFuelConsumption(v1.getMileage(), miles);

        
    }
    
}
