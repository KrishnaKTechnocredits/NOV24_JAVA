package nitish;

public class SumEvenDigits {
	void result1(String input) {
		int sum = 0;
		for (int num = 0; num < input.length(); num++) {
			char ch = input.charAt(num);
			if (Character.isDigit(ch)) {
				if(ch%2==0) {
				sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println("Sum of all the even digits in '"+input+"' is "+sum);
	}
	
	void result2(String input) {
		int sum = 0;
		for (int num = 0; num < input.length(); num++) {
			char ch = input.charAt(num);
			if (Character.isDigit(ch)) {
				if(ch%2==0) {
				sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println("Sum of all the even digits in '"+input+"' is "+sum);
	}
	
	void result3(String input) {
		int sum = 0;
		for (int num = 0; num < input.length(); num++) {
			char ch = input.charAt(num);
			if (Character.isDigit(ch)) {
				if(ch%2==0) {
				sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println("Sum of all the even digits in '"+input+"' is "+sum);
	}

	public static void main(String[] args) {
		String input = "Ni72ndfy63mns73b7";
		String input2 = "Nitish";
		String input3 = "1234";
		SumEvenDigits sumEvenDigits = new SumEvenDigits();
		sumEvenDigits.result1(input);
		sumEvenDigits.result2(input2);
		sumEvenDigits.result3(input3);

	}

}
