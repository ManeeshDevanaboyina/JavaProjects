/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrideexample;

/**
 *
 * @author s541768
 */
public class OverrideExample {

    public static void main(String[] args) {
        // TODO code application logic here

        InsectClass i1 = new InsectClass("RedOne", "Red", 1, 2);
        BeeClass b1 = new BeeClass("BlueOne", "Blue", 2, 4);

        System.out.println(i1.canSting(i1.name));
        System.out.println(b1.canSting(b1.name));

        // b1=i1;
        i1 = b1;
    }

}
