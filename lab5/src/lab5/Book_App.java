/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

public class Book_App {

    public static void main(String[] args) {
        // >>IT - Info. Tech, EE - Enginering ,FB - Fiction, SC - Social Sc, KD - Kids  ,
        Book books = new Book();
        Book[] arrBook = new Book[5];
        arrBook[0] = new Book("Aariz Hassan", "Head First Java", 2011, "CT001");
        arrBook[1] = new Book("Aqeel Hussain", "History of Silat", 2013, "SC003");
        arrBook[2] = new Book("Fatimah", "My Mother's Garden", 2016, "KD004");
        arrBook[3] = new Book("Liu Yifei", "The Midnight Library", 1998, "FB002");
        arrBook[4] = new Book("Ravi Subramanian", "Computer Code with C#", 2022, "CT004");
        
        
        //print books info
        System.out.println("<< List of Books >>\n");
        for(int i = 0; i < arrBook.length; i++){

            arrBook[i].printBookDetails();
            System.out.println("");
        }
        
        
        System.out.println("The oldest book is pubished in: " + books.displayOldest(arrBook));
        System.out.println("The newest book is pubished in: " + books.displayNewest(arrBook));
        System.out.println("");
        
         //Search 
        Scanner cari = new Scanner(System.in);
        
        System.out.print("SEARCH:: Input Author Name >> ");
        String authorSearch = cari.nextLine();
        
        int index = books.searchBook(authorSearch, arrBook);
            
        System.out.println("");
        arrBook[index].printBookDetails();
    }
    
}
