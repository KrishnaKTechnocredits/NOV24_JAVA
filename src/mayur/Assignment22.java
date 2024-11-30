/*
 * Assignment - 22 : 25th Nov'2024 [20 mins]

write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)
 */

package mayur;

public class Assignment22 {
	
	int getDigitsFromString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment22 assign22 = new Assignment22();
		System.out.println("Total "+assign22.getDigitsFromString("aa1kan33ks4h5a")+" digits were found in given input");
	}
}
