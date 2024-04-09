package com.Sunbeam.salary;

import java.util.Scanner;

public class BasePlus extends Commission
{
	private double Base_Salary;

	
	public BasePlus()
	{
		
	}
	
	public BasePlus(double base_Salary) 
	{
		
		this.Base_Salary = base_Salary;
	}
	
	@Override
	public void AcceptData() 
	{
		Scanner sc=new Scanner(System.in);
		super.AcceptData();
		System.out.println("Enter The Base_Salary -");
		Base_Salary=sc.nextDouble();
	}
	
	@Override
	public void DisplayData() 
	{
		super.DisplayData();
		System.out.println("Base_salary-"+Base_Salary);
	}
	
	@Override
	public void CalculateSalary() 
	{
		double salary=(Comm_Rate*gross_sales)+Base_Salary;
		double overall_salary=salary+(Base_Salary*0.1);
		System.out.println("Base Salaried Commission -"+overall_salary);
	}
	
}
