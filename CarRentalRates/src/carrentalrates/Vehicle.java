/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalrates;


public class Vehicle {
    
    private String maker, model, colour;
    private int year;
    
    public Vehicle (String maker, String model, int year, String colour){
        
        this.maker=maker;
        this.model=model;
        this.year=year;
        this.colour=colour;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void printVehicleDetails(){
        
        System.out.println("\nMaker : " +getMaker());
        System.out.println("Model : " +getModel());
        System.out.println("Year : " +getYear());
        System.out.println("Colour : " +getColour());


    }
}
