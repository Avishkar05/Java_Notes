package Vector;

import java.util.Vector;

public class Vector_basic {

	public static void main(String[] args) {

		Vector<Integer> E = new Vector<Integer>(5,3);
//		System.out.println(E.capacity());
		 
		E.addElement(10);
		E.addElement(20);
		E.addElement(30);
		E.addElement(40);
		E.addElement(50);
		System.out.println(E.capacity());


		E.addElement(110);
		System.out.println(E.capacity());
		
	}

}
