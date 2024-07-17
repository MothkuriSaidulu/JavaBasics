package Java_Basics;

public class Test_02_basic_Java_programs {

	public static void main(String[] args) {

//		Fibonacci series in Java
//		In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8,
		int n1 = 0, n2 = 1, n3, i, count = 10;

		System.out.print(n1 + " " + n2);
		for (i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, };

		for (i = 0; i <= num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.print("Multiple of 2  " + num[i]);

			} else {
				System.out.println();
				System.out.println(" ");
			}

		}

	}

}
