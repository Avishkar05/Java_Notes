package Loops;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class While_count_digit {

	public static void main(String[] args) {
		
		int num=1234;
		int rem;
		
		int count=0;
		
		while(num>0)
			//123>0 T
		{
			rem = num%10;
				//123%10=3
			count++;
			num=num/10;
		}
		System.out.println(count);

	}

}
