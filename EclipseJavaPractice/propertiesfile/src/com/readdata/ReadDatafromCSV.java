package com.readdata;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDatafromCSV
{
  public static void main(String args[]) throws IOException

  {
	  
     // Step 1- Create an object of file writer class
	 File f= new File("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\propertiesfile\\TestData.txt"); // For CSV file change the extension
	 //FileWriter fr= new FileWriter("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\propertiesfile\\TestData.txt",true); // To continuously update certain file
	 
	  //FileInputStream fis=new FileInputStream("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\propertiesfile\\TestData.properties");		 
	
	  //Step-2:Use set property/store method to set property
	FileReader fr= new FileReader(f);
	
	BufferedReader br=new BufferedReader(fr);
	 
	//Step 3:Read data
	System.out.println(br.readLine());
	
	//Step 4: Close the file
	System.out.println("Read Successfully");
	br.close();
	  
  }
}
  

