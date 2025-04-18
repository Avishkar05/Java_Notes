package Stack;

import java.util.*;

public class Stack_Basic_Ex {

	public static void main(String[] args) {
		Stack<String> biscuit = new Stack<String>();

		biscuit.push("Parle-G");
		biscuit.push("Krackjak");
		biscuit.push("Burbon");
		biscuit.push("Darkfantacy");
		biscuit.push("goodday");

		System.out.println(biscuit);//[Parle-G, Krackjak, Burbon, Darkfantacy, goodday]

		System.out.println("Get Last element :"+biscuit.peek());//Get Last element :goodday


		System.out.println("Delete last element :"+biscuit.pop());//Delete last element :goodday

		System.out.println(biscuit);//[Parle-G, Krackjak, Burbon, Darkfantacy]

		
		System.out.println("Check if Stack is empty or not :"+biscuit.empty());//false
		
		System.out.println(biscuit);
		System.out.println("Search element :"+biscuit.search("Burbon"));//2

	}

}
