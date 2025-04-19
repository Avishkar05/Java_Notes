package Map;

import java.util.HashMap;

public class Map_Basics_Ex2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m2 = new HashMap<Integer,String>();
		m2.put(101, "Komal");
		m2.put(102, "shantanu");
		m2.put(103, "dinesh");
		m2.put(106, "poonam");
		m2.put(102, "ajit");
		m2.put(null, "null");
		m2.put(null, "sachin");
		
		m2.putIfAbsent(110, "ajit");
		
		System.out.println(m2);
		
		System.out.println(m2.size());
		
		System.out.println(m2.replace(101, "Ketan"));
		
		System.out.println(m2.get(101));
				
		m2.remove(106, "poonam");
		System.out.println(m2);

		
		
	}

}
