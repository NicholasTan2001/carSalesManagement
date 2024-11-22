/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payrollsystem;

/**
 *
 * @author Nicholas Tan
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;

    public BasePlusCommissionEmployee(double baseSalary, double grossSales, double commissionRate, String firstName, String lastName, String myKad) {
        super(grossSales, commissionRate, firstName, lastName, myKad);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double Earnings(){
        
        return getBaseSalary()+super.Earnings();
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s; %s: $%,.2f", "Base-salaried", super.toString(), "Base salary", getBaseSalary());
    }
}

