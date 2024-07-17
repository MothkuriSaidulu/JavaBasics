package Java_Basics;

public class Test_12_Find_Odd_and_Even_Number {

	public static void main(String[] args) {

//		OddandEvenNumber();
//		swapTwoNumbers();
		
	}

	public static int OddandEvenNumber() {

		int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
		int i;
		for (i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				System.out.println(a[i] + " is Odd Number ");
			} else {
				System.out.println(a[i] + " is Even Number ");
			}
		}
		return a[i];
	}

	public static void swapTwoNumbers() {
		int x = 10, y = 50;

		x = x + y; // x = 60
		y = x - y; // 60 - 50 = 10 --> y
		x = x - y; // 60 - 10 = 50

		System.out.println(x + "  " + y);
	}
}
