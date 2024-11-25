/*
Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2. 
*
*/
package pooja;

public class Assignment_21 {

	void getLengthAndSpaceOfString(String str) {
		int space = 0;
		System.out.println("The given string is : " + str);
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ' ') {
				space++;
			}
		}
		int ans = str.length();
		System.out.println("String length without space is " + (ans - space) + " and space characters are " + space);
	}

	public static void main(String[] args) {
		new Assignment_21().getLengthAndSpaceOfString("prem lata gupta");
	}
}