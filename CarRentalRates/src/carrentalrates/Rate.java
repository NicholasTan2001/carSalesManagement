/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalrates;


public class Rate {
    
    private int mileage, rentDuration;
    private double vehicleRate;
    public Rate (){
        
        mileage=0;
        vehicleRate=0;
        rentDuration=0;
        
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getVehicleRate() {
        return vehicleRate;
    }

    public void setVehicleRate(double vehicleRate) {
        this.vehicleRate = vehicleRate;
    }

    public int getRentDuration() {
        return rentDuration;
    }

    public void setRentDuration(int rentDuration) {
        this.rentDuration = rentDuration;
    }
    
    
    public void printRentalDetails(Vehicle VehObj){
        
        if(VehObj.getMaker().equals("Proton")&&VehObj.getModel().equals("Persona")){
            
             vehicleRate = (80*getRentDuration())+(getMileage()*0.5);
            
        }
        
        else if(VehObj.getMaker().equals("Perodua")&&VehObj.getModel().equals("Kelisa")){
            
             vehicleRate  = (50*getRentDuration())+(getMileage()*0.5);            
        }
        
        else if(VehObj.getMaker().equals("Nissan")&&VehObj.getModel().equals("Xtrail")){
            
             vehicleRate = (40*getRentDuration())+(getMileage()*0.5);            
        }
        
        else if(VehObj.getMaker().equals("Honda")&&VehObj.getModel().equals("EX5")){
            
             vehicleRate = (100*getRentDuration())+(getMileage()*0.5);            
        }
        
        
        
        System.out.println("\nDuration : " +getRentDuration());
        System.out.println("Mileage : " +getMileage());
        System.out.println("Amount : "+getVehicleRate());
 
        
    }
}
