package Java_Keywords;

class example
{
	void one(int n)
	{
		System.out.println("one = "+n);
	}
	void two(String name)
	{
		one(2);
		System.out.println("two = "+name);
	}
	void three()
	{
		two("Abcd");
		System.out.println("Three ");
	}
}

public class This_Method {

	public static void main(String[] args) {

		example ob = new example();
		ob.three();

	}

}
