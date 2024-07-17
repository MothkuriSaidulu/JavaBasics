package Inheritance;

// Note: we can create multiple class in a single java file
// We should not use same class name in entire project.
class ParentClassA {
	int a = 100;

	void displayA() {
		System.out.println("Parent class a : " + a);
	}

}

class ChildClassB extends ParentClassA {
	int b = 200;

	void displayB() {
		System.out.println(" Child Class B " + b);
	}

}

class ChildClassC extends ChildClassB {
	int c = 300;

	void displayC() {
		System.out.println("Child class b : " + c);
	}
}

public class InheritanceDemoSingleAndMultiLevel {

	public static void main(String[] args) {

//		Single Inheritance
//		ChildClassB obj = new ChildClassB(); 
//		obj.displayA();
//		obj.displayB();

//		Multi level

		ChildClassC objC = new ChildClassC();
		objC.displayC();
		objC.displayB();
		objC.displayA();
	}

}
