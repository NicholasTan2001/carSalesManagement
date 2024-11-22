/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicleapp;

import java.util.Scanner;

/**
 *
 * @author Nicholas Tan
 */

public class VehicleApp {

    
    public static void main(String[] args) {
        //Task 1//
        
        Vehicle vehicle = new Vehicle("Car","Manual","Gasoline");
        
        vehicle.autoAccelerate(2);
        
        vehicle.autoBrake(5);
        
        
        
        System.out.println(vehicle.getPowertrain() +" " +vehicle.getType() +"with " +vehicle.getTransmission() + " trasmission");
        
        System.out.println("\n");
        
        System.out.println(vehicle.getPowertrain() +" " +vehicle.getType() +"with " +vehicle.getTransmission() +" trasmission");

        System.out.println("Roadtax Price = RM " +vehicle.getRoadTaxPrice());
             
        
        //Task 2//
        Scanner scan = new Scanner(System.in);
        
        SpareTyre spareTyre = new SpareTyre(18, 225, 45, 'V');
        
        Vehicle vehicle1 = new Vehicle("Car","Manual","Electric", spareTyre);
                
        System.out.println("\n\nINPUT  SPARE TYRE INFO & CREATE SPARE TYRRE OBJECT");
        
        System.out.println("\nCREATE VEHICLE OBJECT");
        
        System.out.println("Current Maximum Speed: " +vehicle1.getSpareTyre().maximumSpeed());
        
        
        System.out.println("\nINPUT ENGINE");
        
        System.out.println("Enter Engine Type: ");
        vehicle1.getEngine().setEngineType(scan.nextLine());
        
        System.out.println("Enter Valve Type");
        vehicle1.getEngine().setValveQuantity(scan.nextInt());
        
        System.out.println("OUTPUT");
        System.out.println("Engine Type: " +vehicle1.getEngine().getEngineType());
        System.out.println("Valve Quantity: "+vehicle1.getEngine().getValveQuantity());
        
        //Task 3//
        Car car = new Car("Proton",1602,"Car","Manual","Electric");
        
        SpareTyre spareTyre1 = new SpareTyre(17, 195, 45, 'R');
        
        Vehicle car1  = new Car ("Proton",1602,"Car","Manual","Electric", spareTyre1);
                
        
        System.out.println("\n\n*******Roadtax Price = " +((Car)car1).getRoadTaxPrice()); 
         
        System.out.println("CC: " +((Car)car1).getLiters());
        
        System.out.println("Car Modal: " +((Car)car1).getModel());
        
        System.out.println("Car Power: " +car1.getPowertrain());
        
        System.out.println("\nCOMPOSITION");
        
        System.out.println("Rim Diameter: " +car1.getSpareTyre().getRimDiameter());
        
        System.out.println(car1.getSpareTyre().getWidth());
        
        //Task 4//
        Vehicle lorry = new Lorry (spareTyre1);
        
        System.out.println("\n\nINPUT FOR LORRY");
        
        scan.nextLine();
        
        System.out.println("Enter brand for lorry: ");
        ((Lorry)lorry).setBrand(scan.nextLine());
        
        System.out.println("Enter transmission for lorry: ");
        lorry.setTransmission(scan.nextLine());
        
        System.out.println("Enter lorry powertrain: ");
        lorry.setPowertrain(scan.nextLine());
        
       
        System.out.println("\nOUTPUT");
        System.out.println("Lorry Brand: " +((Lorry)lorry).getBrand());
        System.out.println("Lorry Powertrain: " + lorry.getPowertrain());
        System.out.println("Lorry Transmission: " + lorry.getTransmission());
        System.out.println("Lorry RoadTax Price: " + lorry.getRoadTaxPrice());
    }
    
}
