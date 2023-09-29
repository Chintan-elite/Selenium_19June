package com;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
		
	
	String filePath;
	String fileName;
	
	public ExcellReader(String filePath, String fileName) {
		super();
		this.filePath = filePath;
		this.fileName = fileName;
	}

	public int rowCount()
	{
		int row = 0;
		try 
		{
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet workSheet = workbook.getSheet(fileName);
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
		try 
		{
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet workSheet = workbook.getSheet(fileName);
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
		try 
		{
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet workSheet = workbook.getSheet(fileName);
			data = workSheet.getRow(row).getCell(col).getStringCellValue();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
}
