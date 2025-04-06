/*Abstraction is a process of hidding implementation details and showing only functionality  to the user
Abstract class =make class as abstract by using abstract keyword in abstract class there are 
 two types 1.abstract method
2.non-abstract method
two way to achive
*/
package Abstraction;

import java.util.Scanner;

abstract class client	//Abstract Class
{
	abstract void input();	//Abstract Method
	abstract void output();	//Abstract Method
}

class developer extends client
{
	int num1,num2;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
	}
	
	void output() 
	{
		int sum = num1 + num2;
		System.out.println("Addition is : "+sum);
	}
	
	void fact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for fact : ");
		int num=sc.nextInt();
	
		double fact = 1;
		for (int i = 1; i <= num; i++) 
		{
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
	}
}

public class Abstraction_ex1 {

	public static void main(String[] args) {
		developer ob = new  developer();
		ob.input();
		ob.output();
		ob.fact();

	}

}
