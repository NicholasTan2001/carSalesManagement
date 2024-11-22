/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricidmain;


public class MatricDetails {
    private String ID, program, faculty;
    private int year;
    
    public MatricDetails(){
        ID=("");
        program=("");
        faculty=("");
        year=0;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void IDIdentification(){
        
        String facultyCode = String.valueOf(ID.charAt(0));
        String programCode = String.valueOf(ID.charAt(1));
        int yearCode = Integer.valueOf(ID.substring(2,4)); 
        
        setYear(yearCode);
        
        if(facultyCode.equals("C")){
            
            faculty="FKOM";
            
            if(programCode.equals("C")){
                
                program="Diploma";    
            }
            else if (programCode.equals("A")){
                
                program="Computer System and Networking";
            }
            else if (programCode.equals("D")){
                
                program="Graphic and Multimedia";
            }
            else if (programCode.equals("B")){
                
                program="Software Engineering";
            }
            else if (programCode.equals("Y")){
                
                program="Cyber Security";
            }
            
        }
        else if(facultyCode.equals("M")){
                    
             faculty="FTKMA";     
             
             if(programCode.equals("A")){
                
                program="Mechanical Engineering";
                
            }
             else if(programCode.equals("H")){
                
                program="Mechanical Automotive";
                
            }
        }
        
        System.out.println("Faculty >> "+getFaculty());
        
        System.out.println("Program >> "+getProgram());
        
        System.out.println("Year >> 20"+getYear());           
        
        
    }          
        
}
