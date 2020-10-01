//SURAJMAL KUMAR
//Day 4 continued Assignments 



//https://github.com/surajkumar7252/EmployeeWageProblem.git



public interface IComputeEmpWage {

	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
    public void ComputeEmpWage();
	}


public class companyEmpWage {
	    
	    
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
	     private int numberOfCompany=0;
	     private companyEmpWage[] companyEmp;
	     public EmployeeWage() {
	    	companyEmp = new companyEmpWage[20];
	     }
	     
	     public void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
	    
	    	 companyEmp[numberOfCompany] = new companyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
	    	 numberOfCompany=numberOfCompany+1;
	     }
	     
	     public void computeEmpWage(){
	    	 for(int i=0;i<numberOfCompany;i++){
	    		 companyEmp[i].setTotalEmpWage(this.IComputeEmpWage(companyEmp[i])); 
	    		 System.out.println(companyEmp[i]);
	    	 }
	     }
	     
	     public int getTotalWage(String company) {
	    	 return companyToEmpWage.get(company).totalEmpWage;
	    	
	     }
	     
	     public int computeEmpWage(companyEmpWage companyEmpWage) {
	    	int totalEmployeeHrs=0;
	    	int totalEmployeeDays=0;
	    	 while(totalEmployeeHrs<=companyEmp.numOfWorkingHrs && totalEmployeeDays<companyEmpWage.numOfWorkingDays)   // While Loop begins here.
     		{
             	totalEmployeeDays++;
 		     int empCheck=(int)Math.floor(Math.random()*10)%3;
 		  
 		    switch(empCheck)
 		   {
 		  case  IS_PART_TIME:
 		      empHrs=4;
 		      break;
 		  case IS_FULL_TIME:
 		      empHrs=8;
 		      break;
 		  default:
 		 	empHrs=0;
 		
 		  }
 			   
 		    totalEmployeeHrs+=empHrs;                                                           //total Employee Hours is obtained.
 			System.out.println("DAY#:"+totalWorkingDays+" Emp Hr: "+empHrs);              
 			}
             int totalEmpWage=totalEmpHrs+EMP_RATE_PER_HOUR;                                //total wage is being computed.
     		System.out.println("Total Emp Wage: "+ totalEmpWage); 
          
          }
}
	    	
	    	
	     }
	     
	     
	     }	            
	     
public static void main(String[] args) {
	
	      IComputeEmpWage empWageBuilder= new EmployeeWage();
	    
	     EmployeeWage.addCompanyEmpWage("DMart",20,2,10);
	     EmployeeWage.addCompanyEmpWage("Reliance",10,4,20);
	     EmployeeWage.computeEmpWage();
	     
	       }
	              
}

