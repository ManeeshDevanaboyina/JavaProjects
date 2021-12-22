/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.time.DayOfWeek;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Class: 44542-03 Object Oriented Programming
 * @author Maneesh Devanaboyina
 * Description: Making sure everything works
 * Due: 10/27/2021
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class Days {

    /**
     * Empty Constructor for Days
     */
    private Days() {
    }

    /**
     * returns the day of week
     *
     * @param orderDate orderDate
     * @return orderDay
     */
    public static DayOfWeek getOrderDayOfWeek(String orderDate) {
        DateTimeFormatter m = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate d = LocalDate.parse(orderDate, m);
        DayOfWeek orderDay = d.getDayOfWeek();
        return orderDay;

    }

    /**
     * Gives the discount on Saturday and Sunday
     *
     * @param orderDate orderDate
     * @return Discount
     */
    public static boolean isDiscountDay(String orderDate) {

        return getOrderDayOfWeek(orderDate).equals(DayOfWeek.SATURDAY) || getOrderDayOfWeek(orderDate).equals(DayOfWeek.SUNDAY);
    }
}
