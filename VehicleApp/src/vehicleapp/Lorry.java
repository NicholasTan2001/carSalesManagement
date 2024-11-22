/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleapp;

/**
 *
 * @author Nicholas Tan
 */
public class Lorry extends Vehicle{
    private String brand;
   
    
    public Lorry (SpareTyre spareTyre){
        
        super(spareTyre);
        
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    @Override
    public double getRoadTaxPrice(){
      double price;
      
         if(powertrain.equals("Gasoline")){
             
              price=400;
         }
         else if (powertrain.equals("Hybird")){
             
             price=300;
         }
         else if (powertrain.equals("Electric")){
             
             price=200;
         }
         else{
             
             price=0;
         }
         
     return price;
     }  
}
