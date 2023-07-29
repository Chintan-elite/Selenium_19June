package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_ArraylistDemo {
	public static void main(String[] args) {
		
		//defalt size : 10
		// oldsize * (3/2) + 1 = 10*3 / 2 + 1 = 16
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("php");
		list.add("selenium");
		list.add("Android");
		list.add("java");
		list.add(null);
		
		//System.out.println(list.size());
		//System.out.println(list.get(1));
		
		//list.add(1,"ios");
		//list.set(1, "ios");
		//list.remove(2);
		
//		for(String s : list)
//		{
//			System.out.println(s);
//		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
}
