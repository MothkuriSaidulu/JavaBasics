package Java_Basics;

public class A_PracticePurpose {

	public static void main(String[] args) {
		practice();
	}

	public static void practice() {

//	*
//	* *
//	* * *
		int row, column, count = 3;

		for (row = 0; row < count; row++) {

			for (column = 0; column <= row; column++) {
				System.out.print("*");

			}

			System.out.println();

		}

	}
}