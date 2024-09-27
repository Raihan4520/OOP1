package myPackage.transectionManagement;

public class SavingsAccount extends Account
{
	private double interestRate;
	
	public void setInterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
	public double getInterestRate()
	{
		return this.interestRate;
	}
	public void showInfo()
	{
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Balance: "+getBalance());
		System.out.println("Interest Rate: "+interestRate);
	}
}