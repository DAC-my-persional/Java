package com.Sunbeam.tester;

import java.util.Scanner;

import com.Sunbeam.salary.BasePlus;
import com.Sunbeam.salary.Commission;
import com.Sunbeam.salary.Employee;
import com.Sunbeam.salary.Hourly;
import com.Sunbeam.salary.Salaried;

public class Tester {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("1.Salaried Employee-");
			System.out.println("2.Hourly Employee");
			System.out.println("3.Commission Employee");
			System.out.println("4.Base Plus Commission Employee");
			System.out.println("Enter The Choice -");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				Employee e1=new Salaried();
				if(e1 instanceof Salaried)
				{
					Salaried s=(Salaried) e1;
					s.AcceptData();
					s.DisplayData();
					s.CalculateSalary();
				}
				break;
			case 2:
				Employee e2=new Hourly();
				if(e2 instanceof Hourly)
				{
					Hourly h=(Hourly) e2;
					h.AcceptData();
					h.DisplayData();
					h.CalculateSalary();
				}
				break;
			case 3:
				Employee e3=new Commission();
				if(e3 instanceof Commission )
				{
					Commission c=(Commission) e3;
					c.AcceptData();
					c.DisplayData();
					c.CalculateSalary();
				}
				break;
			case 4:
				Employee e4=new BasePlus();
				if(e4 instanceof BasePlus )
				{
					BasePlus b=(BasePlus) e4;
					b.AcceptData();
					b.DisplayData();
					b.CalculateSalary();
				}
				break;
			}
			
		}while(choice!=0);

	}

}
