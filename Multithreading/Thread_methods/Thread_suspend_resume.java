package Thread_methods;

class suspend_resume extends Thread
{
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Thread_suspend_resume {

	public static void main(String[] args) {
		suspend_resume ob8 = new suspend_resume();
		ob8.start();
//		ob8.suspend();
//		ob8.resume();
	}

}
