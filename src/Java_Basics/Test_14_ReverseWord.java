package Java_Basics;

import java.util.HashMap;

public class Test_14_ReverseWord {

	public static void main(String[] args) {
		reverseWord();
	}

	public static void reverseWord() {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		String originalWord = "How Are You"; // original word

		String reverseWord = ""; // reverse word

		String[] splitSTR = originalWord.split(" ");

		for (int i = 0; i < splitSTR.length; i++) {
			String word = splitSTR[i];
			String revWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				char ch = word.charAt(j);
				
				revWord = revWord + ch;

			}
			reverseWord = reverseWord + revWord + " ";

		}
		System.out.println(reverseWord);

//		
//		String[] splitStr = originalWord.split(" ");
//
//		for (int i = 0; i < splitStr.length; i++) {
//			String words = splitStr[i];
//			String revWord = "";
//			for (int j = words.length() - 1; j >= 0; j--) {
//				char word = words.charAt(j);
//				revWord = revWord + word;
//
//			}
//			reverseWord = reverseWord + revWord  + " " ;
//
//		}
//
//		System.out.print(reverseWord);

	}

}
