package Java_Basics;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.jar.Attributes.Name;

public class Test_15_NoOfAccurencesInString {

	public static void main(String[] args) {
		printDuplicateCharsInString();
//		name();
//		duplicateNumbersInArray();
	}

//	Print Duplicate Charectors in String by using Array
	public static void printDuplicateCharsInString() {
		String str = "gooleekk";
		Object i_Value = null;
		Object J_value = null;
		char[] charArray = str.toCharArray();  // output : [g, o, o, l, e, e, k, k]

		for (int i = 0; i < charArray.length; i++) {
			i_Value = charArray[i];
			for (int j = i + 1; j < charArray.length; j++) {
				J_value = charArray[j];
				if (i_Value == J_value) {
					System.out.println(i_Value);
				}
			}
		}
	}

//	Print Duplicate Chars by using HashMap

	public static void duplicateCharsWithHashMap() {

		String str = "gooogle";

		char charArray[] = str.toCharArray(); // output [g, o, o, g, l, e]
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1); // key and value

			} else {
				map.put(ch, 1);

			}

		}
		System.out.println(map);

	}

	public static void duplicateNumbersInArray() 
	{
		int numbers[] = {1,2,2,3,4,3,5,6,5};
		
		HashMap<Integer, Integer>  mapdata = new HashMap<Integer, Integer>();
		for( int i = 0 ; i < numbers.length; i++ )
		{
			
			int num = numbers[i];
			if (mapdata.containsKey(num))
			{
				mapdata.put(num, mapdata.get(num) + 1);
				
			}else
			{
				mapdata.put(num, 1);
			}
			
		}
		
		System.out.println(mapdata);
		
	}
	
	
	public static void name() {

		String str = "goooglel";

		char charArray[] = str.toCharArray(); // {g, o, o, o, g, l, e, l}

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			char singleChar = charArray[i];
			if (hashMap.containsKey(singleChar)) {
				hashMap.put(singleChar, hashMap.get(singleChar) + 1);

			} else {
				hashMap.put(singleChar, 1); // h 1
			}

		}
		System.out.println(hashMap);

	}

}
