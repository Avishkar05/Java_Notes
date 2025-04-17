package Array;

public class Array_EX13_Remove {

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 3, 4, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			int cnt13 = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					cnt13++;
					break;
				}
			}
			if (cnt13 == 0) {

				System.out.println(i + "<- index : value -> " + a[i] );
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println(a[i] + " " + a[j]);
			}
		}

	}

}
