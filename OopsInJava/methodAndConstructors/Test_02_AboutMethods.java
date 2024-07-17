package methodAndConstructors;

public class Test_02_AboutMethods {

	public static void main(String[] args) {

		Test_02_AboutMethods object = new Test_02_AboutMethods();
		object.m1();
		String str = object.m2();
		System.out.println(str);
		object.m3("hello");;
		
		String str2 = object.m4("hey hello");
		System.out.println(str2);
	}

	
//	1	No Params --> No return value
		void m1()
		{
			System.out.println("No Params --> No return value ");
		}
	
//	2	No Params --> return value

		String m2() 
		{
			return "Hello World";
			
		}
		
//	3	Take parameter --> No retrun value
		
		void m3(String str)
		{
			//str = "hello";
			System.out.println(str);
			
		}
		
//	4		Take parameter --> retrun value

		String m4(String str)
		{
//			str = "hey heloo";
			return str;
			
		}
		
}
