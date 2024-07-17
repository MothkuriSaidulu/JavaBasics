package Java_Basics;

public class practice {

	public static void main(String[] args) {

//		checkGivenPrimeNumber();
//		printPrimeNumber();
//		reverseTheNumber();
//		fibanociseNumber();
//		countDigitesInNumber();
//		printRepeatedWord();
		reverseTheWords();

	}

	public static void printPrimeNumber() {
		int number = 9;

//		int i = 2;

		if (number == 0 || number == 1) {
			System.out.println(number + " is not prime number ");
		} else if (number == 2) {
			System.out.println(number + " is a Prime number");
		} else {

			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					System.out.println(number + " is not prime number");
//					break;
				} else {
					System.out.println(number + "is prime numbers");
					break;
				}

			}

		}

	}

// Check given number Prime number or not
	public static void checkGivenPrimeNumber() {
		int number = 9;

		boolean flag = false;

		for (int i = 2; i <= number / 2; i++) // 20 / 2 = 10 > i
		{
			if (number % 2 == 0) {
//				System.out.println(number + " is not a number ");
				flag = true;
				break;

			} else {
				System.out.println(number + " is prime number ");
			}

		}
	}

// Reverse the String and Number
	public static void reverseTheNumber() {
		int number = 12345;
		String strNumber = String.valueOf(number);
		String revserStr = "";

		for (int i = 0; i < strNumber.length(); i++) {
			char charStr = strNumber.charAt(i);
			revserStr = charStr + revserStr;
		}
		System.out.print(revserStr);
	}

	public static void reverseTheWords() {

		String str = "I Am Writing Java Program";
		String[] splittedStr = str.split(" ");
		String reverseWord = " ";

		for (String w : splittedStr) {
			StringBuilder sb = new StringBuilder(w);
			StringBuilder str2 = sb.reverse();
			str2.append(str);
			reverseWord += str2.toString() + " ";
		}
		System.out.print(reverseWord.trim());

	}

	public static void fibanociseNumber() {
//		0 1 1 2 3 5 8 13 ....

		int count = 10;
		int N1 = 0, N2 = 1, N3;
		int i;
		System.out.print(N1 + " " + N2);
		for (i = 2; i <= count; i++) {
			N3 = N2 + N1;
			System.out.print(" " + N3);
			N1 = N2;
			N2 = N3;
		}
	}

// Count the no of words in a String or number
	public static void countDigitesInNumber() {

		int number = 12345678;
		int count = 0;
		String str = String.valueOf(number);

		for (int i = 0; i < str.length(); i++) {
			char strChar = str.charAt(i);
			count++;
		}
		System.out.println(count);

	}

//	Count the no of time char repeated.

	public static void printRepeatedWord() {
		String str = "Saidachary";
		char search = 'y';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == search) {
				count++;

			}

		}
		System.err.println(" Repeated time id  " + count);

	}

}
