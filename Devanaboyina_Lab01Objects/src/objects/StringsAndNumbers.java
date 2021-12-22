/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;
import java.util.Random;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String Class
        System.out.println("******** String Class ********");
        String string1="    Welcome  ";
        String string2=" to ";
        String string3="    the first  ";
        String string4=" Lab Activity";
        String string5="   in the ";
        String string6=" OOP Course ";
        String len1=string1+string2+string3+string4+string5+string6;
        System.out.println(len1);
        System.out.println("The length of the concatenated string is: "+' '+ len1.length());
        String a=string1.trim()+' '+string2.trim()+' '+string3.trim()+' '+string4.trim()+' '+string5.trim()+' '+string6.trim()+'!';
        System.out.println(a);
        System.out.println("Length of the above string is:"+' '+a.length());
        int index1=a.indexOf("Lab");
        int index2=a.indexOf("in");
        String word=a.substring(index1,index2);
        System.out.println("Retrieved:"+' '+word);
        String Caps= word.toUpperCase();
        int b=Caps.indexOf('I',0);
        System.out.println("Index of first I in 'LAB ACTIVITY' is at:"+' '+b);
       
        //Second Program
        
         
        String string7="lab interesting activities are activities lab Interesting Lab Activities Are Interesting Lab activities Lab Interesting";
        int index3=string7.indexOf("Interesting");
        System.out.println("First occurrence of Interesting is at:"+' '+index3);
        String string8="Object-Oriented-Programming 44542";
        System.out.println(string8);
        String string9=string8.replaceAll("-","_");
        System.out.println(string9.replaceAll(" ","-"));
        String String1="Computer";
        String String2="Science";
        System.out.println("The ID is:"+' '+String1.substring(0,4)+String2.substring(0,3).toUpperCase()+String1.length()+String2.length());
        System.out.println("My dream is become a cloud developer and this course has a excellent curicullum which would be useful outside market.\n");
        
        
        //Math Class
        
        System.out.println("******** Math Class ********");
        int value1=9;
        int value2=13;
        System.out.println("sqrt (value12 +value22):"+' '+Math.sqrt((value1*value1)+(value2*value2)));
        System.out.println("exp (9):"+' '+Math.exp(value1));
        System.out.println("sec (9):"+' '+1/(Math.cos(value1)));
        float myNumber=27;
        System.out.println("Cube root of 27.00:"+' '+Math.cbrt(myNumber));
        System.out.println("Logarithm value is:"+' '+Math.log(myNumber));
        System.out.println("tan 60° - tan 45° / (1 + tan 60° tan 45°) ="+' '+(Math.sin(60-45))/(Math.cos(60-45)));
        System.out.println("Theoritical value of Tan90 is:"+' '+Math.tan(90));
        System.out.println("Cubic root of modulus value of tan (90) is:"+' '+Math.abs(Math.cbrt(Math.tan(90))));
        System.out.println("Cosecant of 30 is:"+' '+1/Math.sin(30));
        System.out.println("Secant of 30 is:"+' '+1/Math.cos(30));
        System.out.println("Minimum value in Cosec (30) and Sec (30) is:"+' '+Math.min(1/Math.sin(30),1/Math.cos(30)));
        System.out.println("Maximum value in Cosec (30) and Sec (30) is:"+' '+Math.max(1/Math.sin(30),1/Math.cos(30)));
        int myNumber1=45;
        int myNumber2=27;
        System.out.println("Rounded value of cos of 45 is: "+Math.round(Math.cos(45)));
        System.out.println("Rounded value of cos of 27 is: "+Math.round(Math.cos(27)));
        System.out.println("Rounded value of tan of 45 is: "+Math.round(Math.tan(45)));
        System.out.println("Rounded value of tan of 27 is: "+Math.round(Math.tan(27)));
        System.out.println("The value of given equation is: "+Math.abs(8*Math.cos(myNumber2))*(Math.pow(Math.pow(7,4)+(8*6*7*5),(1.0/4.0)))/Math.pow(Math.pow(5,2)-Math.pow(3,2),(1.0/8.0)));
        System.out.println("\n");
        
        //Random Class
        
        System.out.println("******** Random Class ********");
        
        Random obj1 = new Random();//instance of Random class
        String[] arr={"First","Second","Third","Fourth","Fifth","Sixth","Seventh"};
        int max_value=200;
        int x;
        System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)");
        for(x=0;x<=3;x++){
        int random_value = obj1.nextInt(max_value);
        
        System.out.println(arr[x]+" "+"random integer value is: "+random_value+" square of "+random_value+" is : "+(random_value*random_value));
       
        }
        System.out.println("3 pseudo-random integer values without seed value and bounds ");
        
        for(x=4;x<=6;x++){ 
        
        int random_value1 = obj1.nextInt();
        System.out.println(arr[x]+" "+"random integer value is:"+" "+random_value1);
        }
        System.out.println("No results were different");
        
        System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)");
        
        Random seedvalue=new Random(30);
        
        for(x=0;x<=3;x++){
        int random_value2 = seedvalue.nextInt(max_value);
        
        System.out.println(arr[x]+" "+"random integer is: "+random_value2+" square of "+random_value2+" is : "+(random_value2*random_value2));
        }
        
        System.out.println("3 pseudo-random integer values with seed value and without bounds ");
        
        for(x=4;x<=6;x++){ 
        
        int random_value3 = seedvalue.nextInt();
        System.out.println(arr[x]+" "+"random integer value is:"+" "+random_value3);
        
        }
        
        System.out.println("Yes getting the same result every time");
        System.out.println("Seeded value is getting the same value every time but unseeded value is getting different values when executing. ");
      
    }   
    
}
