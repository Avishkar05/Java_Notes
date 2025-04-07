package Overloading;

class demo1
{
	static void get() 
	{
		System.out.println("Static get");
	}
}

public class Static_ex1 {

	static void st() 
	{
		System.out.println("st");
	}

	public static void main(String[] args) {
	demo1 d1=new demo1();
	demo1.get();
	st();
		

	}

}
