/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.time.LocalDateTime;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class TransactionNGTest {

    static Transaction transaction;

    public TransactionNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        transaction = new Transaction(1000.00, LocalDateTime.MIN,"WITHDRAW");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        transaction = null;
    }

    /**
     * Test of getAmount method, of class Transaction.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        double expAmount = 1000.0;
        double amount = transaction.getAmount();
        assertEquals(expAmount, amount);
    }
    
    @Test
    public void testGetAmountFail() {
        System.out.println("getAmount");
        double expAmount = 1000.0;
        double amount = transaction.getAmount();
        assertNotEquals(expAmount, 100);
    }

    /**
     * Test of setAmount method, of class Transaction.
     */
    @Test
    public void testSetAmount() {
        double amount = 1000.0;
        transaction.setAmount(1000.0);

        assertEquals(amount, transaction.getAmount());
    }
    
    @Test
    public void testSetAmountFail() {
        double amount = 1000.0;
        transaction.setAmount(1000.0);

        assertNotEquals(100, transaction.getAmount());
    }

    /**
     * Test of getDateTime method, of class Transaction.
     */
    @Test
    public void testGetDateTime() {
        LocalDateTime localDateTime = transaction.getTransactionTime();
        assertEquals(LocalDateTime.MIN, localDateTime);
    }
    
    @Test
    public void testGetDateTimeFail() {
        LocalDateTime localDateTime = transaction.getTransactionTime();
        assertNotEquals(LocalDateTime.MAX, localDateTime);
    }

    /**
     * Test of setDateTime method, of class Transaction.
     */
    @Test
    public void testSetDateTime() {

        transaction.setTransactionTime(LocalDateTime.MIN);
        assertEquals(LocalDateTime.MIN, transaction.getTransactionTime());
    }
    
    @Test
    public void testSetDateTimeFail() {

        transaction.setTransactionTime(LocalDateTime.MIN);
        assertNotEquals(LocalDateTime.MAX, transaction.getTransactionTime());
    }

    /**
     * Test of getTransactionType method, of class Transaction.
     */
    @Test
    public void testGetTransactionType() {

        String actual = transaction.getTransactionType();
        String expected = "WITHDRAW";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetTransactionTypeFail() {

        String actual = transaction.getTransactionType();
        String expected = "DEPOSIT";
        assertNotEquals(expected, actual);
    }

    /**
     * Test of setTransactionType method, of class Transaction.
     */
    @Test
    public void testSetTransactionType() {
        System.out.println("setTransactionType");
        String transationType = "DEPOSIT";
        transaction.setTransactionType(transationType);
        assertEquals(transationType, transaction.getTransactionType());
    }
    
     @Test
    public void testSetTransactionTypeFail() {
        System.out.println("setTransactionType");
        String transationType = "DEPOSIT";
        transaction.setTransactionType(transationType);
        assertNotEquals("WITHDRAW", transaction.getTransactionType());
    }

    /**
     * Test of getAdditionalCharges method, of class Transaction.
     */
    @Test
    public void testGetAdditionalCharges() {
        System.out.println("getAdditionalCharges");
        double expected = 10.00;

        transaction.setAdditionalCharges(10.00);
        double actual = transaction.getAdditionalCharges();
        assertEquals(actual, expected);
    }

    /**
     * Test of setAdditionalCharges method, of class Transaction.
     */
    @Test
    public void testSetAdditionalCharges() {
        System.out.println("setAdditionalCharges");
        double additionalCharges = 100.0;

        transaction.setAdditionalCharges(additionalCharges);
        assertEquals(transaction.getAdditionalCharges(), additionalCharges);
    }
    
     @Test
    public void testSetAdditionalChargesFail() {
        System.out.println("setAdditionalCharges");
        double additionalCharges = 1000.0;

        transaction.setAdditionalCharges(additionalCharges);
        assertNotEquals(transaction.getAdditionalCharges(), 100.00);
    }

    /**
     * Test of getStatus method, of class Transaction.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        String status = "Failed";
        transaction.setStatus(status);
        String result = transaction.getStatus();
        assertEquals(result, status);
    }
    
    @Test
    public void testGetStatusFail() {
        System.out.println("getStatus");
        String status = "SUCCESS";
        transaction.setStatus(status);
        String result = transaction.getStatus();
        assertNotEquals("Failure", status);
    }

    /**
     * Test of setStatus method, of class Transaction.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "SUCCESS";
        transaction.setStatus(status);
        String result = transaction.getStatus();
        assertEquals(result, status);
    }
    
    @Test
    public void testSetStatusFail() {
        System.out.println("setStatus");
        String status = "Failure";
        transaction.setStatus(status);
        String result = transaction.getStatus();
        assertNotEquals("SUCCESS", status);
    }

    /**
     * Test of toString method, of class Transaction.
     */
    // @Test
    public void testToString() {
        System.out.println("toString");
        transaction.setTransactionType("DEPOSIT");
        transaction.setAdditionalCharges(0.00);
        transaction.setAmount(100.00);
        transaction.setStatus("SUCCESS");
        transaction.setTransactionTime(LocalDateTime.MIN);
        String expResult = "DEPOSIT             -999999999-01-01T00:00      100.00          "
                + "0.00                     SUCCESS";
        assertEquals(transaction.toString(), expResult);
    }
}