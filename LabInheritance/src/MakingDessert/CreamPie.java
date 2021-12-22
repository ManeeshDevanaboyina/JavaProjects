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

public class CreamPie extends Pie {

    /**
     *SuperConstructor for CreamPie
     * @param servings Servings
     * @param mainFlavor mainFlavor
     */
    public CreamPie(int servings, String mainFlavor) {
        super(servings, mainFlavor);
    }

    /**
     *Printing the value of a CreamPie Crust
     */
    @Override
    public void topCrust(){
        System.out.println("Cream pies generally don't have crust on top."); 
    }
    
    /**
     *printing the complete info
     */
    @Override
    public void info(){
        System.out.println("Cream pie flavor: "+mainFlavor+"\nNumber of servings: "+servings);
    }
    
    /**
     *Calculating and printing updated info
     * @param amount amount
     */
    @Override
    public void increaseYield(int amount){
        servings=servings*amount;
        System.out.println("Change servings:"+"\nCream pie flavor: "+mainFlavor+"\nNumber of servings: "+servings);
    }
}
