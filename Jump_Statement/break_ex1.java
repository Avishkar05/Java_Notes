package Jump_Statement;

public class break_ex1 {

	public static void main(String[] args) {
		
		/*
		 
		//Using For loop
		
		for(int a=1;a<=10;a++) 
			//a=1<=10 T
			//a=2<=10 T
			//a=3<=10 T
			//a=4<=10 T
			//a=5<=10 T
			//a=6<=10 T
			
			
		{
			if(a==6)
				//a=1 and a==6 F
				//a=2 and a==6 F
				//a=3 and a==6 F
				//a=4 and a==6 F
				//a=5 and a==6 F
				//a=6 and a==6 T
				
			{
				break;
				//a=6 and a==6 T stop printing
			}
			System.out.println(a);
			//1
			//2
			//3
			//4
			//5
			//6 False
		}
		*/
		
		
		
		
		/*
		//Using while loop
		
		int i=0;
		while(i<=10)
		{
			i++;
			if(i==6)
			{
				break;
			}
			System.out.println(i);
		}
		*/
		
		
			
		
		//Using do while loop
		
				int i=1;
				do
				{
					if(i==6)
					{
						break;
					}
					System.out.println(i);
					i++;
				}
				while(i<=10);
	}

}
