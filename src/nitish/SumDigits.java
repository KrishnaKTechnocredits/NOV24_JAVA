package nitish;

public class SumDigits {

	int result1(String input) {
		int sum = 0;
		for (int num = 0; num < input.length(); num++) {
			char ch = input.charAt(num);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	int result2(String input2) {
		int sum2 = 0;
		for (int num2 = 0; num2 < input2.length(); num2++) {
			char ch2 = input2.charAt(num2);
			if (Character.isDigit(ch2)) {
				sum2 = sum2 + Character.getNumericValue(ch2);
			}
		}
		return sum2;
	}

	int result3(String input3) {
		int sum3 = 0;
		for (int num3 = 0; num3 < input3.length(); num3++) {
			char ch3 = input3.charAt(num3);
			if (Character.isDigit(ch3)) {
				sum3 = sum3 + Character.getNumericValue(ch3);
			}
		}
		return sum3;
	}

	public static void main(String[] args) {
		String input = "Nit9h23 Meh8a";
		String input2 = "Nitish";
		String input3 = "2465";
		SumDigits sumDigits = new SumDigits();
		int answer1 = sumDigits.result1(input);
		System.out.println("The sum of digits present in '" + input + "' is " + answer1);
		int answer2 = sumDigits.result2(input2);
		System.out.println("The sum of digits present in '" + input2 + "' is " + answer2);
		int answer3 = sumDigits.result3(input3);
		System.out.println("The sum of digits present in '" + input3 + "' is " + answer3);

	}

}
