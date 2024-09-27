package myPackage.employeeCustomerManagement;

public class Employee
{
	private String name;
	private String empId;
	private double salary;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmpId(String empId)
	{
		this.empId=empId;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getName()
	{
		return this.name;
	}
	public String getEmpId()
	{
		return this.empId;
	}
	public double getSalary()
	{
		return this.salary;
	}
}