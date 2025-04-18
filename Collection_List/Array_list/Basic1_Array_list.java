package Array_list;

import java.util.ArrayList;

public class Basic1_Array_list {

	public static void main(String[] args) {
		
		ArrayList<Object> fruit = new ArrayList<Object>();
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Banana");
		fruit.add("mango");
		fruit.add("Strawberry");
		
		System.out.println(fruit);
		
		ArrayList<Object> Flower = new ArrayList<Object>();
		Flower.add("rose");
		Flower.add("lotus");
		Flower.add("hibiscus");
		
		System.out.println(Flower);
		
		
		System.out.println("Fruit : "+ fruit);
		System.out.println(fruit.getFirst());
		System.out.println(fruit.getLast());
		
		fruit.remove(3);
		System.out.println(fruit);
		
		fruit.removeFirst();
		System.out.println(fruit);
		fruit.removeLast();
		System.out.println(fruit);
		
		fruit.removeAll(fruit);
		System.out.println(fruit);
	}
}