package collection;

import java.util.HashSet;

public class C003_HashsetDemo {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("cricket");
		set.add("Hockey");
		set.add("Football");
		set.add("Vollyball");
		set.add("cricket");
		
		
		for(String s : set)
		{
			System.out.println(s);
		}
		
		
		
		
	}
}
