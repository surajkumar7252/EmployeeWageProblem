
public interface IComputeEmpWage {

	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
    public void ComputeEmpWage();
	public int getTotalWage(String company);
}
