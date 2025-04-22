package TreeMap;

import java.util.*;

public class Treemap_basics_ex {

	public static void main(String[] args) {
		
		TreeMap <Object,Object> map2 = new TreeMap<Object,Object>();
		
		map2.put(10, "Avishkar");
		map2.put(20, "Onkar");
		map2.put(30, "Ketan");
		map2.put(50, "Vilas");
		map2.put(70, "Sahil");
		map2.put(40, "Rohan");
		
		System.out.println(map2);
		
//		To retrive and delete first element
		System.out.println(map2.pollFirstEntry());
		System.out.println(map2);
		
//		To retrive and delete Last element
		System.out.println(map2.pollLastEntry());
		System.out.println(map2);
		
//		Return Higher Key then  Key
		System.out.println(map2.higherEntry(30));

//		Return Higher Key then  Parameter Key
		System.out.println(map2.higherKey(20));

//		Return Lower Key then Key
		System.out.println(map2.lowerEntry(30));
		
//		Return Lower Key then  Parameter Key
		System.out.println(map2.lowerKey(20));
		
		
		
	}

}
