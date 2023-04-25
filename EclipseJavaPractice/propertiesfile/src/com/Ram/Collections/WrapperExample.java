package com.Ram.Collections;

public class WrapperExample 
{
    public static void main(String args[]) 
    {
        int i = 10;
        Integer int1 = new Integer(i); // wrapping
        System.out.println("Before Wrapping="+int1);
		
        int j = int1; // unwrapping
        System.out.println("After Unwrapping="+j);
    }
}