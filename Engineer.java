package com.bl;

public class Engineer 
{

	public static void main(String args[])
	{
		Developer D=new Developer(); 
		   D.salary=30000;
		   D.HRA=10000;
		   {
				 System.out.println("Salary of Developer is :"+D.salary);
				 System.out.println("HRA of Developer is :"+D.HRA);
				 
				  }
    }
}
class Developer extends Engineer
		{  
		  int salary;
		  int  HRA;
		}  

