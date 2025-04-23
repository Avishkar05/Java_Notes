package Loops;

public class Conditional_Ternary_loop_Ex1 {

	public static void main(String[] args) {

		int num = 11;
		
		String even_odd = (num % 2 == 0) ? "Even":"Odd";
		System.out.println(even_odd);
		
		
//		(condition) ? value_if_true : value_if_false;
//		It's a short-hand for if-else.
//		It returns a value based on a condition.


		int a = 10, b = 20;
		int max = (a > b) ? a : b;
		System.out.println("Max value: " + max);

//		How it Works:
//		Checks if a > b → false
//		So, b is returned and assigned to max.


		for (int i = 0; i < 10; i++) {
			
			String result = (i % 2 == 0) ? "Even" : "Odd";
			System.out.println(i + " is " + result);
		}
	}

}
