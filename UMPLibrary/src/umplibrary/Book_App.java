/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package umplibrary;

import java.util.Scanner;

public class Book_App {
    
    static int index;
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        Book book = new Book ();
        
        Book[] arrBook= new Book[5];
        
        arrBook[0]= new Book ("Aariz Hassan","Head First Java",2011,"CT001");
        arrBook[1]= new Book ("Aqeel Hussain","History of Silat",2013,"SC003");
        arrBook[2]= new Book ("Fatimah", "My Mother's Garden", 2017, "KD004");
        arrBook[3]= new Book ("Liu Yifei", "The Midnight Library", 1998, "FB002");
        arrBook[4]= new Book ("Ravi Subramanian ", "Computer Code with C#", 2022, "CT004");
        
        
        System.out.println("\n<<  List of Books >>");
        for (int i=0; i<arrBook.length ;i++){
        
            arrBook[i].printBookDetails();
        }
        
        System.out.println("\n<<  The Oldest Book  >>");
        
        int oldest = book.displayOldest(arrBook);
            
        System.out.println("The Oldest Book is published in:  " +oldest);
        
        System.out.println("\n<<  The Newest Book  >>");
        
        int newest = book.displayNewest(arrBook);
            
        System.out.println("The Newest Book is published in:  " +newest);
        
        System.out.println("\n\n<<  Search Author Name  >>");
        String search = scan.nextLine();
        
        for(int i=0; i<arrBook.length ;i++){
            
            if(search.equals(arrBook[i].getAuthor())){
                
                System.out.println("\nFound !!!");
                
                index=i;
            }
        }
         
        arrBook[index].printBookDetails();
    }
}
