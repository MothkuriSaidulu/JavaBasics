package Java_Basics;

public class Test_01_Start_pattern {

	public static void main(String[] args) {

//1. Right Triangle Star Pattern
		// i for rows and j for columns
		 int i, j, row = 6;
		System.out.println("Right Triangle Star Pattern");
		
		for (i = 0; i < row; i++)   // rows
		{
			for (j = 0; j <= i; j++)  // column
			{
				System.out.print("*"); // it will print
			}
			System.out.println(); // it will move to next line
		}

//2. Left Triangle Star Pattern

//		int i, j, row = 6;
		// Outer loop work for rows
		System.out.println("Left Triangle Star Pattern");
		for (i = 0; i < row; i++) {
			// inner loop work for space
			for (j = 2*(row - i) ; j >= 0; j--) {    // i = 0 , j = 12 ; row = 6
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (j = 0; j <= i; j++) {  // i = 1 , j =0 
				// prints star
				System.out.print("* "); // put space after *
			}
			// throws the cursor in a new line after printing each line
			System.out.println();
		}
		
		
//3. Pyramid Star Pattern

		//int i, j, row = 6;

		for (i = 0; i < row; i++) // --> rows
		{
			for( j = row-i; j >= 0; j-- ) // j>1 also we can put
			{
				System.out.print(" ");
			}

			for(j = 0 ; j <= i; j++ )
			{
				System.out.print("* ");// space
			}
			System.out.println();
		}
	
	}
}
