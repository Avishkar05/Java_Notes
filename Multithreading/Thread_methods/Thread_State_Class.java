package Thread_methods;

class State_Class extends Thread{
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getState());
			System.out.println(Thread.currentThread().getClass());
		}
	}
}

public class Thread_State_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State_Class ob = new State_Class();
		ob.start();
		

	}

}
