/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class EmployeeSalary {

    private double hourlyRate;
    private double insuranceRate;
    private double taxRate;
    private double pfRate;
    private int HOURS = 40;

    /*Constructor with Parameters - The parameters are used to set the values of the instance variables. */

    /**
     *
     * @param hourlyRate
     * Hourly Rate of the Employee
     * @param insuranceRate
     * Insurance Rate
     * @param taxRate
     * TaxRate
     * @param pfRate
     * pfRate
     */

    public EmployeeSalary(double hourlyRate, double insuranceRate, double taxRate, double pfRate){ 

        this.hourlyRate=hourlyRate;
        this.insuranceRate=insuranceRate;
        this.taxRate=taxRate;
        this.pfRate=pfRate;
        this.HOURS=40;
    }
    /*No Argument Constructor*/

    /**
     *
     */

    public EmployeeSalary(){


    }
    
    /** Sets the HourlyRate.
     *@param hourlyRate - A double containing the hourlyRate.
     */

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

     /** Sets the InsuranceRate.
     *@param insuranceRate - A double containing the InsuranceRate.
     */

    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

     /** Sets the taxRate.
     *@param taxRate - A double containing the taxRate.
     */

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

     /** Sets the PfRate.
     *@param pfRate - A double containing the PfRate.'
     */

    public void setPfRate(double pfRate) {
        this.pfRate = pfRate;
    }

    /** Sets the hours.
     *@param hours - A double containing the hours.
     */
        public void setHours(int hours) {
        this.HOURS = hours;
    }

    /** Gets the HourlyRate.
    *@return - A double representing the HourlyRate.
    */  

    public double getHourlyRate() {
        return hourlyRate;
    }

    /** Gets the InsuranceRate.
    *@return - A double representing the InsuranceRate. 
    */

    public double getInsuranceRate() {
        return insuranceRate;
    }

    /** Gets the TaxRate.
    *@return - A double representing the TaxRate. 
    */    

    public double getTaxRate() {
        return taxRate;
    }

    /** Gets the pfRate.
    *@return - A double representing the pfRate.
    */

    public double getPfRate() {
        return pfRate;
    }

    /** Gets the number of Hours.
    *@return - A double representing the number of Hours. 
    */

    public int getHours() {
        return this.HOURS;
    }

    /** Gets the MonthlySalary.
    *@return - A double representing the MonthlySalary.
    */

    public double calcMonthlySalary(){

        return (hourlyRate*this.HOURS)*4;

    }

    /** Gets the MonthlyInsurance.
    *@return - A double representing the MonthlyInsurance. 
    */   

    public double calcMonthlyInsurance(){

        return this.calcMonthlySalary()*(insuranceRate/100);
    }

    /** Gets the MonthlyPfAmount.
    *@return - A double representing the MonthlyPfAmount.
    */

    public double calcMonthlyPfAmount(){

        return this.calcMonthlySalary()*(pfRate/100);
    }

    /** Gets the AnnualGrossSalary.
    *@return - A double representing the AnnualGrossSalary
    *@param bonus - bonus Value 
    */  

    public double calcAnnualGrossSalary(double bonus){

        return bonus+(this.calcMonthlySalary()*12);

    }

    /** Gets the AnnualNetPay.
    *@return - A double representing the AnnualNetPay
    *@param bonus - bonus Value 
    */    

    public double calcAnnualNetPay(double bonus){

        return  this.calcAnnualGrossSalary(bonus)-(this.calcAnnualGrossSalary(bonus)*(taxRate/100))-(this.calcMonthlyInsurance()*12)-(this.calcMonthlyPfAmount()*12);

    }

    /** Displays all the values.
    *@return - A String representing the values.
    */   

    public String toString(){
        return "hourlyRate: "+hourlyRate+", insuranceRate: "+insuranceRate+", taxRate: "+taxRate+", pfRate: "+pfRate+", HOURS: "+HOURS;
    }
}
