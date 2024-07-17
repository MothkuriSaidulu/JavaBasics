package methodAndConstructors;

public class Test_04_overloadingMethod {
//	1.	Method name should be same.
//	2.	if method name same Parameter should be different.
//	3.	if method name same  Data Type of parameter should be different.
//	4.	if method name same  Order of parameter should be different.

	int a = 10, b = 20;

// Actual Method
	void sum() {
		System.out.println(a + b);
	}

//	2.	if method name same Number of Parameter should be different.
	void sum(int x, int y) {
		System.out.println(x + y);
	}

//	3.	if method name same  Data Type of parameter should be different.
	void sum(int x, double y) {

		System.out.println(x + y);
	}

//	4.	if method name same  Order of parameter should be different.
	void sum(double y, int x) {
		System.out.println(x + y);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public static void main(String[] args) {
		Test_04_overloadingMethod object = new Test_04_overloadingMethod();
		object.sum();
		object.sum(100, 200);
		object.sum(102, 10.3);
		object.sum(120, 130);
		object.sum(10, 20, 30);
	}

}
