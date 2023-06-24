package statements;

public class S001_IfElse {
	public static void main(String[] args) {
		
		
		int a = 500;
		int b = 600;
		int c = 300;
		
//		if(a>b)
//		{
//			System.out.println("A is greater");
//		}
//		else
//		{
//			System.out.println("B is greater");
//		}
		
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is greater");
		}
		
		
		
		
		
	}
}
