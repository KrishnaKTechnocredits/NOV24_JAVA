package kishor;
//print maximum and minimum number from given array.

public class Assignment51_Array {

	void displayMinMaxNumber(int[] input) {
		int MaxNumber = input[0];
		int MinNumber = input[0];
		for (int i = 1; i < input.length; i++) {
			if (MaxNumber < input[i]) {
				MaxNumber = input[i];
			}
			if (input[i] < MinNumber) {
				MinNumber = input[i];
			}
		}
		System.out.println("The maximum number in given string is:- " + MaxNumber);
		System.out.println("The minimum number in given string is:- " + MinNumber);
	}

	public static void main(String[] args) {
		int[] arr = { 104, 44, 45, 22, 25, 47, 29, 108, 46 };
		Assignment51_Array assignment51 = new Assignment51_Array();
		assignment51.displayMinMaxNumber(arr);

	}
}
