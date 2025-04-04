package Loops;

import java.util.Scanner;

public class While_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		while (age <= 0) 
		{
			System.out.println("Enter Your Age");
			age = sc.nextInt();
			
			if (age <= 0) 
			{
				System.out.println("=========Enter your Valid Age=========");
			} 
			
			else 
			{
				System.out.println("yes it's your age : "+age);
			}
		}

	}

}
