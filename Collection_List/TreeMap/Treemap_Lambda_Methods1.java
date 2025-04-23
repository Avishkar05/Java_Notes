package TreeMap;

import java.util.*;

public class Treemap_Lambda_Methods1 {

	public static void main(String[] args) {
		
//		Use to compare String and then Short in ascending order using only first letter
		Comparator<Object> com = (o1,o2)->o1.toString().compareTo(o2.toString());
		TreeMap <Object,Object> map3 = new TreeMap<Object,Object>(com);
		
		map3.put(10, "Avishkar");
		map3.put(20, "Onkar");
		map3.put(30, "Ketan");
		map3.put("Komal", "Vilas");
		map3.put("Dipak", "Sahil");
		map3.put(40, "Rohan");
		map3.put(5.5, 67);
		
		System.out.println(map3);
		
		
		for (Map.Entry e: map3.entrySet()) {
			System.out.println(e.getKey()+" - > "+ e.getValue());
		}
		
		
	}

}
