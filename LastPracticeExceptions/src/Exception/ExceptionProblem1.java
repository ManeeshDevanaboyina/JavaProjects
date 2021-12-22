/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;
import javax.swing.JOptionPane;
/**
 *
 * @author Maneesh Devanaboyina
 */
public class ExceptionProblem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            int n1;
            int n2;
            int n3;
            int count = 0;
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your First Number"));
            while (n1 == 0 && count < 3) {
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number other than zero"));
                count++;
            }
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your Second Number"));
            while (n2 == 0 && count < 3) {
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number other than zero"));
                count++;
            }
            n3 = Integer.parseInt(JOptionPane.showInputDialog("Enter your Third Number"));
            while (n3 == 0 && count < 3) {
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number other than zero"));
                count++;
            }
            int largest = 0;
            int smallest = 0;
            if (n1 > n2 && n1 > n3) {
                largest = n1;
                System.out.println("n1 is Largest");
            } else if (n2 > n1 && n2 > n3) {
                largest = n2;
                System.out.println("n2 is largest");
            } else if (n3 > n1 && n3 > n2) {
                largest = n3;
                System.out.println("n3 is largest");
            }

            if (n1 < n2 && n1 < n3) {
                smallest = n1;
                System.out.println("n1 is smallest");
            } else if (n2 > n1 && n2 > n3) {
                smallest = n2;
                System.out.println("n2 is smallest");
            } else if (n3 > n1 && n3 > n2) {
                smallest = n3;
                System.out.println("n3 is smallest");
            }
        } catch (NullPointerException np) {
            System.out.println("NullPointerException Caught!");
        }
    }
}
