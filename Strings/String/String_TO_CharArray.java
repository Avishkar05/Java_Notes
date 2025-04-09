package String;

public class String_TO_CharArray {

	public static void main(String[] args) {
		String s1="Hello";
		System.out.println(s1);
		
		
		//ShortHand Method to Convert String to CharArray. 
		char ch[] = s1.toCharArray();
		
//		char ch[] = new char[s1.length()];
//		for(int i=0;i<s1.length();i++)
//		{
//			ch[i]=s1.charAt(i);
//		}
		
		System.out.println("ch == ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
	}

}
