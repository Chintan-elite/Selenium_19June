package collection;

import java.util.HashMap;

public class C006_HashMap {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(10, "java");
		map.put(20, "php");
		map.put(30, "android");
		map.put(20, "java");
		
		
		System.out.println(map);
		
		
	}
}
