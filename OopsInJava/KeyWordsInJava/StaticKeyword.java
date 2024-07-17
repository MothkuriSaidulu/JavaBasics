package KeyWordsInJava;

public class StaticKeyword {

	static String companyName = "Infosys";
	String empName;
	int age = 30;

	static void staticMethod1() {
		System.out.println(companyName);
	}

	void nonStaticMethod() {
		System.out.println(empName);
	}

	void nonStaticMethod2() {
		staticMethod1();
		System.out.println(empName);
		System.out.println(age);
	}

	public static void main(String[] args) {
		StaticKeyword obj = new StaticKeyword();

//		Static method without creating object we can access
//		staticMethod1();

//		Non static variable we can not access with out creating object.
//		System.out.println(empName);

//		We need to create object to access non static variable/methods
//		obj.empName = "chary";
//		System.out.println(obj.empName);

		obj.nonStaticMethod2();

	}

}
