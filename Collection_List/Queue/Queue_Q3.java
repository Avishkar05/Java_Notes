package Queue;

import java.util.PriorityQueue;

public class Queue_Q3 {

	public static void main(String[] args) {

		PriorityQueue<String> arriveAtBank = new PriorityQueue<String>();
		arriveAtBank.add("David");
		arriveAtBank.add("Laura");
		arriveAtBank.add("Tom");
		
		System.out.println("-----------Q5 STARTED------------");
		System.out.println("Initial Customers Queue: " + arriveAtBank);
		System.out.println(arriveAtBank.poll() + " ------> First Customer Served");
		System.out.println("Remaining in Queue: " + arriveAtBank);
		System.out.println();


		System.out.println("-----------Q6 STARTED------------");
		PriorityQueue<String> customer = new PriorityQueue<String>();
		customer.add("John");
		customer.add("Sarah");
		customer.add("Mike");
		System.out.println("Initial Customers Queue: " + customer);
		System.out.println(customer.poll() + " ------> First Customer Served");
		System.out.println("Remaining Support Queue: " + customer);
		System.out.println();


		System.out.println("-----------Q7 STARTED------------");
		PriorityQueue<String> WaitList = new PriorityQueue<String>();
		WaitList.add("Alice");
		WaitList.add("Bob");
		WaitList.add("Charlie");
		System.out.println("Initial Customers Queue: " + WaitList);
		System.out.println(WaitList.poll() + " ------> First customer Seated");
		System.out.println("Remaining Waiting List: " + WaitList);

	}

}
