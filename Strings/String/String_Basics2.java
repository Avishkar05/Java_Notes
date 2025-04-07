package String;

public class String_Basics2 {

	public static void main(String[] args) {
		
		//TO Remove leading and trailing Spaces in String	--> s.trin()
		String s = "hefshine Java hefshine hefshine  ";
		System.out.println(s.trim());
		
		
		//To Replace Character or word from String	--> s.replace()
		System.out.println(s.replace('h', 's'));
		System.out.println(s.replace("hefshine", "Program"));
		System.out.println(s.replaceAll("hefshine", "Program"));
		System.out.println(s.replaceFirst("hefshine", "Program"));
		
	}

}
