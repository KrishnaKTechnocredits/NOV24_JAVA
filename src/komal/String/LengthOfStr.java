//Assignment - 21 : 24th Nov'2024 [20 mins]
//
//Find the length of the given string excluding space. 
//
//input : prem lata gupta
//output : length without space is 13 and space characters are 2

package komal.String;

public class LengthOfStr {

	void getLengthOfString(String str) {
		int strLenWithoutSpaceCount = 0;
		int spaceCharacterCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				strLenWithoutSpaceCount++;
			} else {
				spaceCharacterCount++;
			}
		}
		System.out.println("length without space is :" + strLenWithoutSpaceCount);
		System.out.println("space characters are :" + spaceCharacterCount);
	}

	public static void main(String[] args) {
		LengthOfStr lengthOfStr = new LengthOfStr();
		lengthOfStr.getLengthOfString("prem lata gupta");

	}
}
