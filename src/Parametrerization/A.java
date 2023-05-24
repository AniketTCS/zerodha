package Parametrerization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
public static void main(String[] args) throws Throwable {
// create object of File input stream class
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Documents\\para.xlsx");
	//Open excel sheet using create method 
// boolean data = WorkbookFactory.create(file).getSheet("Parameterisation").getRow(1).getCell(1).getBooleanCellValue();
// System.out.println(data);
 
  //String data = WorkbookFactory.create(file).getSheet("Parameterisation").getRow(0).getCell(0).getStringCellValue();
// System.out.println(data);
	
	 double data = WorkbookFactory.create(file).getSheet("Parameterisation").getRow(2).getCell(0).getNumericCellValue();
	 System.out.println(data);
	
	
	
		
}
}