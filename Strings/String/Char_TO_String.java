package String;

public class Char_TO_String {

	public static void main(String[] args) {
		
		char ch[] = {'a','b','c'};
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		String s1 = new String(ch);
		System.out.println(s1);

	}

}
