package nitish;

public class SumOddEven {
	void result1(String input) {
		int evenSum = 0;
		int oddSum = 0;
		int total;
		for (int num = 0; num < input.length(); num++) {
			char ch = input.charAt(num);
			if (Character.isDigit(ch)) {
				if(ch%2==0) {
					evenSum = evenSum + Character.getNumericValue(ch);
				}else {
					oddSum = oddSum + Character.getNumericValue(ch);
				}
			}
		}
		total = oddSum-evenSum;
		System.out.println("Difference of Sum of all the odd digits and even digits present in '"+input+"' is "+total);
	}

	public static void main(String[] args) {
		String input = "Ni892y6s5h7";
		SumOddEven sumOddEven = new SumOddEven();
		sumOddEven.result1(input);

	}

}
