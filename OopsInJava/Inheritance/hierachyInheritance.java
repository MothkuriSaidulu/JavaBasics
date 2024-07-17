package Inheritance;

class parentA {
	int a = 100;

	void dispalyA() {
		System.out.println(" Printing from Parent class " + a);
	}

}

class ChildB extends parentA {
	int b = 200;

	void displayB() {
		System.out.println(" Printing from Parent class " + b);

	}

}

class ChildC extends parentA {
	int c = 300;

	void displayC() {
		System.out.println("Printing from Parent class " + c);
	}
}

public class hierachyInheritance extends Object {

	public static void main(String[] args) {
		ChildB objB = new ChildB();
		objB.displayB();
		objB.dispalyA();

		ChildC objC = new ChildC();
		objC.displayC();
		objC.dispalyA();
	}

}
