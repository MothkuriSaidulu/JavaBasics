package KeyWordsInJava;

class TestFinalKeyWord {

// final key word for variable
	
//	int number = 100;
	final int number = 200; 

}

public class FinalKeyWordForVariable {

	public static void main(String[] args) {
		TestFinalKeyWord obj = new TestFinalKeyWord();
//      with out final keyword
//		obj.number = 200;
//		System.out.println(obj.number);

//		with final keyword we will get error
//		obj.number = 300;
		System.out.println(obj.number);

	}

}
