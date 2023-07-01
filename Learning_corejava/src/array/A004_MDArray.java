package array;

public class A004_MDArray {
		public static void main(String[] args) {
			
			int a[][] = new int[3][5];
			
			//0 1 2
			//0 1 2 3 4 
			
			a[0][0] = 25;
			a[0][1] = 60;
			a[0][2] = 23;
			a[0][3] = 53;
			a[0][4] = 40;
			
			a[1][0] = 25;
			a[1][1] = 60;
			a[1][2] = 23;
			a[1][3] = 53;
			a[1][4] = 40;
			
			a[2][0] = 25;
			a[2][1] = 60;
			a[2][2] = 23;
			a[2][3] = 53;
			a[2][4] = 40;
			
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<5;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println("*****************");

			int b[][] = {{30,29,31},{35,29,30},{27,35,30},{27,28,29}};
			
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println("****************");
			
			String login[][] = {{"abc@gmail.com","abc123"},{"xyz@gmail.com","xyz123"},{"test@gmail.com","test123"}};
			
		
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(login[i][j]+" ");
				}
				System.out.println();
			}
				
		
		}
}
