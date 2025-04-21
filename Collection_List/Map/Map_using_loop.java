package Map;

import java.util.*;

public class Map_using_loop {

	public static void main(String[] args) {
		
		HashMap<Object,Object> m3 = new HashMap<Object,Object>();
		
		m3.put(101, "komal");
		m3.put(102, "shantanu");
		m3.put(103, "dinesh");
		m3.put(106, "poonam");
		m3.put(102, "ajit");
		
		int ele = 103;
		
		
		
		System.out.println(m3);
		
		for(Map.Entry e:m3.entrySet())
		{
			System.out.println(e.getKey()+ " : " + e.getValue());
		}
		
		
	}

}
