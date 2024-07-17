package polymorphism;

class Bank {
	int rbiRateOfIntrest() {
		return 10;

	}

}

class HDFC_Bank extends Bank {

	int rbiRateOfIntrest() {
		return 8;
	}

}

class SBI_Bank extends Bank {

	int rbiRateOfIntrest() {

		return 10;
	}
}

public class OverridingMethod {

	public static void main(String[] args) {
		HDFC_Bank objHDFC = new HDFC_Bank();
		objHDFC.rbiRateOfIntrest();

	}

}
