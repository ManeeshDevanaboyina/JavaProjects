/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_Joption;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Practicesession {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String firstName;
        String lastName;
        int age;  
        
        
        
        firstName = JOptionPane.showInputDialog("Enter  your First Name and Last Name");
        
        
        int ind=firstName.indexOf(' ');
        String a=firstName.substring(0,ind);
        String uppe1=a.toUpperCase();
        int len=firstName.length();
        String LastName=firstName.substring(ind+1);
        String uppe2=LastName.toUpperCase();
        int len2=LastName.length();
        
        JOptionPane.showMessageDialog(null,"Last name is " +uppe2+"length of last name is " +len2+"\nFirst name is "+uppe1+"length of First name is"+len);
        
     
        
    }
    
}
