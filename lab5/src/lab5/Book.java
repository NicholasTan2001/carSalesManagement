 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author FSKKP UMP
 */
public class Book {
    private String author, title;
    private int yearPublished;    
    private CallNumber callNum;

    public Book(){
        author = null;
        title = null;
        yearPublished = 0;
        callNum = null;
    }
    public Book(String author, String title, int yearPublished, String callNumber) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.callNum = new CallNumber(callNumber);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }   
    
    public void printBookDetails(){
  
        String level = Character.toString(String.valueOf(callNum.getCallNum()).charAt(4));
        String genre = String.valueOf(callNum.getCallNum()).substring(0,2);
        
        System.out.println("Author   >> " + getAuthor());
        System.out.println("Title    >> " + getTitle());
        System.out.println("Year     >> " + getYearPublished());
        
        if (genre.equals("CT"))
            System.out.println("Genre    >> Information Technology");
        else if (genre.equals("EE"))
            System.out.println("Genre    >> Engineering");
        else if (genre.equals("SC"))
            System.out.println("Genre    >> Arts & Social Sciences");
        else if (genre.equals("FB"))
            System.out.println("Genre    >> Novel & Fiction");
        else if (genre.equals("KD"))
            System.out.println("Genre    >> Kids & Comic");
        else
            System.out.println("Genre not Listed");
        
        if (level.equals("1"))
            System.out.println("Location >> Level One");
        else if (level.equals("2"))
            System.out.println("Location >> Level Two");
        else if (level.equals("3"))
            System.out.println("Location >> Level Three");
        else if (level.equals("4"))
            System.out.println("Location >> Level Four");
        else if (level.equals("5"))
            System.out.println("Location >> Level Five");
        else
            System.out.println("Code not Valid");
        

    }
    
    public int displayOldest(Book[] arrBook){
           
           int oldest = arrBook[0].getYearPublished();
           
           
           for (int i=0; i<arrBook.length;i++){
               if (arrBook[i].yearPublished<= oldest){
                   oldest = arrBook[i].yearPublished;
                    
               }
           }    
                        
           return oldest; 
    }
    
     public int displayNewest(Book[] arrBook){
         
           
          int newest = arrBook[0].getYearPublished();
           
           
           for (int i=0; i<arrBook.length;i++){
               if (arrBook[i].yearPublished>= newest){
                   newest = arrBook[i].yearPublished;
                    
               }
           }    
                        
           return newest; 
    }
    
     public int searchBook(String authorSearch, Book[] arrBook){
         
        int index = 0;
        
        for (int i = 0; i < arrBook.length; i++){
            if (arrBook[i].getAuthor().equals(authorSearch))
                index = i;  
        }
        
         return index;
     }
}
