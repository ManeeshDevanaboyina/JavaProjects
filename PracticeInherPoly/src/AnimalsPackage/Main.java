/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalsPackage;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal x1=new Animal();
        
        //Animal class makeSound method called and printed
        System.out.println(x1.makeSound());
        
        Animal x2=new Mammal();
        //Mammal class makeSound method has been called and printed after upcasting
        System.out.println(x2.makeSound());
        
        Mammal x3=new Mammal();
        GrizzlyBear x4=new GrizzlyBear();
        x3=x4;
        //GrizzlyBear class makeSound method has been called, Childclass object has been assigned superclass object
        System.out.println(x3.makeSound());
        
    }
    
}
