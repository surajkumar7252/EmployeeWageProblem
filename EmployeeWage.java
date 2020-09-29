
public class EmployeeWage {
	    
	    public static final int IS_PART_TIME =1;             // CONSTANT      
		public static final int IS_FULL_TIME =2;             // CONSTANT   
		public static final int EMP_RATE_PER_HOUR =20; 
		public static final int NUM_OF_WORKING_DAYS =20;
		

	              public static void main(String[] args) 
	              {
	                System.out.println("Welcome to Employee Wage Computation Program");
	              
	                int empHrs=0;                                                    //variables declared
	                int empWage=0,totalEmpWage=0;  
	          	
	             for(int day=0; day<NUM_OF_WORKING_DAYS; day++)                // for loop begins here to set value of empHrs as required.
	        	{
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
	    			   
	                   empWage=empHrs*EMP_RATE_PER_HOUR; 
	                   totalEmpWage+=empWage;
	                   System.out.println("Emp Wage: "+empWage);
	          	}
	             System.out.println("Total Emp Wage: "+totalEmpWage);         // Prints the total employee wage.
	     		
	            }
}

