package Java_Basics;

public class Test_07_ReverseString {

	public static void main(String[] args) {

//		String value = "12345";
//		System.out.println(reverseString(value));
		stringReverse();

	}

	public static StringBuilder reverseString(String value) {
		StringBuilder stringBuilder = new StringBuilder();

		char[] chars = value.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--) {
			stringBuilder.append(chars[i]);

		}
		return stringBuilder;
	}

	public static void stringReverse() {
		String name = "Saidachary";

		StringBuilder buildString = new StringBuilder();

		char[] charArray = name.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {

//			System.out.println(charArray[i]);
			buildString.append(charArray[i]);

		}
		System.out.println("Print The String in reverse : " + buildString);
	}
}
