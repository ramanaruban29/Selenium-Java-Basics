package com.SuperKeyword;

public class Child extends Parent {

	String empName="Abby";
	int empNo=65778;
	
	public static void main(String args[])
	{
		Child c=new Child();
		c.getData();
	}
	
	public void getData()
	{
		super.getData();
		System.out.println(empName);
		System.out.println(empNo);
	}
}
