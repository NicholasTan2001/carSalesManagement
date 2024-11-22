/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payrollsystem;

/**
 *
 * @author Nicholas Tan
 */
public class CommissionEmployee extends Employee{
    
    private double grossSales, commissionRate;

    public CommissionEmployee(double grossSales, double commissionRate, String firstName, String lastName, String myKad) {
        super(firstName, lastName, myKad);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commisionRate) {
        this.commissionRate = commisionRate;
    }
    
    @Override
    public double Earnings(){
        
        return getCommissionRate()*getGrossSales();
    }
    
    @Override
    public String toString(){
        
       return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", "Commission employee", super.toString(), "Gross sales", getGrossSales(), "Commission rate", getCommissionRate());
    }
    
}
