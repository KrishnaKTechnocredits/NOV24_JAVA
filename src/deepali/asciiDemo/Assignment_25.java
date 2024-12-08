package deepali.asciiDemo;

//Sum of all the digits present in a given String. 
public class Assignment_25 {
	int sum;

	void getSumOfDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				sum = sum + digit;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Assignment_25 assignment = new Assignment_25();
		assignment.getSumOfDigits("te1ch2no3cre7dits");
		assignment.getSumOfDigits("techno");
		assignment.getSumOfDigits("4563");
	}
}
