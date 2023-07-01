package array;

import javax.annotation.processing.SupportedSourceVersion;

public class A001_ArrayDemo {
	public static void main(String[] args) {
		
		//declaration
		int a[] = new int[5];
		//initialisation
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("*****************");
		
		int b[] = {10,20,3,40,56,78,99};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("********************");
		
		
		String[] subject = {"Java","Php","Python","C#"};
		
		for(int i=0;i<subject.length;i++)
		{
			System.out.println(subject[i]);
		}
		
		System.out.println("************************");
		
		
		char ch[] = {'A','B','C','D'};
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
	}
}
