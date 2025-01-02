package ravindra;

public class PrintLengthMoreThan6CharInFromArray {
	void printLength(String[] names) {
		for (int i = 0; i < names.length; i++) {
			int lengthofString = names[i].length();
			if (lengthofString > 6) {
				System.out.println(names[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		PrintLengthMoreThan6CharInFromArray printLengthMoreThan6CharInFromArray=new PrintLengthMoreThan6CharInFromArray();
		printLengthMoreThan6CharInFromArray.printLength(names);
	}
}
