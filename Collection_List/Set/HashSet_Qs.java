package Set;

import java.util.HashSet;

public class HashSet_Qs {

	public static void main(String[] args) {
//		1. HashSet Is Empty Or Not
		HashSet<Integer> Q1 = new HashSet<Integer>();
		Q1.add(10);
		Q1.add(20);
		Q1.add(30);
		System.out.println(Q1.isEmpty());

//		2. Write a program to add all the elements of a specified hash set to another hash set
		HashSet<Integer> Q2 = new HashSet<Integer>();
		Q2 = (HashSet<Integer>) Q1.clone();
		System.out.println("Clone : "+Q2);
		
//		3.Write a program to compare two hash set
		HashSet<Integer> Q3 = new HashSet<Integer>();
		Q3.add(10);
		Q3.add(30);
		System.out.println("Equal or not :"+Q3.equals(Q2));
		
		
//		4. Append The Specified Element To The End To HashSet
		HashSet<Integer> Q4 = new HashSet<Integer>();
		Q4.add(15);
		System.out.println(Q4);
		
//		5. Write a program to compare two sets and retain elements which are same on both sets. 
		HashSet<Integer> Q5 = new HashSet<Integer>(Q1);
		Q5.retainAll(Q1);
		System.out.println("Common Data between Q5 and Q1 : "+Q5);

//		6. Write a program to remove all of the elements from a hash set.
		HashSet<Integer> Q6 = new HashSet<Integer>();
		Q6.addAll(Q1);
		Q6.clear();
		System.out.println("After Clear :"+Q6);
		
		
//		7. Write a program to get the number of elements in a hash set.
		HashSet<Integer> Q7 = new HashSet<Integer>(Q1);
		System.out.println("Size :"+Q7.size());
		
		
	}

}
