package basic;

import org.testng.annotations.Test;

public class B001_NewTest {
	
	@Test(priority = 4)
	public void gama()
	{
		System.out.println("Runing gama test");
	}
	
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Running test 1....");
	}
	
	@Test(priority = 3,enabled = false)
	public void alpha()
	{
		System.out.println("running alpha test");
	}
	
	@Test(priority = 2)
	public void beta()
	{
		System.out.println("Running beta test");
	}
	
		
	
}
