/* Assignment - 21 : 24th Nov'2024 [20 mins]
Find the length of the given string excluding space. 
input : prem lata gupta
output : length without space is 13 and space characters are 2. 
*/

package amruta.String;

public class Assign_21_FindLengthOfString {

	static void findLengthOfString(String str) {
		int lengthCount = 0;
		int spaceCount = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (Character.isWhitespace(ch))
				spaceCount++;
			else
				lengthCount++;
		}
		System.out.println(
				"length of " + str + " without space is " + lengthCount + " and space characters are " + spaceCount);
	}

	public static void main(String[] args) {
		findLengthOfString("prem lata gupta");

		findLengthOfString("pr2m la_t1a");
	}
}
