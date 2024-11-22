/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computerapp;

/**
 *
 * @author Nicholas Tan
 */
public class Desktop extends Computer implements ElectronicDevice, DigitalMachine{
   
    private String formFactor;
    private int storageSize;
    private Monitor monitor;
    
    public Desktop (){
        
        formFactor="microtower";
        storageSize=512;
        
    }
    
    public Desktop(Monitor monitor){
        
        this.monitor=monitor;
        
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    @Override
    public double calculatePrice(){
              
        if (getQuantity()<=10){
            
            price=price+1450;
        }
        else if (getQuantity()>=11 && getQuantity()<=50){
            
            price=price+1250;
        }
        else if (getQuantity()>=50){
            
            price=price+1150;
        }
        
        
        return price;        
    }
    
    @Override
    public void showOutput (){
        
       System.out.println("Show output for Desktop"); 
    }
    
    @Override
    public void processOutput(){
        
        System.out.println("Process digital output in Desktop" ); 
    }
    
    
}
