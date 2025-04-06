package Polymorphism;

class base
{
	void get(float n)
	{
		System.out.println("first_Base");
	}
}

class child extends base
{
	void get(float n)
	{
		super.get(10);
		System.out.println("first_Child");
	}
}

public class Method_Overriding_Ex1 {

	public static void main(String[] args) {
		child ob = new child();
		ob.get(10f);
	}

}
