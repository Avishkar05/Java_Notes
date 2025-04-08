package String;

public class Remove_String {

	public static void main(String[] args) {
		
		String a = "String";
		
		char aa = 'S';
		int counter=0;
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i) == aa)
			{
				counter++;
			}			
		}
		System.out.println(counter);
		if (counter == 0) 
		{
			System.out.println("Not Present");
		}
		else 
		{
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i) != aa)
				{					
					System.out.print(a.charAt(i));
				}
			}
		}
	}

}
