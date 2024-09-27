package myPackage.transectionManagement;

public class FixedAccount extends Account
{
	private int tenureYear;
	
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear=tenureYear;
	}
	public int getTenureYear()
	{
		return this.tenureYear;
	}
	public void showInfo()
	{
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Balance: "+getBalance());
		System.out.println("Tenure Year: "+tenureYear);
	}
}