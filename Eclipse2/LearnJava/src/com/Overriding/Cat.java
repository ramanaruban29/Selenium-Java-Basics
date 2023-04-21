package com.Overriding;

public class Cat extends Animal 
{
	public static void main(String args[])
	{
		Cat c1=new Cat();
		c1.makeNoise();
	}
	public void makeNoise()
	{
		System.out.println("Cat Meows");
	}
}
