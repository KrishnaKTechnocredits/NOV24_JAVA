package narendra;
/*
Assignment - 21 : 24th Nov'2024 [20 mins]

Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2.
*/

public class Assignment_21_ToFindLenthOfString {
	
	void printCharInReverse(String strInput) {
		System.out.print("Output:");
		int charCount = 0;
		int strLength = strInput.length();
		for(int index=0; index<strLength; index++) {
			char chr = strInput.charAt(index);
			System.out.print(chr);
			if(strInput.charAt(index) == ' ') {
				charCount++;
			}
		}
//		System.out.println(strLength);
//		System.out.println(strLength - charCount);
		System.out.println("\n" + "length without space is " + (strLength - charCount) + " and space characters are " + charCount);		
	
	}

	public static void main(String[] args) {
		Assignment_21_ToFindLenthOfString printcharinreverse = new Assignment_21_ToFindLenthOfString();
		printcharinreverse.printCharInReverse("prem lata gupta");

	}

}