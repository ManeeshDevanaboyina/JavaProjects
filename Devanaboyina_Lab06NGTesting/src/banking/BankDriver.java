/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 * The driver class to test all the classes
 *
 * @author Sri Vasavi Vipparla
 */
public class BankDriver {

    /**
     * @param args the command line arguments 
     * @throws java.io.FileNotFoundException IO_File_Exception
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //Note: (i). You can create any variables required within the main method but not as global/instance variables.
        //      (ii). The dates times provided for the transaction times are in yyyy-MM-dd HH:mm:ss
        // 1. Create an arraylist of Accounts and name it as accounts to store the list of accounts
        ArrayList<Account> accounts = new ArrayList<>();
        // 2. Create a scanner object and name it as sc to read the input from keyboard
        Scanner sc = new Scanner(System.in);
        File inputFile = new File("input.txt");
        Scanner sc1 = new Scanner(inputFile);
        String accountType = sc1.nextLine();
        //   while (iterate)
        while (sc1.hasNext()) {
            // 3. Read the values account type, first name, last name, date of birth from the input file           
            String firstName = sc1.next();
            String lastName = sc1.nextLine();
            String dob = sc1.nextLine();
            // 4. Create an Customer object.
            Customer c = new Customer(dob, firstName, lastName);
            long accNo = sc1.nextLong();
            boolean withDraw = sc1.nextBoolean();
            // 5. Create an Account object.
            Account a = new Account(accNo, c, withDraw);
            // 6. Print full name of the customer.
            System.out.println("------------------------------------------------------------\nName of the customer: " + c.getFirstName() + " " + c.getLastName() + "\n------------------------------------------------------------");
            // 7. while(Iterate){
            while (sc1.hasNext()) {
                String Type = sc1.next();

                if (Type.equals("newAccount")) {
                    break;
                }

                //     a. Read trasaction and a create transaction object by initalizing the multiple argument constructor.
                String k = sc1.next();
                double amount = Double.parseDouble(k);

                String ti = sc1.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime date = LocalDateTime.parse(ti.substring(1), formatter);
                Transaction trans = new Transaction(amount, date, Type);
                //     b. call makeTransaction() method on account object.
                //     c. Print appropiate message upon completing each transaction based on return value of makeTransaction().
                //if makeTransaction returns "Insufficient Balance" print "Insufficient funds. Available funds: {funds}".
                //  where {funds} is the available funds on account.
                //if makeTransaction returns "MaxTransactions" print "Exceeded number of withdrawals transactions. Number of available withdrawals per month: 6"
                //if makeTransaction returns "Transaction Successful" then print "The balance after {transactionType} in dollars is {funds}"
                //  where {transactionType} is type of transaction.
                // 	}

                String transactionResult = a.makeTransaction(trans);
                if (transactionResult.equals("Transaction Successful")) {
                    System.out.println("The balance after " + trans.getTransactionType() + " in dollars is " + a.getBalance());
                } else if (transactionResult.equals("Insufficient Balance")) {
                    System.out.println("Insufficient funds. Available funds: " + a.getBalance());
                } else {
                    System.out.println("Exceeded number of withdrawals transactions. Number of available withdrawals per month: 6");
                }
            }
            // 10. Add Account object to accounts Arraylist.
            // } 
            accounts.add(a);

        }
        // Print "Invoke getNoofWithdrawals() on SavingsAccount objects"
        // 11(a). For each Account from accounts, invoke getNoofWithdrawals() method on SavingsAccount objects
        // 11(b). Print number of withdrawls made in this month for each account.

        System.out.println("************************************************************************\n"
                + "*********Invoke getNoofWithdrawals() on Account objects**********\n"
                + "************************************************************************");
        for (Account acc : accounts) {
            System.out.println(acc.getCustomer().getFirstName() + " made " + acc.getNoofWithdrawals() + " withdrawals in this month.");

        }

        // Print "Invoke generateStatement() on all objects in accounts ArrayList"
        // 12. Invoke generateStatement() method on all objects in accounts ArrayList and print all account statements
        System.out.println("***********************************************************************\n"
                + "****Invoke generateStatement() on all objects in accounts ArrayList****\n"
                + "************************************************************************");

        for (Account acc : accounts) {
            System.out.println(acc.generateStatement());
        }

    }
}
