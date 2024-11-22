/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abby5;

import java.util.Scanner;

public class Abby5 {
    
    
    public static void main(String[] args) {
        Student[] stud = new Student[8];
 
        stud[0] = new Student(25, "John Dow", 'M', true, 90);
        stud[1] = new Student(21, "Jane Dow", 'F', true, 60);
        stud[2] = new Student(23, "Will Beyoan", 'M', false, 39);
        stud[3] = new Student(30, "Smith C", 'M', false, 45);
        stud[4] = new Student(19, "Maria Cari", 'F', false, 12);
        stud[5] = new Student(18, "Donnal Young", 'M', true, 55);
        stud[6] = new Student(17, "Tavarish A", 'M', false, 8);
        stud[7] = new Student(27, "Isabella", 'F', false, 43);
    
    for (int i = 0; i < stud.length; i++){
        
        int index=i+1;
            
        System.out.println("<<< Student " +index +" >>>");
        
        System.out.println("Name : "+stud[i].getName());
        
        System.out.println("Age : " +stud[i].getAge());
        
        System.out.println("Gender : " +stud[i].getGender());
        
        if(stud[i].getFlag()==true){
            System.out.println(stud[i].getName() +" pass OOP subject , good job !");
            
        }
        else{
            System.out.println(stud[i].getName() +" fail OOP subject, see u next sem !!");
            
        }
        System.out.println("\n");
    }    
        
        System.out.println("\n\nMINIMUM & MAXIMUM AGE VALUE");
        
        int minimum=stud[0].getAge();
        String minimumName=stud[0].getName();
        
        for(int i=0;i<stud.length;i++){
            
            if (minimum>stud[i].getAge()){
                minimum=stud[i].getAge();
                minimumName=stud[i].getName();
            }
            
        }
        System.out.println("Youngers => " +minimumName +"(" +minimum +")");
        
        int maximum=stud[0].getAge();
        String maximumName=stud[0].getName();
        
        for(int i=0;i<stud.length;i++){
            
            if (maximum<stud[i].getAge()){
                maximum=stud[i].getAge();
                maximumName=stud[i].getName();
            }
            
        }
        System.out.println("Olders => " +maximumName +"(" +maximum +")");
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("\n\n<< SEARCHING >>");
        System.out.println("Name to Search : ");
        String searchName=scan.nextLine();
        
        for(int i=0; i<stud.length;i++){
            
            if(searchName.equals(stud[i].getName())){
                
                System.out.println(stud[i].getName() +"'s Profile:-");
                System.out.println("\n--------------------------------------");
                
                System.out.println("Age : " +stud[i].getAge());
                System.out.println("Gender : " +stud[i].getGender());
                
                if(stud[i].getFlag()==true){
                    if(stud[i].getGender()=='M'){
                        System.out.println("Result : He PASS OOP subject");
                    }
                    else{
                        System.out.println("Result : She PASS OOP subject");
                    }   
                }
                else{
                    if(stud[i].getGender()=='M'){
                        System.out.println("Result : He FAIL OOP subject");
                    }
                    else{
                        System.out.println("Result : She FAIL OOP subject");
                    }   
                    
                }
            }            
        }
        
        System.out.println("\n\n|-----------------------------------|");
        System.out.println("List of PASS Students");
        System.out.println("|-----------------------------------|");
        
        double numPass=0.00;
                
        for(int i=0;i<stud.length;i++){
           
           if(stud[i].getFlag()==true){           
           
               numPass=numPass+1;
               
               System.out.println(numPass +")" +stud[i].getName() +", " +stud[i].getMark() +"marks");
        
            }
      
        }
        
        double averagePass = (numPass/8)*100;
        
        System.out.println("Total => " +numPass +"/8" +"(" +averagePass +"%)");
        
        System.out.println("\n\n|-----------------------------------|");
        System.out.println("List of FALL Students");
        System.out.println("|-----------------------------------|");
        
        double numFail=0.00;
                
        for(int i=0;i<stud.length;i++){
           
           if(stud[i].getFlag()==false){           
           
               numFail=numFail+1;
               
               System.out.println(numFail +")" +stud[i].getName() +", " +stud[i].getMark() +"marks");
        
            }
      
        }
        
        double averageFail = (numFail/8) *100;
        
        System.out.println("Total => " +numFail +"/8" +"(" +averageFail +"%)");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }    
}
    

