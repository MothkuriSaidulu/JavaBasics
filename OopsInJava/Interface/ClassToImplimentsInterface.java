package Interface;

public class ClassToImplimentsInterface implements interfaceDemo {

	public void abstractMethod() {
		System.out.println("this is abstract method from interface");

	}

	public static void main(String[] args) {

//		 Case 1

		ClassToImplimentsInterface obj = new ClassToImplimentsInterface();
		obj.abstractMethod(); // through obj we can access this method
		obj.defaultMethod(); // through obj we can access this method
//		staticMethod();  // we can not access this method directly whic is coming from interface
		interfaceDemo.staticMethod(); // for static method we need to use interface name.

// 		we can not instantiate the interface by using object
//		interfaceDemo objr = new interfaceDemo(); 

//      by using class we can create the object from interface
		interfaceDemo obj2 = new ClassToImplimentsInterface();
		obj2.abstractMethod();
		obj2.defaultMethod();
		obj2.x;
		obj2.y;
		interfaceDemo.staticMethod();

	}

}
