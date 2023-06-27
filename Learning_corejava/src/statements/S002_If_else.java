package statements;

import java.util.Scanner;

public class S002_If_else {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		//91-100 : A
		//71-90  : B
		//51-70	 : C
		//35-50  : D
		//0-35 : Fail
		//other : invalid input
		
		if(marks>90 && marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(marks<=90 && marks>70)
		{
			System.out.println("Grade B");
		}
		else if(marks>50 && marks<=70)
		{
			System.out.println("Grade C");
		}
		else if(marks>34 && marks<=50)
		{
			System.out.println("Grade D");
		}
		else if(marks>=0 && marks<=34)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		
	}
}
