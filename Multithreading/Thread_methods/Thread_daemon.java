package Thread_methods;

class daemon extends Thread
{
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().isDaemon());
		}
	}
}

public class Thread_daemon {

	public static void main(String[] args) {

		daemon ob9 = new daemon();
		ob9.setDaemon(true);
		ob9.start();

		daemon ob91 = new daemon();
		ob91.start();
	}

}
