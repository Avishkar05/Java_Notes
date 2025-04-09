package String;

public class String_number_check {

	public static void main(String[] args) {
		
		String s="1665fhgg";
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) >= '0' &&  s.charAt(i) <= '9')
			{
				
				cnt++;
			}
		}
		System.out.println(cnt);

		if(cnt == s.length())
		{
			System.out.println("String contains Only digits");
		}
		else if(cnt >0 && cnt <s.length())
		{
			System.out.println("String contains digits and Character");
		}
		else 
		{
			System.out.println("String cotains not only digits");
		}
	}

}
