package ashwini.stringAssignments;

public class TotalDigitAssignment22 {
	int index;

	int getDigitCount(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			boolean flag = Character.isDigit(input.charAt(index));
			if (flag == true) {
				count++;
			}
		}
		System.out.println("total " + count + " digits are there in given input.");
		return count;
	}

	public static void main(String[] args) {
		TotalDigitAssignment22 assn22 = new TotalDigitAssignment22();
		assn22.getDigitCount("aa1kan33ks4h5a");

	}

}
