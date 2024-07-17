package Java_Basics;

public class Test_16_LargeAndSmallNumber {

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int large = numbers[0]; // 1
		int small = numbers[0]; // 1
		int num = 0;
		for (int i = 0; i < numbers.length; i++) {
			num = numbers[i];
			if (num > large) {
				large = num;

			} else if (num < small) {
				small = num;

			}
		}

		System.out.println(" Large Number is : " + large);
		System.out.println(" Samller Number is : " + small);
	}

}