package Set;

import java.util.HashSet;

public class HashSet_Basic_Ex {

	public static void main(String[] args) {
		
		HashSet <Integer> h1 = new HashSet<Integer>();
		
		h1.add(4);
		h1.add(23);
		h1.add(23);
		h1.add(1);
		h1.add(null);
		h1.add(null);
		System.out.println(h1);
	}

}
