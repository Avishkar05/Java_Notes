package Try_Catch;

public class Try_Catch_finally_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Hello, This is Exception Handling");
		
		//Always have (Try + Catch) or (Try + finally)
		
		//Use to Throw the exception when occurs
		try {
//			int a=10,b=2,c;
//			c=a/b;
//			System.out.println(c);
			
			String a=null;
			System.out.println(a);
			System.out.println("No Exception Error");
		}
		
		//use to catch the exception that throw by try block
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Error");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Error found!!");
		}
		
		
		//Finally Block is always executable block Either exception is found or not
		finally {
			System.out.println("This is finally Block");
		}

	}

}
