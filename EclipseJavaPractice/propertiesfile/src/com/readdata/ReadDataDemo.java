package com.readdata;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataDemo
{
  public static void main(String args[]) throws IOException

  {
	  
     // Step 1- Create an object of file reader class
	 //FileReader fr= new FileReader("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\propertiesfile\\TestData.properties");
	 
	  FileInputStream fis=new FileInputStream("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\propertiesfile\\TestData.properties");		 
	
	  //Step-2:Create an object of properties class
	Properties p=new Properties();
	
	 
	//Step 3:Load the file
	p.load(fis);
	
	//Step 4: Use get property method to get property
	
	System.out.println(p.getProperty("website"));
	System.out.println(p.getProperty("name"));
	 

	  
  }
}
  
