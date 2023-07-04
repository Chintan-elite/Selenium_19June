package oops;

class Student
{
	int id;
	String name;
	
	Student()
	{
		System.out.println("Constructor calling...");
	}
	
	Student(int a)
	{
		System.out.println("Value of a : "+a);
	}
	
	
	Student(String name)
	{
		System.out.println("My name is : "+name);
	}
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void print()
	{
		System.out.println(id+" "+name);
	}
	
	
}

public class O002_Second {
	public static void main(String[] args) {
		
		Student st = new Student(10,"Nikunj");
		st.print();
		
		Student st1 = new Student(20,"Taushif");
		st1.print();
		
		
	}
}
