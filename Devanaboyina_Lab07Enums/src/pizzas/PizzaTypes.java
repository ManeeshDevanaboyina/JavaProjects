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
 * Pizza Types
 */
public enum PizzaTypes {

    /**
     * HandTossed Pizza
     */
    HANDTOSSED_PIZZA(10.50, 13.50, 16.50),
    /**
     * PAN_PIZZA
     */
    PAN_PIZZA(9.50, 12.50, 15.50);

    private final double smallPizzaPrice;
    private final double mediumPizzaPrice;
    private final double largePizzaPrice;

    /**
     * Constructor for PizzaTyes
     *
     * @param smallPizzaPrice smallPizzaPrice
     * @param mediumPizzaPrice mediumPizzaPrice
     * @param largePizzaPrice largePizzaPrice
     */
    private PizzaTypes(double smallPizzaPrice, double mediumPizzaPrice, double largePizzaPrice) {
        this.smallPizzaPrice = smallPizzaPrice;
        this.mediumPizzaPrice = mediumPizzaPrice;
        this.largePizzaPrice = largePizzaPrice;
    }

    /**
     * returns the small pizza price
     *
     * @return smallPizzaPrice
     */
    public double getSmallPizzaPrice() {
        return smallPizzaPrice;
    }

    /**
     * returns the price of medium pizza
     *
     * @return mediumPizzaPrice
     */
    public double getMediumPizzaPrice() {
        return mediumPizzaPrice;
    }

    /**
     * returns the price of Large Pizza
     *
     * @return largePizzaPrice
     */
    public double getLargePizzaPrice() {
        return largePizzaPrice;
    }

    //3. Since we declared them as final it is not possible to create setter methods.
}
