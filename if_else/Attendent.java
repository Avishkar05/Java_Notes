package if_else;

import java.util.Scanner;

public class Attendent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int at, bh;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Attendance");
		at = sc.nextInt();
		System.out.println("Enter the Behavior Rating (1 to 10)");
		bh = sc.nextInt();

		if (at >= 75 && bh >= 8)
		{
			System.out.println("You are allowed to attend the annual function");
		} 
		
		else if(at<75 && bh>=8)
		{
			System.out.println("You are Not allowed to attend the annual function, Because of low Attendance");
		}
		
		else if(at>=75 && bh<8) {
			System.out.println("You are Not allowed to attend the annual function, Because of low Behavior Rating");
		}
		
		else {
			System.out.println("You are Not allowed to attend the annual function, Because of low Attendance &  Behavior Rating");
		}

	}

}
