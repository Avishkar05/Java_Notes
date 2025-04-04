package Jump_Statement;

public class continue_ex2_evenodd {

	public static void main(String[] args) {
		// Even number using continue
		int i = 0;
		do {
			i++;
			if (i % 2 != 0) {
				continue;
			}
			System.out.println("Even number : " + i);

		} 
		while (i <= 10);

		System.out.println("====================");

		// Odd number using continue
		int j = 0;
		do {
			j++;
			if (j % 2 == 0) {
				continue;
			}

			System.out.println("Odd number : " + j);

		} 
		while (j < 10);
	}

}
