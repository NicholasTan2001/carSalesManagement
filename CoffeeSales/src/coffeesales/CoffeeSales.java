/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeesales;

import java.util.Scanner;

/**
 *
 * @author syafi
 */
public class CoffeeSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        //Array of Objects
//        CoffeeBag[] bag = new CoffeeBag[4];
//        bag[0] = new CoffeeBag("Arabica", 5, 2, 25.00);
//        bag[1] = new CoffeeBag("Robusta", 30, 3, 50.00);
//        bag[2] = new CoffeeBag("Excelsa", 75, 5, 30.00);
//        bag[3] = new CoffeeBag("Liberica", 105, 6, 40.00);
        

        //ask user to enter number of data they want to input
        System.out.println("How many array you want to enter?:");
        int length = scan.nextInt();
        
        CoffeeBag[] bag = new CoffeeBag[length];

        
        //Array of object with user input
        for(int i=0; i < bag.length; i++){
                        
            System.out.println("Enter Coffee Type " + (i+1) +":" );
            String type = scan.next();
                        
            System.out.println("Enter number of Bag Sold " + (i+1) +" :" );
            int bagsold = scan.nextInt();
                        
            System.out.println("Enter Bag Weight " + (i+1) +" :" );
            int weight = scan.nextInt();
            
            System.out.println("Enter Price per Kg " + (i+1) +" :" );
            double priceperkg = scan.nextDouble();
            System.out.println("\n");
            
            bag[i] = new CoffeeBag(type, bagsold, weight, priceperkg);
        }
        
        
        //display output using array
        for (int i = 0; i < bag.length; i++) {
            bag[i].PrintSale();
        }
        
        //create more than 1 object
//        CoffeeBag bag1, bag2, bag3, bag4;
//        bag1 = new CoffeeBag("Arabica", 5, 2, 25.00);
//        bag2 = new CoffeeBag("Robusta", 30, 3, 50.00);
//        bag3 = new CoffeeBag("Excelsa", 75, 5, 30.00);
//        bag4 = new CoffeeBag("Liberica", 105, 6, 40.00);
        
//        bag1.PrintSale();
//        bag2.PrintSale();
//        bag3.PrintSale();
//        bag4.PrintSale();
        

        //nested for loop
        ShippingCost ship = new ShippingCost();
        ship.ShippingCostTable();
        
        
//        bag1.totalPrice();
//        bag1.totalPriceWithTax();
//        
//        System.out.println("Coffee type: " + bag1.getCoffeeType());
//        System.out.println("Number of bags sold: " + bag1.getBagSold());
//        System.out.println("Weight per bag: " + bag1.getBagWeight()+ " kg");
//        System.out.println("Price per kilogram: RM" + bag1.getPricePerKg());
//        System.out.println("Sales tax: " + bag1.getTaxRate() + " %");
//        System.out.println("\n");
//        System.out.println("Total price: $" + bag1.totalPriceWithTax());
    }
    
}
