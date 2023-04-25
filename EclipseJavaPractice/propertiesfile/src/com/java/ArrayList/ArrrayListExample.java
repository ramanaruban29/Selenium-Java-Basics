package com.java.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrrayListExample 
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Ramana");
		al.add(100);
		al.add("Ramanaruban");
		System.out.println(al.size());
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		System.out.println(al.get(0));
		
		Iterator Itr=al.iterator();
		
		while(Itr.hasNext()) 
		{
			System.out.println(Itr.next());
		}
		
		ArrayList <Integer> number =new ArrayList<Integer>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(400);
		System.out.println(number);
		
		int i =(Integer) number.get(0); //Typecasting from object ti integer
		System.out.println(i);
	}
	
}
