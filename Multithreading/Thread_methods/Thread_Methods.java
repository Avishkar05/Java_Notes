package Thread_methods;

class Thread_name extends Thread
{
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class Thread_Methods {

	public static void main(String[] args) {
		
		Thread_name ob5 = new Thread_name();
		ob5.setName("first");
		ob5.start();
	}

}
