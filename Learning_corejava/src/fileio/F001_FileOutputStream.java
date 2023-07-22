package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F001_FileOutputStream {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		try
		{
			 fos = new FileOutputStream("D:\\test\\test.txt");
			System.out.println("File created...");
		
			String data = "sun riese in east";
			byte b[] = data.getBytes();
			fos.write(b);
			System.out.println("Data written successfully!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally //always executable
		{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
