/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleapp;

/**
 *
 * @author Nicholas Tan
 */
public class Car extends Vehicle{
    
    private String model;
    private double cc;
    
    public Car(String model, double cc, String type, String transmission, String powertrain) {       
        super(type, transmission, powertrain);
        this.model = model;
        this.cc = cc;
        
    }
    
    public Car(String model, double cc, String type, String transmission, String powertrain, SpareTyre spareTyre){       
        super(type, transmission, powertrain, spareTyre);
        this.model = model;
        this.cc = cc;
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }
    
    public double getLiters(){
        double liters;
        
        liters=cc/1000;
        
        return liters;
    }
    
    public double getRoadTaxPrice(){
        double totalTaxValue;
        
        if (cc<=1000){
            totalTaxValue=20;
            
        }
        else if(cc>=1001&&cc<=1200){
            totalTaxValue=55;
            
        }
        else if(cc>=1201&&cc<=1400){
            totalTaxValue=70;
            
        }
        else if(cc>=1401&&cc<=1600){
            totalTaxValue=90;
            
        }
        else if(cc>=1601&&cc<=1800){
            totalTaxValue=200+((cc-1600)*0.4);
            
        }
         else if(cc>=1801&&cc<=2000){
            totalTaxValue=280+((cc-1800)*0.5);
            
        }
         else if(cc>=2001&&cc<=2500){
            totalTaxValue=380+((cc-2000)*1.0);
            
        }
         else if(cc>=2501&&cc<=3000){
            totalTaxValue=880+((cc-2500)*2.5);
            
        }   
        else if(cc>=3001){
            totalTaxValue=2130+((cc-3000)*4.5);
            
        }
        else{
            totalTaxValue=0;
            
        }
        return totalTaxValue;
    }
    
    



    
    

}
