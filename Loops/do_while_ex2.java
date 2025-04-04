package Loops;

import java.util.Scanner;

public class do_while_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number For Table");
		int num=sc.nextInt();
		//int num=2;
		int i=1;
		do {
			int T=num*i;
			System.out.println(num+" * "+i+" : "+T);
			i++;
		}
		while(i<=10);
	}

}
