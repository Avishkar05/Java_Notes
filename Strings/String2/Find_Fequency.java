package String2;

public class Find_Fequency {

	public static void main(String[] args) {
		
		String f1 = "aabb";  // Given string

        for (int i = 0; i < f1.length(); i++)
            // 1 -> i = 0, char = 'a'
            // 2 -> i = 1, char = 'a'
            // 3 -> i = 2, char = 'b'
            // 4 -> i = 3, char = 'b'
        {
            int count = 0; // To check if character has already been counted

            for (int j = 0; j < i; j++)
                // This loop checks whether f1.charAt(i) has appeared before in the string
                // If found, count is incremented, meaning it's a duplicate
                // Otherwise, it's counted for the first time
            {
                if (f1.charAt(i) == f1.charAt(j))
                    // 2.1 -> 'a' == 'a' -> T -> count++
                    // 4.1 -> 'b' == 'b' -> T -> count++
                {
                    count++;
                }
            }

            if (count == 0)
                // If count == 0, it means f1.charAt(i) is a unique character encountered for the first time.
            {
                int count1 = 0; // To store the actual frequency of the character

                for (int k = 0; k < f1.length(); k++)
                    // This loop counts occurrences of f1.charAt(i) in the whole string
                {
                    if (f1.charAt(i) == f1.charAt(k))
                        // 1.1 -> 'a' == 'a' -> count1++
                        // 1.2 -> 'a' == 'a' -> count1++
                        
                        // 3.1 -> 'b' == 'b' -> count1++
                        // 3.2 -> 'b' == 'b' -> count1++
                    {
                        count1++;
                    }
                }
                
                System.out.println(f1.charAt(i) + " " + count1);
                // Output:
                // a 2  -> Printed in 1st iteration
                // b 2  -> Printed in 3rd iteration
            }
        }
	}

}

