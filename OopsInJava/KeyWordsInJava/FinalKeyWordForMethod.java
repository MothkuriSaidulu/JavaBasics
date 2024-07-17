package KeyWordsInJava;

class Test1 {

	static int x = 100;
	final int y = 200;

//	method with out Final key word....
	void m1() {
		System.out.println(" This is not Final Method ");
	}

//	Method with final key word.....
	final void m2() {

	}
}

class Test2 extends Test1 {

	void m1() {
		System.out.println(" this is overriden from Test1.. ");

	}

// final method we can not access into child class.
//	void m2() {
//
//	}
}

public class FinalKeyWordForMethod {

	public static void main(String[] args) {
		System.out.println(Test1.x = 200);
		Test1 obj = new Test1();
		System.out.println(obj.y);

	}

}
