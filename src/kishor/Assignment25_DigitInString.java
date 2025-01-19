package kishor;
//Sum of all the digits present in a given String.

public class Assignment25_DigitInString {
	
	void DisplaySumOfDigits(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int number = Character.getNumericValue(ch);//give numeric value not ascii value
				sum = sum+number;
			}
		}
		System.out.println("The sum of the digit present is giving string is:- "+sum);
	}
	
	public static void main(String[] args) {
		Assignment25_DigitInString assignment25 = new Assignment25_DigitInString();
		assignment25.DisplaySumOfDigits("te1ch2no3cre7dits");
		assignment25.DisplaySumOfDigits("techno");
		assignment25.DisplaySumOfDigits("4563");	
	}
}
