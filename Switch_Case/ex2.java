package Switch_Case;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		//WAP to input a number from the user and display the corresponding day of week Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number(1-7) to display day of week:-");
		int day=sc.nextInt();
		switch(day) {
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Invalid choice");
		
		}
		
		
		

	}

}
