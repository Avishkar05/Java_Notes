package Abstraction;

interface ex1
{
	static void java()
	{
		System.out.println("java Trainer");
	}
	
	default void python()
	{
		System.out.println("Python Trainer");
	}
	
	void testing();
}

class myclass implements ex1
{
	public void testing() {
		System.out.println("Testing tainer");
	}
}

public class Interface_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1 t = new  myclass();
		t.python();
		t.testing();
		ex1.java();
	}

}
