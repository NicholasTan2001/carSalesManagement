/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payrollsystem;

/**
 *
 * @author Nicholas Tan
 */
public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Employee[] employees = new Employee[3];
        
         SalariedEmployee salariedEmployee= new SalariedEmployee(2600.00, "James", "Watt","771014-03-9003");
         CommissionEmployee commissionEmployee= new CommissionEmployee(10000.00, 0.07, "Mohit", "Sharma", "891209-13-9005");
         BasePlusCommissionEmployee basePlusCommissionEmployee= new BasePlusCommissionEmployee(1200.00, 5000.00, 0.04, "Kim", "Wong","850521-10-9006");
        
         employees[0] = salariedEmployee; 
         employees[1] = commissionEmployee; 
         employees[2] = basePlusCommissionEmployee; 
       
        for(Employee currentEmployee : employees)
        {
             System.out.println(currentEmployee);
             if (currentEmployee instanceof BasePlusCommissionEmployee){
                          
                 BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                 
                 double oldBaseSalary = employee.getBaseSalary(); 
                 
                 employee.setBaseSalary(1.10 * oldBaseSalary);
                 
                 System.out.printf("New base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary());
             }
             
             System.out.printf("Earned $%,.2f\n\n", currentEmployee.Earnings());
        }

    }
}