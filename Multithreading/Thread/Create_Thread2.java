package Thread;

class demo3 extends Thread
{
	public void run() 
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Create_Thread2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		demo3 ob3 = new demo3();
		ob3.start();
		demo3 ob4 = new demo3();
		ob4.start();

	}

}
