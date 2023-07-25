package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F004_FileReader {
	
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("D://test//home.txt");
		
			int i = fr.read();
			
			while(i !=-1)
			{
				char ch = (char) i;
				System.out.print(ch);
				i = fr.read();
			}
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
