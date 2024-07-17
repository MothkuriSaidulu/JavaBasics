package Java.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
//		Note: 
//		Hash Set will not allow you to print duplicate record.
//		Hash Set will not print the records in a order sequence.
//		Inserting of element is not possible.
//		Accessing specific element not possible

//		Declaration

		HashSet mySet = new HashSet(); // class with Heterogenious data
//		Set mySet1 = new HashSet();  // by interface

//		HashSet<String> mySetHomgenious = new HashSet<String>();// Homogeniuos data

		mySet.add(100); // int
		mySet.add(102);
		mySet.add("Chary"); // String
		mySet.add(true); // boolean
		mySet.add('c'); // char
		mySet.add('a');
		mySet.add('a');
		mySet.add(null);
		mySet.add(null);
		mySet.add(100);
		
		System.out.println(" Print first HashSet  " + mySet);

		mySet.remove(100); // we need to pass value
		System.out.println(" Print After remove HashSet  " + mySet);

//		For each loop only possible due order on values
		for( Object x : mySet )
		{
			
		}
		
//		Converting Hash set to ArrayList
		ArrayList list = new ArrayList(mySet);
		System.out.println("Convert HashSet to Array List  " + list.get(3));
		
	}

}
