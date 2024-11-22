/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computerapp;

import java.util.Scanner;
/**
 *
 * @author Nicholas Tan
 */
public class ComputerApp {

    public static void main(String[] args) {
        
        Computer[] mycomputer = new Computer [4];
        Scanner scan = new Scanner(System.in);
        

        
        for (int i=0; i<mycomputer.length;i++){
           if(i<2){
            System.out.println("CREATING RECODR FOR LAPTOP");
            System.out.println("Please enter new laptop type: ");
            String type = scan.nextLine();
            
            System.out.println("Please enter new laptop brand: ");
            String brand = scan.nextLine();
            System.out.println("Please enter new laptop brand: ");
            double screenSize = scan.nextDouble();
            
            System.out.println("\n");
            
            mycomputer[i]=new Laptop(type, screenSize, brand);
           }
            
           else{
                 
             System.out.println("CREATING RECODR FOR Desktop");
             System.out.println("Please enter new Desktop From Factor: ");
             ((Desktop)mycomputer[i]).setFormFactor(scan.nextLine());
             System.out.println("Please enter new Desktop Storage Size: ");
             ((Desktop)mycomputer[i]).setStorageSize(scan.nextInt());
             
            }
        }
        
        for(int i=0;i<mycomputer.length;i++){
           if(mycomputer[i] instanceof Laptop){
            System.out.println("\nDISPLAY RECORD FOR LAPTOP " +(i+1));
            System.out.println("Type: " +((Laptop)mycomputer[i]).getType());
            System.out.println("Brand: "+((Laptop)mycomputer[i]).getBrand());           
            System.out.println("Screen: "+((Laptop)mycomputer[i]).getScreenSize());  
            System.out.println("Memory Size: "+((Laptop)mycomputer[i]).getMemorySize());
            System.out.println("Memory Size: "+DigitalMachine.BIT);
            ((Laptop)mycomputer[i]).processOutput();
            System.out.println("Input from: "+ElectronicDevice.INPUT);
            System.out.println("Output from: "+ElectronicDevice.OUTPUT);
            ((Laptop)mycomputer[i]).showOutput();
           }
           else
           {
            System.out.println("\nDISPLAY RECORD FOR Desktop " +(i+1));
            System.out.println("Type: " +((Desktop)mycomputer[i]).getStorageSize());
            System.out.println("Memory Size: "+DigitalMachine.BIT);
            ((Desktop)mycomputer[i]).processOutput();
            System.out.println("Input from: "+ElectronicDevice.INPUT);
            System.out.println("Output from: "+ElectronicDevice.OUTPUT);
            ((Desktop)mycomputer[i]).showOutput();
           }
        } 
    }
}
