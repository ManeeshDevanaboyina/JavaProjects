/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;
import java.util.*;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Retailer {
    private String retailerName;
    private String address;
    private ArrayList<Beer> beerList;

    /**
     *Constructor Retailer
     * @param retailerName Retailer
     * @param address address
     */
    public Retailer(String retailerName, String address) {
        this.retailerName = retailerName;
        this.address = address;
        this.beerList = new ArrayList<Beer>();
    }

    /**
     *Name of the retailer
     * @return retailerName
     */
    public String getRetailerName() {
        return retailerName;
    }

    /**
     *Address of the retailer
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *List of all beer objects for a retailer
     * @return beerList
     */
    public ArrayList<Beer> getBeerList() {
        return beerList;
    }

    /**
     * Setting Name of the retailer.
     * @param retailerName retailerName
     */
    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    /**
     *Setting Address of the retailer
     * @param address address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *Setting List of all beer objects for a retailer
     * @param beerList beerList
     */
    public void setBeerList(ArrayList<Beer> beerList) {
        this.beerList = beerList;
    }
        
    /**
     *Whether beer is Available
     * @param beerName beerName
     * @return false
     */
    public boolean isAvailable(String beerName){
        for(Beer A:beerList){
            
            if(A.getBeerName().equals(beerName))
                return true;
        }
        return false;
    }
    
    /**
     *
     * @param newBeer newBeer
     */
    public void addNewBeer(Beer newBeer){
        
          if(beerList!=null && beerList.size()>0 && beerList.contains(newBeer)) {
               
         }  
          else {
              beerList.add(newBeer);
          }
            
    }
    
    /**
     *Remove Beer if have same name
     * @param beerName beerName
     * @return m
     */
    public Beer removeBeer(String beerName){
        
        for(Beer i: beerList){
            if(i.getBeerName().equals(beerName)){
              
              Beer m=i;
              beerList.remove(i);
              return m;
                
            }
        }
        
        return null;
    }
 
    /**
     * Strong beer
     * @return strong
     */
    public ArrayList<Beer> getStrongBeers(){
        
        ArrayList<Beer> strong=new ArrayList<>();
        
        for(Beer i:beerList){
            if(i.getAbv()>4.00)
                strong.add(i);
        }
        
        return strong;
        
    }
    
    /**
     *Light Beers
     * @return Light
     */
    public ArrayList<Beer> getLightBeers(){
        
        ArrayList<Beer> Light=new ArrayList<>();
        
        for(Beer j:beerList){
            if(j.getAbv()<4.00)
                Light.add(j);
        }
        
        return Light;
    }
    
    /**
     *IndexList
     * @param beerName beerName
     * @return -1
     */
    public int getIndexinList(String beerName){
        int count=0;
        Iterator<Beer> index=beerList.iterator();
        while (index.hasNext()){
            Beer m=index.next();
            count=count+1;
            if(m.getBeerName().equals(beerName))
                return count;   
        }
        return -1;
    }

    @Override
    public String toString() {
        String m=retailerName+"\n"+address+"\n*****Beers List*****\n"+"********************\n";
        String a="";
        for(Beer i:beerList){
            a+="Beer Name: "+i.getBeerName()+"\n"+"Beer Type: "+i.getBeerType()+", "+"Beer Style: "+i.getBeerStyle()+"\n"+"abv: "+i.getAbv()+"%"+"\n"+"Available in packs of: "+i.packs(i.getAvailablePackages())+"."+"\n--------------------\n";
                    
                    
                    
    }
    
        return m+a;
    }      
    
}
