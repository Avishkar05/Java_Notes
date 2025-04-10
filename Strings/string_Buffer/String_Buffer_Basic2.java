package string_Buffer;

public class String_Buffer_Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b3 = new StringBuffer("Java");
		String b33="Java";
		System.out.println(b3.equals(b33));
		
		System.out.println(b3.append("Hefshine"));
		
//		System.out.println(b3.reverse());
		
		System.out.println(b3.insert(3, "a"));
		
//		System.out.println(b3.delete(3 , 8));
		
		
		b3.ensureCapacity(300);
		System.out.println(b3.capacity());
	}

}
