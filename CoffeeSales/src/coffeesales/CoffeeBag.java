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
public class CoffeeBag {
    private String coffeeType;
    private int bagSold, bagWeight;
    private double pricePerKg;
    private double taxRate;
    private int discount;
    
    public CoffeeBag(String coffeeType, int bagSold, int bagWeight, double pricePerKg){
        this.coffeeType = coffeeType;
        this.bagSold = bagSold;
        this.bagWeight = bagWeight;
        this.pricePerKg = pricePerKg;                 
        taxRate = 7.25;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public int getBagSold() {
        return bagSold;
    }

    public void setBagSold(int bagSold) {
        this.bagSold = bagSold;
    }

    public int getBagWeight() {
        return bagWeight;
    }

    public void setBagWeight(int bagWeight) {
        this.bagWeight = bagWeight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double getTaxRate() {
        return taxRate;
    }
       
       public int getDiscountValue(){
           if (coffeeType.equals("Arabica")){
               if(bagSold >=20 && bagSold<=50){
                   discount = 5;
               }
               else if(bagSold >=51 && bagSold<=100){
                   discount = 7;
               }
               else if(bagSold > 100){
                   discount = 10;
               }
               else{
                   discount = 0;
               }
           }
           else if (coffeeType.equals("Robusta")){
               if(bagSold >=10 && bagSold<=25){
                   discount = 7;
               }
               else if(bagSold >=26 && bagSold<=50){
                   discount = 10;
               }
               else if(bagSold > 50){
                   discount = 15;
               }
               else{
                   discount = 0;
               }
           }
           else if (coffeeType.equals("Excelsa")){
               if(bagSold >=50 && bagSold<=70){
                   discount = 10;
               }
               else if(bagSold >=71 && bagSold<=100){
                   discount = 15;
               }
               else if(bagSold > 100){
                   discount = 20;
               }
               else{
                   discount = 0;
               }
           }
           else {
               if(bagSold >=15 && bagSold<=30){
                   discount = 5;
               }
               else if(bagSold >=31 && bagSold<=60){
                   discount = 10;
               }
               else if(bagSold > 60){
                   discount = 15;
               }
               else{
                   discount = 0;
               }
           }
           
           return discount;
       }
       
       //Switch Statement
//       public int getDiscountValue(){
//        switch (coffeeType) {
//            case "Arabica":
//                if(bagSold >=20 && bagSold<=50){
//                    discount = 5;
//                }
//                else if(bagSold >=51 && bagSold<=100){
//                    discount = 7;
//                }
//                else if(bagSold > 100){
//                    discount = 10;
//                }
//                else{
//                    discount = 0;
//                }break;
//            case "Robusta":
//                if(bagSold >=10 && bagSold<=25){
//                    discount = 7;
//                }
//                else if(bagSold >=26 && bagSold<=50){
//                    discount = 10;
//                }
//                else if(bagSold > 50){
//                    discount = 15;
//                }
//                else{
//                    discount = 0;
//                }break;
//            case "Excelsa":
//                if(bagSold >=50 && bagSold<=70){
//                    discount = 10;
//                }
//                else if(bagSold >=71 && bagSold<=100){
//                    discount = 15;
//                }
//                else if(bagSold > 100){
//                    discount = 20;
//                }
//                else{
//                    discount = 0;
//                }break;
//            default:
//                if(bagSold >=15 && bagSold<=30){
//                    discount = 5;
//                }
//                else if(bagSold >=31 && bagSold<=60){
//                    discount = 10;
//                }
//                else if(bagSold > 60){
//                    discount = 15;
//                }
//                else{
//                    discount = 0;
//                }break;
//        }
//           
//           return discount;
//       }
    
       public double totalPrice(){
           double totalPrice = bagWeight * bagSold * pricePerKg;
           return totalPrice;
       }
       
       
       public double totalPriceWithTax(){
           double totalPriceWithTax = getPriceAfterDiscount()+ (getPriceAfterDiscount()* (taxRate/100));
           return totalPriceWithTax;
       }
       
       public double getPriceAfterDiscount(){
           double priceAfterDiscount = totalPrice() - (totalPrice() * discount/100);
           return priceAfterDiscount;
       }
       
       public void PrintSale(){
          System.out.println("-------------------------------------------------");
          System.out.println("Coffee Type: " + coffeeType);
          System.out.println("Number of Bag Sold: " + bagSold );
          System.out.println("Weight per Bag: " + bagWeight + "kg");
          System.out.println("Price per KG: RM" + pricePerKg);
          System.out.println("Total price: RM" + totalPrice());
          System.out.println("Discount rate: " + getDiscountValue() + "%");
          System.out.println("Discounted Price: RM" + getPriceAfterDiscount());
          System.out.println("Tax rate: " + taxRate + "%");
          System.out.println("Price with Tax: RM" + totalPriceWithTax());
          System.out.println("-------------------------------------------------");
        
       }
}
