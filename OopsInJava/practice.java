
public class practice {

	int x;
	int y;

	practice(int a, int b) {

		x = a;
		y = b;
	}

	void display() {
//		int sum = x + y;
		System.out.println(x);
		System.out.println(y);

	}

	public static void main(String[] args) {

		practice obj = new practice(100, 200);
		obj.display();

	}

}
