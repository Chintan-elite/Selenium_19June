package statements;

import java.util.Scanner;

public class S003_SwitchCase {
	public static void main(String[] args) {
		
		int choice = 0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 :
			System.out.println("You have choose Gujarati");
			break;
		case 2 :
			System.out.println("You have choose Hindi");
			break;
		case 3 : 
			System.out.println("You have choose English");
			break;
		case 0 : 
			System.out.println("Exit !!!");
			break;
		default : 
			System.out.println("Invalid choice!!!");
		}
		}while(choice!=0);
		
		
	}
}
