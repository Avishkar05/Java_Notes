package Thread_methods;

class contexclassloder extends Thread
{
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(i);
			System.out.println(Thread.currentThread().getContextClassLoader());
		}
	}
}

public class Thread_ContexClassloder {

	public static void main(String[] args) {
		
		contexclassloder ob2 = new contexclassloder();
		ob2.start();
		
	}

}
