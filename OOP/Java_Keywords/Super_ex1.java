package Java_Keywords;

class S_A
{
	int S_id=2;
	void show(int n)
	{
		System.out.println("Show = " + n);
	}
	
}

class S_B extends S_A
{
	int S_id=4;
	void get()
	{
		super.show(5);						//Super Method
		System.out.println(S_id);
		System.out.println(super.S_id);		//Super Variable
	}
}

public class Super_ex1 {

	public static void main(String[] args) {
		
		S_B ob = new S_B();
		ob.get();

	}

}
