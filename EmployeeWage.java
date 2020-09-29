
public class EmployeeWage {
	    
	    public static final int IS_PART_TIME =1;             // CONSTANT      
		public static final int IS_FULL_TIME =2;               
		
		

	              public static int computeEmpWage(String company,int empRatePerHour,int numberOfWorkingDays,int maxHoursPerMonth)
	              {
	               
	                int empHrs=0,totalEmpHrs=0, totalWorkingDays=0;                                                    //variables declared
	                
	                while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numberOfWorkingDays)   // While Loop begins here.
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
	                int totalEmpWage=totalEmpHrs+empRatePerHour;                                //total wage is being computed.
	        		System.out.println("Total Emp Wage for company: "+ company + " is: " + totalEmpWage); 
	                return totalEmpWage;
	             }
	              public static void main(String[] args) {
					computeEmpWage("DMart",20,2,10);
					computeEmpWage("Reliance",10,4,20);
					
				}
}

