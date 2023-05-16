package com.providio.pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =new FileInputStream("C:\\Users\\user\\eclipse-workspace\\provideo\\proVideo\\ProVidioAkhi\\Products Skew.xlsx");
				XSSFWorkbook  workbook =new XSSFWorkbook(fis);
		
	   
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("New Arrivals")) {
				
				XSSFSheet sheet=workbook.getSheetAt(i);
				//Identify Testcases coloum by scanning the entire 1st row
				
				// This line creates an iterator over the rows of an Excel sheet named sheet
				Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
				// This line retrieves the first row from the sheet collection using the next() method of the rows iterator. 
				Row firstrow= rows.next();
				// This line creates an iterator over the cells of the first row (firstrow). firstrow is a row object that represents the first row of the sheet.
				Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
				int k=0;
				int coloumn = 0;
					while(ce.hasNext())
					{
						Cell value=ce.next();
						
						if(value.getStringCellValue().equalsIgnoreCase("category"))
						{
						coloumn=k;
						
						}
					
					k++;
					}
				System.out.println(coloumn);
				
				}
				
			}
			//System.out.println("akhi");
		}
	}
	

