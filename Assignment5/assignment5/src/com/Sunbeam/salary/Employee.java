package com.Sunbeam.salary;

import java.util.Scanner;

public abstract class Employee 
{
	private String F_name;
	private String L_name;
	private double Ssn;
	
	
	public Employee() 
	{
		
	}

	public Employee(String f_name, String l_name, double ssn) 
	{
		F_name = f_name;
		L_name = l_name;
		Ssn = ssn;
	}

	public void AcceptData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The F_name -");
		F_name=sc.next();
		System.out.println("Enter The L_name -");
		L_name=sc.next();
		System.out.println("Enter The SSN -");
		Ssn=sc.nextDouble();
	}
	
	@Override
	public String toString() 
	{
		return "name="+F_name+" "+L_name;
	}
	
	public void DisplayData()
	{
		System.out.println(toString());
		System.out.println("SSN - "+Ssn);
		
	}
	
	public abstract void CalculateSalary();

}
