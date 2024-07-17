package KeyWordsInJava;

public class throwException {

	public void throwExe(int number) {
		if (number < 1) {
			throw new ArithmeticException(" Number is -ve can not calculate ");
		} else {
			System.out.println("Square of " + number + " is " + (number * number));
		}

	}

	public static void main(String[] args) {

		throwException obj = new throwException();
		obj.throwExe(0);

	}

}