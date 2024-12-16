/* Assignment - 29 : 2nd Dec'2024 [20 mins]
write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).
*/

package nikita.stringdemo;

public class Assignment29 {
	
	int charToAscii(char ch) {
		int ascii = ch;
		return ascii;
	}
	
	private void printUpperCaseAscii() {
			System.out.println("Following is the Ascii values for given Upper Case Characters: " );
			for (char ch1 = 'A'; ch1<='Z'; ch1++) {
				int ans = charToAscii(ch1);
			System.out.println(ch1 + " --> " + ans);
		}
	}
	
	private void printLowerCaseAscii() {
		System.out.println("\nFollowing is the Ascii values for given Lower Case Characters: ");
		for (char ch1 = 'a'; ch1<='z'; ch1++) {
			int ans = charToAscii(ch1);
			System.out.println(ch1 + " --> " + ans);
		}
	}
	
	private void printDigitsAscii() {
		System.out.println("\nFollowing is the Ascii values for given Digits: ");
		for (char ch1 = '0'; ch1<='9'; ch1++) {
			int ans = charToAscii(ch1);
			System.out.println(ch1 + " --> " + ans);
		}
	}
	
	public static void main(String[] args) {
		Assignment29 a29 = new Assignment29();
		a29.printUpperCaseAscii();
		a29.printLowerCaseAscii();
		a29.printDigitsAscii();
	}
}
