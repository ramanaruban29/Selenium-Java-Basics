package com.TryCatch;

public class TryCatch {
	
	public static void main(String args[])
	{
		try
		{
			int i=10;
			System.out.println(i/0);
			System.out.println("After Division");
	
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			System.out.println(t.getStackTrace());
		}
		
        finally
        {
        	System.out.println("This is finally");
        }
		System.out.println("After Division");
	}
}
