package Java_Basics;

public class Test_13_SumOf_Array {

	public static void main(String[] args) {

//		SumOfArray();
		sumOfDigitsOfNumber();
//		findCharNoOfTimes();

	}

	public static void SumOfArray() {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
//		int[] numbersa =new int[] { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println(" Sum Of All Numbers In Array is : " + sum);
	}

	public static void sumOfDigitsOfNumber() {
		int num = 12345; // sum = 15
		int sum = 0;
		int digit;

		while (num > 0) {
			digit = num % 10;
			System.out.println("Digit value " + digit);
			sum = sum + digit;
			num = num / 10;
			System.out.println(" Sum of num " + num);

		}
		System.out.println("Sum of all digits is : " + sum);

	}

	public static void findCharNoOfTimes() {
		String str = "saidachary";
		char searchChar = 'a';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
//			char singleChar = str.charAt(i);
//			if (singleChar == searchChar) {
//				count++;
//			}

			if (str.charAt(i) == searchChar) {
				count++;
			}
			
		}
		System.out.println(" Char Repeated no of time is " + count);

	}

}
