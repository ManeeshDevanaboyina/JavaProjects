
package starbucks;
import java.util.Scanner;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class StarbucksDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int ord=0;
        String s1,s2,s3,s4;
        System.out.println("***** Welcome to Starbucks *****");
        Scanner obj2=new Scanner(System.in);
        for (int i=0;i>=0;i++){
        
       
        System.out.print("Please enter the full name (Firstname Lastname): ");
        s1=obj2.nextLine();
        if(s1.equals("")){
            continue;
        }
        System.out.print("Please enter the Address: ");
        s2=obj2.nextLine();
        System.out.print("Please enter Contact Number: ");
        s3=obj2.nextLine();
        System.out.print("Please enter Customer Type(Regular/New): ");
        s4=obj2.nextLine();
           
        Starbucks obj1=new Starbucks(s1,s2,s3,s4);
        System.out.println("!*!*!*!*! Welcome Board "+s1+" !*!*!*!*!");
        int num,quantity;
            while(true){
        
                System.out.println("\nSelect items from following list\n\t1.Ham & Swiss Panini\n\t2.Cheese & Fruit Bistro Box\n\t3.Turkey Pesto Panini\n\t4.Salted Caramel or Birthday Cake Pop\n\t5.Roasted Tomato & Mozzarella Panini");
               num=obj2.nextInt();
                if(num>5|num<1){
                    System.out.println("Please choose the number 1 to 5");
                    num=obj2.nextInt();                
                 }
                System.out.print("Enter the quantity: ");
                quantity=obj2.nextInt();
                obj1.updateReceipt(quantity,num);
                System.out.print("Do you want to add one more item(Y/N))?");      
                char char1=obj2.next().charAt(0);
                if (char1=='Y'){
                    
                    continue;}
                else{
                    
                    break;}
                
            }
            
           ord=ord+1;
           obj1.setOrder("Order - "+ord);
           System.out.println("Bill amount is "+Math.round(obj1.getFinalBillAmount()*100.0)/100.0);
           System.out.print("Enter the cash paid: $");
           double pay=obj2.nextDouble();            
           System.out.println("\n***********************************");
           System.out.println(obj1.printReciept(pay));
           System.out.println("***********************************");
           System.out.print("Do you want add one more order(Y/N))?");
           char char2=obj2.next().charAt(0);
           obj2.nextLine();

           
           if (char2!='Y'){
            break;
            
        }
        
            
       
    }
        System.out.println("Thank you!");
}
}