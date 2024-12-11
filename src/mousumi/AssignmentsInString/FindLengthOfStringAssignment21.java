package mousumi.AssignmentsInString;

/**
Assignment - 21 : 24th Nov'2024 [20 mins]

Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2. 
 */

public class FindLengthOfStringAssignment21 {

	static int lengthCount = 0;
	static int spaceCount = 0;

	static int findLengthOfString(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (Character.isLetter(str.charAt(index)))
				lengthCount++;
			else
				spaceCount++;
		}
		return lengthCount;
	}

	public static void main(String[] args) {
		String str = "prem lata gupta";
		int length = findLengthOfString(str);
		System.out.println("length of " + str + " without space is " + length  + " and "
				                                 + "space characters are " + spaceCount);
	}
}
