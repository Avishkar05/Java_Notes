/*
 * 7.A restaurant has a waiting list for tables. As customers arrive, they are added to the 
 * waiting list queue. When a table becomes available, the first customer in the queue is 
 * seated. Write a program to:Add customers to the waiting list.Serve (seat) the first customer
 * in the waiting list. Display the name of the seated customer and the remaining waiting list.
 * Input: addToWaitingList("Alice")
 * 		addToWaitingList("Bob")
 * 		addToWaitingList("Charlie")	
 * 		seatCustomer()
 * Output:
 * 		"Alice" (first customer seated)
 * 		Remaining Waiting List: [ "Bob", "Charlie"]
 */

package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Q7 {

	public static void main(String[] args) {
		Queue<String> Q7 = new LinkedList<String>();
		Q7.add("Alice");
		Q7.add("Bob");
		Q7.add("Charlie");

		System.out.println("Original : "+Q7);
		System.out.println("Dequed : "+Q7.poll());
		System.out.println("Remaining : "+Q7);

	}

}
