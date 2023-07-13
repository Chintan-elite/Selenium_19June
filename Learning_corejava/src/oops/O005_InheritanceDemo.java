package oops;

class A
{
	int a = 10;
	
	public void display()
	{
		System.out.println("Running class A display method");
	}
}

class B extends A
{
	int a = 50;
	public void print()
	{
		System.out.println("a : "+a);
		System.out.println("a : "+super.a);
	}
}
class C extends B
{
	
}

public class O005_InheritanceDemo {
	public static void main(String[] args) {
		
		B b = new B();
		b.display();
		b.print();
	}
}
