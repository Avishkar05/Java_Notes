package Polymorphism;
/*
	Static							Global
	single copy						multiple copy
	method area						heap area
	can write once in class			can write once in class

*/

class cls
{
	static int id = 3;
	
	void get()
	{
		id = 3;
		System.out.println("id = " + id);
	}
}


public class Static_vs_global {

	public static void main(String[] args) {
		
		cls ob = new cls();
		ob.get();
	}

}
