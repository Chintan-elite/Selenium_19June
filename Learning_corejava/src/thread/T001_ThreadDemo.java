package thread;



class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(currentThread().getName() +" : "+i);
		}
	}
}

class T2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(currentThread().getName()+" : "+i);
		}
	}
}
public class T001_ThreadDemo {
	public static void main(String[] args) {
		
		
		
		
		T1 t1 = new T1();
		T1 t = new T1();
		T2 t2 = new T2();
		
		
		//System.out.println(t1.getName()+" "+t2.getName()+" "+t.getName());
		System.out.println(t1.getId()+" "+t2.getId()+" "+t.getId());
		t1.setName("A");
		t2.setName("B");
		t.setName("C");
//		t1.run();
//		t2.run();
	
		t.start();
		t1.start();
		t2.start();
		
		
		
		
	}
}
