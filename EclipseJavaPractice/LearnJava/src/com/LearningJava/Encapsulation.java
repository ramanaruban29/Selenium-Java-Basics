package com.LearningJava;

public class Encapsulation 
{
	private int length;
	private int width;
	private int height;
	
	public void setBoxDimension(int l, int b, int h)
	{
		System.out.println("Box created with dimensions ="+l+" "+b+" "+h);
	}
	
	public int getLength()
	{
		
		return length;
	}
	public int getWidth()
	{
		
		return width;
	}
	public int getBredth()
	{
		
		return width;
	}
	
	public int setLength(int l)
	{
		if(l>0)
		{
			length=l;
		}
		else
		{
			System.out.println("Please provide number greater than the zero");
		}
		
		return length;
	}
	public int setWidth(int w)
	{
		width=w;
		return width;
	}
	public int setHeight(int h)
	{
		height=h;
		return height;
	}
	
}

