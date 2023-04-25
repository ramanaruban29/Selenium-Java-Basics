package com.LearningJava;

public class CreateBox 
{
	public static void main(String args[])
	{
		Encapsulation en = new Encapsulation();
		//int h =en.height=10;
		//int l=en.length=20;
		//int b=en.width=30;
		//en.setBoxDimension(l, b, h);
		int l=en.setLength(0);
		int h=en.setHeight(30);
		int b=en.setWidth(10);
		
		en.setBoxDimension(l, b, h);
		System.out.println(en.getLength());
	}
}
