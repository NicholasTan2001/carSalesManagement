/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umplibrary;

/**
 *
 * @author Nicholas Tan
 */
public class Book {
    
    private String author, title, location, genre;
    private int yearPublished;
    CallNumber callNum;
    
    
    public Book (){
    
        author=("");
        title=("");
        yearPublished=(0);
        callNum=null;
        
    }
    
    public Book (String author, String title, int yearPublished, String callNumber){
    
        this.author=author;
        this.title=title;
        this.yearPublished=yearPublished;
        this.callNum = new CallNumber(callNumber);

        
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    
    public void printBookDetails(){
        genre=String.valueOf(callNum.getCallNum().substring(0,2)); 
        location=String.valueOf(callNum.getCallNum().charAt(4));
                     
        System.out.println("\nAuthor >>  " +getAuthor());
        System.out.println("Title >>  " +getTitle());
        System.out.println("Year >>  "+getYearPublished());
        
        if (genre.equals("CT")){
            System.out.println("Genre  >>  Information Technology");
        }
        else if (genre.equals("EE")){
            System.out.println("Genre  >>  Engineering");
            
        }
        else if (genre.equals("SC")){
            System.out.println("Genre  >>  Arts & Social Sciences");
            
        }
        else if (genre.equals("FB")){
            System.out.println("Genre  >>  Novel & Fiction");
            
        }
        else if (genre.equals("KD")){
            System.out.println("Genre  >>  Kids & Comic");
            
        }
        
        if (location.equals("1")){
            System.out.println("Location >> Level One");
        }
        
        else if (location.equals("2")){
            System.out.println("Location >> Level Two");
        }
        
        else if (location.equals("3")){
            System.out.println("Location >> Level Three");
        }
        
        else if (location.equals("4")){
            System.out.println("Location >> Level Four");
        }     
   
    }
   
    
    public int displayOldest (Book[] arrBook){
        
        int oldest=arrBook[0].getYearPublished();
        
        for(int i=0;i<arrBook.length;i++){
            
            if(arrBook[i].getYearPublished()<oldest){
                
                oldest=arrBook[i].getYearPublished();
                
            }
            
            
        }
        
       return oldest;
    }
    
    public int displayNewest(Book[] arrBook){
        
        int newest=arrBook[0].getYearPublished();
        
        for(int i=0;i<arrBook.length;i++){
             
            if(arrBook[i].getYearPublished()>newest){
                
                newest=arrBook[i].getYearPublished();
                
            }
        }
        return newest;
    }
    
    
    
    
    
}
