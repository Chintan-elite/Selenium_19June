package impclasses;

class A
{
	public void display()
	{
		
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}

class B extends A
{
	
}

public class I004_ObjectDemo {
	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a);
		
	}
}
