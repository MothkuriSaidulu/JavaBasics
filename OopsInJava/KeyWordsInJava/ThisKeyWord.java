package KeyWordsInJava;

public class ThisKeyWord {

	int x;
	int y;

//	ThisKeyWord(int a , int b)
//	{
//		x = a;
//		y = b;	
//	}

	ThisKeyWord(int x, int y) {
//		x = x;
//		y = y;
//		output : 0 , 0
		this.x = x;
		this.y = y;
//		Output : 100 , 200
	}

	void dispaly() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {

		ThisKeyWord object = new ThisKeyWord(100, 200);
		object.dispaly();

	}

}
