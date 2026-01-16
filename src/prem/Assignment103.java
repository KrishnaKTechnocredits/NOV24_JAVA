package prem;

public class Assignment103 {

	void checkPalindrom(String string) {

		StringBuilder str1 = new StringBuilder(string);
		String reversestr1 = str1.reverse().toString();
		System.out.println("Original: " + string);
		System.out.println("Reversed: " + reversestr1);

		if (string.equals(reversestr1)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

	public static void main(String[] args) {
		String name = "naman";
		int num = 1221;
		String string = String.valueOf(num);
		Assignment103 assign103 = new Assignment103();
		assign103.checkPalindrom(name);
		assign103.checkPalindrom(string);
	}

}
