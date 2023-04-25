package com.readdata;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeDataToCSV
{
  public static void main(String args[]) throws IOException

  {
	  
     // Step 1- Create an object of file writer class
	 FileWriter fr= new FileWriter("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\propertiesfile\\TestData.txt"); // For CSV file change the extension
	 //FileWriter fr= new FileWriter("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\propertiesfile\\TestData.txt",true); // To continuously update certain file
	 
	  //FileInputStream fis=new FileInputStream("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\propertiesfile\\TestData.properties");		 
	
	  //Step-2:Use set property/store method to set property
	BufferedWriter br= new BufferedWriter(fr);
	
	
	 
	//Step 3:Write data
	br.write("Ramanaruban");
	
	//Step 4: Close the file
	
	br.close();
	  
  }
}
  
