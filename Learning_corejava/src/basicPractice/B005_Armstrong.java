package basicPractice;

public class B005_Armstrong {
	public static void main(String[] args) {
		
		int num = 154;
		int temp = num;
		int sum = 0;
		
		while(num != 0)
		{
			int rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
			
		}
		
		if(sum==temp)
		{
			System.out.println("Armstrong num.");
		}
		else
		{
			System.out.println("Not armstrong.");
		}
		
		
		
	}
}
