package Parameterized_Method;

import java.util.Scanner;

public class Parameterized_ex1 {

	int num;
	
	void sc() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for fact");
		num=sc.nextInt();
	}
	
	
	void get()
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Fact of number is "+fact);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_ex1 ob=new Parameterized_ex1();
		ob.sc();
		ob.get();

	}

}
