package if_else;

import java.util.Scanner;

public class Largest_of_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1, no2, no3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number:");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		no3 = sc.nextInt();

		if (no1 > no2) {
			if (no1 > no3) {
				System.out.println(no1 + " is largest number");
			} else {
				System.out.println(no3 + " is largest number");
			}
		}

		else if (no2 > no3) {
			System.out.println(no2 + " is largest number");
		}

		else {
			System.out.println(no3 + " is largest number");
		}
	}

}
