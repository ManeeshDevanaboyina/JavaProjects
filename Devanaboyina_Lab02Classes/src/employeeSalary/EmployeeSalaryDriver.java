   /*
   * To change this license header, choose License Headers in Project Properties.
   * To change this template file, choose Tools | Templates
   * and open the template in the editor.
   */
   package employeeSalary;
   import java.util.Scanner;

   /**
   *
   * @author Maneesh Devanaboyina
   */
   public class EmployeeSalaryDriver {

    /**
     * Launches the application
     * 
     * @param args - Application startup arguments
     */  
     public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Double hourlyRate,insuranceRate,taxRate,pfRate,bonus;
        System.out.println("Testing the EmployeeSalary class:");
        System.out.print("Enter the hourly pay rate of the Employee: $");
        hourlyRate = scan.nextDouble(); 
        System.out.print("Enter the insurance rate of the Employee in percentage: ");
        insuranceRate = scan.nextDouble(); 
        System.out.print("Enter the tax rate of the Employee in percentage: ");
        taxRate = scan.nextDouble();
        System.out.print("Enter the pf rate of the Employee in percentage: ");
        pfRate = scan.nextDouble();
        System.out.print("Enter the bonus of the Employee: ");
        bonus = scan.nextDouble();
        EmployeeSalary empSalObj1=new EmployeeSalary(hourlyRate,insuranceRate,taxRate,pfRate);
        System.out.println("The details of empSalObj1 object are as follows:");
        System.out.println(empSalObj1.toString());

        System.out.println("The monthly salary of the Employee is: $"+empSalObj1.calcMonthlySalary()+"\nThe monthly insurance of the Employee is: $"+empSalObj1.calcMonthlyInsurance()+"\nThe monthly pf of the Employee is: $"+empSalObj1.calcMonthlyPfAmount()+"\nThe annual gross salary of the Employee is: $"+empSalObj1.calcAnnualGrossSalary(bonus)+"\nThe gross annual net pay of the Employee is: $"+empSalObj1.calcAnnualNetPay(bonus));
        System.out.println("**************************************************");
        EmployeeSalary empSalObj2=new EmployeeSalary();
        System.out.println("The details of empSalObj2 object are as follows: ");
        System.out.println(empSalObj2.toString());
        System.out.println("The monthly salary of the Employee is: $"+empSalObj2.calcMonthlySalary()+"\nThe monthly insurance of the Employee is: $"+empSalObj2.calcMonthlyInsurance()+"\nThe monthly pf of the Employee is: $"+empSalObj2.calcMonthlyPfAmount()+"\nThe annual gross salary of the Employee is: $"+empSalObj2.calcAnnualGrossSalary(bonus)+"\nThe gross annual net pay of the Employee is: $"+empSalObj2.calcAnnualNetPay(bonus));

        System.out.print("Enter the new bonus of the Employee: ");
        double newBonus=scan.nextDouble();
        empSalObj2.setHourlyRate(35.0);
        empSalObj2.setInsuranceRate(12.5);
        empSalObj2.setPfRate(10.5);
        empSalObj2.setTaxRate(11.45);
        System.out.println("The details of empSalObj2 object are as follows:");
        System.out.println(empSalObj2.toString());
        System.out.println("The monthly salary of the Employee is: $"+empSalObj2.calcMonthlySalary()+"\nThe monthly insurance of the Employee is: $"+empSalObj2.calcMonthlyInsurance()+"\nThe monthly pf of the Employee is: $"+empSalObj2.calcMonthlyPfAmount()+"\nThe annual gross salary of the Employee is: $"+empSalObj2.calcAnnualGrossSalary(newBonus)+"\nThe gross annual net pay of the Employee is: $"+empSalObj2.calcAnnualNetPay(newBonus));
     }
  }