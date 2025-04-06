package Inhertance;
/*
Create a class Test1 with two instance variables num1 and num2.Creat another ClassTest2 which is inheriting 
Test1.Apart from inheriting class Test1, Test2 declares another variable num3. Here an object of class Test2 
will have the instance variable num1 and num2 due to the concept of inheritance. within the main() of class
TestDemo create an object of class Test2 and assign the values to the instance variables and display them 
displaying the concept of inheritance.
*/

class test1
{
	int num1,num2;
}

class test2 extends test1
{
	int num3;
}

public class Q1_Inhertance {

	public static void main(String[] args) {
		
		test2 ob = new test2();
		ob.num1=10;
		ob.num2=20;
		ob.num3=30;
		
		System.out.println("num1 = "+ob.num1);
		System.out.println("num2 = "+ob.num2);
		System.out.println("num3 = "+ob.num3);

	}

}
