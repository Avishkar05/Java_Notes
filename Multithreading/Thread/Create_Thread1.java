package Thread;
//2nd way to create Thread
class demo2 implements Runnable
{
	void get()
	{
		System.out.println("get");
	}
	
	void show()
	{
		System.out.println("show");
	}
	
	public void run()
	{
		get();
		show();
		System.out.println(Thread.currentThread().getName());
	}
}

public class Create_Thread1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		demo2 ob2 = new demo2();
		Thread t1 = new Thread(ob2);
		t1.start();

	}

}
