package Try_Catch;


public class Try_catch_throw {
	
	static void dividion (int a,int b)
	{
		if(b==0) {
			throw new ArithmeticException("hello");
		}
		else {
			System.out.println(a/b);
		}
	}

	public static void main(String[] args) {
		
		try {
			dividion(20, 10);
//			String s = null;
			String s = "asd";
			System.out.println(s.length());
			throw new NullPointerException("String is null");
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		catch (NullPointerException e1) {
			System.out.println(e1);
		}
		
//		finally {
//			throw new NullPointerException("String is null");			
//		}
	}
}
