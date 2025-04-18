package Array_list;

import java.util.ArrayList;

public class Basic2_Array_list {

	public static void main(String[] args) {
		ArrayList<Object> fruit = new ArrayList<Object>();
		
		fruit.add("mango");
		fruit.add("Watermelon");
		fruit.add("Apple");
		fruit.add("Grapes");

		System.out.println("Orignal list :- "+fruit);
		
		//To check element is present or not in list
		System.out.println("Check element is present or not in list :- "+fruit.contains("Grapes"));
		
		//to check how many element present in list
		System.out.println("check how many element present in list :- "+fruit.size());
		
		//to reverse list
//		System.out.println("reverse list :- "+fruit.reversed());
		
		System.out.print("Reverse using loop :- ");
		for(int i=fruit.size()-1;i>=0;i--)
		{
			System.out.print(fruit.get(i)+" ");
		}

	}

}
