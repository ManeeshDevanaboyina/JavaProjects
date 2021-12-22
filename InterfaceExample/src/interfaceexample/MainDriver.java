
package interfaceexample;

public class MainDriver {
  
    public static void main(String[] args) {
        // TODO code application logic here
     MSISClass msis = new MSISClass(100,2,"ADB");
     int st = msis.noOfStudentsPerSection();
     System.out.println("The number of students per section in msis is "+ st);   
    }
    
}
