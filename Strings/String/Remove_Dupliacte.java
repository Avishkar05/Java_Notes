package String;

import java.util.Scanner;

public class Remove_Dupliacte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String s1 = "hhffrrsh";
		System.out.println("Enter String");
		String s1=sc.next();
//		System.out.println(s1);
		
		
		System.out.println("Before remov \n"+s1);
		
		System.out.println("After remove ");
		for(int i=0;i<s1.length();i++)
		{
			int count1=0;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count1++;
				}
			}
			
			if(count1 == 0)
			{
				System.out.print(s1.charAt(i));
			}
		}

	}

}
