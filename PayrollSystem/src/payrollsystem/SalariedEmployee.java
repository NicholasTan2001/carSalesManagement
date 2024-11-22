/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payrollsystem;

/**
 *
 * @author Nicholas Tan
 */
public class SalariedEmployee extends Employee{
    
    private double monthlySalary;

    public SalariedEmployee(double monthlySalary, String firstName, String lastName, String myKad) {
        super(firstName, lastName, myKad);
        this.monthlySalary = monthlySalary;
    } 

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    public double Earnings(){

       return getMonthlySalary();
    }
    
    @Override
    public String toString() 
 {
    return String.format("Salaried employee: %s\n%s: $%,.2f", 
    super.toString(), "Monthly salary", getMonthlySalary());
 }

}
