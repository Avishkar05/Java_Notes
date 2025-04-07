package Java_Keywords;

class feb
{
	int n;
	void get(int n)
	{
		this.n=n;	//This keyword
	}
	void show()
	{
		System.out.println(n);
	}
}

public class This_Keyword {

	public static void main(String[] args) {
		
		feb ob=new feb();
		ob.get(2);
		ob.show();
		

	}

}
