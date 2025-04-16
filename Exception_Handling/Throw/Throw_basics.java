package Throw;

public class Throw_basics {

	public static void main(String[] args) {
		
		int a=20,b=10;
		if(b==0)
		{
			throw new ArithmeticException("a is equal to 0 so can't perfom dividion");
		}
		else {
			System.out.println(a/b);
		}
		
	}

}
