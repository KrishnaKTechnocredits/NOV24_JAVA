/*Assignment - 25 : 2nd Dec'2024 [20 mins]-------------8 min

Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18*/
package prashant;

public class Assignment25 {
	
	int sumOfDigit(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int digit=Character.getNumericValue(ch);
				sum=sum+digit;
				//sum = sum + Character.getNumericValue(ch);
			}

		}

		return sum;
	}

	public static void main(String[] args) {

		Assignment25 assignment25 = new Assignment25();
		int input1 = assignment25.sumOfDigit("te1ch2no3cre7dits");
		System.out.println(input1);
		int input2 = assignment25.sumOfDigit("techno");
		System.out.println(input2);
		int input3 = assignment25.sumOfDigit("4563");
		System.out.println(input3);

	}

}
