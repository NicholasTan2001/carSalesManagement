/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleapp;

/**
 *
 * @author Nicholas Tan
 */
public class SpareTyre {
    
    private int rimDiameter, width, aspectRation;
    private char speedRating;

    public SpareTyre(int rimDiameter, int width, int aspectRation, char speedRating) {
        this.rimDiameter = rimDiameter;
        this.width = width;
        this.aspectRation = aspectRation;
        this.speedRating = speedRating;
    }
    
    public int getRimDiameter() {
        return rimDiameter;
    }

    public void setRimDiameter(int rimDiameter) {
        this.rimDiameter = rimDiameter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getAspectRation() {
        return aspectRation;
    }

    public void setAspectRation(int aspectRation) {
        this.aspectRation = aspectRation;
    }

    public char getSpeedRating() {
        return speedRating;
    }

    public void setSpeedRating(char speedRating) {
        this.speedRating = speedRating;
    }
    
    public int maximumSpeed(){
        
        int maximumSpeed=0;
        
        if (speedRating=='R'){
            
            maximumSpeed=170; 
        }
        else if (speedRating=='S'){
            
            maximumSpeed=180; 
        }
        else if (speedRating=='T'){
            
            maximumSpeed=190; 
        }
        
        else if (speedRating=='U'){
            
            maximumSpeed=200; 
        }
        else if (speedRating=='H'){
            
            maximumSpeed=210; 
        }
        else if (speedRating=='V'){
            
            maximumSpeed=240; 
        }
        
    return maximumSpeed;
    }
    
    
}
