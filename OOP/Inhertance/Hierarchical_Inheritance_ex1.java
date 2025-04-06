package Inhertance;

class AA
{
	void showa()
	{
		System.out.println("Base class A");
	}
}

class BB extends AA
{
	void showb()
	{
		System.out.println("Derived class B of Base class A");
	}
}

class CC extends AA
{
	void showc()
	{
		System.out.println("Derived class C of Base class A");
	}
}


public class Hierarchical_Inheritance_ex1 {

	public static void main(String[] args) {
		
		BB ob=new BB();
		ob.showa();
		ob.showb();
		CC ob1=new CC();
		ob1.showa();
		ob1.showc();
	}

}
