package Java_Basics;

public class Test_04_Prime_Numbers {

	public static void main(String[] args) {
// Prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
		// 0 , 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 .........

		int i = 0,  m, count = 10;
		m = i / 2;
		
		for (i = 0; i <= count; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "  Is Not Prime Number  ");
			} else if (i % 2 != 0) {
				System.out.println(i + "  Is  Prime Number  ");
			}

		}

		/*
		 * int i, m = 0, flag = 0;
		 * 
		 * int n = 3; // 3rd place number
		 * 
		 * m = n / 2;
		 * 
		 * if (n == 0 || n == 1) { System.out.println(n + " Is Not Prime Number ");
		 * 
		 * } else { for (i = 2; i <= m; i++) { if (n % 2 == 0) { System.out.println(n +
		 * " Is Not Prime Number  "); flag = 1; break; }
		 * 
		 * } if (flag == 0) { System.out.println(n + " Is Prime Number  "); }
		 * 
		 * }
		 */
	}

}
