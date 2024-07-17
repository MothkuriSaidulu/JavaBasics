package methodAndConstructors;

public class Test_01_ClassAndObject {

//	Note:
//	At the time of execution java always looking for main method in the class before execution.
//	Objects always should create inside the main method only.
//	Void means this method not returning any value.
//	Inside method we can not write one more method.

//	Variables
	String companyName = "Infosys";  // it is referring Entity so we can assign at class level.
	int empID;
	String empName;
	String empJobType;
	int empSalary;

//	Method
	void dispaly() {
		System.out.print(" empID : " + empID + ", ");
		System.out.print(" empName : " + empName + ", ");
		System.out.print(" empJobType : " + empJobType + ", ");
		System.out.print(" empSalary : " + empSalary);

	}

	public static void main(String[] args) {

		Test_01_ClassAndObject object = new Test_01_ClassAndObject(); // Object Creation
		object.empID = 101;
		object.empName = "Chary";
		object.empJobType = "Tester";
		object.empSalary = 10000;
		object.dispaly();

		Test_01_ClassAndObject object2 = new Test_01_ClassAndObject();
		object2.empID = 102;
		object2.empName = "Vanam";
		object2.empJobType = "Api Tester";
		object2.empSalary = 20000;
		object2.dispaly();
		
	}
	
	

}
