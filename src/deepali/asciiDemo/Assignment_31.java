package deepali.asciiDemo;

//Assignment - 31 : 2nd Dec'2024 [15 mins]
//return the difference of Sum of all the odd digits and even digits present in a given String. 
//HINT : sum of odd digits - sum of even digits
public class Assignment_31 {
	int evenSum;
	int oddSum;

	void getSumOfEven(String str) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int evenValue = Character.getNumericValue(ch);
				if (evenValue % 2 == 0) {
					evenSum = evenSum + evenValue;
				} else {
					oddSum = oddSum + evenValue;
				}
			}
		}
		int Diff = oddSum - evenSum;
		System.out.println("Differance of Sum of even numbers and odd numbers : " + Diff);
	}

	public static void main(String[] args) {
		Assignment_31 assignment = new Assignment_31();
		assignment.getSumOfEven("te1ch2no3cre7dits");
		assignment.getSumOfEven("4563");
	}
}
