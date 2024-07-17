package Java_Basics;

public class Test_07_ReverseString {

	public static void main(String[] args) {

		stringReverse();
//		numberreverse();
	}

	public static void numberreverse() {
		int number = 12345;
		int reverseNumber = 0;

//		reminder = number % 10 => remainder
//		reverseNumber = reverseNumber * 10 + remainder => 0 * 10 + 5 = 5
//		number = number / 10 => number

		while (number != 0) {
			int rem = number % 10;
			reverseNumber = reverseNumber * 10 + rem;
			number = number / 10;
		}

		System.out.println(reverseNumber);
	}

	public static void stringReverse() {

		String str = "Saidachary";
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			reverseStr = reverseStr + ch;
		}
		
		System.out.println(str);
		System.out.println(reverseStr);
	}

}
