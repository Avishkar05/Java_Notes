package Practice;
/*

	    *
	   **
	  ***
	 ****
	*****

*/
public class Pattern_ex3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("-");
				
				/*
					OUTPUT
					//First Line
					i=1T j=3T print			- 
					i=1T j-- j=2T print		-- 
					i=1T j-- j=1T print		---
					i=1T j-- j=0F 
					
					//second line
					i=2T j=3T print			-
					i=2T j-- j=2T print		--
					i=2T j-- j=1F
					
					
					//Third Line
					i=3T j=3T print 		-
					i=3T j++ j=4F
					
					//fourth line
					i=4T j=4F 
					
					//OUTPUT for(j) Loop
											
											---
											--
											-
										
					
				*/
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				
				/*
				 	OUTPUT
				 	//First Line
				 	i=1T k=1T print			---*
				 	
				 	//Second Line
				 	i=2T k=1T print 		--*
				 	i=2T k++ k=2T print 	--**
				 	i=2T k++ k=23F
				 	
				 	//Third Line			
				 	i=3T k=1T Print			-*
				 	i=3T k++ k=2T Print		-**
				 	i=3T k++ k=3T Print		-***
				 	i=3T k++ k=4F
				 	
				 	//fourth line
				 	i=4T k=1T Print			*
				 	i=4T k++ k=2T Print		**
				 	i=4T k++ k=3T Print		***
				 	i=4T k++ k=4T Print		****
				 	i=4T k++ k=5F
				 	
				 	//OUTPUT of for(k) Loop
				 							   *
											  **
											 ***
				 							****
				 	//Final OUTPUT 
				 							---*
				 							--**
				 							-***
				 							****
				*/
			}
			System.out.println(" ");
			
			//Go to second line
			//Go to Third line
			//Go to fourth line
			
		}

	}

}
