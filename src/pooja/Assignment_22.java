/*
 * Assignment - 22 : 25th Nov'2024 [20 mins]

write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)
 */
package pooja;

public class Assignment_22 {

	int getTotalNoOfDigitsFromString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("The total digits in string aa1kan33ks4h5a is : " +  new Assignment_22().getTotalNoOfDigitsFromString("aa1kan33ks4h5a"));
	}
}