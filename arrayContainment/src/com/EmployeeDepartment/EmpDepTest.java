package com.EmployeeDepartment;

public class EmpDepTest 
{
	public static void departmentWiseEmp(Employee e1[],Department d1[])
	{
		for(Department d:d1)
		{
			System.out.println(d.getName());
			for(Employee e:e1)
			{
				if(e.getDep().equals(d))
					System.out.print(e.getName() + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Department d[] = new Department[5];
		
		d[0] = new Department(1," IT ");
		d[1] = new Department(2," Software engg ");
		d[2] = new Department(3," Non IT ");
		d[3] = new Department(4," Testing ");
		d[4] = new Department(5," Process ");
		
		Employee emp[] = new Employee[5];
		
		emp[0] = new Employee(101,"Pratik",70000f,d[0]);
		emp[1] = new Employee(101,"Mayur",60000f,d[1]);
		emp[2] = new Employee(101,"Kiran",50000f,d[2]);
		emp[3] = new Employee(101,"Chanda",80000f,d[3]);
		emp[4] = new Employee(101,"Mohan",90000f,d[4]);
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		
		departmentWiseEmp(emp, d);
				
		

	}

}
