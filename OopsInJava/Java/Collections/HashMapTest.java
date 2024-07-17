package Java.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Chary");
		map.put(101, "Saidachary");
		map.put(103, "aaaa");
		map.put(104, "bbbb"); // this will not prin
		map.put(104, "cccc");
		map.put(null, "cccc");// this will not print
		map.put(null, "dddd"); // this print

		System.out.println(" data of map = " + map);
		System.out.println("Size of map = " + map.size());

		System.out.println(" Set of keys in Map : " + map.keySet());

		System.out.println(" Set of Values in Map : " + map.values());

		System.err.println("Entery map data : " + map.entrySet());

		Set<Entry<Integer, String>> mapEntry = map.entrySet();

		Iterator<Entry<Integer, String>> it = mapEntry.iterator();

		while (it.hasNext()) {
			Entry<Integer, String> pair = it.next();
			System.out.println("Key value = " + pair.getKey() + " Values : " + pair.getValue());
		}
	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub

	}
}
