//SURAJMAL KUMAR
//Day 4 continued Assignments 



//https://github.com/surajkumar7252/EmployeeWageProblem.git

import java.util.Map;

public interface IComputeEmpWage{
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
    public void ComputeEmpWage();
	public int getTotalWage(String company);
}

public class companyEmpWage {
	    
	    public static final int IS_PART_TIME =1;                  
		public static final int IS_FULL_TIME =2; 
		
		private final String company;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHoursPerMonth;
		private int totalEmpWage;
		
        public  EmployeeWages(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
	                
        	        this.company=company;
	                this.empRatePerHour=empRatePerHour;
	                this.numOfWorkingDays=numOfWorkingDays;
	                this.maxHoursPerMonth=maxHoursPerMonth;
	                totalEmpWage=0;
	     }
	              
	     public void setTotalEmpWage(int totalEmpWage){
	    	        this.totalEmpWage=totalEmpWage;
	     }
	            
	     public String toString() {
	    	 return "Total Emp Wage for the company: " +company+" is: "+ totalEmpWage;
	     }
        }       
	      
public class EmployeeWage implements IComputeEmpWage{
	    
	     public static final int IS_PART_TIME =1;                  
	     public static final int IS_FULL_TIME =2; 
	     private int numOfCompany=0;
	     private LinkedList <String,CompanyEmpWage>companyEmpWageList;
	     private Map<String,CompanyEmpWage> companyToEmpWageMap;
	     
	     public EmployeeWage() {
	    	 companyEmpWageList =new LinkedList<>();
	    	 companyToEmpWageMap=new HashMap<>();
	     }
	     
	     public void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
	    	companyEmpWageList.add(companyEmpWage);
	    	companyToEmpWageMap.put(cpmpany, companyEmpWage);
	     }
	     
	     public void computeEmpWage()
	     {
	    	 for(int i=0;i<companyEmpWageList.size();i++()){
	    		 companyEmpWage companyEmpWage = companyEmpWageList.get(i);
	    		 companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
	    		 System.out.println(companyEmpWage);
	    	 }
	     }
	     
	     public int getTotalWage(String company) {
	    	 return companyToEmpWage.get(company).totalEmpWage;
	    	
	     }
	     
	     public int computeEmpWage(companyEmpWagr companyEmpWage) {
	    	 ...
	     }
	     
	     
	            
	     
public static void main(String[] args) {
	
	      IComputeEmpWage empWageBuilder= new EmployeeWage();
	      empWageBuilder.addCompanyEmpWage(company: "DMart", empRatePerHour 20, numOfWorkingDays 2, maxHoursPerMonth 10);
	      empWageBuilder.addCompanyEmpWage(company: "Reliance", empRatePerHour 10, numOfWorkingDays 4, maxHoursPerMonth 20);
	      empWageBuilder.ComputeEmpWage();
	      System.out.println("Total Wage for Dmart Company: "+ empWageBuilder.getTitalWage(company: "DMart"));

	       }
	              
}

