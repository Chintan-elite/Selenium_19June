package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C003_TreesetDemo {
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		set.add("Cricket");
		set.add("Hockey");
		set.add("Football");
		set.add("Vollyball");
		set.add("Cricket");
		
		
//		for(String s : set)
//		{
//			System.out.println(s);
//		}
		
		//Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
}
