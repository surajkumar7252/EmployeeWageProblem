//SURAJMAL KUMAR
//Day 4 continued Assignments 



//https://github.com/surajkumar7252/EmployeeWageProblem.git




 class CompanyEmpWage {
	    
	    public final String company;
		public final int empRatePerHour;
		public final int numOfWorkingDays;
		public final int maxHoursPerMonth;
		public int totalEmpWage;
		
        public  CompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
	                
        	        this.company=company;
	                this.empRatePerHour=empRatePerHour;
	                this.numOfWorkingDays=numOfWorkingDays;
	                this.maxHoursPerMonth=maxHoursPerMonth;
	                
	     }
	              
	     public void setTotalEmpWage(int totalEmpWage){
	    	        this.totalEmpWage=totalEmpWage;
	     }
	            
	     public String toString() {
	    	 return "Total Emp Wage for  company: " +company+" is: "+ totalEmpWage;
	     }
    }       
	      
public class EmployeeWage{
	    
	     public static final int IS_PART_TIME =1;                  
	     public static final int IS_FULL_TIME =2; 
	    
	     
	     private int numOfCompany=0;
	     private CompanyEmpWage[] companyEmpWageArray;
	    
	     public EmployeeWage() {
	    	 companyEmpWageArray=new CompanyEmpWage[5];
	     }
	     
	     public void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
	    	companyEmpWageArray[numOfCompany]= new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
	    	numOfCompany++;
	    	
	     }
	     
	     private void computeEmpWage(){
	    	 
	    	 for(int i=0;i<numOfCompany;i++){
	    		 companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i])); 
	    	 }
	     }
	     
	     private int computeEmpWage(CompanyEmpWage companyEmpWage) {
	    	 
	    	 int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;                                
             while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays){
            	 
             
		            totalWorkingDays++;                                                     
		            int empCheck=(int) Math.floor(Math.random()*10)%3;                      
		            switch(empCheck){
		             
		                     case IS_PART_TIME : empHrs=4;break;
		                     
		                     case IS_FULL_TIME : empHrs=8;
		                                         break;
		                     default: empHrs=0;
		             }
		            totalEmpHrs+=empHrs;                                                           //total Employee Hours is obtained.
		    		System.out.println("DAY#:"+totalWorkingDays+" Emp Hr: "+empHrs);              
		       }
              
               return totalEmpHrs *companyEmpWage.empRatePerHour;
	     }
	     
	    
	     
public static void main(String[] args) {
	
	     
	      EmployeeWage empWageBuilder = new EmployeeWage();
	      empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
	      empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
	      empWageBuilder.computeEmpWage();
	      }
	              
}

