package oops;

abstract class Abs
{
	public abstract void display();
	
	public void run()
	{
		
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		System.out.println("Runinng abs method");
	}
	
}

public class O008_AbstractClass {
	public static void main(String[] args) {
		
		
		//Abs ab = new Abs();: not possible
		
		AbsImpl abs = new AbsImpl();
		abs.display();
		abs.run();
		
	}
}
