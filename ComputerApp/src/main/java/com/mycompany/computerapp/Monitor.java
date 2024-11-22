/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computerapp;

/**
 *
 * @author Nicholas Tan
 */
public class Monitor {
    
    private int brigthness;
    private double screenSize;

    public Monitor() {
        brigthness = 250;
        screenSize = 17;
    }
    
    public int getBrigthness() {
        return brigthness;
    }

    public void setBrigthness(int brigthness) {
        this.brigthness = brigthness;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    
    
    
    
    
}
