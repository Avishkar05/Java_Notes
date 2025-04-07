package string_Buffer;

public class String_Buffer_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer b1 = new StringBuffer();
		b1.append("123456789012345678901234567890");
		//16 * 2 + 2 = 34
		System.out.println(b1.capacity());
		
		b1.ensureCapacity(100);
		//Use to extends the capacity
		System.out.println(b1.capacity());

	}

}
