package Thread_methods;

class Priority extends Thread
{
	public void run() {
		for (int i = 0; i < 3; i++) {
//			System.out.println(i);
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}

public class Thread_Priority {

	public static void main(String[] args) {
		System.out.println("main :"+Thread.currentThread().getPriority());

		Priority ob3 = new Priority();
		ob3.start();
		
		Priority ob31 = new Priority();
		ob31.start();
		ob31.setPriority(10);
	}

}
