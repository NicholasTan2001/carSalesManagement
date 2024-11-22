/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalrates;


public class Customer {
    
    private String name, ICNum;
    private char gender;
    private int age;
    
    public Customer (String name, String ICNum, int age, char gender){
        
        this.name= name;
        this.ICNum=ICNum;
        this.age=age;
        this.gender=gender;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getICNum() {
        return ICNum;
    }

    public void setICNum(String ICNum) {
        this.ICNum = ICNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void printDetails(){
        
        System.out.println("\nName : "+getName());
        System.out.println("IC Number : "+getICNum());
        System.out.println("Age : "+getAge());
        System.out.println("Gender : "+getGender());
        
    }
    
    
}
