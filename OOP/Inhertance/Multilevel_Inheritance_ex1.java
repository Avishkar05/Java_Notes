package Inhertance;

class A
{
	void showA()
	{
		System.out.println("Base class");
	}
}

class B extends A
{
	void showB()
	{
		System.out.println("Derived class B of Base class A");
	}
}

class C extends B
{
	void showC()
	{
		System.out.println("Derived class C of Base class B");
	}
}

public class Multilevel_Inheritance_ex1 {

	public static void main(String[] args) {
		
		 C ob = new C();
		 ob.showC();
		 ob.showB();
		 ob.showA();

	}

}
