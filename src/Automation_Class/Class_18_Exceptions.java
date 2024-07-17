package Automation_Class;

import java.util.Scanner;

public class Class_18_Exceptions {

	public static void main(String[] args) {

		System.out.println(" Programe Is Started .... ");
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println(" Enter a number from Console... "); int number =
		 * sc.nextInt(); System.out.println(100 / number);
		 * System.out.println(" Execution Completed....  ");
		 * System.out.println("  Exist The Programe....  ");
		 */

// 
//		int array[] = new int[6]; // Static Array
//		System.out.println(" Enter the number range 0 - 6 ");
//		int position = sc.nextInt();
//
//		System.out.println(" Enter The Values : ");
//
//		int value = sc.nextInt();
//
//		array[position] = value;
//
//		System.out.println(array[position]);

//		***********************************************************************************************
//		Exception handling
		
		/*
		 * try { int num = sc.nextInt(); int value = 100 / num;
		 * System.out.println(value);
		 * 
		 * } catch (Exception e) { e.printStackTrace();
		 * System.out.println(e.getMessage()); // System.out.println(); }
		 * 
		 */

		String str = null;

		try {
			System.out.println(str.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(" Execution Completed....  ");
		System.out.println("  Exist The Programe....  ");
	}
}