package impclasses;

public class I003_StringbuffrerNBuilder {
	public static void main(String[] args) {
		
		//syncronised
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=1;i<=1000000;i++)
		{
			sb.append("Java");
		}
		double endTime = System.currentTimeMillis();
		
		
		//asyncronised
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i=1;i<=1000000;i++)
		{
			sb1.append("Java");
		}
		double endTime1 = System.currentTimeMillis();
		
		
		System.out.println("Time taken by buffer : "+(endTime-startTime));
		System.out.println("Time taken by builder : "+(endTime1-startTime1));
	}
}
