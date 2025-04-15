package Char_Pattern;

public class Char_Pattern_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			char p = 'A';
			for (int j = 5; j > i; j--) {
				System.out.print(p++);
			}
			System.out.println();
		}

		System.out.println("------------");

		for (int i = 0; i <= 5; i++) {
			char p ='A';
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i ; j--) {
				System.out.print(p++);
			}
			System.out.println();
		}
	}

}
