/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsPackage;
import java.util.Random;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class loopsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intial=200;
        int upTo=500,m;
        int i=1;
        
        Random value=new Random(500);
        for (i=1;i<=20;i++);{
            m=(int) Math.floor(Math.random()*(upTo-intial+1)+intial);
            //int random_value = value.nextInt();
            
            System.out.println("Random values between 200 to 500"+ m);
        }
    }
    
}
