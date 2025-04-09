package String;

public class String_TO_CharArray2 {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		String s2 = "abc";
		String s22="";
		
		for (int i = 0; i < s2.length(); i++) 
		{
			char a=s2.charAt(i);
			s22 = s22+ a + "" + a;
		}
		System.out.println(s22);

	}

}
