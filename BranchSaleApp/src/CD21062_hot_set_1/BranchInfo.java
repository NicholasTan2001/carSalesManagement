/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CD21062_hot_set_1;


public class BranchInfo {
    
    private String branchOnwer,branchManager,branchCode;
    private int numStaff,totalCustomer;
    private double totalSales;
    
    public BranchInfo(){
        branchOnwer=("");
        branchManager=("");
        branchCode=("");
        numStaff=0;
        totalCustomer=0;
        totalSales=0.00;
        
    }
    
    public BranchInfo(String branchOnwer, String branchManager,String  branchCode,int  numStaff,int totalCustomer,double totalSales){
        this.branchManager=branchManager;
        this.branchOnwer=branchOnwer;
        this.branchCode=branchCode;
        this.numStaff=numStaff;
        this.totalCustomer=totalCustomer;
        this.totalSales=totalSales;
        
    }

    public String getBranchOnwer() {
        return branchOnwer;
    }

    public void setBranchOnwer(String branchOnwer) {
        this.branchOnwer = branchOnwer;
    }

    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public int getNumStaff() {
        return numStaff;
    }

    public void setNumStaff(int numStaff) {
        this.numStaff = numStaff;
    }

    public int getTotalCustomer() {
        return totalCustomer;
    }

    public void setTotalCustomer(int totalCustomer) {
        this.totalCustomer = totalCustomer;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    
    
    public void printBranchInfo(){

        String stateCode = String.valueOf(branchCode.substring(0,3));
        String cityCode = String.valueOf(branchCode.substring(3,6));
        String yearCode = String.valueOf(branchCode.substring(6,8));
        String numCode = String.valueOf(branchCode.substring(9,10));
        
        String state[]={"Sabah","Sarawak","Johor","Pahang","Wilayah Persekutuan","Kedah"};
        String city[]={"Kota Kinabalu", "Tawau", "Kuching", "Samarahan", "Johor Bahru", "Batu Pahat", "Kuantan", "Pekan", "Putrajaya", "Labuan", "Alor Setar", "Sungai Petani"};
        
        System.out.println("\nBranch Code >> " +branchCode);
        
        if(stateCode=="SAB"){
            
            if(cityCode=="KKI"){
                
                System.out.println("Branch Location >> " +city[0] +state[0]);
            }
            else if (cityCode=="TWU"){
                
                System.out.println("Branch Location >> "+city[1] +state[0]);
                
            }
        }
        else if(stateCode=="SWK"){
            
            if(cityCode=="KCH"){
                
                System.out.println("Branch Location >> " +city[2] +state[1]);
            }
            else if (cityCode=="SMR"){
                
                System.out.println("Branch Location >> "+city[3] +state[1]);
            }
        }
        else if(stateCode=="JHR"){
            
            if(cityCode=="JBR"){
                
                System.out.println("Branch Location >> " +city[4] +state[2]);
            }
            else if (cityCode=="BPT"){
                
                System.out.println("Branch Location >> "+city[5] +state[2]);
            }
        } 
        else if(stateCode=="PHG"){
            
            if(cityCode=="KUA"){
                
                System.out.println("Branch Location >> " +city[6] +state[3]);
            }
            else if (cityCode=="PKN"){
                
                System.out.println("Branch Location >> "+city[7] +state[3]);
            }
        }
        else if(stateCode=="WLP"){
            
            if(cityCode=="PJY"){
                
                System.out.println("Branch Location >> " +city[8] +state[4]);
            }
            else if (cityCode=="LBN"){
                
                System.out.println("Branch Location >> "+city[9] +state[4]);
            }
        }  
        else if(stateCode=="KDH"){
            
            if(cityCode=="AOR"){
                
                System.out.println("Branch Location >> " +city[10] +state[5]);
            }
            else if (cityCode=="SNP"){
                
                System.out.println("Branch Location >> "+city[11] +state[5]);
            }
        } 
        
        System.out.println("Openin Year >> 20"+yearCode);
        
        System.out.println("Branch no. >> "+numCode);
        
        System.out.println("Onwer Name >> "+branchOnwer);
        
        System.out.println("Manager Name >> "+branchManager);
        
        System.out.println("No. of Staff >>" +numStaff);
        
        System.out.println("Total Customer >> "+totalCustomer);
        
        System.out.println("Total Sales >> "+totalSales);
 
    }
     
    public double calcTotalSale (BranchInfo[] arrBranch){
        
        double totalSale=0.0;
        
        for (int a=0; a<arrBranch.length;a++){
            
            totalSale=totalSale+arrBranch[a].totalSales;
            
        }
            
        return totalSale;
    }
    
    public double calcSaleAverage (BranchInfo[] arrBranch){
        
        double saleAverage, finalSales=0.0;
        
        for (int a=0; a<arrBranch.length;a++){
            
            finalSales=finalSales+arrBranch[a].totalSales;
            
        }
        
        saleAverage=finalSales/arrBranch.length;
        
        return saleAverage;
    }
     
    public void getHighestSales(BranchInfo[] arrBranch){
        
        double highest=arrBranch[0].totalSales;
        
        int index=0;
        
        for(int a=0;a<arrBranch.length;a++){
            
            if(arrBranch[a].totalSales>highest){
                
                highest=arrBranch[a].totalSales;
                index=a;
                
            }
            
            
        }
        
        System.out.println("\nBranch with highest sale is " +arrBranch[index].branchCode +"with total sales of " +arrBranch[index].totalSales);
        
    }
    
    public void getLowestCustomer(BranchInfo[] arrBranch){
        
        double lowest=arrBranch[0].totalCustomer;
        
        int index=0;
        
        for(int a=0;a<arrBranch.length;a++){
            
            if(arrBranch[a].totalCustomer<lowest){
                
                lowest=arrBranch[a].totalCustomer;
                index=a;
                
            }
            
            
        }
        
        System.out.println("Branch with lowest customer is " +arrBranch[index].branchCode +"with total customer of " +arrBranch[index].totalCustomer);
        
    }
    
    public void searchByOnwer(String oName, BranchInfo[] arrBranch){
        
        int index=0;
        
        for(int a=0;a<arrBranch.length;a++){
            
            if(arrBranch[a].getBranchOnwer().equals(oName)){
                
                index=a;
                
            }
            
            
        }
        
        arrBranch[index].printBranchInfo();

        
    }
   
        
   
}
