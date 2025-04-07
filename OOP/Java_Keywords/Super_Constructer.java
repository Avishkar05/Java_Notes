package Java_Keywords;

class Super_con1
{
	Super_con1(String name)
	{
		System.out.println("one "+name);
	}
}

class Super_con2 extends Super_con1
{
	Super_con2()
	{
		super("ABCD");
		System.out.println("Two");
	}
}



public class Super_Constructer {

	public static void main(String[] args) {
		
		Super_con2 ob = new Super_con2();
		
		
	}

}
