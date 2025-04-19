package TreeSet;

import java.util.TreeSet;

public class TreeSet_Basics_Methods {

	public static void main(String[] args) {
		
		TreeSet <Integer> t1 = new TreeSet <Integer>();
		t1.add(23);
		t1.add(1);
		t1.add(67);
		t1.add(1);
//		t1.add(null); 
		
		System.out.println("Original t1 :"+t1);
		System.out.println("Size t1 :"+t1.size());
		System.out.println("Contain t1 :"+t1.contains(20));
		System.out.println("Empty or not t1 :"+t1.isEmpty());
		
		TreeSet<Integer> t11 = new TreeSet<Integer>();
//		t11= (TreeSet<Integer>)t1.clone();
//		System.out.println("After copy t1 to t11 using Clone :"+t11);
		
		t11.addAll(t1);
		System.out.println("After copy t1 to t11 using addAll :"+t11);
		
		t11.remove(1);
		System.out.println("after delete '1' in t11 :"+t11);
		
		t11.retainAll(t1);
		System.out.println("retain :"+t11);
		
	}

}
