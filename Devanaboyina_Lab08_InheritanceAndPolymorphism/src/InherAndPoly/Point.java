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

public class Point {

    private double x;
    private double y;
    private double z;

    /**
     *Constructor for point x,y,z
     * @param x X axis Point
     * @param y Y axis Point
     * @param z Z axis Point
     */
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     *Constructor for point x,y
     * @param x X axis Point
     * @param y Y axis Point
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     *Empty Constructor
     */
    public Point() {
    }

    /**
     *Returns point x
     * @return returns value x
     */
    public double getX() {
        return x;
    }

    /**
     *Sets Point x
     * @param x Sets point x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     *returns the Point Y
     * @return returns the Point Y
     */
    public double getY() {
        return y;
    }

    /**
     *sets the pointY
     * @param y sets the pointY
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     *Returns the Point z
     * @return returns z
     */
    public double getZ() {
        return z;
    }

    /**
     *sets the point z
     * @param z sets the point z
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     *for area
     * @return for area
     */
    public double area() {
        return 0;
    }

}
