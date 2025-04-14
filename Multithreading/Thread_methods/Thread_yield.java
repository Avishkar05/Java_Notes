package Thread_methods;

class yield_method extends Thread
{
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}
public class Thread_yield {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		}
		
		yield_method ob4 = new yield_method();
		ob4.start();
		
		yield_method ob41 = new yield_method();
		ob41.start();

	}

}
