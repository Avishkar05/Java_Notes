package Try_Catch;

import java.util.Scanner;

public class Try_catch_throw2 {
	
	static void dividion (int a,int b)
	{
		if(a==0 || b==0) {
			throw new ArithmeticException("Enter valid values");
		}
		else {
			System.out.println(a/b);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a =sc.nextInt();
		System.out.println("Enter value of b :");
		int b =sc.nextInt();
		
		try {
			dividion(a, b);
		}
		
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
