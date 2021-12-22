/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Beer {
    
    private String beerName;
    private String beerType;
    private String beerStyle;
    private double abv;
    private int[] availablePackages;

    /**
     * Constructor
     * @param beerName beerName
     * @param beerType beerType
     * @param beerStyle beerStyle
     * @param abv abv
     * @param availablePackages availablePackages
     */
    public Beer(String beerName, String beerType, String beerStyle, double abv, int[] availablePackages) {
        this.beerName = beerName;
        this.beerType = beerType;
        this.beerStyle = beerStyle;
        this.abv = abv;
        this.availablePackages = availablePackages;
    }

    /**
     *Name of the beer.
     * @return beerName
     */
    public String getBeerName() {
        return beerName;
    }

    /**
     *Type of beer 
     * @return beerType
     */
    public String getBeerType() {
        return beerType;
    }

    /**
     *Style of Beer
     * @return beerStyle
     */
    public String getBeerStyle() {
        return beerStyle;
    }

    /**
     *Alcohol by volume
     * @return abv
     */
    public double getAbv() {
        return abv;
    }
    
    /**
     *Type of packaging
     * @return availablePackages
     */
    public int[] getAvailablePackages() {
        return availablePackages;
    }

    /**
     *Setting Name of the beer.
     * @param beerName beerName
     */
    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    /**
     *Type of beer 
     * @param beerType beerType
     */
    public void setBeerType(String beerType) {
        this.beerType = beerType;
    }

    /**
     *Setting of beerstyle
     * @param beerStyle beerStyle
     */
    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    /**
     * Setting Alcohol by volume in percentage of a beer. 
     * @param abv abv
     */
    public void setAbv(double abv) {
        this.abv = abv;
    }

    /**
     *type of packaging available 
     * @param availablePackages availablePackages
     */
    public void setAvailablePackages(int[] availablePackages) {
        this.availablePackages = availablePackages;
    }
    
    /**
     *whether beer is Light
     * @return true
     */
    public boolean isLightBeer(){
        if (abv<=4){
            return true;
        }
        return false;
    }
    
     /**
     *getting toList
     * @param a a
     * @return value
     */
    public String packs(int[] a){
        String value=String.valueOf(a[0]);
        for(int k=1;k<a.length;k++){
            value=value+", "+a[k];
        
        }
        return value;
     }

    @Override
    public String toString() {
        return "Beer Name: "+beerName+"\n"+"Beer Type: "+beerType+", "+"Beer Style: "+beerStyle+"\nabv: "+abv+"%"+"\n"+"Available in packs of: "+packs(availablePackages)+"."+"\n--------------------\n";
    }
    
   
    
}
