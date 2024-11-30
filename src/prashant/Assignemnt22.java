/*Assignment - 22 : 25th Nov'2024 [20 mins]

write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)*/

package prashant;

public class Assignemnt22 {

	int returnDigit(String input) {
		boolean flag = true;
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) == true) {
				count++;
			}

		}

		return count;

	}

	public static void main(String[] args) {
		Assignemnt22 assignemnt22 = new Assignemnt22();
		int count = assignemnt22.returnDigit("aa1kan33ks4h5a");
		System.out.println("total " + count + " digits are there in given input");

	}

}
