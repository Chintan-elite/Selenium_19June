package thread;

class Sample
{
	
}
class Th extends Sample implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
public class T002_ThreadByRunnable {
	public static void main(String[] args) {
		
		
		Th t1 = new Th();
	
		Thread t = new Thread(t1);
		t.start();
		
	}
}
