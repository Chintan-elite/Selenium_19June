package fileio;

import java.io.File;
import java.io.IOException;

public class F005_File {

		public static void main(String[] args) {
			
			
			File file = new File("D://test//sample.txt");
			
			//file.mkdir();
			
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			
//			if(file.exists())
//			{
//				System.out.println("File available");
//				file.delete();
//				System.out.println("File deleted");
//			}
//			else
//			{
//				System.out.println("File not exist !!!");
//				
//				try {
//					file.createNewFile();
//					System.out.println("File created...");
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
//			
			
			
		}
}
