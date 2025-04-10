package String_Class_Methods;

public class Comparison_Methods {

	public static void main(String[] args) {
		
		String Username = "Avishkar";
		String password= "123adsd3";
		String password1= " ";
		
		System.out.println(password1.isEmpty());
		//Return true When String is Empty(Without Spaces)
		
		
		System.out.println(password1.isBlank());
		//Return true When String is Empty(With Spaces)
		
		
		System.out.println(Username.equals(password));
		//Return True When Two String Are Equal
		
		System.out.println(Username.equalsIgnoreCase(password));
		//Return True When If both strings have the same characters, regardless of Uppercase or lowercase
		
		
		String s1="95";
		String s2="98";

		String s3="DC";
		String s4="bc";

		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareToIgnoreCase(s1));
		//Returns 0 → If both strings are equal.
		//Returns a negative value (<0) → If str1 is lexicographically smaller than str2.
		//Returns a positive value (>0) → If str1 is lexicographically greater than str2.
		System.out.println(s4.compareTo(s3));
		System.out.println(s4.compareToIgnoreCase(s3));
		
		
		
		
		
		
		
		
		
		
		
		
		if(Username.isBlank())
		{
			System.out.println("Plz Enter UserName");
		}
		else if(password.isBlank())
		{
			System.out.println("Plz Enter Password");			
		}
		else{
			System.out.println("login Successful");
		}
		
	}

}
