package Loops;

public class For_ex1 {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int num3,i;
		System.out.print(num1+" "+num2+" ");
						//0 1 
		
		for(i=1;i<10;i++)
		{
			num3=num1+num2;
			//0 + 1=1
			//1+1=2
			//1+2=3 .....
			System.out.print(num3+" ");
							//print next number as num3
			num1=num2;
			//swap num1 to num2
			//0 -> 1
			//1 -> 1
			//1 -> 2
			//| -> |
			num2=num3;
			//swap num2 to num3
			//1 -> 1
			//1 -> 2
			//2 -> 3
			//| -> |
		}

	}

}
