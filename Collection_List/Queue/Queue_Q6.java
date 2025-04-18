/*6. A customer support system handles customer queries on a first-come, first-served basis.
 *  Write a program that: Adds customers to a support queue as they arrive. Processes (serves) 
 *  the first customer in the queue. Displays the name of the served customer and the 
 *  remaining customers waiting for support.
 *  Input: addCustomer("John") 
 *  	addCustomer("Sarah")
 *  	addCustomer("Mike")	
 *  	serveCustomer()
 *  Output:
 *  	"John" (first customer served)
 *  	Remaining Support Queue: [ "Sarah", "Mike" ]
 */

package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Q6 {

	public static void main(String[] args) {
		Queue<String> Q6 = new LinkedList<String>();
		Q6.add("John");
		Q6.add("Sarah");
		Q6.add("Mike");

		System.out.println("Original : "+Q6);
		System.out.println("Dequed : "+Q6.poll());
		System.out.println("Remaining : "+Q6);

	}

}
