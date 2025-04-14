package Thread_methods;

class Statename extends Thread
{
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());		// Prints thread name (default: Thread-0)
			System.out.println(Thread.currentThread().getId());			// Prints thread ID
			System.out.println(Thread.currentThread().isAlive());		// true (while thread is running) 	
			System.out.println(Thread.currentThread().activeCount());	// Approx active threads count
		}
	}
}

public class Thread_SetName {

	public static void main(String[] args) {
		
		Statename ob6 = new Statename();
		try 
		{
			ob6.join();
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		ob6.start();
	}

}
