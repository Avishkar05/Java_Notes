package Abstraction;
import java.util.Scanner;
interface client4
{
	void input();	//by default public abstract
	void output();
	int a=10;	//by default public static final
}
class deveoper4 implements client4
{
	int num1,num2;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number : ");
		num1=sc.nextInt();
		this.num1=num1;
		num2=sc.nextInt();
		this.num2=num2;
	}
	public void output()
	{
		int sum=num1+num2;
		System.out.println("sum = "+sum);
	}
}
public class Abstraction_ex4 {

	public static void main(String[] args) {
		developer ob4= new developer();
		ob4.input();
		ob4.output();
		System.out.println("Value of A inside interface is : "+client4.a);
	}

}