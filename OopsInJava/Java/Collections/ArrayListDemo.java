package Java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

//		ArrayList Declaration with Heterogeneous data

		ArrayList myList = new ArrayList(); // ArrayList is a class.
//		List myList = new ArrayList(); // Note: List is an Interface.

//		ArrayList Declaration with HomoGenious data
//		ArrayList<Integer> myList = new ArrayList<Integer>(); // this will allow only integer
//		ArrayList<String> myList = new ArrayList<String>(); // this will allow only integer

		myList.add(100);
		myList.add(101);
		myList.add("Chary");
		myList.add(null);
		myList.add('c');
//		System.out.println(" Size of the Array = " + myList.size());
//		System.out.println(" Size of the Array = " + myList);
		
		myList.remove(2);
		myList.get(3);
		
		
//		Each For Loop
		for (Object list : myList) {
			System.out.println(list);
		}

		System.out.println( " Print it from While loop " );
		
//		Iterator<Integer> its = myList.iterator(); Integer/ String,

		Iterator it = myList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

		
	}

}
