package impclasses;

public class I001_StringDemo {
	public static void main(String[] args) {
		
//		
//		String s = "java";
//		String s1 = new String("java");
		
		//System.out.println(s+" "+s1);
		
//		String s2 = s.concat("core");
//		System.out.println(s);
//		System.out.println(s2);
		
		
		String s1 = "java";
		String s2 = "selenium";
		String s3 = "java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		System.out.println("*****************************");
		
		String str1 = new String("java");
		String str2 = new String("selenium");
		String str3 = new String("java");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
	}
}
