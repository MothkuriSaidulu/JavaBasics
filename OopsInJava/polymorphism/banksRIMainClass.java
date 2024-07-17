package polymorphism;







public class banksRIMainClass {

	public static void main(String[] args) {

		HDFC_Bank obj1 = new HDFC_Bank();
		int value = obj1.rbiRateOfIntrest();
		System.out.println(" HDFC Rate OF Intrest : "+value);
		
		SBI_Bank obj2 = new SBI_Bank();
		int SBI_Value = obj2.rbiRateOfIntrest();
		System.out.println( " SBI Rate Of intrest : " + SBI_Value);
	}

}
