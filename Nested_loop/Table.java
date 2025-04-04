package Nested_loop;

public class Table {

	public static void main(String[] args) {

	
		//Outer for loop=row data
		for (int i = 1; i <= 10; i++) 
		{
			//inner for loop=column data
			for (int j = 1; j <=10; j++) 
			{
				System.out.print(i*j+"\t");
				//System.out.print("*"+" ");
			}
			
			System.out.println(" ");

		}
		
	}

}
