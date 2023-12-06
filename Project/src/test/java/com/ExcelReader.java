package com;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
		String filePath = "C:\\Users\\CHINTAN\\OneDrive\\Desktop\\test\\project.xlsx";
		String fileName = "login";
		
		public int rowCount()
		{
			int row = 0;
			
			try {
				XSSFWorkbook workBook = new XSSFWorkbook(filePath);
				XSSFSheet workSheet = workBook.getSheet(fileName);
				row = workSheet.getPhysicalNumberOfRows();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			return row;
		}
		
		public int colCount()
		{
			int col = 0;
			try {
				XSSFWorkbook workBook = new XSSFWorkbook(filePath);
				XSSFSheet workSheet = workBook.getSheet(fileName);
				col = workSheet.getRow(0).getPhysicalNumberOfCells();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			return col;
		}
		
		
		public String getData(int row, int col)
		{
			String data = null;
			try {
				XSSFWorkbook workBook = new XSSFWorkbook(filePath);
				XSSFSheet workSheet = workBook.getSheet(fileName);
				data = workSheet.getRow(row).getCell(col).getStringCellValue();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			return data;
		}
		
		
		
}
