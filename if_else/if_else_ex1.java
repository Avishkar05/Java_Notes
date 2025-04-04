package if_else;

import java.util.Scanner;

public class if_else_ex1 {

	public static void main(String[] args) {
		int salary,credit_score;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your Monthly Salary");
		salary=s1.nextInt();
		if(salary>50000) 
		{
			System.out.println("Enter credit score");
			credit_score=s1.nextInt();
			
			if(credit_score>750) 
			{
				System.out.println("Loan Is Approved");
				
			}
			else {
				System.out.println("Loan is Rejected due to low credit score");
			}
		}
		else {
			System.out.println("loan is Rejected due to low Salary");
		}
	}

}
