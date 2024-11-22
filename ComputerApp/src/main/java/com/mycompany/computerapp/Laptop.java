/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computerapp;

/**
 *
 * @author Nicholas Tan
 */
public class Laptop extends Computer implements ElectronicDevice, DigitalMachine{
    
    private String type;
    private double screenSize;
    private int memorySize;
    private Monitor monitor;

    public Laptop(String type, double screenSize, String brand) {
        super(brand);
        this.type = type;
        this.screenSize = screenSize;
        this.memorySize=8;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    public void upgradeMemory(){
        
        setMemorySize(memorySize+8);
        
    }
    
     public void downgradeMemory(){
        
        setMemorySize(memorySize-4);
        
    }
     
     @Override
    public double calculatePrice(){
              
        if (getQuantity()<=10){
            
            price=price+2460;
        }
        else if (getQuantity()>=11 && getQuantity()<=50){
            
            price=price+2260;
        }
        else if (getQuantity()>=50){
            
            price=price+2160;
        }
        
        
        return price;        
    }
    
    @Override
    public void showOutput (){
        
        System.out.println("\nShow output for Laptop");  

                
    }
    
    @Override
    public void processOutput(){
        
        System.out.println("Process digital output in Laptop" );
        
        
    };
    
}
