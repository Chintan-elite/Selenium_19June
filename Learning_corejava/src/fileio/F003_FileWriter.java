package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_FileWriter {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("D:\\test\\home.txt");
			
			String data = "this is my first io program";
			fw.write(data);
			fw.flush();
			System.out.println("Data written successfully!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
