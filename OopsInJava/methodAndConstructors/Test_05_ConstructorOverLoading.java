package methodAndConstructors;

public class Test_05_ConstructorOverLoading {

	double width, height, length;

//	Constructor with out parameter
	Test_05_ConstructorOverLoading() {
		width = 10.3;
		height = 12.5;
		length = 13.5;

//		width = height =length = 0;

	}

//	Constructor with parameter
	Test_05_ConstructorOverLoading(double w, double h, double l) {
		width = w;
		height = h;
		length = l;

	}

//	another Constructor 
	Test_05_ConstructorOverLoading(double len) {

		width = height = length = len;
	}

	double valume() {

		return (width * height * length);
	}

	public static void main(String[] args) {

		Test_05_ConstructorOverLoading object1 = new Test_05_ConstructorOverLoading();
		Test_05_ConstructorOverLoading object2 = new Test_05_ConstructorOverLoading(10);
		Test_05_ConstructorOverLoading object3 = new Test_05_ConstructorOverLoading(10.30, 12.30, 13.40);
		
		
	}

}
