package Switch_Case;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a,b,choice,sum,sub,mul,div;
		System.out.println("Enter value of A:");
		a=sc.nextInt();
		System.out.println("Enter value of B:");
		b=sc.nextInt();
		System.out.println("Selecte Choice:\n1.Addition: \n2.Substraction: \n3.multiply: \n4.divide:");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			sum=a+b;
			System.out.println("Addition is :"+sum);
			break;
			
		case 2:
			sub=a-b;
			System.out.println("Substraction is :"+sub);
			break;
			
		case 3:
			mul=a*b;
			System.out.println("multiply is :"+mul);
			break;
			
		case 4:
			div=a/b;
			System.out.println("divide is :"+div);
			break;
			
		default:
			System.out.println("invaild choice");
		}

	}

}
