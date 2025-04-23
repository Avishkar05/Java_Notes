package TreeMap;

import java.util.*;

public class Treemap_basics_Methods3 {

	public static void main(String[] args) {
		
		TreeMap <Object,Object> map3 = new TreeMap<Object,Object>();
		
		map3.put(10, "Avishkar");
		map3.put(20, "Onkar");
		map3.put(30, "Ketan");
		map3.put(50, "Vilas");
		map3.put(70, "Sahil");
		map3.put(40, "Rohan");
		
		System.out.println(map3);
		
		System.out.println(map3.descendingMap());
		
		System.out.println(map3.descendingKeySet());
		
		
	}

}
