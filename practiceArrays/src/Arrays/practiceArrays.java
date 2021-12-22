/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;
import java.util.*;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class practiceArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] x=new int[]{1,2,3,4,5,6,7,8,9,20};
        
        
        for(int m=0;m<=x.length;m++){
            System.out.println("The values in Array are"+x[m]);
        }
        int sum=0;
           
        for(int j=0;j<x.length;j++){
            
            sum=sum+x[j];
        }
        
        System.out.println("sum of the no "+sum);
        float avg=sum/x.length;
        System.out.println(avg);
        
        
    }
    
    
    
}
