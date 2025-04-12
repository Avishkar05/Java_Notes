package Thread;

class Thread_trycatch extends Thread
{
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class Thread_using_Try_catch {

	public static void main(String[] args) {
		
		Thread_trycatch ob6 = new Thread_trycatch();
		ob6.start();
		try 
		{
			ob6.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread_trycatch ob61 = new Thread_trycatch();
		ob61.start();
		
		
	}

}
