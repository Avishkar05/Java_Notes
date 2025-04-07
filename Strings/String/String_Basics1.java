package String;

public class String_Basics1 {

	public static void main(String[] args) {

		String s = "Java";
		String s1 = "Hefshine";
				
		//TO Combine String		--> s.concat(s1)
		String s2 = s.concat(s1);
		System.out.println(s2);
		
		
		//TO Combine String short		--> s.concat(s1)
		System.out.println(s.concat(s1));
		
		
		//TO Get Length of String 		--> length()
		System.out.println("Java : "+s.length());  		//4
		System.out.println("Hefshine : "+s1.length());	//8
		
		
		//TO Find Index number by it Index Value		--> indexOf(2)
		System.out.println("'f' is at index :"+s1.indexOf('f'));	
		
		
		//TO Find Index value by it Index number		--> charAt(2)
		System.out.println("Index 2 : "+s1.charAt(2));
		
		

	}

}
