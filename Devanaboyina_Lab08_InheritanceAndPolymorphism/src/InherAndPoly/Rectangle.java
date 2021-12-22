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

public class Rectangle extends Point {

    private double length;
    private double breadth;

    /**
     * Constructor for Rectangle
     *
     * @param length Length
     * @param breadth Breadth
     */
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    /**
     * Empty Constructor
     */
    public Rectangle() {
    }

    /**
     * Constructor Rectangle
     *
     * @param length Length
     * @param breadth Breadth
     * @param x point x
     * @param y point y
     * @param z point z
     */
    public Rectangle(double length, double breadth, double x, double y, double z) {
        super(x, y, z);
        this.length = length;
        this.breadth = breadth;
    }

    /**
     * Returns Length
     *
     * @return Returns Length
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets Length
     *
     * @param length Sets Length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Returns Breadth
     *
     * @return Returns Breadth
     */
    public double getBreadth() {
        return breadth;
    }

    /**
     * Sets Length
     *
     * @param breadth Sets Length
     */
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    /**
     * Area of Rectangle
     *
     * @return Area of Rectangle
     */
    @Override

    public double area() {
        return length * breadth;
    }

    /**
     * Circumference of Rectangle
     *
     * @return Circumference
     */
    public double circumference() {
        return (length + breadth) * 2;
    }

}
