/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themeparkticketingsystem;

/**
 *
 * @author Nicholas Tan
 */
public class Visitor extends Customer{
    
    private String membership;

    public Visitor(Attractions attraction) {
        super(attraction);
    }

    public double discountPrice(){
        double discountPrice=0.00;
        
        if (membership.equals("platinium")){
            
            discountPrice = 5.00;
        }
        else  if (membership.equals("gold")){
            
            discountPrice = 3.50;
        }
        else  if (membership.equals("silver")){
            
            discountPrice = 2.00;
        }
        
        return discountPrice;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
    
    @Override
    public double totalTicketPayment(){
        
        double ticketPayment=0.00;
        
        ticketPayment=getTicketPrice()+getAttraction().getGamePrice()-discountPrice();
        
        return ticketPayment;

    }
    
    
    
}
