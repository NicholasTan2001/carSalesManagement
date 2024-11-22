/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themeparkticketingsystem;

/**
 *
 * @author Nicholas Tan
 */
public class Staff extends Customer{
    
    private String staffType;
    
    public Staff(Attractions attraction){
        super(attraction);
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }
    
    public double discountPrice(){
        double discountPrice=0.00;
        
        if (staffType.equals("management")){
            discountPrice=15.00;
        }
        
        else if (staffType.equals("admin")){
            discountPrice=10.00;
        }
        else if (staffType.equals("technical")){
            discountPrice=8.50;
        }
        
        return discountPrice;
    }
     
    @Override
    public double totalTicketPayment(){
        double ticketPayment=0.00;
        
        ticketPayment=getTicketPrice()+getAttraction().getGamePrice()-discountPrice();
        
        return ticketPayment;
    }
    
}
