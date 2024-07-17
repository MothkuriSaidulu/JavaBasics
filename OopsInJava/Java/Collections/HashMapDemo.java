package Java.Collections;
	
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;;

public class HashMapDemo {

	public static void main(String[] args) {
//		Data will in Key and value.
//		Duplicate Key not allowed.
//		Duplicate values allowed.
//		By using index we con’t read the data.
//		HashMap allows one null key and multiple null values 
		
//		Declaration
//		HashMap mymap = new HashMap();
//		map mapm = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

// 		Inserting date into Hash Map
		hm.put(100, " Chary");
		hm.put(101, " Saida");
		hm.put(102, " Vanam");
		hm.put(103, " oldValue");
		hm.put(103, " newvalue");
		hm.put(null, "cccc");
		hm.put(null, "bbb");
		hm.put(104, null);
		hm.put(105, null);
		hm.put(106, null);
		
		System.out.println(" First Hash Map " + hm);

//		Remove pair from Hash Map
//		hm.remove(100);
//		System.out.println(" Print Hash Map After remove " + hm);
		
//		Access particular pair from Hash Map
		System.out.println(" Print Particular Pair " + hm.get(101));
		
//		Get the keys from Hash Map
		System.out.println(" Print Key only "+hm.keySet());
		
//		Getting vales from HashMap
		System.out.println(" Print Value only "+hm.values());
		
//		Get the data of key and value
		System.out.println("Print Key and Value " + hm.entrySet());
		
//		 {  --> Representig the List
//		[]  --> Representig the Set

		
//		Reading data by looping 
//		Normal loop not possible bcz index not possible we need to use each for loop.
		for( Object h : hm.keySet()  )
		{
			System.out.println( " Print key " + h + "  Print Value" + hm.get(h));
			
		}
		
		System.out.println("Print from Iterator " + " "
				+ ""
				+ "");
//		By using Iterator
		Iterator<java.util.Map.Entry<Integer, String>> it= hm.entrySet().iterator();
		
		while( it.hasNext() ) 
		{
			java.util.Map.Entry<Integer, String > pair = it.next();
			System.out.println(" Key  " + pair.getKey() + " value " +pair.getValue() );
		}
		
		
	}

}
