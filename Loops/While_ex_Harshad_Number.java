package Loops;

import java.util.Scanner;

public class While_ex_Harshad_Number {

	public static void main(String[] args) {

		//int num=200;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print addition of given numbers and check wether the number is Harshad number or not");
		int num=sc.nextInt();
		int Tnum=num;
		int rem;				
		int sum=0;	
		
		while(num>0){			
			rem = num % 10;		
			sum = sum + rem;	
			num = num / 10;	
		}
		System.out.println("Sum of Given Number is : "+sum);

		if(Tnum%sum==0) {
			System.out.println("Number is Harshad Number");
		}
		else {
			System.out.println("Number is Not Harshad Number");
		}
	}

}
