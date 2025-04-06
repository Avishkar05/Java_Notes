package Encapsulation;

class student
{
	private String name;	//Declare variable Private
	private int Stu_id;
	private long con_no;
	
	void setname(String name)	//Setter Method
	{
		this.name=name;
	}
	
	void setid(int Stu_id)
	{
		this.Stu_id=Stu_id;
	}
	
	void setcon_no(long con_no)
	{
		this.con_no=con_no;
	}
	
	
	String getname()	//Getter Method
	{
		return name;
	}
	
	int Stu_id()
	{
		return Stu_id;
	}
	
	long con_no()
	{
		return con_no;
	}
	
	
}


public class Encapsulation_ex1 {

	public static void main(String[] args) {
		
		student ob = new student();
		ob.setname("Vilas");
		System.out.println(ob.getname());
		
		ob.setid(101);
		System.out.println(ob.Stu_id() );
		
		ob.setcon_no(1234567890);
		System.out.println(ob.con_no());
		
		System.out.println("------------");
		
		student ob1 = new student();
		ob1.setname("onkar");
		System.out.println(ob1.getname());
		
		ob1.setid(102);
		System.out.println(ob1.Stu_id() );
		
		ob1.setcon_no(1234567891);
		System.out.println(ob1.con_no());
		
		
	}

}
