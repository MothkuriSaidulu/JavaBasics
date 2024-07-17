package methodAndConstructors;

public class constructorDemo {

	int num;
	static String name;

//		Default constructor
	constructorDemo() {
		num = 100;
		name = "chary";
	}

//	Parameterized Constructor

	constructorDemo(int x, String str) {
		num = x;
		name = str;

	}

	void dispaly() {
		System.out.println(num + " " + name + " ");
	}

	public static void main(String[] args) {

//		constructor object = new constructor(); // we have 2 constructors but now Default constructor will invok

		constructorDemo object = new constructorDemo(10, "chary");//
		object.dispaly();

	}

}
