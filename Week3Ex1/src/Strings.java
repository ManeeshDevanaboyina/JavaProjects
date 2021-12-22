/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S545394
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1="Maneesh";
        System.out.println(name1);
        String name2=name1;
        System.out.println(name2);
        
        String fname=name1;
        String lname="Devana";
        
        System.out.println("using + :"+lname+fname);
        System.out.println("using concat"+lname.concat(fname));
        System.out.println(lname.toUpperCase());
       
        
        //Strings are immutable
        
        String name5="Maneesh";
        System.out.println(name5);
       name5="Sandeep";
        System.out.println(name5);
        
        String name6=new String("Maneesh");
        
        System.out.println(name6);
        
        
    }
    
}
