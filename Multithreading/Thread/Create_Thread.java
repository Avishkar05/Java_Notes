package Thread;
// 1ST way to create Thread
class demo1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

public class Create_Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		demo1 ob1 = new demo1();
		ob1.start();
	}

}
