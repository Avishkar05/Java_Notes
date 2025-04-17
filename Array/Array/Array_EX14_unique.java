package Array;

public class Array_EX14_unique {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 4, 3 };

		for (int i = 0; i < a.length; i++) {
			System.out.print("Index : " + i + ": ");
			for (int j = 0; j < a.length; j++) {
				System.out.print(" (" + a[i] + "," + a[j] + ") ");
			}
			System.out.println();
		}

		// Remove duplicate element from array
		System.out.println("Updated Array");
		int cnt144 = 0;
		for (int i = 0; i < a.length; i++) {
			int cnt14 = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					cnt14++;

				}
			}
			if (cnt14 == 0) {
				System.out.print(a[i] + " ");
				cnt144++;
			}
		}

		int b[] = new int[cnt144];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			int cnt14 = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					cnt14++;
					break;
				}
			}
			if (cnt14 == 0) {
				b[index] = a[i];
				index++;
			}
		}

		for (int i = 0; i < b.length; i++) {
			System.out.print("Index : " + i + ": ");
			for (int j = 0; j < b.length; j++) {
				System.out.print(" (" + b[i] + "," + b[j] + ") ");
			}
			System.out.println();
		}

	}

}
