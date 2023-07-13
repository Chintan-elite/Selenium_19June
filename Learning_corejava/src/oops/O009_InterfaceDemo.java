package oops;

interface I1
{
	 void sample();
	
}

class InterImpl implements I1
{

	@Override
	public void sample() {
		System.out.println("inter method");
	}
	
}

public class O009_InterfaceDemo {
	public static void main(String[] args) {
		
	//	I1 i = new I1(); not possible
		
		InterImpl impl = new InterImpl();
		impl.sample();
		
	}
}
