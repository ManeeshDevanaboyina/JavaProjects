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
public class Order {

    private PizzaTypes pizzasName;
    private String pizzasSize;
    private int quantity;
    private Sauces sauce;
    private Sides side;
    private String sideSize;
    private Drinks drink;
    private Sides.Cheese cheese;
    private Desserts dessert;
    private Double cost;

    /**
     * Constructor with below parameters
     *
     * @param pizzasName pizzasName
     * @param pizzasSize pizzasSize
     * @param quantity quantity
     * @param sauce sauce
     * @param Side Side
     * @param sideSize sideSize
     * @param drink drink
     * @param cheese cheese
     * @param dessert dessert
     */
    public Order(PizzaTypes pizzasName, String pizzasSize, int quantity, Sauces sauce, Sides Side, String sideSize, Drinks drink, Sides.Cheese cheese, Desserts dessert) {
        this.pizzasName = pizzasName;
        this.pizzasSize = pizzasSize;
        this.quantity = quantity;
        this.sauce = sauce;
        this.side = Side;
        this.sideSize = sideSize;
        this.drink = drink;
        this.cheese = cheese;
        this.dessert = dessert;
    }

    /**
     * Returns the PizzaName
     *
     * @return pizzasName
     */
    public PizzaTypes getPizzasName() {
        return pizzasName;
    }

    /**
     * returns the pizzaSize
     *
     * @return pizzasSize
     */
    public String getPizzasSize() {
        return pizzasSize;
    }

    /**
     * returns the quantity
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * returns the sauce
     *
     * @return sauce
     */
    public Sauces getSauce() {
        return sauce;
    }

    /**
     * returns the side
     *
     * @return side
     */
    public Sides getSide() {
        return side;
    }

    /**
     * returns the side size
     *
     * @return sideSize
     */
    public String getSideSize() {
        return sideSize;
    }

    /**
     * returns the drink
     *
     * @return drink
     */
    public Drinks getDrink() {
        return drink;
    }

    /**
     * returns the cheese
     *
     * @return cheese
     */
    public Sides.Cheese getCheese() {
        return cheese;
    }

    /**
     * returns the dessert
     *
     * @return dessert
     */
    public Desserts getDessert() {
        return dessert;
    }

    /**
     * returns the cost
     *
     * @return cost
     */
    public Double getCost() {
        return cost;
    }

    /**
     * sets the cost
     *
     * @param cost cost
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * This is for Calculating Dessert cost
     *
     * @return returns CostDesert
     */

    private double calcDessertCost() {
        double CostDesert = 0;
        for (Desserts m : Desserts.values()) {

            if (m == dessert) {
                CostDesert = m.getDessertPrice();
            }
        }

        return CostDesert;
    }

    /**
     * This is for Calculating Sauce cost
     *
     * @return returns cost of the Sauce
     */
    private double calcSauceCost() {
        double CostSauce = 0;
        for (Sauces m : Sauces.values()) {

            if (m == sauce) {
                CostSauce = m.getPriceOfSauce();
            }
        }
        return CostSauce;
    }

    /**
     * This is for Calculating Cheese cost
     *
     * @return returns cost of the Cheese
     */

    private double calcCheeseCost() {
        double CostCheese = 0;
        for (Sides.Cheese m : Sides.Cheese.values()) {
            if (m == cheese) {
                CostCheese = m.getCheesePrice();
            }
        }
        return CostCheese;
    }

    /**
     * This is for Calculating Drink cost
     *
     * @return returns cost of the Drink
     */
    private double calcDrinkCost() {
        double CostDrink = 0;
        for (Drinks m : Drinks.values()) {
            if (m == drink) {
                CostDrink = m.getDrinkPrice();
            }
        }
        return CostDrink;
    }
    /**
     * This is for Calculating Sides cost
     *
     * @return returns cost of the Sides
     */
    double sideCost;

    private double calcSideCost() {
        sideSize = sideSize.trim().toLowerCase();
        switch (this.sideSize) {
            case ("small"):
                sideCost = side.getSmallSidesPrice();
                break;
            case ("family"):
                sideCost = side.getFamilySidesPrice();
                break;
            case ("party"):
                sideCost = side.getPartySidesPrice();
                break;
        }
        return sideCost;
    }

    /**
     * This is for Calculating Pizza cost
     *
     * @return returns the Pizza Cost
     */
    public double calcPizzasCost() {
        switch (this.pizzasSize) {
            case ("small"):
                sideCost = pizzasName.getSmallPizzaPrice();
                break;
            case ("medium"):
                sideCost = pizzasName.getMediumPizzaPrice();
                break;
            case ("Large"):
                sideCost = pizzasName.getLargePizzaPrice();
                break;
        }
        double pizzasCost = sideCost;
        return pizzasCost;
    }

    /**
     * This is for calculating Discount
     *
     * @param date date
     * @return returns discount
     */
    public double calcDiscount(String date) {
        double discount = 0;
        PizzaTypes type = PizzaTypes.valueOf("HANDTOSSED_PIZZA");
        if (pizzasName.equals(type)) {
            double calc = calcPizzasCost();
            double total = calc * quantity;
            boolean day = Days.isDiscountDay(date);
            if (day == true) {
                discount = total * 0.5;
            } else {
                discount = 0;
            }
        }
        return discount;
    }

    /**
     * This is to find the total cost
     *
     * @param orderDate takes OrderDate as Parameter
     * @return returns the cost
     */
    public double getTotalCost(String orderDate) {

        double a = this.calcPizzasCost();
        double b = this.calcDessertCost();
        double c = this.calcSauceCost();
        double d = this.calcCheeseCost();
        double e = this.calcDrinkCost();
        double f = this.calcSideCost();
        cost = b + c + d + e + f + (a * quantity);
        setCost(cost);
        return cost;
    }

    /**
     * This is to show the output(String)
     *
     * @param orderDate orderDate
     * @return returns toString
     */
    public String toString(String orderDate) {
        double total = getTotalCost(orderDate);
        String sauces1 = "";
        if (sauce.equals(Sauces.valueOf("NO_SAUCE"))) {
            sauces1 = "NO SAUCE";
        } else if (sauce.equals(Sauces.valueOf("PESTO"))) {
            sauces1 = "PESTO";
        } else if (sauce.equals(Sauces.valueOf("TOMATO"))) {
            sauces1 = "TOMATO";
        } else if (sauce.equals(Sauces.valueOf("BBQ"))) {
            sauces1 = "BBQ";
        } else if (sauce.equals(Sauces.valueOf("HUMMUS"))) {
            sauces1 = "HUMMUS";
        }
        String deserts1 = "";
        if (dessert.equals(Desserts.valueOf("DESSERT_NACHOS"))) {
            deserts1 = "DESSERT NACHOS";
        } else if (dessert.equals(Desserts.valueOf("LOADED_ICE_CREAM"))) {
            deserts1 = "LOADED ICE CREAM";
        } else if (dessert.equals(Desserts.valueOf("NO_DESSERTS"))) {
            deserts1 = "NO DESSERTS";
        } else if (dessert.equals(Desserts.valueOf("CHOCOLATE_FUDGE_CAKE"))) {
            deserts1 = "CHOCOLATE FUDGE CAKE";
        }
        String drinks1 = "";
        if (drink.equals(Drinks.valueOf("WATER"))) {
            drinks1 = "WATER";
        } else if (drink.equals(Drinks.valueOf("RED_BULL"))) {
            drinks1 = "RED BULL";
        } else if (drink.equals(Drinks.valueOf("FOUNTAIN_SODA_20_OZ"))) {
            drinks1 = "FOUNTAIN SODA 20 OZ";
        } else if (drink.equals(Drinks.valueOf("IZZE_SPARKLING_JUICE"))) {
            drinks1 = "IZZE SPARKLING JUICE";
        }
        String sides1 = "";
        if (side.equals(Sides.valueOf("MASHED_POTATOES"))) {
            sides1 = "MASHED POTATOES";
        } else if (side.equals(Sides.valueOf("CHEFSALAD"))) {
            sides1 = "CHEFSALAD";
        } else if (side.equals(Sides.valueOf("RANCH_CHIPS"))) {
            sides1 = "RANCH CHIPS";
        } else if (side.equals(Sides.valueOf("ONION_RINGS"))) {
            sides1 = "ONION RINGS";
        }

        PizzaTypes p = PizzaTypes.valueOf("HANDTOSSED_PIZZA");
        String pizzas1 = "";
        if (this.pizzasName.equals(p)) {
            pizzas1 = "HANDTOSSED PIZZA";
        } else {
            pizzas1 = "PAN PIZZA";
        }

        String cheese1 = "";
        if (cheese.equals(Sides.Cheese.valueOf("NO_CHEESE"))) {
            cheese1 = "NO CHEESE";
        } else if (cheese.equals(Sides.Cheese.valueOf("BLUE_CHEESE"))) {
            cheese1 = "BLUE CHEESE";
        } else if (cheese.equals(Sides.Cheese.valueOf("CHEDDAR_CHEESE"))) {
            cheese1 = "CHEDDAR CHEESE";
        } else if (cheese.equals(Sides.Cheese.valueOf("SWISS_CHEESE"))) {
            cheese1 = "SWISS CHEESE";
        } else {
            cheese1 = "RANCH";
        }
        total = Math.round(total * 100.00) / 100.00;
        return "**************  " + orderDate + ", "
                + Days.getOrderDayOfWeek(orderDate) + "  ***************"
                + "\nPIZZA TYPE: " + pizzas1 + "\nPIZZA SIZE: " + this.pizzasSize.toUpperCase()
                + "\nQUANTITY: " + this.quantity + "\nSAUCE: " + sauces1
                + "\nSIDES: " + sides1 + " (" + this.sideSize.toUpperCase() + ")" + "\nCHEESE: " + cheese1
                + "\nDRINKS: " + drinks1 + "\nDESSERTS: " + deserts1
                + "\nCOST: " + total;
    }

}
