package Map;

import java.util.HashMap;

public class Map_Basics_Ex {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(101, "Komal");
		m1.put(102, "shantanu");
		m1.put(103, "dinesh");
		m1.put(106, "poonam");
		m1.put(102, "ajit");
		m1.put(null, "null");
		m1.put(null, "sachin");
		System.out.println(m1);
		
		System.out.println(m1.get(102));
		
		m1.replace(101, "Ketan");
		System.out.println(m1.get(101));
		
		System.out.println(m1.containsKey(102));
		System.out.println(m1.containsValue("sachin"));
		
		System.out.println(m1.size());

	
	}

}
