package Java_Basics;

public class Test_09_VowelPresentOrNot {

	public static void main(String[] args) {

		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false

		String Name = "hhhh";
		Boolean trim = Name.toLowerCase().matches(".*[aeiou].*");

	}

	public static boolean stringContainsVowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	}
}
