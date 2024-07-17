package Interface;

interface interfaceDemo {
// 	by default variables are final and static
//	Interface will allow 3 types of methods
//	1.default method.
//	2.abstract method.
//	3.static method.

	int x = 10;
	int y = 20;

// 	abstract method: this method is public method by default
	void abstractMethod(); 

	default void defaultMethod() {
		System.out.println(" this is from interface default mthood ");

	}

	static void staticMethod() {

	}


}
