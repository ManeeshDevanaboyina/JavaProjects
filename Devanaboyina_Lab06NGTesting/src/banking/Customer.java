/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 * Class: 44542-03 Object Oriented Programming
 * @author Maneesh Devanaboyina
 * Description: Making sure everything works
 * Due: 10/19/2021
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */

public class Customer {

    private String dob;
    private String firstName;
    private String lastName;

    /**
     *dobfirstNameLastName
     * @param dob dob
     * @param firstName firstName 
     * @param lastName lastName
     */
    public Customer(String dob, String firstName, String lastName) {
        this.dob = dob;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *return dob
     * @return dob
     */
    public String getDob() {
        return dob;
    }

    /**
     *set dob
     * @param dob dob
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     *return firstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *sets firstName
     * @param firstName firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *return LastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *set lastName
     * @param lastName lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     *return the String value
     * @return String
     */
    @Override
    public String toString() {
        return "Name: " + lastName + ", " + firstName + "\nDate of Birth: " + dob;

    }

}
