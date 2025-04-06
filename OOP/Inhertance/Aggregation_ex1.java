package Inhertance;

class one
{
	void one1()
	{
		System.out.println("one");
	}
	
	void one2()
	{
		System.out.println("one1");
	}
}

class two
{
	one ob2 = new one();	//no need to extends class
	void two1()
	{
		System.out.println("Two");
	}
	
	void two2()
	{
		System.out.println("Two1");
	}
}

public class Aggregation_ex1 {

	public static void main(String[] args) {
		
		two ob1 = new two();
		ob1.two1();
		ob1.ob2.one1();
		ob1.two2();
		ob1.ob2.one2();
	}

}
