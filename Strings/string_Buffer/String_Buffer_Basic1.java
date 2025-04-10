package string_Buffer;

public class String_Buffer_Basic1 {

	public static void main(String[] args) {
		StringBuffer b2 = new StringBuffer();
		b2.append("1234567890123456");
		System.out.println("default : "+b2.length()+","+b2.capacity()); //default 16.

		b2.append("12345678901234567");
		System.out.println("1st : "+"Length : "+b2.length()+", Capacity :"+b2.capacity());//16*2+2=34
		
		b2.append("12345678901234567890123456789012345");
		System.out.println("2nd : "+"Length : "+b2.length()+", Capacity :"+b2.capacity());//34*2+2=70
		
		b2.append("1234567890123456789012345678901234567890"
				+ "");
		System.out.println("3rd : "+"Length : "+b2.length()+", Capacity :"+b2.capacity());//70*2+2=142
		
		b2.append("123456789012345678901234567890123456789012345678901234567890");
		System.out.println("4th : "+"Length : "+b2.length()+", Capacity :"+b2.capacity());//142*2+2=286
	}

}
