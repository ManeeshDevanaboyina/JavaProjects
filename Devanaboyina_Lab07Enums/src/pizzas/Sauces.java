/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 * Class: 44542-03 Object Oriented Programming
 * @author Maneesh Devanaboyina
 * Description: Making sure everything works
 * Due: 10/27/2021
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */

/**
 * 
 * Sauces
 */
public enum Sauces {
    
    /**
     *PESTO Sauce
     */
    PESTO(0.20),

    /**
     *TOMATO Sauce
     */
    TOMATO(0.15),

    /**
     *BECHAMEL Sauce
     */
    BECHAMEL(0.25),

    /**
     *BBQ Sauce
     */
    BBQ(0.35),

    /**
     *HUMMUS Sauce
     */
    HUMMUS(0.10),

    /**
     *MARINARA Sauce
     */
    MARINARA(0.13),

    /**
     *TAPENADE Sauce
     */
    TAPENADE(0.15),

    /**
     *PUMPKIN_PIZZA_SAUCE Sauce
     */
    PUMPKIN_PIZZA_SAUCE(0.35),

    /**
     *NO_SAUCE
     */
    NO_SAUCE(0.00);
    
    
    private final double priceOfSauce;
    
     /**
     * Constructor for Sauces
     *
     * @param priceOfSauce priceOfSauce
     */

    private Sauces(double priceOfSauce) {
        this.priceOfSauce = priceOfSauce;
    }

    /**
     *returns the price of Sauce
     * @return priceOfSauce
     */
    public double getPriceOfSauce() {
        return priceOfSauce;
    }

    
    
    
    
}
