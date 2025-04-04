package Loops;

public class While_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		System.out.println("Odd number :");
		while(i<=10) {
			if(i%2!=0) {
				System.out.println(i);
				sum=sum+i;
			}
			i++;
		}
		System.out.println("Sum is:"+sum);
			
						

		
		System.out.println("\nEven number :");
		int j=0;
		int sum1=0;
		while(j<=10) {
			if(j%2==0) {
				System.out.println(j);
				sum1=sum1+j;
						
			}
		    j++;

		}
		System.out.println("Sum is:"+sum1);
	}

}
