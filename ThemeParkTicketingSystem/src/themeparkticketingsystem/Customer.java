/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themeparkticketingsystem;

/**
 *
 * @author Nicholas Tan
 */
abstract public class Customer {
    
    protected String custName;
    protected int custAge;
    protected Attractions attraction;

    public Customer(Attractions attraction) {
        this.attraction = attraction;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustAge() {
        return custAge;
    }

    public void setCustAge(int custAge) {
        this.custAge = custAge;
    }

    public Attractions getAttraction() {
        return attraction;
    }

    public void setAttraction(Attractions attraction) {
        this.attraction = attraction;
    }
    
    public String getCustomerCategory(){
        String customerCategory=null;
        
        if(custAge>=55){
            
            customerCategory="senior";
        }
        else if(custAge>=13){
            
            customerCategory="adult";
        }
        else{
            customerCategory="child";
            
        }
  
        return customerCategory;
    }
    
    public double getTicketPrice(){
        double ticketPrice=0.00;
        
        if(custAge>=55){
            
            ticketPrice = 30.00;
        }
        else if(custAge>=13){
            
            ticketPrice = 70.00;
        }
        else if (custAge<=12){
            
            ticketPrice = 45.00;         
        }
        
        return ticketPrice;
    }
    
    abstract public double totalTicketPayment();

    
}
