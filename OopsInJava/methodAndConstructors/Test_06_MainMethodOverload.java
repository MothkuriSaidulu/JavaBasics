package methodAndConstructors;

public class Test_06_MainMethodOverload {

	void Test_06_MainMethodOverload(int x) {

		System.out.println(x);
	}

	void Test_06_MainMethodOverload(String name, int age) {
		System.out.println(name + age);

	}

//	String[] args --> main method always will take string array as a parameter
	public static void main(String[] args) {

		Test_06_MainMethodOverload obj = new Test_06_MainMethodOverload();
		obj.Test_06_MainMethodOverload(100);
		obj.Test_06_MainMethodOverload("chary", 102);

	}

}
