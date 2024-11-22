/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payrollsystem;

/**
 *
 * @author Nicholas Tan
 */
abstract public class Employee {
    
    protected String firstName, lastName, myKad; 
    
    public Employee (String firstName, String lastName, String myKad){
    
           this.firstName=firstName;
           this.lastName=lastName;
           this.myKad=myKad;
           
    }
    
    public void setFirstName(String firstName){
        
        this.firstName=firstName;
        
    }
    
    public String getFirstName(){
        
        return firstName;
        
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMyKad() {
        return myKad;
    }

    public void setMyKad(String myKad) {
        this.myKad = myKad;
    }
    
   
    @Override
    public String toString() 
 {
    return String.format("%s %s\nMyKad : %s", getFirstName(), 
    getLastName(), getMyKad());
 }

    abstract public double Earnings();
    
}
