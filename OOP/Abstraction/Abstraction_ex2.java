package Abstraction;

import java.util.Scanner;

abstract class client1
{
	int num1,num2;
	abstract void input1();
	
	void output1()
	{
		
		System.out.println("Addition is = "+(num1+num2));
	}
}

class developer1 extends client1
{
	void input1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number = ");
		int num1 = sc.nextInt();
		super.num1=num1;
		int num2 = sc.nextInt();
		super.num2=num2;
	}
}

public class Abstraction_ex2 {

	public static void main(String[] args) {
		
		developer1 ob1 = new developer1();
		ob1.input1();
		ob1.output1();
		
	}

}
