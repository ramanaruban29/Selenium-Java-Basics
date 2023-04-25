package com.data.write;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkBook;

public class WriteDatatoExcel 
{
	public static void main (String args[])
	{
	  XSSFWorkbook workbook=new XSSFWorkbook();
	  XSSFSheet sheet1 = workbook.createSheet("Sheet1");
	  
	  Row r0= sheet.createRow(0);
	  Cell c0=r0.createCell(0);
	  c0.setcellvalue("RamanaCodes");
	  
	  File f=new File("C:\\Users\\Ramanan\\OneDrive\\Desktop\\EclipseJavaPractice\\propertiesfile\\src\\com\\data\\read")
	  FileOutputStream fos=new FileOutputSream(f);
	  workbook.write(fos);
	  fos.close()
	  workbook.close();
	  System.out.println("File is writtens succesfully");
	  
	}

}
