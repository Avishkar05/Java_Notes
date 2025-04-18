package Set;

import java.util.HashSet;

public class HashSet_Methods {

	public static void main(String[] args) {
		
		HashSet<Integer> h2 = new HashSet<Integer>();
		
		h2.add(22);
		h2.add(23);
		h2.add(1);
		
		System.out.println("Hashset list : "+h2);
		System.out.println("Size : "+h2.size());
		System.out.println("Empty or not : "+h2.isEmpty());
		System.out.println("Contains element : "+h2.contains(22));
//		h2.clear();
//		System.out.println("After clear : "+h2);
		
//		HashSet<Integer> h2a = new HashSet<Integer>(h2);	//Copy using Parameter
		HashSet<Integer> h2a = new HashSet<Integer>();
		
		//Deep copy
		h2a.addAll(h2);
		System.out.println("After copy :"+h2a);
		
		//shallow copy
		h2a = (HashSet<Integer>) h2.clone();
		h2a.add(12); 
		System.out.println("After copy :"+h2a);
		
		//Check object are equal or not
//		System.out.println(h2a.equals(h2));
		if (h2a.equals(h2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
		
		//To print common data 
		h2.retainAll(h2a);
		System.out.println("Common Data between h2 and h2a : "+h2);
		
	}

}
