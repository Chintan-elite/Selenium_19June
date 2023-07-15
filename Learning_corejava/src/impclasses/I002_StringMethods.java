package impclasses;

public class I002_StringMethods {
	public static void main(String[] args) {
		
		
		String s = "Sun Rise In East";
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf("u"));
		System.out.println(s.substring(4));
		System.out.println(s.substring(4,10));
		System.out.println(s.replace("s", "U"));
		System.out.println(s.trim());
		
		System.out.println("*********************");
		
		String str[] =  s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		
		System.out.println("**********************");
		
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("******************");
		byte b[] = s.getBytes();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		
		
		
		
		
		
		
	}
}
