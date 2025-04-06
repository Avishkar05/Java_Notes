//Note :- Hybrid Inhertance is not Possible
package Inhertance;

class h_A
{
	void Show_h_A()
	{
		System.out.println("Base class A");
	}
}

class h_B extends h_A
{
	void Show_h_B()
	{
		System.out.println("Derived class B of Base class A");
	}
}

class h_D extends h_B
{
	void Show_h_D()
	{
		System.out.println("Derived class D of Base class B\n");
	}
}

class h_C extends h_A
{
	void Show_h_C()
	{
		System.out.println("Derived class C of Base class A");
	}
}

public class Hybrid_Inheritance_ex1 {

	public static void main(String[] args) {
		
		h_D ob = new h_D();
		ob.Show_h_A();
		ob.Show_h_B();
		ob.Show_h_D();
		
		h_C ob1 = new h_C();
		ob1.Show_h_A();
		ob1.Show_h_C();
		

	}

}