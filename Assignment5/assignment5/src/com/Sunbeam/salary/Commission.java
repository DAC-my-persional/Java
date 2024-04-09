package com.Sunbeam.salary;

import java.util.Scanner;

public class Commission extends Employee
{

	protected double gross_sales;
	protected double Comm_Rate;
	
	
	public Commission() 
	{
		
	}
	
	public Commission(double gross_sales, double comm_Rate) 
	{
		this.gross_sales = gross_sales;
		this.Comm_Rate = comm_Rate;
	}
	
	@Override
	public void AcceptData() 
	{
		Scanner sc=new Scanner(System.in);
		super.AcceptData();
		System.out.println("Enter The Gross Sales -");
		gross_sales=sc.nextDouble();
		System.out.println("Enter Comm Rate -");
		Comm_Rate=sc.nextDouble();
		
	}
	public void DisplayData() 
	{
//		super.toString();
		super.DisplayData();
		System.out.println("Gross Sales -"+gross_sales);
		System.out.println("Commission Rate -"+Comm_Rate);
	}


	@Override
	public void CalculateSalary() 
	{
		double salary=Comm_Rate*gross_sales;
		System.out.println("Commissioned Salary -"+salary);
	}
	

}
