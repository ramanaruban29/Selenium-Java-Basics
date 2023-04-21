package com.LearningJava;


public class Methods 
{
	public static void main(String args[])
	{
	Methods md=new Methods();
	System.out.println(md.doLogin(1));
	System.out.println(md.doLogin(2));
	System.out.println(md.doLogin("a"));
	md.doLogout();
	}	
	

	public int doLogin(int a)
	{
	//login code
		return a;
	}

	public String doLogin(String b)
	{
		return b;
	}

	public void doLogin(double c)
	{
	 	System.out.println("Login Successfully");
	}

	public void doLogout()
	{
		doLogin(1);
		System.out.println("Logout Successfully");
	}

}