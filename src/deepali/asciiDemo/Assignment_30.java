package deepali.asciiDemo;

//Assignment - 30 
//Sum of all the even digits present in a given String.
public class Assignment_30 {
	int sum;

	void getSumOfEven(String str) {
		int sum = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int evenValue = Character.getNumericValue(ch);
				if (evenValue % 2 == 0) {
					sum = sum + evenValue;
				}
			}
		}
		System.out.println("Sum of even numbers: "+ sum);
	}

	public static void main(String[] args) {
		Assignment_30 assignment = new Assignment_30();
		assignment.getSumOfEven("te1ch2no3cre7dits");
		assignment.getSumOfEven("techno");
		assignment.getSumOfEven("4563");
	}
}
