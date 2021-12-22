/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import pizzas.Sides.Cheese;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class OrderDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        //1. Declare and initialize a scanner object to read from file "input.txt"
        Scanner scan = new Scanner(new File("input.txt"));
        System.out.println("*****************************************************");
        System.out.println("*********************** Pizza Hut ******************");
        System.out.println("*****************************************************");
        while (scan.hasNext()) {
            //2. Declare and initialize an OrderSummary object and name it as orderSum
            OrdersSummary orderSum = new OrdersSummary();
            //3. Read date and pass the date to the getOrderDayOfWeek method
            String date = scan.nextLine();
            //4. Read pizzas name and convert it to PizzaTypes enum. Note: You can convert to PizzaTypes enum here in the main method or you can create a private static method after main method in the same class to convert a string that is read to PizzaTypes enum. Do not use switch or if else to convert to enums
            String name = scan.nextLine();
            name = name.replaceAll(" ", "_");
            name = name.toUpperCase();
            PizzaTypes pizzaName = PizzaTypes.valueOf(name);
            //5. Read size and number of Pizzas per order according to the input given in the input file
            String size = scan.next();
            int number = scan.nextInt();
            scan.nextLine();
            //6. Read Sauce, Sides, Cheese and Drinks and convert them to corresponding enums.
            String s1 = scan.nextLine();
            s1 = s1.replaceAll(" ", "_");
            s1 = s1.toUpperCase();
            Sauces sauce = Sauces.valueOf(s1);
            String s2 = scan.nextLine();
            String[] sidearray = s2.split("-", 2);
            s2 = sidearray[0];
            s2 = s2.trim();
            s2 = s2.replaceAll(" ", "_");
            s2 = s2.toUpperCase();
            Sides side = Sides.valueOf(s2);
            String sideSize = sidearray[1];
            sideSize = sideSize.replaceAll("- ", "");
            String s3 = scan.nextLine();
            s3 = s3.replaceAll(" ", "_");
            s3 = s3.toUpperCase();
            Sides.Cheese cheese = Sides.Cheese.valueOf(s3);
            String s4 = scan.nextLine();
            s4 = s4.replaceAll(" ", "_");
            s4 = s4.toUpperCase();
            Drinks drink = Drinks.valueOf(s4);
            String s5 = scan.nextLine();
            s5 = s5.trim();
            s5 = s5.replace(" ", "_");
            s5 = s5.toUpperCase();
            Desserts dessert = Desserts.valueOf(s5);
            //Please follow same rules as provided above for PizzaTypes enums. 
            //7. Create an Order object with above attributes and name it as order
            Order order = new Order(pizzaName, size, number, sauce, side, sideSize, drink, cheese, dessert);
            //8. Add order, an Order object created above to orderSum object which is an orderSummary Class object
            orderSum.addAOrder(order);
            //9. Print the receipt for orders.
            String l = orderSum.printReceipt(date);
            System.out.println(l);
        }

    }
}
