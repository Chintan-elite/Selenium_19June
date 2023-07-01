package oops;

class Pen
{
	//state/field/datamember/variable
	static String color = "red";
	String company = "Cello";
	int price = 50;
	
	//function mem
	public void toWrite()
	{
		System.out.println(color+" "+company+" "+price);
	}
	
	static public void sample()
	{
		System.out.println("Sample calling");
	}
}

public class O001_First {
	public static void main(String[] args) {
		
		Pen.color = "White";
		
		Pen pen = new Pen();
		pen.price=100;
		pen.toWrite();
		
		
		
		Pen pen1 = new Pen();
		pen1.toWrite();
		
		
		Pen.sample();
		
		
		
	}
}
