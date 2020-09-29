
public class EmployeeWage {
	    
	    public static final int IS_PART_TIME =1;             // CONSTANT      
		public static final int IS_FULL_TIME =2;             // CONSTANT   
		public static final int EMP_RATE_PER_HOUR =20; 

	              public static void main(String[] args) 
	              {
	                System.out.println("Welcome to Employee Wage Computation Program");
	              
	                int empHrs=0;                                                    //variables declared
	                int empWage=0;  
	          	
	          	
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
	    			   empHrs=0;
	                   empWage=empHrs*EMP_RATE_PER_HOUR;                                 // Calculation
	                   System.out.println("Emp Wage: "+empWage);
	          	

	              }

	            }


