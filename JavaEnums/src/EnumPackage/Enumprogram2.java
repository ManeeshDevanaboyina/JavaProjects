/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumPackage;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Enumprogram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       enum Operations{
           PLUS(),MINUS(),SUB(),MULTIPLE();
           switchOperations()
       }
    }
    
}
