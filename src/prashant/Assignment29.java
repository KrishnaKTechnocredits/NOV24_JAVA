/*Assignment - 29 : 2nd Dec'2024 [20 mins]----10 min
write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).*/

package prashant;

public class Assignment29 {
	
	int asciiUpperLowerNumber(char ch) {
		int num = ch;
		return num;

	}

	public static void main(String[] args) {

		Assignment29 assignment29 = new Assignment29();

		for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			int num = assignment29.asciiUpperLowerNumber(ch1);
			System.out.println(ch1 + "-->" + num);
		}

		for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
			int num = assignment29.asciiUpperLowerNumber(ch1);
			System.out.println(ch1 + "-->" + num);
		}
		for (char ch1 = '0'; ch1 <= '9'; ch1++) {
			int num = assignment29.asciiUpperLowerNumber(ch1);
			System.out.println(ch1 + "-->" + num);
		}

	}

}
