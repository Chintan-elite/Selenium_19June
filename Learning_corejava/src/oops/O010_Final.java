package oops;

/*final*/ class X
{
	/* final */ public void data()
	{
		
	}
}

class Y extends X
{
	@Override
	public void data() {
		
	}
}

public class O010_Final {
	public static void main(String[] args) {
		
		final int a = 10;
		//a = 20;
		System.out.println(a);
		
		
		
	}
}
