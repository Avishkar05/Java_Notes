package Java_Keywords;
class This_Const
{
	This_Const()
	{
		System.out.println("no arg");
	}
	
	This_Const(String name)
	{
		this();
		System.out.println("Para : " + name);
	}
	
	This_Const(int name)
	{
		this("ABCD");
		System.out.println("Para - "+name);
	}
}

public class This_Constructer {

	public static void main(String[] args) {
		
		This_Const ob=new This_Const("ABCDE");

	}

}
