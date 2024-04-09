package com.Sunbeam.salary;

import java.util.Scanner;

public class Salaried extends Employee
{
	private double Weakly_salary;
	
	
	public Salaried() 
	{
		
	}
	public Salaried(double weakly_salary)
	{
		Weakly_salary = weakly_salary;
	}

	@Override
	public void AcceptData() 
	{
		Scanner sc=new Scanner(System.in);
		super.AcceptData();
		System.out.println("Enter The Weakly Salary -");
		Weakly_salary=sc.nextDouble();
	}
	@Override
	public void DisplayData()
	{
		
		super.DisplayData();
		
		System.out.println("Weakly_Salary"+Weakly_salary);
	}
	@Override
	public void CalculateSalary() 
	{
		double salary=Weakly_salary;
		System.out.println("The Salary of the Salaried Employee is -"+salary);
		
	}

}
