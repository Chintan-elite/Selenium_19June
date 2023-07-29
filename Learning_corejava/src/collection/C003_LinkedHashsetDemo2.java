package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class C003_LinkedHashsetDemo2 {
	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Cricket");
		set.add("Hockey");
		set.add("Football");
		set.add("Vollyball");
		set.add("Cricket");
		
		
		for(String s : set)
		{
			System.out.println(s);
		}
		
		
		
		
	}
}
