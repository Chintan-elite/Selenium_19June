package basicPractice;

public class B004_Fibbonacci {
	public static void main(String[] args) {
		
		
		int a = 20;
				
		
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1+" "+n2);
		int n3;
		for(int i=3;i<=a;i++)
		{
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
		
		
		
	}
}
