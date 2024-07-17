package methodAndConstructors;

public class Test_03_accessingVariables {

	static String companyName = "Infosys";
	int empID;
	String empName;
	int salary;

//	Method for printing the values
	void dispaly() {
		System.out.println(companyName + " " + empID + " " + empName + " " + salary + " ");
	}

//	method for mapping variable
	void dataByMethod(String cName, int eID, String eName, int eSalary) {
		companyName = cName;
		empID = eID;
		empName = eName;
		salary = eSalary;

	}

//	Constructor
	Test_03_accessingVariables(String cName, int eID, String eName, int eSalary) {
		companyName = cName;
		empID = eID;
		empName = eName;
		salary = eSalary;
	}

//	construction: 
//	we using for for initializing the data for variables.
//	it will not return any values.
//	it will take parameters.
//	it will invoke automatically at the time creating object.

	public static void main(String[] args) {

//		Creating object
//		Test_03_class object = new Test_03_class();

// 	1)	By using object reference variable

		/*
		 * object.empID = 101; object.empName = "chary"; object.salary = 10000;
		 * 
		 * object.dispaly();
		 * 
		 */

//	2)	By using Method accessing variables
//		object.dataByMethod(companyName, 100, "chary", 1000);

//	3) by using constructor 
//		object.dispaly();

		Test_03_accessingVariables object = new Test_03_accessingVariables(companyName, 100, "Chary", 30000);
		object.dispaly();
	}
}