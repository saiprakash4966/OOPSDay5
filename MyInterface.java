package com.bl;

public interface MyInterface 
{
           public static int num = 100;
		   public void display();
		}
		  class Interfacenew implements MyInterface
		{
		   public static int num = 500;
		   public void display()
		   {
		      System.out.println("This is the implementation of the display method");
		   }
		   public void show()
		   {
		      System.out.println("This is the implementation of the show method");
		   }
		   public static void main(String args[])
		   {
		      Interfacenew obj = new Interfacenew();
		      System.out.println("Value of no of the interface "+MyInterface.num);
		      System.out.println("Value of no of the class "+obj.num);
		   }
		}


