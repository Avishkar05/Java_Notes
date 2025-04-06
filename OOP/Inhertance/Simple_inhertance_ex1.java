package Inhertance;

class bank
{
	void terms()
	{
		System.out.println("Terms of Banks");
	}
}

class HDFC extends bank   //derived extends class
{
	void terms1()
	{
		System.out.println("Terms of HDFC Banks");
	}
}


public class Simple_inhertance_ex1 {

	public static void main(String[] args) {
		
		HDFC ob1 = new HDFC();
		ob1.terms();			// Use of Inhertance
		ob1.terms1();
		
	}

}
