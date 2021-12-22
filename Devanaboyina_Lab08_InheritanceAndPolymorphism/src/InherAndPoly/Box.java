/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InherAndPoly;



/**
 * Class: 44542-03 Object Oriented Programming
 * @author Maneesh Devanaboyina
 * Description: Making sure everything works
 * Due: 11/03/2021
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */

public class Box extends Rectangle {

    private double height;

    /**
     * Empty Constructor Box
     */
    public Box() {
    }

    /**
     * Constructor for Box
     *
     * @param height height
     * @param length length
     * @param breadth breadth
     */
    public Box(double height, double length, double breadth) {
        super(length, breadth);
        this.height = height;
    }

    /**
     * Constructor for Box
     *
     * @param height height
     * @param length length
     * @param breadth breadth
     * @param x x
     * @param y y
     * @param z z
     */
    public Box(double height, double length, double breadth, double x, double y, double z) {
        super(length, breadth, x, y, z);
        this.height = height;
    }

    /**
     * Returns the height
     *
     * @return Returns the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height
     *
     * @param height height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * returns the area of Box
     *
     * @return returns the area of Box
     */
    @Override

    public double area() {
        return 2 * (getLength() * getBreadth() + getBreadth() * height + getLength() * height);

    }

    /**
     * returns the Volume of Box
     *
     * @return returns the Volume of Box
     */
    public double volume() {
        return getLength() * getBreadth() * height;
    }

    /**
     * returns the Circumference
     *
     * @return circumference
     */
    @Override
    public double circumference() {
        return -1;
    }
}
