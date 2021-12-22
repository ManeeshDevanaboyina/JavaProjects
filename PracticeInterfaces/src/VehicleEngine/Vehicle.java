/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehicleEngine;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Vehicle implements Engine {
    private int gears;
    private double mileage;
    

    public Vehicle(int gears, double mileage) {
        this.gears = gears;
        this.mileage = mileage;
    }

    public Vehicle() {
    }

    public double getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    
    @Override
    public void noOfGears() {
        System.out.println("No Of Gears: "+gears);
    }

    @Override
    public void avgFuelConsumption(double mileage, double noOfMiles) {
        double AvgFuel;
        AvgFuel=noOfMiles/mileage;
        System.out.println("Average Fuel Consumed is: "+AvgFuel);
    }
    
    
    
}
