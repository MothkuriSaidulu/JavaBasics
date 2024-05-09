package Java_Basics;

public class Test_06_ControlStatements {

	public static void main(String[] args) {
		continueStateMent();
//		ifElseIFCondition();
//		eachForLoop();
//		switchSatement();
//		doWhileLoop();

	}

// IF Statment
	public static void ifStatement() {
		int x = 10, y = 15;
		if (x + y > 20) {
			System.out.println("x + y > 20 ");

		}
	}

// If else condition
	public static void ifElseStatement() {
		int x = 10, y = 15;
		if (x + y < 20) {
			System.out.println("x + y > 20 ");

		} else {
			System.out.println(" x + y  20 ");
		}
	}

// If Else If Statment
	public static void ifElseIfStatement() {
		int x = 10, y = 15;
		if (x + y < 20) {
			System.out.println("x + y > 20 true ");

		} else if (x + y < 30) {
			System.out.println(" x + y  < 30 true ");
		} else {
			System.out.println("if above both conditions false then this will execute");
		}

	}

//	Nested IF Statement
	public static void nestedIfStatement() {
		int x = 10, y = 15;
		if (x + y > 20) {
			System.out.println("x + y > 20 true ");
			if (x + y < 30) {
				System.out.println(" x + y  < 30 true ");

			}
		} else {
			System.out.println("if above both conditions false then this will execute");

		}

	}

// Switch Statment	
	public static void switchSatement() {
		int num = 2;
		switch (num) {
		case 0:
			System.out.println("Number iS 0 ");
			break;

		case 1:
			System.out.println("Number is 1");
			break;

		default:
			System.out.println(num);
		}

	}

	public static void continueStateMent() {
		for (int i = 0; i <= 2; i++) {

			for (int j = i; j <= 5; j++) {

				if (j == 4) {
					continue;
				}
				System.out.println(j);
			}
		}

	}

//	if-else-if statement

	public static void ifElseIFCondition() {

		String city = "HYD";

		if (city == "Dilhi") {
			System.out.println(city);

		} else if (city == "Chennai") {
			System.out.println(city);

		} else {
			System.out.println(city);
		}

	}

//	Nested if-statement 
	public void nestedIF() {

		String address = "Delhi, India";

		if (address.endsWith("India")) {
			if (address.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			} else if (address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				System.out.println(address.split(",")[0]);
			}
		} else {
			System.out.println("You are not living in India");
		}
	}

//	Loop Statements for loop
	public static void forLoop(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		System.out.println("The sum of first 10 natural numbers is " + sum);
	}

//	Loop Statements Java for-each loop
	public static void eachForLoop() {
		// TODO Auto-generated method stub
		String[] names = { "Java", "C", "C++", "Python", "JavaScript" };

		System.out.println("Printing the content of the array names:\n");
		for (String name : names) {
			System.out.println(name);
		}
	}

// Java while loop
	public static void whileLoop() {

		int i = 0;

		while (i <= 10) {
//				System.out.println(i);
			i = i + 2;
			System.out.println(i);
		}

	}

	public static void doWhileLoop() {

		int i = 0;
		System.out.println("Print The First 10 even numbers");
		do {
			System.out.println(i);
			i = i + 2;
			System.out.println(i);
		} while (i <= 10);

	}

}
