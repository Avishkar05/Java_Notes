package Overloading;

class feb19{
	
	String n;
	feb19(String name)
	{
		n=name;
	}
	
	feb19(feb19 f1)
	{
		n=f1.n;
	}
	
	void display()
	{
		System.out.println(n);
	}
}

public class Copy_Constructer_ex1 {

	public static void main(String[] args) {
		feb19 f1=new feb19("abc");
		f1.display();
		feb19 f2=new feb19(f1);
		f1.display();
	}

}
