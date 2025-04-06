/*
  Method Overriding : If subclass has the same method as declared in parent class, 
  					   It is known as Method overriding in Java
  -The method must have same name as in the parent class
  -The method must have the same parameter as in the parent class
  -There must be an IS-A relationship(inheritance)
 
 
 */

package Polymorphism;

class Pol
{
	void polget()
	{
		System.out.println("first");
	}

	void polget(int n)  //Polymorphism : Data overlodaing 
	{
		System.out.println("Second = " + n);
	}
}

public class Polymorphism_Ex1 {

	public static void main(String[] args) {
		
		Pol ob = new Pol();
		ob.polget();
		ob.polget(1);
		

	}

}
