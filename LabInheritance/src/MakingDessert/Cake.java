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

public abstract class Cake extends Dessert {
    
    /**
     *Abstract void type topping
     */
    public abstract void topping();
    
    /**
     *Servings and MainFlavor for Cake
     * @param servings Servings for Cake
     * @param mainFlavor MainFlavor for cake
     */
    public Cake(int servings,String mainFlavor){
        this.mainFlavor=mainFlavor;
        this.servings=servings;
    }
    
}
