package pooja.stringassignments;

/*
 * Assignment - 30 : 2nd Dec'2024 [15 mins]

Sum of all the even digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 2

input : "techno"
output : 0

input : "4563"
output : 10*/
public class Assignment_30 {

	void printSumOfEvenAndOddDigitsFromString(String str) {
		int oddSum = 0, evenSum = 0, temp = 0;
		System.out.println("Given String : " + str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					temp = num;
					evenSum = evenSum + temp;
				} else {
					temp = num;
					oddSum = oddSum + temp;
				}
			}
		}
		System.out.println("The sum of even numbers in string : " + evenSum);
		System.out.println("The sum of odd numbers in string : " + oddSum);
	}

	public static void main(String[] args) {
		Assignment_30 assignment_30 = new Assignment_30();
		assignment_30.printSumOfEvenAndOddDigitsFromString("te1ch2no3cre7dits");
		System.out.println("--------------------------------");
		assignment_30.printSumOfEvenAndOddDigitsFromString("techno");
		System.out.println("--------------------------------");
		assignment_30.printSumOfEvenAndOddDigitsFromString("4563");
	}
}