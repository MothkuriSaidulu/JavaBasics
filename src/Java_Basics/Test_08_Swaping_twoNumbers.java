package Java_Basics;

public class Test_08_Swaping_twoNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("A value = " + a + ", B value = " + b);

// swap numbers

		b = b + a; // b = 30
		a = b - a; // a = 20
		b = b - a; // a = 20

		System.out.println("A value = " + a + ", B value = " + b);

	}

}
