package Stack;

import java.util.*;

public class Stack_Methods {

	public static void main(String[] args) {
		Stack<String> biscuit2 = new Stack<String>();

		biscuit2.push("Parle-G");
		biscuit2.push("Krackjak");
		biscuit2.push("Burbon");
		biscuit2.push("Darkfantacy");
		biscuit2.push("goodday");
		
		System.out.println(biscuit2);
		biscuit2.pop();
		biscuit2.pop();
		biscuit2.pop();

		System.out.println(biscuit2.peek());
		System.out.println(biscuit2.search("goodday"));
		
		
	}

}
