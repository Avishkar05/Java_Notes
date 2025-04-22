package TreeMap;

import java.util.TreeMap;

public class Treemap_basics_Methods {

	public static void main(String[] args) {
		TreeMap<Object,Object>  map = new TreeMap<Object,Object>();
		
		map.put(20, "Ketan");
		map.put(10, "Avishkar");
		map.put(70, "onkar");
		map.put(90, "vilas");
		map.put(200, "Sahil");
		
		System.out.println(map);
		
		//Use to print equal or greater 
		System.out.println(map.ceilingEntry(80));
		
		//Use to print equal or lower 
		System.out.println(map.floorEntry(60));
		
		
		
	}

}
