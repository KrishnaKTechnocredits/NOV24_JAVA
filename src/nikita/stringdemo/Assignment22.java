/* Assignment - 22 : 25th Nov'2024 [20 mins]

write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)
*/

package nikita.stringdemo;

public class Assignment22 {
	int count = 0;
	int getTotalNumberOfDigits(String str) {
	for (int i = 0; i<str.length(); i++) {
		if (Character.isDigit(str.charAt(i))) {
			count++;
			}
		}
	return count;
	}

	public static void main(String[] args) {
		Assignment22 a22 = new Assignment22();
		String input = "nik124ta";
		int countOfDigits = a22.getTotalNumberOfDigits(input);
		System.out.println("Total " + countOfDigits + " digits are there in given input string ");
	}
}
