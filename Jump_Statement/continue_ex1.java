package Jump_Statement;

public class continue_ex1 {

	public static void main(String[] args) {
		/*
		
		//Using For Loop
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==4)
				//i=1 and i==4 False
				//i=2 and i==4 False
				//i=3 and i==4 False
				
				//i=4 and i==4 True
				
				//i=5 and i==4 False
				//i=6 and i==4 False
				//i=7 and i==4 False
				//i=8 and i==4 False
				//i=9 and i==4 False
				//i=10 and i==4 False
		
			{
				System.out.println("");
				continue;  //Use to Skip ex: in This program continue well skip 4.
			}
			System.out.println(i);
			//1
			//2
			//3
			//4 will not print
			//5
			//6
			//7
			//8
			//9
			//10
		}
		*/
		
		/*
		//Using while Loop
		
		int i=0;
		while(i<=10)
		{
			i++;
			if(i==5)
			{
				System.out.println("");
				continue;
			}
			System.out.println(i);
		}
		*/
		
		
		
		//Using do while
		
		int i=0;
		do{
			i++;//1 //2 //3 //4 //5
			if(i==5)//1==5 f 2f 3f 4f 5T
			{
				System.out.println("");
				continue; //5 skip 
			}
			
			System.out.println(i);
			//1
			//2
			//3
			//4
			//5 will not print
			
		}
		while(i<=10);
		
		
	}

}
