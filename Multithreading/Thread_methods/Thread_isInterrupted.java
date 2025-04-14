package Thread_methods;

class Thread_interrupted extends Thread {
	public void run() {

		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println(i);
				System.out.println(Thread.currentThread().isInterrupted());
				Thread.sleep(3000);
			}
		} catch (Exception E) {
			System.out.println("Exception occured!!!!!!!!!!!!!");
		}
	}
}

public class Thread_isInterrupted {

	public static void main(String[] args) {

		Thread_interrupted ob1 = new Thread_interrupted();
		ob1.start();
		
		
		ob1.interrupt();
		
		Thread_interrupted ob11 = new Thread_interrupted();
		ob11.start();
		

	}

}
