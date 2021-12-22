package scannerStuff;

import java.util.Scanner;

public class ComputePay
{

   public static void main(String[] args)   
   {
      Scanner console = new Scanner(System.in);
      
		System.out.print("Enter the name: ");
		String name = console.nextLine();
		System.out.print("Enter the hours worked: ");
		int hours = console.nextInt();
		System.out.print("Enter the hourly rate: ");
		double rate = console.nextDouble();
		double pay = hours * rate;
		System.out.println(name + " earned $" + pay);
      
      System.out.print("Enter the name: ");
		String firstName = console.next();
      String lastName = console.next();
		System.out.print("Enter the hours worked: ");
		hours = console.nextInt();
		System.out.print("Enter the hourly rate: ");
		rate = console.nextDouble();
		pay = hours * rate;
		System.out.println(name + " earned $" + pay);
      System.out.println("First name is " + firstName);
      System.out.println("Last name is " + lastName);
     
		console.close();
   }
}
