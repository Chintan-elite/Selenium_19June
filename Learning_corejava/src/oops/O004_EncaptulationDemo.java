package oops;

class Stud
{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	public void setData(int id, String name)
//	{
//		this.id = id;
//		this.name = name;
//	}
//	
//	public void display()
//	{
//		System.out.println(id+" "+name);
//	}/
	
	
}

public class O004_EncaptulationDemo {
	
	public static void main(String[] args) {
		
		Stud std = new Stud();
//		std.setData(10, "Nikunj");
//		std.display();
		
		std.setId(20);
		std.setName("Nikunj");
		
		
		System.out.println(std.getId()+" : "+std.getName());
		
		
	}
}
