package Throw;


class division extends Exception
{
	division(String msg)
	{
		super(msg);
	}
}

class invaliddenominator extends Exception
{
	invaliddenominator(String msg1)
	{
		super(msg1);
	}
}
public class Throw_basics1 {

	public static void main(String[] args) throws division, invaliddenominator
	{
		 int a=20,b=0;
		 
			if (b == 0) 
			{
				throw new invaliddenominator("do not take zero as denominate");
			} 
			
//			else if (a == 0 )
//			{
//				throw new invaliddenominator("a number is zero");
//			}
			else 
			{
				System.out.println(a / b);
			}

	}

}
