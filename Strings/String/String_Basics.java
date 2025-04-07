package String;
//String is a non-primitive data type
//String is a sequence of Characters
//String is a array of Characters
//String is a class(Final)
//String is a object i.e. Immutable


public class String_Basics {

	public static void main(String[] args) {		
		
		String s = "Java";
		
		System.out.println(s+10);				//Java10
		System.out.println(s+10+20);			//Java1020
		System.out.println(s+(10+20));			//Java30
		System.out.println(s+(10-20));			//Java-10
		System.out.println(s+10/20);			//Java0
		System.out.println(s+10*20);			//Java200
		System.out.println(s+10%20);			//Java10
		System.out.println(10+20+s+10+20);		//30Java1020
		System.out.println(10-20+s+10+20);		//-10Java1020	
		System.out.println(10*20+s+10+20);		//200Java1020
		System.out.println(10/20+s+10+20);		//0Java1020
		
		
		
		
		
	}

}
