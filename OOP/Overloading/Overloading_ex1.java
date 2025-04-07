package Overloading;

class demo
{
	void get()
	{
		System.out.println("Without Parameter");
	}
	
	void get(int n)
	{
		System.out.println("With Parameter : " + n);
	}
	
	void get(String name , int id)
	{
		System.out.println("With Two Parameter : " + name+ " and " + id);
	}
}

public class Overloading_ex1 {

	public static void main(String[] args) {
		demo d1 = new demo();
		d1.get();
		d1.get(5);
		d1.get("name",10);
		

	}

}
