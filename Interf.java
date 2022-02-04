package com.bl;

public interface Interf 
{

    final int a = 5;
    default void display()
    {
        System.out.println("My name is prakash");
    }
}
  
class Test implements Interf
{
    
    public static void main (String[] args)
    {
        Test t = new Test();
        t.display();
    }
}
