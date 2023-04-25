package com.readdata;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Properties;

public class writeData
{
  public static void main(String args[]) throws IOException

  {
	  
     // Step 1- Create an object of file writer class
	 FileWriter fr= new FileWriter("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\propertiesfile\\TestData.properties");
	 
	  //FileInputStream fis=new FileInputStream("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\propertiesfile\\TestData.properties");		 
	
	  //Step-2:Create an object of properties class
	Properties p=new Properties();
	
	 
	//Step 3:Load the file
	//p.load(fis);
	
	//Step 4: Use set property method to set property and store
	
	
	p.setProperty("url","RamanaSite.com");
	p.store(fr, "Sample Comments");


	  
  }
}
  
