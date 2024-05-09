package Java_Basics;

public class StaticTest {

	int rollNumber;
	String sName;
	static String collegeName = "HolyMary";

	public StaticTest(int r, String name) {
		rollNumber = r;
		sName = name;

	}

	public void print() {
		System.err.println(rollNumber + " " + sName + " " + collegeName);

	}

}
