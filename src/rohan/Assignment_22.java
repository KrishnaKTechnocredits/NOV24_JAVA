package rohan;

public class Assignment_22 {

	public static void main(String[] args) {
		Assignment_22 digitcount = new Assignment_22();
		digitcount.DigitCount("aa1kan33ks4h5a", 0);

	}

	void DigitCount(String str, int count) {
		for (int i = 0; i <= str.length() - 1; i++) {
			if (Character.isDigit(str.charAt(i)) == true) {
				count++;
			}
		}
		System.out.println("total " + count + " digits are there in given input.");
	}

}
