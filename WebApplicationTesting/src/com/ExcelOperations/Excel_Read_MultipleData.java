package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleData {

	public static void main(String[] args) throws IOException {
		
		
	FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/Pradeep_MultipleData.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	
	int rowCount=sheet.getLastRowNum();
	
	for(int i=0;i<=rowCount;i++) // goto every active row
	{
		Row r=sheet.getRow(i); // goto a Row
		
		int cellCount=r.getLastCellNum(); // identify active cells
		
		for(int k=0;k<cellCount;k++) // goto every cell of all the Rows
		{
			Cell c=r.getCell(k); // goes to a Cell of the Row
			String data=c.getStringCellValue();
			
			System.out.print(data+" ");
		}
		System.out.println();
	}

	}

}
