package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C002_ArrayListDemo {
	
	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList<>();
		list.add("Hello");
		list.add(10);
		list.add(10.22);
		list.add('A');
		list.add(true);
		list.add(null);
		
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
