/*Assignment - 21 : 24th Nov'2024 [20 mins]

Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2. 
*/

package prashant;

public class Assignment21 {

	void lenghtOfString(String input) {

		int count = 0;
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			if (ch == ' ') {
				count++;
			}

		}
		int withoutsapce = input.length() - count;
		System.out.println("length without space is " + withoutsapce + " and space characters are " + count);
	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		assignment21.lenghtOfString("prem lata gupta");

	}

}
