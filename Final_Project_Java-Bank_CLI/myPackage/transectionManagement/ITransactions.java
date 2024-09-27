package myPackage.transectionManagement;

interface ITransactions
{
	void deposit(double amount);
	void withdraw(double amount);
	void transfer(Account a, double amount);
}