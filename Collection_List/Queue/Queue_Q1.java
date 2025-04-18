package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Write a program to simulate the queue of passengers waiting to go through airport security. 
 * Add passengers to the queue as they arrive and remove them when they are checked. 
 * Display each passenger being checked.
 */

public class Queue_Q1 {

	public static void main(String[] args) {

		Queue<String> Q1 = new PriorityQueue<String>();

//        Q1.add("Passenger1");
//        Q1.add("Passenger2");
//        Q1.add("Passenger3");
//        Q1.add("Passenger4");
//
//        System.out.println("Passengers are being checked:");
//
//        while (!Q1.isEmpty()) {
//            String passenger = Q1.poll();
//            System.out.println(passenger + " is checked.");
//        }
        
        String[] passengers = {"Passenger1", "Passenger2", "Passenger3", "Passenger4"};
        
        for (String s : passengers) 
        {
			Q1.add(s);
		}
        
        System.out.println(Q1);
        
        while (!Q1.isEmpty()) 
        {
			System.out.println("Checked : "+Q1.poll());
		}
        
        if(Q1.isEmpty())
        {
        	System.out.println("All passenger beging Checked!!!!");
        }
        
	}
	
}
