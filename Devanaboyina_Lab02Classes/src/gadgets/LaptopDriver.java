/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadgets;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class LaptopDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Laptop object1=new Laptop("HP","Intel Core i5","windows",512,12.4,true);
        
        System.out.println("*Testing getter method on object1*");
        
        
        System.out.println("Laptop Brand is: "+object1.getLaptopBrand()+"\nName of the Processor is: "+object1.getProcessor()+"\nOperating System name: "+object1.getOperatingSystem()+"\nHard Drive capacity in GB's: "+object1.getHardDrive()+"\nScreen Size: "+object1.getDisplay()+"\nis Touch: "+object1.getTouch());
    
        System.out.println("*Testing toString method on object1*");
        
        System.out.println(object1.toString());
        
        Laptop object2=new Laptop();
        System.out.println("*Testing toString method on object2*");
        System.out.println("Laptop Brand: "+object2.getLaptopBrand()+"\nLaptop Processor: "+object2.getProcessor()+"\nLaptop Operating System:"+object2.getOperatingSystem()+"\nLaptop Hard Drive: "+object2.getHardDrive()+"\nLaptop Display: "+object2.getDisplay()+"\nLaptop is Touch: "+object2.getTouch());
        
        System.out.println("Testing toString method on object2*");
       
        object2.setLaptopBrand("Apple");
        object2.setProcessor("Intel core i3");
        object2.setOperatingSystem("macOS Mojave");
        object2.setHardDrive(256);
        object2.setDisplay(10.5);
        object2.setTouch(Boolean.FALSE);
        
        System.out.println(object2.toString());
        
        System.out.println("*Testing getter method on object2*");
        
        System.out.println("Laptop Brand is: "+object2.getLaptopBrand()+"\nName of the processor is: "+object2.getProcessor()+"\nOperating System name: "+object2.getOperatingSystem()+ "\nHard Drive capacity in GB's: "+object2.getHardDrive()+"\nScreen Size: "+object2.getDisplay()+"\nis Touch: "+object2.getTouch());
    
    }
    
    
}
