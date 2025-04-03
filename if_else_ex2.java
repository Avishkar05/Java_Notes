package if_else;

import java.util.Scanner;

public class if_else_ex2 {

	public static void main(String[] args) {

		/*
		 * Design a program that simulates at ATM withdraw process.Base on the amount
		 * request,it should output whether when transaction is successful or not base
		 * on the following condition.
		 * 
		 * :The Account balance is Sufficient. :the amount request is multiple of 200
		 */

		int balance, withdrawamt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Balance Amount");
		balance = sc.nextInt();
		System.out.println("Enter withdrawamt Amount");
		withdrawamt = sc.nextInt();

		if (withdrawamt < balance) {
			System.out.println("");
			if (withdrawamt % 200 == 0) {

				balance = balance - withdrawamt;

				System.out.println("withdraw operation is successful" + "\nAvalable Balance :" + balance);
			}

			else {
				System.out.println("withdraw operetion is Unsuccessful");
			}

		}

		else {
			System.out.println("Insufficent Amount");
		}
		
		

	}

}
