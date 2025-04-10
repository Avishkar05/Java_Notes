package String_Class_Methods;

class Q1 
{
	
//Q. Reverse The Given String
    private String reversed;

    public Q1(String str) {
        reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed = reversed + str.charAt(i);
        }
    }

    void ShowQ1() {
        System.out.println(reversed);
    }
}

class Q2 {
    private String str;  // Instance variable

    // Constructor to initialize the string
    public Q2(String a) {
        this.str = a;  
    }

    // Method to check if the string is empty
    void showQ2() {
        if (str.isEmpty()) 
        {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is NOT empty.");
        }
    }
}
public class Questions {

	public static void main(String[] args) {
		
		Q1 ob1=new Q1("Abc");
		ob1.ShowQ1();

		Q2 obj1 = new Q2("");  // Empty string
        obj1.showQ2();

        Q2 obj2 = new Q2("Hello");  // Non-empty string
        obj2.showQ2();
	
	}

}
