
public class EmployeeWage {
	    
	    public static final int IS_PART_TIME =1;             // CONSTANT      
		public static final int IS_FULL_TIME =2;               
		public static final int EMP_RATE_PER_HOUR =20; 
		public static final int NUM_OF_WORKING_DAYS =20;
		public static final int MAX_HRS_IN_MONTH =100;
		
		

	              public static int computeEmpWage()
	              {
	                System.out.println("Welcome to Employee Wage Computation Program");
	              
	                int empHrs=0,totalEmpHrs=0, totalWorkingDays=0;                                                    //variables declared
	                
	                while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)   // While Loop begins here.
	        		{
	                	totalWorkingDays++; 
	    		     int empCheck=(int)Math.floor(Math.random()*10)%2;
	    		  
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
	                int totalEmpWage=totalEmpHrs+EMP_RATE_PER_HOUR;                                //total wage is being computed.
	        		System.out.println("Total Emp Wage: "+ totalEmpWage); 
	                return totalEmpWage;
	             }
	              public static void main(String[] args) {
					computeEmpWage();
				}
}

