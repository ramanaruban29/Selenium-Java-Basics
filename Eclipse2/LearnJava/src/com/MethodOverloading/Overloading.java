package com.MethodOverloading;

public class Overloading 
{
	public static void main(String args[])
	{
		Overloading c1=new Overloading();
		c1.login("Ramana","ruban");
	  
	}
	
	public void login(String s, String p)

	{
		System.out.println("Login succesfully with" +s+" " +p);
	}
	public void login(String s, String p,String w)

	{
		System.out.println("Login succesfully with" +s+" " +p+ " "+w);
	}
}
