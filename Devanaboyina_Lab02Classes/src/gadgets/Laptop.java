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
public class Laptop {
    
    private String laptopBrand;
    private String processor;
    private double display;
    private int hardDrive;
    private String operatingSystem;
    private boolean touch;
    
    public Laptop(String laptopBrand, String processor, String operatingSystem, int hardDrive, double display, boolean touch){ 
     
        this.laptopBrand=laptopBrand;
        this.processor=processor;
        this.operatingSystem=operatingSystem;
        this.hardDrive=hardDrive;
        this.display=display;
        this.touch=touch;
    }
    
    public Laptop(){
        
    }

    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setTouch(Boolean touch) {
        this.touch = touch;
    }
    
    public String getLaptopBrand() {
        return laptopBrand;
    }

    public String getProcessor() {
        return processor;
    }

    public double getDisplay() {
        return display;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public Boolean getTouch() {
        return touch;
    }
    
  
    
    public String toString(){
            
        return "Laptop brand: "+this.laptopBrand+"\nLaptop processor: "+this.processor+"\nLaptop Operating System: "+this.operatingSystem+"\nLaptop Hard Drive: "+this.hardDrive+"\nLaptop Display: "+this.display+"\nLaptop is Touch: "+this.touch;
     
    }         
    
    
    
        
}


