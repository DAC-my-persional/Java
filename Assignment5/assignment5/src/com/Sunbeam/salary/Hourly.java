package com.Sunbeam.salary;

import java.util.Scanner;

public class Hourly extends Employee
{
	private double Hourly_wage;
	private double Hrs;
	
	
	public Hourly() 
	{
		
	}
	
	public Hourly(double hourly_wage, double hrs)
	{
		this.Hourly_wage = hourly_wage;
		this.Hrs = hrs;
	}

	@Override
	public void AcceptData() 
	{
		Scanner sc=new Scanner(System.in);
		super.AcceptData();
		System.out.println("Enter The Hourly Wages -");
		Hourly_wage=sc.nextDouble();
		System.out.println("Enter The Hrs -");
		Hrs=sc.nextDouble();
	}
	
	@Override
	public void DisplayData() 
	{
//		super.toString();
		super.DisplayData();
		System.out.println("Hourly wages -"+Hourly_wage);
		System.out.println("Hrs -"+Hrs);
	}

	@Override
	public void CalculateSalary() 
	{
		double salary = 0;
		if(Hrs<=40)
		{
			salary=Hourly_wage*Hrs;
		}
		else if(Hrs>40)
		{
			salary=40*Hourly_wage+(Hrs-40)*Hourly_wage*1.5;
		}
		
		System.out.println("Hourly_Salary -"+salary);
		
	}
	
	
	
}
