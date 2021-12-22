/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.util.ArrayList;

/**
 * Class: 44542-03 Object Oriented Programming
 * @author Maneesh Devanaboyina
 * Description: Making sure everything works
 * Due: 10/27/2021
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class OrdersSummary {

    private ArrayList<Order> orders;

    /**
     * Empty Constructor and initializes array
     */
    public OrdersSummary() {
        orders = new ArrayList<>();
    }

    /**
     * This is for returning the order
     *
     * @return returns the Array of Orders
     */
    public ArrayList<Order> getOrders() {
        return orders;
    }

    /**
     * This is add orders from inputfile
     *
     * @param order order
     */
    public void addAOrder(Order order) {

        orders.add(order);
    }

    /**
     * This is for calculating total cost of all orders
     *
     * @param orderDate orderDate
     * @return cost
     */
    public double calcTotalCostOfAllOrders(String orderDate) {
        double cost = 0;
        for (Order m : orders) {
            cost = cost + m.getTotalCost(orderDate);
        }
        return cost;

    }

    /**
     * this is For Calcualting Total bill with Tax
     *
     * @param orderDate OrderDate parameter is passed
     * @return total bill
     */
    public double calcTotalBillWithTax(String orderDate) {
        double i = 0;
        double j = 0;
        for (Order m : orders) {
            i = i + m.calcDiscount(orderDate);
            j = m.getTotalCost(orderDate);
        }
        j = j - i;
        double total = j * 0.086;
        double totalBill = j + total;
        return totalBill;

    }

    /**
     * This is for printing the receipt
     *
     * @param orderDate Order Date Parameter from driver class
     * @return returns the receipt
     */
    public String printReceipt(String orderDate) {
        String receipt;
        double m = 0;
        double k = 0;
        String s1 = "";
        for (Order od : orders) {
            m = m + od.getTotalCost(orderDate);
            k = k + od.calcDiscount(orderDate);
            s1 = s1 + od.toString(orderDate);
        }
        double t1 = (m - k) * 0.086;
        m = Math.round(m * 100) / 100.00;
        t1 = Math.round(t1 * 100) / 100.00;
        double tax1 = this.calcTotalBillWithTax(orderDate);
        tax1 = Math.round(tax1 * 100) / 100.00;
        String n = String.format("%1.2f", t1);
        String st2 = String.format("%1.2f", tax1);
        String st3 = String.format("%1.2f", k);
        receipt = s1
                + "\n-----------------------------------------------------"
                + "\n		";
        receipt = receipt + "Order Total :		$" + m + "\n"
                + "		Discount@50 :		$" + st3
                + "\n		Tax@8.6 :		$" + n
                + "\n		Total Amount with tax : $"
                + st2
                + "\n-----------------------------------------------------";
        return receipt;
    }
}
