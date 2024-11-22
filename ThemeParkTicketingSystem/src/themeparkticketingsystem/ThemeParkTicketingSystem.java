/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package themeparkticketingsystem;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;
/**
 *
 * @author Nicholas Tan
 */
public class ThemeParkTicketingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Customer[] cust = new Customer[2];
        
        Staff staff = null;
        Visitor visitor = null;
        
        Attractions fantasyGarden = new FantasyGarden();
        Attractions galaxyStation = new GalaxyStation();
                
        System.out.println("INPUT PAYMENT INFORMATION");
        System.out.println("_________________________");
        
 for (int i=0; i<cust.length; i++){            
        
        
        System.out.println("Please enter customer type (enter number) : [1-Staff, 2-Visitor] : ");
        int customerType = scan.nextInt();
        
        System.out.println("Please choose Attractions (enter number) : [1-Fantasy Garden, 2-Galaxy Station] : ");
        int attraction = scan.nextInt();
        
        if (customerType==1){
            
            if(attraction==1){
                
                cust[i]=new Staff(fantasyGarden);                                     
            }
            else{
                
                cust[i]=new Staff(galaxyStation);
      
            }
            
            System.out.println("Enter Staff Name: ");
            cust[i].setCustName(scan.next());
            
            System.out.println("Enter Staff Age: ");
            cust[i].setCustAge(scan.nextInt());
            
            scan.nextLine();
            System.out.println("Enter Staff Type[management/admin/technical]: ");
            ((Staff)cust[i]).setStaffType(scan.nextLine());
            
            System.out.println("Enter games selection (enter number) " + "[Fantasy Garden: " + "\n\t1-Cosmo Theater," +"\n\t2-Honey Bump," +"\n\t3-Crazy Bus]" +"\n[Galaxy Station:" + "\n\t1-Dizzy Izzy," + "\n\t2-Supersonic Odyssey," + "\n\t3-Spinning Object]: ");
            cust[i].getAttraction().selectGameAndPrice(scan.nextInt());
        }
        else{
            
             if(attraction==1){
                
                cust[i]=new Visitor(fantasyGarden);                                     
            }
            else{
                
                cust[i]=new Visitor(galaxyStation);
      
            }
            
            System.out.println("Enter Visitor Name: ");
            cust[i].setCustName(scan.next());
            
            System.out.println("Enter Visitor Age: ");
            cust[i].setCustAge(scan.nextInt());
            
            scan.nextLine();
            System.out.println("Enter Staff Membership [platinium/gold/silver]: ");
            ((Visitor)cust[i]).setMembership(scan.nextLine());
            
            System.out.println("Enter games selection (enter number) " + "[Fantasy Garden: " + "\n\t1-Cosmo Theater," +"\n\t2-Honey Bump," +"\n\t3-Crazy Bus]" +"\n[Galaxy Station:" + "\n\t1-Dizzy Izzy," + "\n\t2-Supersonic Odyssey," + "\n\t3-Spinning Object]: ");
            cust[i].getAttraction().selectGameAndPrice(scan.nextInt());
               
        }
 }
     System.out.println("DISPLAY PAYMENT INFORMATION");
     System.out.println("___________________________");
     
     for (int a = 0; a <cust.length; a++){
         
        if(cust[a] instanceof Staff){
         
            System.out.println("Staff Name: " +cust[a].getCustName());
            System.out.println("Staff Age: " +cust[a].getCustAge());
            System.out.println("Staff Type: " +((Staff)cust[a]).getStaffType());
            System.out.println("Staff Game Name: " +cust[a].getAttraction().getGameName());
            System.out.println("Game Price: RM" +cust[a].getAttraction().getGamePrice());
            System.out.println("Total Ticket Price: " +cust[a].totalTicketPayment());
            
            
        }  
        else{
            
            System.out.println("Visitor Name: " +cust[a].getCustName());
            System.out.println("Visitor Age: " +cust[a].getCustAge());
            System.out.println("Visitor Membership: " +((Visitor)cust[a]).getMembership());
            System.out.println("Visitor Game Name: " +cust[a].getAttraction().getGameName());
            System.out.println("Game Price: RM" +cust[a].getAttraction().getGamePrice());
            System.out.println("Total Ticket Price: " +cust[a].totalTicketPayment());
            
            
            
            
        }
            
     }
     
         
         
         
         
         
         
         
     }
    
}        
        
        
        
        
        
    
            
            
            
        
       

    
    
    
    
    

