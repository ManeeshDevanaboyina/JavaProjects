/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


/**
 *
 * @author Instructor
 */
public class SalesDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException java.io.FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
         //1.Declare and initialize a Scanner object to read from the file "inputFile2.txt"
         File inputFile=new File("inputFile1.txt");
         Scanner i=new Scanner(inputFile);
        //2.Declare and initialize a PrintWriter object to write output to the file "outputFileText2.txt"
        PrintWriter outputFile=new PrintWriter("outputFileText1.txt");  
        //3.create an ArrayList of Retailer objects with name "retailers"
        ArrayList<Retailer> retailers=new ArrayList<>();
        //4.Read Data
        String M=i.nextLine(); 
        
        //while(scanner.hasNext()){ //Read line
        while(i.hasNext()){
             
            //5.Read Retailer name and address
            String Na=i.nextLine();
            String ad=i.nextLine();
            
            //6.Declare and initialize an object for retailer using above read values
            Retailer m=new Retailer(Na,ad);
            //7.Read all beers available for the retailer. Loop starts here
            //do{ 
            do{
                
                    String name=i.nextLine();
                    if(name.equals("Retailer")){
                        break;
                    }
                    
                    // 8.Read all details of a beer
                    String style=i.nextLine();
                    String type=i.next();
                    String abv=i.nextLine();
                    double a=Double.parseDouble(abv);
                    String s[]= i.nextLine().split(" ");
                    int[] len=new int[s.length];
                    for(int k=0;k<s.length;k++){
                        len[k]=Integer.parseInt(s[k]);
                    }
                // 9.Declare and initialize an object for Beer using above read values
                    Beer B=new Beer(name,type,style,a,len);
                // 10.Add the declared beer object to retailer object created in the outer loop
                    m.addNewBeer(B);
                
            //}while(condition); //End the loop if reading all the Beer objects for a retailer is completed
            
                    }while(i.hasNext());
            // 11.Add the retailer object created in this loop to variable retailers}
                     retailers.add(m);
            
        }
        
        /*!!!For bellow statements, use loops to retrive required Retailer object from arraylist "retailers"
             Do not hardcode indexes to retrive data from variable retailers*/

        // 12.Print "******Walmart Inventory for Beer's*****"
        
        outputFile.println("***************************************");
        System.out.println("***************************************");
        outputFile.println("******Walmart Inventory for Beer's*****");
        System.out.println("******Walmart Inventory for Beer's*****");
        outputFile.println("***************************************");
        System.out.println("***************************************");
        // 13.Invoke toString() on retailer "Walmart" and print object

        for(Retailer k:retailers){
            if(k.getRetailerName().equals("Walmart")){
                outputFile.println(k.toString());
                System.out.println(k.toString());
            }
        }

        System.out.println("********************");
        outputFile.println("********************");
        
        // 14.Print "******Remove Wells IP from Walmart*****"
        
        outputFile.println("***********************************");
        System.out.println("***********************************");
        outputFile.println("***Remove Wells IPA from Walmart***");
        System.out.println("***Remove Wells IPA from Walmart***");
        outputFile.println("***********************************");
        System.out.println("***********************************");        


        // 15.Remove Beer with name "Wells IP" from retailer "Walmart" in retailers and print removed beer details.

        for(Retailer k:retailers){
            if(k.getRetailerName().equals("Walmart")){
                Beer B=k.removeBeer("Wells IPA");
                outputFile.println(B.toString());
                System.out.println(B.toString());
            }
        }

        
        
        // 16.Print "****List of strong beer from Hy-Vee****"
        
        outputFile.println("***************************************");
        System.out.println("***************************************");
        outputFile.println("****List of strong beer from Hy-Vee****");
        System.out.println("****List of strong beer from Hy-Vee****");
        outputFile.println("***************************************");
        System.out.println("***************************************");        
        
        
        // 17.Print all strong beer available in Hy-Vee
        for(Retailer k:retailers){
            if(k.getRetailerName().equals("Hy-Vee")){
                for(Beer B:k.getBeerList()){
                    if(B.getAbv()>4.0){
                        System.out.print(B.toString());
                        outputFile.print(B.toString());
                    }
                }

            }
        }
        
        
        // 18.Print "****List of light beer from Sam's Club****"

        outputFile.println("******************************************");
        System.out.println("******************************************");
        outputFile.println("****List of light beer from Sam's Club****");
        System.out.println("****List of light beer from Sam's Club****");
        outputFile.println("******************************************");
        System.out.println("******************************************");
        
        
        // 19.Print all light beer available in Sam's Club
        
         for(Retailer k:retailers){
            if(k.getRetailerName().equals("Sam's Club")){
                for(Beer B:k.getBeerList()){
                    if(B.getAbv()<=4.0){
                        System.out.print(B.toString());
                        outputFile.print(B.toString());
                    }
                }

            }
        }       
        // 20.Print  "****Count of different beers available from each retailer****"
        
        outputFile.println("*************************************************************");
        System.out.println("*************************************************************");
        outputFile.println("****Count of different beers available from each retailer****");
        System.out.println("****Count of different beers available from each retailer****");
        outputFile.println("*************************************************************");
        System.out.println("*************************************************************");
        
        // 21.Print count of different beers available from each retailer

        ArrayList<String> Walmart = new ArrayList<>();
        ArrayList<String> Hyvee=new ArrayList<>();
        ArrayList<String> SamClub=new ArrayList<>();
        ArrayList<String> CaseyGeneral=new ArrayList<>();       
       
        for(Retailer k:retailers){
            switch (k.getRetailerName()) {
                case "Walmart":
                    for(Beer B:k.getBeerList()){
                        Walmart.add(B.getBeerName());
                        
                    }   break;
                case "Hy-Vee":
                    for(Beer B:k.getBeerList()){
                        Hyvee.add(B.getBeerName());
                        
                    }   break;
                case "Sam's Club":
                    for(Beer B:k.getBeerList()){
                        SamClub.add(B.getBeerName());
                        
                    }   break;
                default:
                    for(Beer B:k.getBeerList()){
                        CaseyGeneral.add(B.getBeerName());
                        
                    }   break;
            }
                
        
        }        
        
        // 22.Print "****All different beers available from all retailers****"
        
        outputFile.println("Walmart: "+ Walmart.size()+"\n" +"Hy-Vee: "+Hyvee.size()+"\n" +"Sam's Club: "+SamClub.size()+"\n" +"Casey's General Store: "+CaseyGeneral.size()+"\n");
                
        System.out.println("Walmart: "+ Walmart.size()+"\n" +"Hy-Vee: "+Hyvee.size()+"\n" +"Sam's Club: "+SamClub.size()+"\n" +"Casey's General Store: "+CaseyGeneral.size()+"\n");                
       
        // 23.Print Names of all different beers from all retailers.
        
        outputFile.println("********************************************************");
        System.out.println("********************************************************");
        outputFile.println("****All different beers available from all retailers****");
        System.out.println("****All different beers available from all retailers****");
        outputFile.println("********************************************************");
        System.out.println("********************************************************");        
        
        ArrayList<String> diffBeer=new ArrayList<>();
        
        for(String s : Walmart){
            if(!diffBeer.contains(s)){
                diffBeer.add(s);
               
            
            }
            
        }
        for(String s : Hyvee){
            if(!diffBeer.contains(s)){
                diffBeer.add(s);  
            }      
        }
        for(String s : SamClub){
            if(!diffBeer.contains(s)){
                diffBeer.add(s);
            }            
        }
        for(String s : CaseyGeneral){
            if(!diffBeer.contains(s)){
                diffBeer.add(s);      
            }            
        }
        for(String s : diffBeer){
            System.out.println(s);
            outputFile.println(s);
        }
        
        
        // 24.Close PrintWriter object
        
        outputFile.close();
    }
    
}
