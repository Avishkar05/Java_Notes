package String_Class_Methods;

public class Modification_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is Java Program";
		String[] array = s.split(" ");
		for (int i = array.length - 1; i >= 0; i--) 
		{
			System.out.print(array[i] + " ");
		}
		
//		.substring(int beginIndex)
//			--> Returns a substring from the given index to the end.
//
//		.substring(int beginIndex, int endIndex)
//			--> Returns a substring between the specified indexes.

		System.out.println("\n"+s.substring(2));
		System.out.println(s.subSequence(8,20));
		
		

	}

}
