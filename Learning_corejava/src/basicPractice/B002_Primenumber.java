package basicPractice;

public class B002_Primenumber {	
		public static void main(String[] args) {
			
			
			int a = 15;
			int flag = 0;
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					flag=1;
					break;
				}	
			}
			
			if(flag==1)
			{
				System.out.println("No is not prime");
			}
			else
			{
				System.out.println("No is prime");
			}
			
			
			
			
		}
}
