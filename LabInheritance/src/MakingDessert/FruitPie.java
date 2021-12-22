/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakingDessert;

/**
* I certify that all code in this file is my own work.
* This code is submitted as the solution to this Lab
* in CSIS44542   Object-Oriented Programming, 2021 , section 03
*
* Due date:  Tuesday   Nov. 9 08:00AM 
*
* @author Maneesh Devanaboyina
**/

public class FruitPie extends Pie {

    /**
     *SuperConstructor for FruitPie
     * @param servings Servings for FruitPie
     * @param mainFlavor MainFlavor for FruitPie
     */
    public FruitPie(int servings, String mainFlavor) {
        super(servings, mainFlavor);
    }
    
    /**
     *Printing the crust
     */
    @Override
    public void topCrust(){
        System.out.println("Fruit pie might have crust on top."); 
        
    }

    /**
     *printing the complete info
     */
    @Override
    public void info() {
        System.out.println("Fruit pie flavor: "+mainFlavor + "\nNumber of Servings: "+servings);
    }
    
    /**
     *Calculating and printing updated info
     * @param amount amount
     */
    @Override
    public void increaseYield(int amount){
        servings=servings*amount;
        System.out.println("Change servings:"+"\nFruit pie flavor: "+mainFlavor+"\nNumber of servings: "+servings);
    }
}
