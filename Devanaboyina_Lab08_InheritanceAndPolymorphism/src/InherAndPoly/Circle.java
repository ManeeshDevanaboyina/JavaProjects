/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InherAndPoly;

import static java.lang.Math.PI;

/**
 * Class: 44542-03 Object Oriented Programming
 * @author Maneesh Devanaboyina
 * Description: Making sure everything works
 * Due: 11/03/2021
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */

public class Circle extends Point {

    private double radius;

    /**
     * Constructor for Circle
     *
     * @param radius Radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Empty Constructor for Circle
     */
    public Circle() {
    }

    /**
     * Constructor for Radius,X,Y,Z
     *
     * @param radius radius
     * @param x x
     * @param y y
     * @param z z
     */
    public Circle(double radius, double x, double y, double z) {
        super(x, y, z);
        this.radius = radius;
    }

    /**
     * Gets Radius
     *
     * @return Radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets Radius
     *
     * @param radius Radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * area of Circle
     *
     * @return area of Circle
     */
    @Override

    public double area() {
        return PI * radius * radius;
    }

    /**
     * Returns the Circumference
     *
     * @return Returns the Circumference
     */
    public double circumference() {
        return 2 * PI * radius;

    }

}
