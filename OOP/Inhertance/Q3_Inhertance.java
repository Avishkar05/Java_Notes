package Inhertance;
import java.util.Scanner;

class bank2
{
	
	Scanner scc = new Scanner(System.in);
	
	void deposite(double amount)
	{
		int d;
		System.out.println("Enter amount to deposite");
		d = scc.nextInt();
		amount = amount + d;
		System.out.println("Amount after deposite : "+ amount);
	}
	void withdraw(double amount)
	{
		int w;
		System.out.println("Enter the amount to withdraw : ");
		w = scc.nextInt();
		
		if(amount >= w)
		{
			amount = amount - w;
			System.out.println("AMount after withdraw : "+ w);
		}
		else
		{
			System.out.println("Transaction failed.......!");
//			System.out.println("Your Balance amount is : "+ amount);
		}
	}
	
}

public class Q3_Inhertance {

	public static void main(String[] args) {
		
		bank2 ob2 = new bank2();
		double amount;
		Scanner scc1 = new Scanner(System.in);
		System.out.println("Enter amount : ");
		amount = scc1.nextDouble();
		System.out.println("Enter Choice : \n1.deposite \n2.withdraw");
		int ch=scc1.nextInt();
		
		switch(ch)
		{
		case 1:
			ob2.deposite(amount);
			break;
			
		case 2:
			ob2.withdraw(amount);
			break;
		
		default:
			System.out.println("Invalid Choice!!");		
		}
	}

}
