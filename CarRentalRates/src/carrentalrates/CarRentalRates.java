/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrentalrates;


public class CarRentalRates {

   
    public static void main(String[] args) {
        
         Customer cusObj = new Customer("Jane Dow", "900431-06-3434", 27,'F');
         
         Rate ratObj = new Rate(); 
         
         Vehicle vehObj = new Vehicle("Proton", "Persona", 2015, "Silver Metallic"); 
         
         ratObj.setRentDuration(2);
         ratObj.setMileage(100);
           
         
         System.out.println("ABC Car Rental Service Sdn. Bhd. ");
         
         System.out.println("\nCustomer Information");
         
         cusObj.printDetails();
         
         System.out.println("\nVehicle Information");
         
         vehObj.printVehicleDetails();
         
         System.out.println("\nRental Rate");
         
         ratObj.printRentalDetails(vehObj);
         

         
    }
    
}
