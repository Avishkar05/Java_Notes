package Loops;

import java.util.Scanner;

public class do_while_factrioal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number For Factrioal");
		int num=sc.nextInt();
		//int num=5;
		int i=1;
		int fac=1;
		do {
			fac=fac*i;  
			i++;
		}
		while(i<=num);
		System.out.println("Factrioal of number "+num+" is : "+fac);
	}

}
