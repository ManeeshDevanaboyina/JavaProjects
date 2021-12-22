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
 * Drinks
 */
public enum Drinks {

    /**
     * Fountain Soda
     */
    FOUNTAIN_SODA_20_OZ(2.99),
    /**
     * RedBull
     */
    RED_BULL(4.29),
    /**
     * IzzeSparkling
     */
    IZZE_SPARKLING_JUICE(2.79),
    /**
     * FreshBrewed Tea
     */
    FRESH_BREWED_ICED_TEA(2.99),
    /**
     * Water
     */
    WATER(0.00);

    private final double drinkPrice;

    /**
     * Constructor for Drinks
     *
     * @param drinkPrice setting drinkPrice
     */
    private Drinks(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    /**
     * returns the price of Drink
     *
     * @return drinkPrice
     */
    public double getDrinkPrice() {
        return drinkPrice;
    }

}
