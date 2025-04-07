package objects;

public class Sumofdigit_countofdigit {

	int num=10200;
	int temp=num;
	int temp1=num;
	
	void sumof_digit()
	{
		System.out.println(num);
		int rem;
		int sum=0;
		while(num>0)
		{
			rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println("Sum fo digit : " + sum);
	}
	
	void hr_n()
	{
		if(temp%10==0)
		{
			System.out.println("H");
		}
		else {
			System.out.println("N");
		}
	}
	
	void cnt_dig()
	{
		int rem1;
		int count=0;
		while(temp1>0)
		{
			rem1 = temp1%10;
			count++;
			temp1 /=10;
		}
		System.out.println("count of digit : "+count);
	}
	
	public static void main(String[] args) {
		Sumofdigit_countofdigit ob=new Sumofdigit_countofdigit();
		ob.sumof_digit();
		ob.hr_n();
		ob.cnt_dig();
	}

}
