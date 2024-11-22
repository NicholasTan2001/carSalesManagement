/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CD21062_hot_set_1;

import java.util.Scanner;
/**
 *Name: Nicholas Tan Kae Jer
 *Student ID: CD21062
 *Lab Group: 03B
 * Task: Hot
 * Set: 1
 */
public class BranchSaleApp {

 
    public static void main(String[] args) {
        BranchInfo branchInfo= new BranchInfo();
        
        BranchInfo[] arrBranch= new BranchInfo[5];
        
        arrBranch[0]=new BranchInfo ("Aariz Hassan", "Joshua Ng","WLPPJY2002", 25, 1000, 35000.0);
        arrBranch[1]=new BranchInfo ("Aqeel Hussain", "Lydiawati","KDHAOR2101", 30, 1200, 45000.0);
        arrBranch[2]=new BranchInfo ("Fatimah", "Nurul Nadia","PHGPKN2202", 20, 1300, 55000.0);
        arrBranch[3]=new BranchInfo ("Liu Yifei", "Iman","JHRBPT1903", 15, 1400, 65000.0);
        arrBranch[4]=new BranchInfo ("Ravi Subramanian", "Anas","SWKKCH2003", 20, 1500, 75000.0);
    
        System.out.println("TOP 5 BRANCH WITH HIGHTEST SALE (MONTH: MAY)");
        
        System.out.println("\n********************Branch Information********************");
        
        for (int a=0; a<arrBranch.length;a++){
        
            arrBranch[a].printBranchInfo();
        
        }
        
        
            
        double totalSale=branchInfo.calcTotalSale(arrBranch);
        
        System.out.println("\nTotal sale of top 5 branch is RM: "+totalSale);
        
        double saleAvarage=branchInfo.calcSaleAverage(arrBranch);
        
        System.out.println("Average sale of top 5 branch is RM: "+saleAvarage);
        
        branchInfo.getHighestSales(arrBranch);
      
        branchInfo.getLowestCustomer(arrBranch);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nSEARCH: Input Onwer Name >> ");
        String oName=scan.nextLine();
        
        branchInfo.searchByOnwer(oName, arrBranch);
        
        
        
    }
    
}
