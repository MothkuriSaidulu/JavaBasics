package Java_Basics;

public class Test_11_RemoveSpaces {

	public static void main(String[] args) {

		String name = "said chary";
		System.out.println(name);
		removeSpaceInString(name);

	}

	public static String removeSpaceInString(String name) {

		StringBuilder stringBuilder = new StringBuilder();
		char[] charArray = name.toCharArray();

		for (char charr : charArray) {
			if (Character.isWhitespace(charr)) {
				stringBuilder.append(charr);
			}

		}
		return stringBuilder.toString();

	}
}
