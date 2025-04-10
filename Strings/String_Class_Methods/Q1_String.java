package String_Class_Methods;
/*
	Write a java program to create a new string of 4 copies of the last 3 characters
	of the original String.The length of the original string must be 3 and above.
	let's assume that the provided string is 'codinig'.
*/
public class Q1_String {

	public static void main(String[] args) {
		
		String s = "codinig";
		
		if(s.length() > 3)
		{
			for(int i=0;i<=3;i++)
			{
				System.out.println(s.substring(s.length()-3));
			}
		}
		else
		{
			System.out.println("String is not valid");
		}
	}

}
