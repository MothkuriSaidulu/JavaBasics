package Java_Basics;

public class Test_10_CheckPrimeNumber {

	public static void main(String[] args) {

		System.out.println(checkNumberIsPrime(7));
		System.out.println(checkNumberIsPrime(46));

	}

	public static boolean checkNumberIsPrime(int n) {
		// 0 1 2 3 4 5 6 7 8 9
		// 2, 3 , 5, 7 ,11, ,13, 17

		if (n == 0 || n == 1) {
			System.out.println(" Given Number is not a prime Number ");
//			return false;

		}

		if (n == 2) {
			System.out.println(" Given Number is a prime Number ");

//			return true;

		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {

				return false;
			}

		}
		return true;

	}

	public void list() {

	}

}
