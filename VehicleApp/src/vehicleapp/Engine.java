/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleapp;

/**
 *
 * @author Nicholas Tan
 */
public class Engine {
    
    private String engineType;
    private int valveQuantity;

    public Engine() {
        engineType =null;
        valveQuantity=0;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getValveQuantity() {
        return valveQuantity;
    }

    public void setValveQuantity(int valveQuantity) {
        this.valveQuantity = valveQuantity;
    }
    
    
}
