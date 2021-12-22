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

public class LayerCake extends Cake{

    /**
     *SuperClass constructor for Layer cake
     * @param servings servings
     * @param mainFlavor mainFlavor
     */
    public LayerCake(int servings, String mainFlavor) {
        super(servings, mainFlavor);
    }

    /**
     *Override method for topping of Layer Cake
     */
    @Override
    public void topping() {
        System.out.println("Layer cakes have frosting, MAYBE a topping.");
    }
    
    /**
     *printing the complete info
     */
    @Override
    public void info(){
        System.out.println("Layer cake flavor: "+mainFlavor+"\nNumber of servings: "+servings);
        
    }
    
    /**
     *Calculating and printing updated info
     * @param amount amount
     */
    @Override
    public void increaseYield(int amount){
        servings=servings*amount;
        System.out.println("Change servings:"+"\nLayer cake flavor: "+mainFlavor+"\nNumber of servings: "+servings);
    }    
    
}
