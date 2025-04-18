package Queue;

public class count_of_digit {

	public static void main(String[] args) {
		
		int num=123,rem,cnt=0;
		while (num>0) {
			rem = num % 10;
			cnt++;
			num /= 10;
			
		}
		
		System.out.println(cnt);

	}

}
