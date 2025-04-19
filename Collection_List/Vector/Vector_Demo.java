package Vector;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		// Create a Vector of Strings
		Vector<String> fruits = new Vector<>();

		// Add elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		System.out.println("Original List : "+ fruits);

		// Get and print element at index 1
		System.out.println(fruits.get(1)); // Output: Banana

		// Update element
		fruits.set(1, "Orange");
		System.out.println("updated : "+ fruits.set(2, "orange")+ " to "+fruits.get(2));
//		System.out.println(fruits);
		
		
		// Remove an element
		fruits.remove(0);

		// Check if contains
		if (fruits.contains("Mango")) {
			System.out.println("Mango is in the list!");
		}

		// Print size
		System.out.println("Total fruits: " + fruits.size());

		// Clear all
		fruits.clear();
		System.out.println("After Clear list : "+fruits);
	}
	
}