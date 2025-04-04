package Loops;

import java.util.Scanner;

public class While_ex4_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=123;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse ");
		int num=sc.nextInt();
		
		int tnum=num;
		int rem;
			//3
			//2
			//1
		
		int rev=0;
			//3
			//32
			//321
		
		while(num>0)
			//123>0 T
			//12>0 T
			//1>0 T
			//0>0 F
		{
			rem = num%10;
				//rem=123%10=3
				//rem=12%10=2
				//rem=1%10=1
			
			rev = rev * 10 + rem;
				//rev=0*10+3=3
				//rev=3*10+2=32
				//rev=32*10+1=321
			
			num = num /10;
				//num=123/10=12
				//num=12/10=1
				//num=1/10=0
			
		}
		System.out.println("reverse number of "+tnum+" is "+rev);//321
		
		if(tnum==rev) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
			
	}

}
