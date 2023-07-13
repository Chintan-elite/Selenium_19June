package oops;

class Test1
{
	public void run()
	{
		System.out.println("Running Test class Run method");
	}
}

class Practice extends Test1
{
	@Override
	public void run() {
		System.out.println("Running Practice class run method");
		super.run();
	}
}



public class O007_MethodOverRiding {
	public static void main(String[] args) {
		
		
		Practice p =  new Practice();
		p.run();
		
	}
}
