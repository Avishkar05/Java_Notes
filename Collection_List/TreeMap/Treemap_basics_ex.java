package TreeMap;

import java.util.*;

public class Treemap_basics_ex {

	public static void main(String[] args) {
		
		TreeMap <Object,Object> map2 = new TreeMap<Object,Object>();
		
		map2.put(01, "Avishkar");
		map2.put(05, "Onkar");
		map2.put(03, "Ketan");
		map2.put(02, "Vilas");
		map2.put(07, "Sahil");
		map2.put(04, "Rohan");
		
		System.out.println(map2);
		
//		To retrive and delete first element
		System.out.println(map2.pollFirstEntry());
		System.out.println(map2);
		
//		To retrive and delete Last element
		System.out.println(map2.pollLastEntry());
		System.out.println(map2);
		
		System.out.println(map2.size());
		
	}

}
