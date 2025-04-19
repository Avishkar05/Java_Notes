package Vector;

import java.util.*;

public class Vector_Methods2 {

	public static void main(String[] args) {
		
		Vector <String> v1 = new Vector<String>();
		
		v1.addElement("mango");
		v1.addElement("apple");
		v1.addElement("orange");
		v1.addElement("Grapes");
		System.out.println(v1);

//		Enumeration<String> e = new v1.elements();
		Enumeration<String> e = v1.elements();

		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
