//Assignment - 30 : 2nd Dec'2024 [15 mins]
//
//Sum of all the even digits present in a given String. 
//
//input : "te1ch2no3cre7dits"
//output : 2
//
//input : "techno"
//output : 0
//
//input : "4563"
//output : 10

package harshada.string;

public class StringAss8 {

	void sumOfEvenDigitFromString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {//traversing STring
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {//checking if char is digit or not
				int digit = Character.getNumericValue(ch);//finding char's numeric value
				sum += checkIsDigitEven(digit);//calling method to check if value is even or not and adding it in sum if its even
			}
		}
		System.out.println("Sum of even digits is " + sum);
	}

	//method to check if digit from string is even or not
	int checkIsDigitEven(int digit) {
		int evenNum = 0;
		if (digit % 2 == 0) {
			evenNum += digit;
		}
		return evenNum;
	}

	public static void main(String[] args) {
		StringAss8 stringAss8 = new StringAss8();
		stringAss8.sumOfEvenDigitFromString("te1ch2no3cre7dits");
		stringAss8.sumOfEvenDigitFromString("techno");
		stringAss8.sumOfEvenDigitFromString("4563");
	}
}
