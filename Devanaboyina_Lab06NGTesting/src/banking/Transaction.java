/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Class: 44542-03 Object Oriented Programming
 * @author Maneesh Devanaboyina
 * Description: Making sure everything works
 * Due: 10/19/2021
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */

public class Transaction {

    private double additionalCharges;
    private double amount;
    private String status;
    private LocalDateTime transactionTime;
    private String transactionType;

    /**
     *constructor for amount, trans time, trans type
     * @param amount amount
     * @param transactionTime transactionTime
     * @param transactionType transactionType
     */
    public Transaction(double amount, LocalDateTime transactionTime, String transactionType) {
        this.amount = amount;
        this.transactionTime = transactionTime;
        this.transactionType = transactionType;
    }

    /**
     *get additional charge
     * @return additionalCharges
     */
    public double getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     *Set Additional charges
     * @param additionalCharges additionalCharges
     */
    public void setAdditionalCharges(double additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    /**
     *returns the Amount
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     *Sets the amount
     * @param amount amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     *returns the status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     *Sets the status
     * @param status status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *returns the TransactionTime
     * @return transactionTime
     */
    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     *Sets TransactionTime
     * @param transactionTime transactionTime
     */
    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     *Returns the TransactionType
     * @return transactionType
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     *Sets TransactionType
     * @param transactionType transactionType
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    
    /**
     *return the String value
     * @return String
     */
    @Override
    public String toString() {
        return transactionType + "\t\t" + transactionTime + "\t\t" + amount + "\t\t" + additionalCharges + "\t\t\t" + status;
    }

}
