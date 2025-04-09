package String;

public class String_TO_CharArray1 {

	public static void main(String[] args) {

		String a1 = "Hello";
		char ch1[] = a1.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			System.out.println(ch1[i]+ " " + i);
		}

	}

}
