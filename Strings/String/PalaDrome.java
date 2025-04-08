package String;

public class PalaDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String a="abac";
		String rev="";
		System.out.print("Reverse String of "+a+" is ");
		for(int i=a.length()-1;i>=0;i--)
		{
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
		
		if(a.equals(rev))
		{
			System.out.println("String is paladrom");
		}
		else
		{
			System.out.println("not");
		}*/
		
		
		String org="abcdef";
		String revs="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			revs = revs + org.charAt(i);
		}
		System.out.println(revs);
		if(org.equals(revs))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
	}

}
