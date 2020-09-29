
public class EmployeeWage {
	

	              public static void main(String[] args) 
	              {

	              System.out.println("Welcome to Employee Wage Computation Program");
	              int IS_FULL_TIME=2; 
	              int IS_PART_TIME =1;
	              int EMP_PER_HOUR =20;                                             
	      		
	                int empHrs=0;                                                    //variables declared
	                int empWage=0;  
	          	
	          	System.out.println("Daily Employee Wage Calculation System");
                
	    		double empCheck=Math.floor(Math.random()*10)%3;
	    		if(empCheck== IS_FULL_TIME)                                       //COMPARISON
	                       empHrs=8;
	    		else if (empCheck== IS_PART_TIME)
	                       empHrs=4;
	    		else
	    			   empHrs=0;
	                   empWage=empHrs*EMP_PER_HOUR;                                 // Calculation
	                   System.out.println("Emp Wage: "+empWage);
	          	

	              }

	            }


