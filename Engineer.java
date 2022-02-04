package com.bl;

public class Engineer 
{
	 
		 Double salary=30000.00;  
}  
		class Developer extends Engineer
		{  
		 int HRA=12000;  
		 public static void main(String args[])
		 {  
		   Developer p=new Developer();  
		   System.out.println("Developer salary is:"+p.salary);  
		   System.out.println("HRA of Developer is:"+p.HRA);  
		}  
		}  


