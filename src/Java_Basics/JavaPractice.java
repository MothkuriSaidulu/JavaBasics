package Java_Basics;

public class JavaPractice {

	public static void main(String[] args) {

		Fibonacci_Series();
		primeNumbers();
		findDevidedNumberFromList();
		multipleOfTable();

	}

	public static void Fibonacci_Series() {
		// series 0 1 1 2 3 5 8 13 ....

		int n1 = 0, n2 = 1, n3, count = 10;

//		System.out.println(n1 + " " + n2);
		System.out.print(n1 + " " + n2);
		for (int i = 2; i <= count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println("  ");

	}

	public static void primeNumbers() {
		// 0 , 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		int i = 0, count = 10;

		for (i = 0; i <= count; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " Not Prime Number");
			} else if (i % 2 != 0) {
				System.out.println(i + " Prime Number");

			}

		}
		System.out.println("******************************");

	}

// Print Even Numbers
	public static void findDevidedNumberFromList() {

		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < number.length; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " This Number will devided by 2");

			} else if (i % 2 != 0) {
				System.out.println(i + " This Number will Not devided by 2");
			}

		}

	}

	public static void multipleOfTable() {

//		1 2 3 4 5 6 7 8 9 10
//		2 4 6 8 10 12 14 16 18 20 --> Expected

		int n, Count = 10, printValue;

		n = 2;

		for (int i = 1; i <= Count; i++) {
			printValue = n * i;
			System.out.println(printValue);

		}

	}

}
