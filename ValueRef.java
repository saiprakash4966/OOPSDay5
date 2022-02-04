package com.bl;

public class ValueRef
{
	  int num=50;    
      void change(ValueRef VR)
		 {  
		 VR.num=VR.num+50; 
		 }     
		 public static void main(String args[])
		 {  
		   ValueRef VR=new ValueRef();    
		   System.out.println("before change "+VR.num);  
		   VR.change(VR);
		   System.out.println("after change "+VR.num);  
     	 }  
}  


