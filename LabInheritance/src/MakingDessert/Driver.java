/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakingDessert;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FruitPie fp=new FruitPie(8,"Strawberry");
        fp.info();
        fp.topCrust();
        fp.increaseYield(3);
        System.out.println();
        
        CreamPie cp=new CreamPie(10,"Chocolate");
        cp.info();
        cp.topCrust();
        cp.increaseYield(3);
        System.out.println();
        
        Cheesecake chca=new Cheesecake(12,"Lemon");
        chca.info();
        chca.topping();
        chca.increaseYield(3);
        System.out.println();
        
        LayerCake lcca=new LayerCake(8,"Vanilla");
        lcca.info();
        lcca.topping();
        lcca.increaseYield(3);  
        
    }
    
}
