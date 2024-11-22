/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computerapp;

/**
 *
 * @author Nicholas Tan
 */
abstract public class Computer {
    
    protected String brand;
    protected double price;
    protected int quantity;
    
    public Computer (){
    
    brand = "Dell";
    price = 2000.00;
    quantity = 3;
    
    }

    public Computer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    abstract protected double calculatePrice();
    
 
}
            
