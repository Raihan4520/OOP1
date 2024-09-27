package myPackage.employeeCustomerManagement;
import myPackage.accountManagement.Customer;

public class Bank implements CustomerOperations,EmployeeOperations
{
	private Customer[] customers=new Customer[50];
	private Employee[] employees=new Employee[50];
	static int i=0,j=0;

	public void insertCustomer(Customer c)
	{
		try
		{
			customers[i]=c;
			i++;
			System.out.println("Customer inserted successfully");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Customer insertion failed\nMaximum "+customers.length+" customers can be inserted");
		}
	}
	public void removeCustomer(Customer c)
	{
		int count=0;
		if(c!=null)
		{		
			for(i=0;i<customers.length;i++)
			{
				if(customers[i]==c)
				{
					if(i==(customers.length-1))
					{
						customers[i]=null;
						count++;
					}
					else
					{
						for(int k=i;k<(customers.length-1);k++)
							{
								customers[k]=customers[k+1];
								if((k+1)==(customers.length-1))
								{
									customers[k+1]=null;
								}
							}
							count++;
							break;			
					}
				}
			}	
			if(count==0)
			{
				System.out.println("NID not found");
			}
			else
			{
				System.out.println("Customer removed successfully");
			}
		}
	}
	public Customer getCustomer(int nid)
	{
		try
		{	
			for(i=0;i<customers.length;i++)
			{
				if(customers[i].getNid()==nid)
				{
					return customers[i];
				}
			}
		}
		catch(NullPointerException ex)
		{
			System.out.println("NID not found");
		}
		return null;
	}
	public void showAllCustomers()
	{
		for(i=0;i<customers.length;i++)
		{
			if(customers[i]!=null)
			{
				System.out.println("*************************");
				System.out.println("Details of Customer "+(i+1)+":");
				System.out.println("Name: "+customers[i].getName());
				System.out.println("NID: "+customers[i].getNid());
				System.out.println("*************************");	
			}
			else
			{
				break;
			}
		}
	}

	public void insertEmployee(Employee e)
	{
		try
		{
			employees[j]=e;
			j++;
			System.out.println("Employee inserted successfully");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Employee insertion failed\nMaximum "+employees.length+" employees can be inserted");
		}
	}
	public void removeEmployee(Employee e)
	{
		int count=0;
		if(e!=null)
		{
			for(j=0;j<employees.length;j++)
			{
				if(employees[j]==e)
				{
					if(j==(employees.length-1))
					{
						employees[j]=null;
						count++;
					}
					else
					{
						for(int k=j;k<(employees.length-1);k++)
							{
								employees[k]=employees[k+1];
								if((k+1)==(employees.length-1))
								{
									employees[k+1]=null;
								}
							}
							count++;
							break;			
					}
				}
			}
			if(count==0)
			{
				System.out.println("Employee's ID not found");
			}
			else
			{
				System.out.println("Employee removed successfully");
			}
		}
	}
	public Employee getEmployee(String empId)
	{
		try
		{	
			for(j=0;j<employees.length;j++)
			{
				if((employees[j].getEmpId()).equals(empId)==true)
				{
					return employees[j];
				}
			}
		}
		catch(NullPointerException ex)
		{
			System.out.println("Employee's ID not found");
		}
		return null;
	}
	public void showAllEmployees()
	{
		for(j=0;j<employees.length;j++)
		{
			if(employees[j]!=null)
			{
				System.out.println("**************************************************");
				System.out.println("Details of Employee "+(j+1)+":");
				System.out.println("Name: "+employees[j].getName());
				System.out.println("ID: "+employees[j].getEmpId());
				System.out.println("Salary: "+employees[j].getSalary());
				System.out.println("**************************************************");	
			}
			else
			{
				break;
			}
		}
	}
}