package objects;

public class object_ex1 {
	
	int a=10;
	int b=20;
	int num=5;
	int fact=1;
	
	void add()
	{
		System.out.println("Addition is : "+(a+b));
	}
	
	void sub()
	{
		System.out.println("substraction is : "+(a-b));
	}
	
	void mul()
	{
		System.out.println("multiplication is : "+(a*b));
	}
	
	void div()
	{
		System.out.println("divide is : "+(a/b));
	}
	
	void fact() {
		
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println("fact = "+fact);
	}

	public static void main(String[] args) {
		
		//System.out.println("Wellcome");
		object_ex1 ob=new object_ex1();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
		ob.fact();
		
	}

}
