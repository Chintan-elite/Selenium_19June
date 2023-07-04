package oops;

class Calc
{
	public void sample()
	{
		System.out.println("Running sample  method..");
	}
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition of a and b is : "+c);
	}
	
	public void display(String name)
	{
		System.out.println("My name is : "+name);
	}
	
	public int square(int a)
	{
		int sq = a*a;
		return sq;
	}
	
	public String mydata()
	{
		return "Taushif";
	}
	
	public void addArray(int[] a)
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum +a[i];
		}
		System.out.println("Sum of an array  : "+sum);
	}
	
}

public class O003_Methodmanipulation {
	public static void main(String[] args) {
		
		
		Calc c = new Calc();
		c.sample();
		c.add(10, 20);
		c.display("Nikunj");
		int sq = c.square(10);
		System.out.println(sq);
		System.out.println(c.mydata());
		
		int a[] = {10,20,30,40,50,60};
		int b[] = {1,2,3,4,5};
		c.addArray(a);
		c.addArray(b);
	}
}
