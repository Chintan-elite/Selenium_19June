package exception;

class Sample
{
	
	public void display() throws ClassNotFoundException
	{
		Class.forName("exceptio.Demo");
	}
	
}

public class E002_CompileTimeEdemo {
	public static void main(String[] args) {
		
//		try {
//			Class.forName("exceptio.Demo");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Sample s = new Sample();
		try {
			s.display();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
