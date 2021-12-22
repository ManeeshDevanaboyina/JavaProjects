/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelexpenses;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class RouteCalculator {

    private int routeNo;
    private int numpassengers;
    private boolean isMember;
    private boolean isFirstTimeUser;
    private boolean haveCoupon;
    private double Coupon = 5.00;
    private double salesTax = 7.50;

    /**
     * Constructor with Parameters
     * @param routeNo Route Number
     * @param numpassengers Number of passengers
     * @param isMember Does user have membership
     * @param isFirstTimeUser Is he first time user
     * @param haveCoupon Does user have a coupon
     */
    public RouteCalculator(int routeNo, int numpassengers, boolean isMember, boolean isFirstTimeUser, boolean haveCoupon) {

        this.routeNo = routeNo;
        this.numpassengers = numpassengers;
        this.isMember = isMember;
        this.isFirstTimeUser = isFirstTimeUser;
        this.haveCoupon = haveCoupon;

    }

    /**
     *gets the RouteNo
     * @return Route Number
     *
     */
    public int getRouteNo() {
        return routeNo;
    }

    /**
     * Returning Number of Passengers
     * @return getNumpassengers
     * 
     */
    public int getNumpassengers() {
        return numpassengers;
    }

    /** gets IsMember
     * @return getIsMember
     */
    public boolean getIsMember() {
        return isMember;
    }

    /**
     * gets Returning whether person is a FirsttimeUser
     * @return getIsFirstTimeUser
     * 
     */
    public boolean getIsFirstTimeUser() {
        return isFirstTimeUser;
    }

    /**
     * return whether person has coupon
     * @return getHaveCoupon
     * 
     */
    public boolean getHaveCoupon() {
        return haveCoupon;
    }


    /**
     * Setting RouteNo
     * @param routeNo  Route Number 
     */
    public void setRouteNo(int routeNo) {
        this.routeNo = routeNo;
    }

    /**
     * Setting Number of Passengers
     * @param numpassengers Number of passengers
     */
    public void setNumpassengers(int numpassengers) {
        this.numpassengers = numpassengers;
    }

    /**
     * Setting whether person is member or not
     * @param isMember Does user have membership
     */
    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }

    /**
     * Setting whether person is FirstTimeUser or not
     * @param isFirstTimeUser Is he first time user
     */
    public void setFirstTimeUser(boolean isFirstTimeUser) {
        this.isFirstTimeUser = isFirstTimeUser;
    }

    /**
     * Setting whether person have Coupon or not
     * @param haveCoupon haveCoupon
     */
    public void setHaveCoupon(boolean haveCoupon) {
        this.haveCoupon = haveCoupon;
    }
    
    
     /**
     * Returning the toString
     * @return String toString
     */  
    
    public String toString() {
        return "User Route details: \n" + "routeNo: " + routeNo + ", numpassengers: " + numpassengers + ", isMember: " + isMember + ", isFirstTimeUser: " + isFirstTimeUser + ", haveCoupon: " + haveCoupon;
    }

     /**
     *Returning the RoutePrice
     * @return calcRoutePrice
     * 
     */  
    
    private double calcRoutePrice() {

        if (this.routeNo == 1) {
            if (this.numpassengers == 1) {
                return 35;
            } else if (this.numpassengers == 2) {
                return 60;
            } else {
                return this.numpassengers * 26.50;
            }
        }

        if (this.routeNo == 2) {
            if (this.numpassengers == 1) {
                return 32.89;
            } else if (this.numpassengers == 2) {
                return 53.12;
            } else {
                return this.numpassengers * 24.20;
            }
        }

        if (this.routeNo == 3) {
            if (this.numpassengers == 1) {
                return 38;
            } else if (this.numpassengers == 2) {
                return 63.78;
            } else {
                return this.numpassengers * 28.78;
            }
        }
        return 0;
    }
    
     /**
     * Returning the MembershipDiscount
     * @return calcMembershipDiscount
     * 
     */       

    private double calcMembershipDiscount() {
            
        
        if (this.isMember == true) {
            
            if (this.numpassengers == 1) {
                return this.calcRoutePrice()*0.05;
            }
            else if (this.numpassengers == 2) {
                return this.calcRoutePrice() * 0.062;
            } else if (this.numpassengers > 2) {
                return this.calcRoutePrice() * 0.08;
            }
            else{
            return 0.;
            }
        }    
        else{
            return 0;        
        }    

    }

     /**
     *Returning the FirstTimeUserDiscount
     * @return calcFirstTimeUserDiscount
     * 
     */    
    
    private double calcFirstTimeUserDiscount() {

        if (isFirstTimeUser == true) {
            if (numpassengers == 1) {
                return this.calcRoutePrice()*0.1;
            } else if (numpassengers == 2) {
                return this.calcRoutePrice()*0.07;
            } else if (numpassengers > 2) {
                return this.calcRoutePrice()*0.04;
            }
        } else {
            return 0.0;
        }

        return 0;

    }
    
     /**
     *Returning the CouponDiscount
     * @return calcCouponDiscount
     * 
     */    

    private double calcCouponDiscount() {

        if (haveCoupon == true) {
            if (numpassengers >= 1) {
                return 5.00;
                /*else
                return 0;*/

            }
        }

        return 0;
    }
    
     /**
     *Returning the totalprice which includes discount
     * @return totalPrice
     * 
     */

    private double totalPrice() {

        return this.calcRoutePrice() - (Coupon + this.calcFirstTimeUserDiscount() + this.calcMembershipDiscount());

    }

     /**
     *Returning the TotalpricewithSalesTax 
     * @return totalPriceWithSalesTax
     * 
     */
    
    private double totalPriceWithSalesTax() {
        return Math.round(((salesTax / 100) * this.totalPrice()+ totalPrice())*100.0)/100.0;

    }

    /**
     *Returning the Receipt 
     * @return printReceipt
     */
    public String printReceipt() {

        return "Receipt\n" + "Travel Charges for " + numpassengers + " passengers on route " + routeNo + ": $" + this.calcRoutePrice() + "\nMembership Discount: $" + this.calcMembershipDiscount() + "\nFirst Time user discount: $" + this.calcFirstTimeUserDiscount() + "\nCoupon Discount: $" +( calcRoutePrice()-this.calcCouponDiscount() )+ "\nCharges After applying Discount: $" + this.totalPrice() + "\nTotal Price with Tax: $" + this.totalPriceWithSalesTax();

    }

}
