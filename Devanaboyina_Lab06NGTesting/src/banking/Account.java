/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.*;
import java.time.*;

/**
 * Class: 44542-03 Object Oriented Programming
 * @author Maneesh Devanaboyina
 * Description: Making sure everything works
 * Due: 10/19/2021
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */

public class Account {

    private long accountNumber;
    private Customer customer;
    private double balance;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private boolean hasLimitedWithdrawals;
    final double SAVING_INTEREST = 5.80;

    /**
     *Constructor accntNo, customer, hasLimitedwithdrawals
     * @param accountNumber accountNumber
     * @param customer customer
     * @param hasLimitedWithdrawals hasLimitedWithdrawals
     */
    public Account(long accountNumber, Customer customer, boolean hasLimitedWithdrawals) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.hasLimitedWithdrawals = hasLimitedWithdrawals;
    }

    /**
     *returns accountNumber
     * @return accountNumber
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     *Sets accountNumber
     * @param accountNumber accountNumber
     */
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *returns customer
     * @return customer customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *Sets customer
     * @param customer customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     *returns balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     *sets balance
     * @param balance balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *returns the TransactionList
     * @return transactions
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    /**
     *Sets transactionsList
     * @param transactions transactions
     */
    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     *returns hasLimitedWithdrawals
     * @return hasLimitedWithdrawals
     */
    public boolean isHasLimitedWithdrawals() {
        return hasLimitedWithdrawals;
    }

    /**
     *Sets HasLimtedWithdrawals
     * @param hasLimitedWithdrawals hasLimitedWithdrawals
     */
    public void setHasLimitedWithdrawals(boolean hasLimitedWithdrawals) {
        this.hasLimitedWithdrawals = hasLimitedWithdrawals;
    }

    /**
     *Returns the Statement 
     * @return String
     */
    public String generateStatement() {
        String m = "Transaction Type\tTransaction Time\t\tAmount\t\tAdditionalCharges\tStatus";
        String em = "";
        for (Transaction t : transactions) {
            em = em + "\n" + t.toString();

        }
        String k = "";
        if (hasLimitedWithdrawals) {
            k = "7 Transactions";
        } else {
            k = "No Limit";
        }
        return "Name: " + customer.getLastName() + "," + customer.getFirstName()
                + "\nDate of Birth: " + customer.getDob() + "\n"
                + "Account Number: " + accountNumber + "\n"
                + "Account Information:-    Interest Rate : " + SAVING_INTEREST + "%\n"
                + "Transaction Limit for withdrawal: " + k + "\n-------------------------------------------------------------\n------------------"
                + "\n" + m + em + "\n------------------------------------------------------------------------\n-------" + "\nCurrent Balance: $" + balance + "                  Interest: $" + ((balance * SAVING_INTEREST) / 100)
                + "\n**********************\n****";

    }

    /**
     *returns no of withdrawals
     * @return count
     */
    public int getNoofWithdrawals() {

        int currentMonth = YearMonth.now().getMonthValue();
        int count = 0;
        for (Transaction m : transactions) {
            if ((currentMonth == m.getTransactionTime().getMonthValue()) && m.getTransactionType().equalsIgnoreCase("WITHDRAW")) {
                count++;
            }
        }
        return count;
    }

    /**
     *Returns the Transaction Statements
     * @param transaction transaction
     * @return value
     */
    public String makeTransaction(Transaction transaction) {
        String value = "";
        if ((transaction.getTransactionType().equalsIgnoreCase("WITHDRAW") || transaction.getTransactionType().equalsIgnoreCase("ONLINEPURCHASE")) && (transaction.getAmount() > balance)) {
            transaction.setAdditionalCharges(0.0);
            transaction.setStatus("FAILED");
            transactions.add(transaction);
            value = "Insufficient Balance";
        } else if (transaction.getTransactionType().equalsIgnoreCase("DEPOSIT")) {
            transaction.setAdditionalCharges(0.00);
            transaction.setStatus("SUCCESS");
            balance = balance + transaction.getAmount();
            transactions.add(transaction);
            value = "Transaction Successful";
        } else if (transaction.getTransactionType().equalsIgnoreCase("ONLINEPURCHASE")) {
            transaction.setAdditionalCharges(1.99);
            transaction.setStatus("SUCCESS");
            balance = balance - (transaction.getAmount() + transaction.getAdditionalCharges());
            transactions.add(transaction);
            value = "Transaction Successful";
        } else if (transaction.getTransactionType().equalsIgnoreCase("WITHDRAW") && (transaction.getAmount() < balance) && (hasLimitedWithdrawals == false)) {
            if (getNoofWithdrawals() > 5) {
                double onePercent = ((double) transaction.getAmount() / 100);
                transaction.setAdditionalCharges(onePercent);
                if (onePercent < 2.59) {
                    transaction.setAdditionalCharges(2.59);
                }
                transaction.setStatus("SUCCESS");
                balance = balance - (transaction.getAmount() + transaction.getAdditionalCharges());
                transactions.add(transaction);
                value = "Transaction Successful";
            } else {
                double onePercent = ((double) transaction.getAmount() / 100);
                transaction.setAdditionalCharges(0.00);

                transaction.setStatus("SUCCESS");
                balance = balance - (transaction.getAmount());
                transactions.add(transaction);
                value = "Transaction Successful";
            }
        } else if (transaction.getTransactionType().equalsIgnoreCase("WITHDRAW") && (transaction.getAmount() < balance) && (hasLimitedWithdrawals == true)) {

            if (getNoofWithdrawals() > 5) {
                transaction.setAdditionalCharges(0.0);

                transaction.setStatus("FAILED");
                transactions.add(transaction);
                value = "MaxTransactions";
            } else {
                transaction.setAdditionalCharges(0.00);

                transaction.setStatus("SUCCESS");
                balance = balance - (transaction.getAmount());
                transactions.add(transaction);
                value = "Transaction Successful";
            }
        }

        return value;

    }
}
