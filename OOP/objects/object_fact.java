package objects;

public class object_fact {
	
	int num=5;
	int fact=1;
	int sum=0;
	
	void fact() {

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("fact : " + fact);
	}
	
	void sum()
	{
		for(int i=0;i<=num;i++)
		{
			sum = sum +i;
		}
		System.out.println("sum : "+sum);
	}
	
	void numdigit() {
		int numdigit=212;
		int sum=0;
		while(numdigit>0)
		{
			
			int rem = numdigit%10;
			sum=sum + rem;
			
			numdigit=numdigit/10;
		}
		System.out.println("Sum of digit : "+sum);
	}

	public static void main(String[] args) {
		object_fact ob=new object_fact();

		ob.fact();
		ob.sum();
		ob.numdigit();
	}

}
