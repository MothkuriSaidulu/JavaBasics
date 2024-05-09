package Java_Basics;

public class Test_03_Fibonacci_Series_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Exaxmple: 0 1 1 2 3 5 8 13 ect.....

		
		
		
		int n1 = 0, n2 = 1, n3, Count = 10;

		System.out.print(n1 + " " + n2);

		// 0 1 1

		for (int i = 2; i <= Count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);

			n1 = n2; // now n1 value 1
			n2 = n3; // now n2 value 2

		}

	}

}
