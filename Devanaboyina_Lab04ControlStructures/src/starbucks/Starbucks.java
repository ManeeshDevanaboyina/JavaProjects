package starbucks;
import java.util.Scanner;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Starbucks {
    
    private String customerName;
    private String address;
    private String contactNumber;
    private String customerType;
    private String billReciept="The Following is the bill for purchased products\n";
    private double billAmount=0;
    private String order="";

    /**
     *
     * @param customerName Customer Name
     * @param address Address
     * @param contactNumber Contact Number
     * @param customerType customer Type
     */
    public Starbucks(String customerName, String address, String contactNumber, String customerType) {
        this.customerName = customerName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.customerType = customerType;
        this.billReciept="\nThe Following is the bill for purchased products\n";
    }

    /**
     * gets the CustomerName
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets CustomerName
     * @param customerName customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     *gets Address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *Sets Address
     * @param address address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *gets ContactNumber
     * @return contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     *Sets contactNumber
     * @param contactNumber contactNumber
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     *gets Type of Customer
     * @return customerType
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     *sets type of Customer
     * @param customerType customerType
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     *return the order number
     * @return order
     */
    public String getOrder() {
        return order;
    }

    /**
     *sets the order number
     * @param order order
     */
    public void setOrder(String order) {
        this.order = order;
    }
    
    /**
     *Gets the Starting letter of Word
     * @return c1
     */
    public String getNameInitials(){
        
        String[] string=customerName.split(" ");
        String fullstop=".";
        String c1="";
        for(int i = 0; i < string.length; i++){
           String s=string[i].toUpperCase();
           char c=s.charAt(0);
           c1=c1+c+fullstop;
                   
        }
        
            return c1;   
    }
    
 
    
    private String getItemName(int num){
        
        String itemName;
        switch(num){
            case 1:
               itemName= "Ham & Swiss Panini";
               break;
                
            case 2:
                itemName= "Cheese & Fruit Bistro Box";
                break;
               
            case 3:
                itemName= "Turkey Pesto Panini";
                break;
               
            case 4:
                itemName= "Salted Caramel or Birthday Cake Pop";
                break;
                
            case 5:
                itemName= "Roasted Tomato & Mozzarella Panini";
                break;
                
              default:
                itemName= "Please choose the number 1 to 5"+getItemName(num);
                
    }
        return itemName;
    }
   
    private double getItemCost(String itemName){
        
        double itemCost=0;
        switch(itemName){
               case "Ham & Swiss Panini":
                itemCost= 5.25;
                break;
               
               case "Cheese & Fruit Bistro Box":
                itemCost= 4.95;
                break;
               
               case "Turkey Pesto Panini":
                itemCost= 5.96;
                break;

               case "Salted Caramel or Birthday Cake Pop":
                itemCost= 3.50;
                break;

               case "Roasted Tomato & Mozzarella Panini":
                itemCost= 3.46;
                break;
               
               default:
                 System.out.println("Please choose the number 1 to 5");
                        
        }
            return itemCost;
        
    }
    
    /**
     * Updating the Receipt
     * @param quantity quantity
     * @param num numb
     */
    public void updateReceipt(int quantity,int num){
       String itemname=getItemName(num);
       double cost=getItemCost(itemname);
       billAmount=billAmount+cost*quantity;
        billReciept+= itemname+"("+cost+")"+"                     *"+quantity+"="+Math.round(cost*quantity*100.0)/100.0+"\n";
    }
    
    private double getDiscount(){
       double discount;
        if (customerType.equals("Regular")){
            if (billAmount>10.00){
                return Math.round(0.1*billAmount*100.0)/100.0;         
        }
        
        }
        return 0.0;
        
    }   
    
    private double getSalesTax(){
        double Tax= 0.08*billAmount;
        return Math.round(Tax*100.0)/100.0;
       
    }
    
    /**
     *returns the FinalBillAmount
     * @return billAmount+getSalesTax()-getDiscount()
     */
    public double getFinalBillAmount(){
        return billAmount+getSalesTax()-getDiscount();
    }
    
    private String getFinalBillReciept(){
        billReciept += "                        Sales Tax = "+getSalesTax()+"\n";
        billReciept += "                        discount  = -"+getDiscount()+"\n";
        billReciept += "------------------------------------------------------\n";
        billReciept += "                        Total Bill = "+Math.round(getFinalBillAmount()*100.0)/100.0+"\n";
        billReciept += "------------------------------------------------------\n";
        return billReciept;
    } 
    
    private String getOrderWithName(){
        return getOrder()+" by "+getNameInitials();
    }
    
    private String getContactDetails(){
        return "Address:  "+address+"\n"+"Contact:  "+contactNumber;
                        
    }
    private String getBalance(double pay){
     
        double bal=pay-Math.round(getFinalBillAmount()*100.0)/100.0;
        double value=bal;
        int fiftyDollar = 0;
        int tenDollar=0;
        int fiveDollar=0;
        int oneDollar=0;
        int cent025=0;
        int cent010=0;
        int cent005=0;
        int cent001=0;  
        
        while(true){
        if (bal>=50.00){
            bal=bal-50.00;
            fiftyDollar=fiftyDollar+1;}
           
        else if(bal>=10.00){
            
            bal=bal-10.00;
            tenDollar=tenDollar+1;
        }
        else if(bal>=5.00){
            bal=bal-5.00;
            fiveDollar=fiveDollar+1;            
        }
        else if(bal>=1.00){
            bal=bal-1.00;
            oneDollar=oneDollar+1;
        }
        else if(bal>=0.25){
            bal=bal-0.25;
            cent025=cent025+1;
        }
        else if(bal>=0.10){
            bal=bal-0.10;
            cent010=cent010+1;
        }
        else if(bal>=0.05){
            bal=bal-0.05;
            cent005=cent005+1;
        }
        else if(bal>=0.01){
            bal=bal-0.01;
            cent001=cent001+1;
        }
        else
            break;
        }
        
        if (value>=50.00){
            
            return "Change received is as follow\n$50.00  *"+fiftyDollar+" = "+(fiftyDollar*50.00)+"\n"+"$10.00  *"+tenDollar+" = "+(tenDollar*10.00)+"\n"+"$5.00   *"+fiveDollar+" = "+(fiveDollar*5.00)+"\n"+"$1.00   *"+oneDollar+" = "+(oneDollar*1.00)+"\n"+"$0.25   *"+cent025+" = "+(cent025*0.25)+"\n"+"$0.10   *"+cent010+" = "+(cent010*0.10)+"\n"+"$0.05   *"+cent005+" = "+(cent005*0.05)+"\n"+"$0.01   *"+cent001+" = "+(cent001*0.01)+"\n-------------------------\nTotal Bal = "+value+"\n-------------------------";
        }    
        else if(value>=10.00){
            
            return "Change received is as follow\n"+"$10.00  *"+tenDollar+" = "+(tenDollar*10.00)+"\n"+"$5.00   *"+fiveDollar+" = "+(fiveDollar*5.00)+"\n"+"$1.00   *"+oneDollar+" = "+(oneDollar*1.00)+"\n"+"$0.25   *"+cent025+" = "+(cent025*0.25)+"\n"+"$0.10   *"+cent010+" = "+(cent010*0.10)+"\n"+"$0.05   *"+cent005+" = "+(cent005*0.05)+"\n"+"$0.01   *"+cent001+" = "+(cent001*0.01)+"\n--------------------\nTotal Bal = "+value+"\n--------------------";
        }
        else if(value>=5.00){
            
            return "Change received is as follow\n"+"$5.00   *"+fiveDollar+" = "+(fiveDollar*5.00)+"\n"+"$1.00   *"+oneDollar+" = "+(oneDollar*1.00)+"\n"+"$0.25   *"+cent025+" = "+(cent025*0.25)+"\n"+"$0.10   *"+cent010+" = "+(cent010*0.10)+"\n"+"$0.05   *"+cent005+" = "+(cent005*0.05)+"\n"+"$0.01   *"+cent001+" = "+(cent001*0.01)+"\n--------------------\nTotal Bal = "+value+"\n--------------------";
        }
        
        else if(value>=1.00){
            
            return "Change received is as follow\n"+"$1.00   *"+oneDollar+" = "+(oneDollar*1.00)+"\n"+"$0.25   *"+cent025+" = "+(cent025*0.25)+"\n"+"$0.10   *"+cent010+" = "+(cent010*0.10)+"\n"+"$0.05   *"+cent005+" = "+(cent005*0.05)+"\n"+"$0.01   *"+cent001+" = "+(cent001*0.01)+"\n--------------------\nTotal Bal = "+value+"\n--------------------";
            
        }
        
        else if(value>=0.25){
            
            return "Change received is as follow\n"+"$0.25   *"+cent025+" = "+(cent025*0.25)+"\n"+"$0.10   *"+cent010+" = "+(cent010*0.10)+"\n"+"$0.05   *"+cent005+" = "+(cent005*0.05)+"\n"+"$0.01   *"+cent001+" = "+(cent001*0.01)+"\n--------------------\nTotal Bal = "+value+"\n--------------------";
        }
        else if(value>=0.10){
            
            return "Change received is as follow\n"+"$0.10   *"+cent010+" = "+(cent010*0.10)+"\n"+"$0.05   *"+cent005+" = "+(cent005*0.05)+"\n"+"$0.01   *"+cent001+" = "+(cent001*0.01)+"\n--------------------\nTotal Bal = "+value+"\n--------------------";
        }
        else if(value>=0.05){ 
            
            return "Change received is as follow\n"+"$0.05   *"+cent005+" = "+(cent005*0.05)+"\n"+"$0.01   *"+cent001+" = "+(cent001*0.01)+"\n--------------------\nTotal Bal = "+value+"\n--------------------";
        }
        else if(value>=0.01){
            return "Change received is as follow\n"+"$0.01   *"+cent001+" = "+(cent001*0.01)+"\n--------------------";
        }
        else
            return null;
    }

    @Override
    public String toString() {
        return getOrderWithName()+"\n"+getContactDetails()+getFinalBillReciept();
    }
    
    /**
     *Returns the Receipt to the Customer
     * @param pay toString()+getBalance(pay); 
     * @return toString()+getBalance(pay)
     */
    public String printReciept(double pay){
        	
        return toString()+getBalance(pay);    
    }
    
    
}
