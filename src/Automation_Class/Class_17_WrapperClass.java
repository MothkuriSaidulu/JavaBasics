package Automation_Class;

import java.util.ArrayList;

public class Class_17_WrapperClass {

	public static void main(String[] args) {

//		1. Converting String  to Int

		String str = "welcome"; // this we can not conver to integer
		String str1 = "1234";

		int number = Integer.parseInt(str1);
		System.out.println(" Converting String to Integer ; " + number);

//		2. Converting String  to double

		String strDouble = "12.345";
		Double doubleData = Double.valueOf(strDouble);
		System.out.println(" Convert String to Double  : " + doubleData);

//		3. Converting String to Char not possible

//		int, char , Double, boolean .. to String

		int number1 = 123;
		char ch = 'c';
		double value = 12.345;

		System.out.println(String.valueOf(number1));
		System.out.println(String.valueOf(ch));
		System.out.println(String.valueOf(value));
		
		
		ArrayList array = new ArrayList();
		ArrayList<String> arryaStr = new ArrayList<String>();		

	}
}
