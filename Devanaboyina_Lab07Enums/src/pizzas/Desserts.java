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
 * Desserts
 */
public enum Desserts {

    /**
     * Chocolate Dessert
     */
    CHOCOLATE_FUDGE_CAKE(11.99),
    /**
     * CheeseCake Dessert
     */
    CHEESECAKE_BITES(10.49),
    /**
     * Dessert_Nachos Dessert
     */
    DESSERT_NACHOS(14.49),
    /**
     * IceCream Dessert
     */
    LOADED_ICE_CREAM(4.49),
    /**
     * NO_DESSERTS
     */
    NO_DESSERTS(0.00);

    private final double dessertPrice;

    /**
     * Constructor for Desserts
     *
     * @param dessertPrice dessertPrice
     */
    private Desserts(double dessertPrice) {
        this.dessertPrice = dessertPrice;
    }

    /**
     * returns the price of Dessert
     *
     * @return dessertPrice
     */
    public double getDessertPrice() {
        return dessertPrice;
    }

}
