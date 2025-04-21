package Map;

import java.util.*;

public class Map_using_loop2 {

	public static void main(String[] args) {
		
		HashMap<Object,Object> m3 = new HashMap<Object,Object>();
		
		m3.put(101, "komal");
		m3.put(102, "shantanu");
		m3.put(103, "dinesh");
		m3.put(106, "poonam");
		m3.put(102, "ajit");
		
		int count = 0;
		
		
		
		System.out.println(m3);
		
		for(Map.Entry e:m3.entrySet())
		{
			if (e.getKey().equals(1033)) {
				System.out.println("Present");
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Not Present");
		}
		
		
	}

}
