/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeesales;

/**
 *
 * @author syafi
 */
public class ShippingCost {
    int price;
    
    public ShippingCost(){
        
    }
    
    public void ShippingCostTable(){
        System.out.println("\n");
        System.out.println("------------------------Shipping Cost for Coffee Bean-------------------------------");
        
        for (int colLabel = 50 ; colLabel<=500; colLabel +=50){
            System.out.format("%8d", colLabel);
        }
        System.out.println("");
        System.out.println("");
        for (int weight= 5; weight <= 50; weight +=5){
            System.out.format("%3d", weight);
            
            for(int dest = 50; dest<=500; dest +=50){
                price = weight * dest * 10;
                System.out.format("%8d", price);
            }
            
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }
}
