package Loops;

import java.util.Scanner;

public class While_ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rem;				//3 	//2 	//1
		int sum=0;				//3 	//5 	//6
		
		while(num>0){			//123>0 T.		12>0 T. 	1>0 T. 		 0>0 F.
			rem = num % 10;		//123%10=3.		12%10=2. 	1%10=1.
			sum = sum + rem;	//sum=0+3=3. 	sum=3+2=5. 	sum=1+5=6.
			num = num / 10;		//123/10=12. 	12/10=1.  	1/10=0.
		}
		System.out.println(sum);
	}

}
