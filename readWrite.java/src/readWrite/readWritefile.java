/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readWrite;
import java.io.*;
import java.util.*;


/**
 *
 * @author Maneesh Devanaboyina
 */
public class readWritefile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  {
        PrintWriter outputFile = new PrintWriter("RandomData.txt");
        //Scanner keyboard = new Scanner(System.in);
        
        for(int i=0;i<=5;i++){
            Random obj1=new Random();
            int m=obj1.nextInt(50);
            System.out.println("Random numbers:"+m);
            outputFile.println(m);
           // keyboard.nextLine();
        }
        outputFile.close();
    }
    
}
