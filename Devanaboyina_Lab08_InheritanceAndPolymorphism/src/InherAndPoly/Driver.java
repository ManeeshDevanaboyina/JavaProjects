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

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1.0);
        p1.setY(3.0);
        Point p2 = new Point(2, 4, 5);
        Point p3 = new Point(1.2, 2.3);
        System.out.println("Area of point p1: " + p1.area() + "\nx cordinate: " + p1.getX() + "\ny cordinate: " + p1.getY());
        System.out.println("\nArea of point p2: " + p2.area() + "\nx cordinate: " + p2.getX() + "\ny cordinate: " + p2.getY() + "\nz cordinate: " + p2.getZ());

        Circle ci1 = new Circle(2);
        Circle ci2 = new Circle();
        Circle ci3 = new Circle(2,3,4,7);
        ci2.setRadius(3.0);
        System.out.println("\nArea of circle ci1: " + ci1.area() + "\nCircumference of circle: " + ci1.circumference());
        System.out.println("\nArea of circle ci2: " + ci2.area() + "\nCircumference of circle: " + ci2.circumference());
        System.out.println("\nArea of circle ci3: " + ci3.area() + "\nCircumference of circle: " + ci3.circumference());

        Rectangle r1 = new Rectangle();
        r1.setLength(3);
        r1.setBreadth(5);
        Rectangle r2 = new Rectangle(1.4,3.7);
        Rectangle r3 = new Rectangle(4.1,3.2,2,4,6);
        System.out.println("\nArea of Rectangle r1: " + r1.area() + "\nCircumference of Rectangle r1: " + r1.circumference());
        System.out.println("\nArea of Rectangle r2: " + r2.area() + "\nCircumference of Rectangle r2: " + r2.circumference());
        System.out.println("\nArea of Rectangle r3: " + r3.area() + "\nCircumference of Rectangle r3: " + r3.circumference());
        Sphere s1 = new Sphere();
        Sphere s2 = new Sphere(2);
        s1.setRadius(4.2);
        Sphere s3 = new Sphere(2,3,5,7);
        System.out.println("\nArea of Sphere s1: " + s1.area() + "\nCircumfence of Sphere: " + s1.circumference() + "\nVolume of Sphere: " + s1.volume());
        System.out.println("\nArea of Sphere s2: " + s2.area() + "\nCircumfence of Sphere: " + s2.circumference() + "\nVolume of Sphere: " + s2.volume());
        System.out.println("\nArea of sphere s3: " + s3.area() + "\nCircumfence of Sphere: " + s3.circumference() + "\nVolume of Sphere: " + s3.volume());
        Box b1 = new Box();

        b1.setHeight(4);

        b1.setBreadth(5);
        b1.setLength(8);
        Box b2 = new Box(3,4,6, 2,4,7);
        Box b3 = new Box(1, 8, 2);
        System.out.println("\nArea of Box b1: " + b1.area() + "\nCircumfence of Box: " + b1.circumference() + "\nVolume of Box: " + b1.volume());
        System.out.println("\nArea of Box b2: " + b2.area() + "\nCircumfence of Box: " + b2.circumference() + "\nVolume of Box: " + b2.volume());
        System.out.println("\nArea of Box b3: " + b3.area() + "\nCircumfence of Box: " + b3.circumference() + "\nVolume of Box: " + b3.volume());

    }

}
