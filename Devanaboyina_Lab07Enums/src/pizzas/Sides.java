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
 * Sides
 */
public enum Sides {

    /**
     * GARLIC_CHEESEBREAD Sides
     */
    GARLIC_CHEESEBREAD(6.99, 24.99, 39.99),
    /**
     * CHEFSALAD Sides
     */
    CHEFSALAD(3.99, 15.99, 29.99),
    /**
     * RANCH_STIX Sides
     */
    RANCH_STIX(1.99, 7.99, 12.99),
    /**
     * RANCH_POTATO_WEDGES Sides
     */
    RANCH_POTATO_WEDGES(2.99, 10.99, 20.99),
    /**
     * MASHED_POTATOES Sides
     */
    MASHED_POTATOES(5.99, 16.99, 32.99),
    /**
     * RANCH_CHIPS Sides
     */
    RANCH_CHIPS(3.99, 17.99, 32.99),
    /**
     * PARMESAN_BROCCOLI Sides
     */
    PARMESAN_BROCCOLI(2.99, 7.99, 16.99),
    /**
     * ONION_RINGS Sides
     */
    ONION_RINGS(4.99, 7.49, 29.49),
    /**
     * NO_SIDES
     */
    NO_SIDES(0.00, 0.00, 0.00);

    private final double smallSidesPrice;
    private final double familySidesPrice;
    private final double partySidesPrice;

    /**
     * Constructor for Sides
     *
     * @param smallSidesPrice smallSidesPrice
     * @param familySidesPrice familySidesPrice
     * @param partySidesPrice partySidesPrice
     */
    private Sides(double smallSidesPrice, double familySidesPrice, double partySidesPrice) {
        this.smallSidesPrice = smallSidesPrice;
        this.familySidesPrice = familySidesPrice;
        this.partySidesPrice = partySidesPrice;
    }

    /**
     * Price of smallSidePrice
     *
     * @return smallSidesPrice
     */
    public double getSmallSidesPrice() {
        return smallSidesPrice;
    }

    /**
     * returns family sides Price
     *
     * @return familySidesPrice
     */
    public double getFamilySidesPrice() {
        return familySidesPrice;
    }

    /**
     * returns Party Sides Price
     *
     * @return partySidesPrice
     */
    public double getPartySidesPrice() {
        return partySidesPrice;
    }

    /**
     * Cheese
     */
    public enum Cheese {

        /**
         * AMERICAN cheese
         */
        AMERICAN_CHEESE(0.55),
        /**
         * CHEDDAR cheese
         */
        CHEDDAR_CHEESE(0.60),
        /**
         * CHEDDAR_JACK Cheese
         */
        CHEDDAR_JACK_CHEESE(0.70),
        /**
         * PEPPER_JACK Cheese
         */
        PEPPER_JACK_CHEESE(0.59),
        /**
         * QUESO Cheese
         */
        QUESO_CHEESE(0.65),
        /**
         * SWISS Cheese
         */
        SWISS_CHEESE(0.60),
        /**
         * BLUE Cheese
         */
        BLUE_CHEESE(0.60),
        /**
         * RANCH Cheese
         */
        RANCH(0.60),
        /**
         * NO_CHEESE
         */
        NO_CHEESE(0.0);

        private double CheesePrice;

        private Cheese(double CheesePrice) {
            this.CheesePrice = CheesePrice;
        }

        /**
         * returns the price of Cheese
         *
         * @return CheesePrice
         */
        public double getCheesePrice() {
            return CheesePrice;
        }

    }
}
