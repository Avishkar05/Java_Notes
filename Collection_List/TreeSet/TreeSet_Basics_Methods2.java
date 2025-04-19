package TreeSet;

import java.util.TreeSet;

public class TreeSet_Basics_Methods2 {

	public static void main(String[] args) {
		
		TreeSet <Integer> t2 = new TreeSet <Integer>();
		t2.add(23);
		t2.add(1);
		t2.add(67);
		t2.add(1);
		int ele = 60;
		
		System.out.println("Original t2 :"+t2);
		
		System.out.println(" > "+t2.higher(ele));		// >
		System.out.println(" < "+t2.lower(ele));		// <
		
		//Use to check greater(close) than equal to given data
		System.out.println("greater(close) to element :"+t2.ceiling(ele));	// >=
		
		//Use to check Lower(close) than equal to given data
		System.out.println("Lower(close) to element :"+t2.floor(ele));		// <=
		
		System.out.println(t2.first());		//Print first element
		System.out.println(t2.last());		//Print last element
		System.out.println(t2.pollFirst());	//Print first element and delete it
		System.out.println(t2.pollLast());	//Print last element and delete it
		System.out.println(t2);
		 
	}

}
