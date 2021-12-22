/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
public class AccountNGTest {

    static Account account;
    static Customer customer;
    static Transaction transaction;
    static ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public AccountNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date = "2021-02-02 08:42:02";
        LocalDateTime local = LocalDateTime.parse(date, dateFormat);
        transaction = new Transaction(1000.00, local,"DEPOSIT");
        customer = new Customer("09/05/1993", "Bill", "Gates");
        account = new Account(3429587739L, customer, false);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {

    }

    /**
     * Test of getAccountNumber method, of class Account.
     */
    @Test
    public void testGetAccountNumber() {
        System.out.println("getAccountNumber");

        long expResult = 3429587739L;
        long result = account.getAccountNumber();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getCustomer method, of class Account.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");

        Customer expResult = customer;
        Customer result = account.getCustomer();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");

        double expResult = 0.0;
        double result = account.getBalance();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testGetBalanceFail() {
        System.out.println("getBalance");

        double expResult = 10.0;
        double result = account.getBalance();
        assertNotEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getTransactions method, of class Account.
     */
    @Test
    public void testGetTransactions() {
        System.out.println("getTransactions");

        ArrayList expResult = transactions;
        ArrayList result = account.getTransactions();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isHasLimitedWithdrawals method, of class Account.
     */
    @Test
    public void testIsHasLimitedWithdrawals() {
        System.out.println("isHasLimitedWithdrawals");

        boolean expResult = false;
        boolean result = account.isHasLimitedWithdrawals();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testIsHasLimitedWithdrawalsFail() {
        System.out.println("isHasLimitedWithdrawals");

        boolean expResult = true;
        boolean result = account.isHasLimitedWithdrawals();
        assertNotEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getSAVING_INTEREST method, of class Account.
     */
    @Test
    public void testGetSAVING_INTEREST() {
        System.out.println("getSAVING_INTEREST");
        double expResult = 5.8;
        double result = account.SAVING_INTEREST;
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testGetSAVING_INTERESTFail() {
        System.out.println("getSAVING_INTEREST");
        double expResult = 0.00;
        double result = account.SAVING_INTEREST;
        assertNotEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getNoofWithdrawals method, of class Account.
     */
    @Test
    public void testGetNoofWithdrawals() {
        System.out.println("getNoofWithdrawals");

        int expResult = 0;
        int result = account.getNoofWithdrawals();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetNoofWithdrawalsFail() {
        System.out.println("getNoofWithdrawals");

        int expResult = 2;
        int result = account.getNoofWithdrawals();
        assertNotEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of makeTransaction method, of class Account.
     */
    @Test
    public void testMakeTransaction() {
        System.out.println("makeTransaction");
        String expResult = "Transaction Successful";
        String result = account.makeTransaction(transaction);
        System.out.println(transactions);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.     
    }

    @Test
    public void testMakeTransactionFail() {
        System.out.println("makeTransaction");
        String expResult = "Transaction Failure";
        String result = account.makeTransaction(transaction);
        System.out.println(transactions);
        assertNotEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.     
    }

    /**
     * Test of generateStatement method, of class Account.
     */
    @Test
    public void testGenerateStatement() {
        System.out.println("generateStatement");

        String result = account.generateStatement();
        assertTrue(!result.isEmpty());
        // TODO review the generated test code and remove the default call to fail.  
    }

}
