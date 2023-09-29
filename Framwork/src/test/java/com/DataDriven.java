package com;

import org.testng.annotations.Test;

public class DataDriven {
		
		@Test
		public void test()
		{
			
			ExcellReader ex = new ExcellReader("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\test\\testing_demo.xlsx", "reg");
			int row = ex.rowCount();
			int col = ex.colCount();
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					String data = ex.getData(i, j);
					System.out.println(data);
				}
			}
			
			
			
		}
}
