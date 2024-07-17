package Java_Basics;

public class Test_17_PrintDuplicateNumberInArray {

	public static void main(String[] args) {

		int numberArray[] = { 1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 8 };
		int I_Value = 0;
		int J_Value = 0;
		for (int i = 0; i < numberArray.length; i++) {
			I_Value = numberArray[i];
			for (int j = i + 1; j < numberArray.length; j++) 
			{
				J_Value = numberArray[j];
				if (I_Value == J_Value) {
//					System.out.println("Duplicate Values = ");
					System.out.print(I_Value + " ");
				}

			}

		}

	}

}