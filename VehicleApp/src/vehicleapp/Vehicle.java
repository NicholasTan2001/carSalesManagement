/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleapp;

/**
 *
 * @author Nicholas Tan
 */
 public class Vehicle {
    
    protected String type, transmission, powertrain;
    protected int speed;
    protected SpareTyre spareTyre;
    protected Engine engine;
    
    public Vehicle (String type, String transmission, String powertrain){
         
        this.type=type;
        this.transmission=transmission;
        this.powertrain=powertrain;
        this.speed=60;
        
    }
    
    public Vehicle (SpareTyre spareTyre){
        this.spareTyre=spareTyre;
        
    }
    
    public Vehicle (String type, String transmission, String powertrain, SpareTyre spareTyre){
        
        this.type=type;
        this.transmission=transmission;
        this.powertrain=powertrain;
        this.speed=60;
        this.spareTyre=spareTyre;
        this.engine =new Engine();
        
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    } 
      
    
    public Vehicle (String transmission, String powertrain){
        this.transmission=transmission;
        this.powertrain=powertrain;
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getPowertrain() {
        return powertrain;
    }

    public void setPowertrain(String powertrain) {
        this.powertrain = powertrain;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    public void autoAccelerate(int accelerate){
        
        for(int i=0; i<accelerate; i++){
            
            speed=speed+10;
        }
         
        System.out.println("\nAuto Accelerate <" +accelerate +"> Time: From 60 "+" to " +speed +"kmh");
        
    }
    
    public void autoBrake (int brake){
        
        for(int i=0; i<brake; i++){
            
            speed=speed-5;
            
            if (speed<=0){
                
                System.out.println("Speed cant below 0 kmh");
                
                speed=0;
                
                break;
         
            }
            
            
        }
        System.out.println("Auto Brake <" +brake +"> Times: From " + (speed+(brake*5)) +" to " +speed +"kmh");

        
        
    }
    
    public double getRoadTaxPrice(){
        
        double price; 
        
        if (getType().equals("Car") && getPowertrain().equals("Gasoline")){
            
            price = 200;
        }
        else if  (getType().equals("Car") && getPowertrain().equals("Hybrid")){
            
            price = 100;
        }
        else if  (getType().equals("Car") && getPowertrain().equals("Electric")){
            
            price = 50;
        }
        else if  (getType().equals("SUV")||getType().equals("MPV") && getPowertrain().equals("Gasoline")){
            
            price = 300;
        }
        else if  (getType().equals("SUV")||getType().equals("MPV") && getPowertrain().equals("Hybrid")){
            
            price = 150;
        }
        else if  (getType().equals("SUV")||getType().equals("MPV") && getPowertrain().equals("Electric")){
            
            price = 100;
        }
         else if  (getType().equals("Lorry")){
            
            price = 400;
        }
         else{
             price=0;
         }
        
        return price;  
        
    }

    public SpareTyre getSpareTyre() {
        return spareTyre;
    }

    public void setSpareTyre(SpareTyre spareTyre) {
        this.spareTyre = spareTyre;
    }
    
    
    
    
}
