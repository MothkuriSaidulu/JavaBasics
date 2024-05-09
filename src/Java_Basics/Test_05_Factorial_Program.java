package Java_Basics;

import java.util.Iterator;

public class Test_05_Factorial_Program {

	public static void main(String[] args) {

		// Example
//		4! = 4*3*2*1 = 24  
//		5! = 5*4*3*2*1 = 120  

		int i, fact = 1;
		int Number = 5;

		for (i = 1; i <= Number; i++) {
			fact = fact * i;

		}
		System.out.println(" Factorial Of " + Number + " is = " + fact);

	}

}
