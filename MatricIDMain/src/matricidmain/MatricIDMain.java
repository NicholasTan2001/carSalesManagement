/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matricidmain;

import java.util.Scanner;

public class MatricIDMain {


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        MatricDetails md = new MatricDetails();
        
        System.out.println("Enter your Matric ID >> ");
        String ID = scan.nextLine();
        
        md.setID(ID);
        
        System.out.println("\n----------Matric Details----------");
        
        md.IDIdentification();
       
    }
    
}
