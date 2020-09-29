
public class EmployeeWage {
	    
	    public static final int IS_PART_TIME =1;             // CONSTANT      
		public static final int IS_FULL_TIME =2; 
		
		private final String company;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHoursPerMonth;
		private int totalEmpWage;
		
		
		
		

	              public  EmployeeWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	              {
	                this.company=company;
	                this.empRatePerHour=empRatePerHour;
	                this.numOfWorkingDays=numOfWorkingDays;
	                this.maxHoursPerMonth=maxHoursPerMonth;
	              }
	              
	              public void computeEmpWage()
	              {
	            	 
	                int empHrs=0,totalEmpHrs=0, totalWorkingDays=0;                                                    //variables declared
	                
	                while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays)   // While Loop begins here.
	        		{
	                	totalWorkingDays++; 
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
	    			   
	    		    totalEmpHrs+=empHrs;                                                           //total Employee Hours is obtained.
	    			System.out.println("DAY#:"+totalWorkingDays+" Emp Hr: "+empHrs);              
	    	     }
	               totalEmpWage=totalEmpHrs*empRatePerHour;
	           }
	              public String toString()
	              {
	            	  return "Total Emp Wage for Company: " + company +" is: "+ totalEmpWage;
	              }
	              public static void main(String[] args) {
	            	  EmployeeWage dMart = new EmployeeWage("Dmart",20,2,10);
	            	  EmployeeWage reliance = new EmployeeWage("Reliance",20,2,10);
	                  dMart.computeEmpWage();
	                  System.out.println(dMart);
	                  reliance.computeEmpWage();
	                  System.out.println(reliance);
	                  
	            	  
	            	 
	              }
	              
}

