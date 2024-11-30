/**
 * 
 */
package harish.stringdemo;

/**
 * Assignment 22 | Nov 25 - write a method to return total number of digits from
 * the given input. print the count in main method.
 * 
 * Time Taken = 4 minutes
 */
public class Assignment22 {

	int getCountOfDigits(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		String input = "Assignment 22 | Nov 25 - write a method to return total number of digits";
		int countOfDigits = assignment22.getCountOfDigits(input);
		System.out.println("The count of digits in given string is: " + countOfDigits);
	}
}
