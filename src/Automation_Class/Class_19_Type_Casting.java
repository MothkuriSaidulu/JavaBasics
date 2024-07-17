package Automation_Class;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Class_19_Type_Casting {

//	Session 19 - Type Casting in Java | Up Casting & Down Casting in Java
//  UpCasting: Converting value from smaller to larger. Ex: int --> long, float --> double
//	DownCasting: converting value from larger to smaller. Ex: long --> int , double --> float

	public static void main(String[] args) throws FileNotFoundException {

//		Up-casting
		int number = 100;
		long longVlaue = number;
		
		float fl = 12.3F;
		double db = fl; 
		Scanner sc = new Scanner(System.in);
		
//		Down Casting
		
		long longValue2 = 122222;
		int smallerValue = (int) longValue2;
		System.out.println(" Down-Casting " + smallerValue);

		double doubleValue = 12.3565;
		float floatvalue = (float) doubleValue;
		System.out.println(" Down-Casting " + floatvalue);
		
	}

}
