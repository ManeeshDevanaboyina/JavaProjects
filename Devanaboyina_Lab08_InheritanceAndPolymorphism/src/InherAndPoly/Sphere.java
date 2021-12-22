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

public class Sphere extends Circle {

    /**
     * Empty Constructor for Sphere
     */
    public Sphere() {
    }

    /**
     * Constructor
     *
     * @param radius Radius from Super Class
     */
    public Sphere(double radius) {
        super(radius);
    }

    /**
     * Constructor Sphere
     *
     * @param radius radius
     * @param x x
     * @param y y
     * @param z z
     */
    public Sphere(double radius, double x, double y, double z) {
        super(radius, x, y, z);
    }

    /**
     * Area of Sphere
     *
     * @return Area
     */
    @Override

    public double area() {
        return 4 * PI * super.getRadius() * super.getRadius();
    }

    /**
     * Returns the Circumference with -1
     *
     * @return Circumference
     */
    @Override

    public double circumference() {
        return -1;
    }

    /**
     * Returns the Volume of Sphere
     *
     * @return Volume
     */
    public double volume() {
        return (4 * PI * super.getRadius() * super.getRadius() * super.getRadius()) / 3;
    }

}
