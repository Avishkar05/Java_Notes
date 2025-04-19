package Vector;

import java.util.*;

public class Vector_Methods {

	public static void main(String[] args) {
		
		Vector <Integer> v = new Vector<Integer>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);

		System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());
		
		v.removeElement(40);
		System.out.println(v);

		v.removeElementAt(0);
		System.out.println(v);
		
		Object o = v.clone();
		System.out.println("Clone : "+o);
		
		System.out.println(v.reversed());
		

	}

}
