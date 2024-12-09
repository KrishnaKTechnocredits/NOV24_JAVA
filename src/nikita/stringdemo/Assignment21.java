/* Assignment - 21 : 24th Nov'2024 [20 mins]

Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2. 
*/

package nikita.stringdemo;

public class Assignment21 {
	
	int getCharCount(String str) {
		int count = 0;
		for (int i = 0; i<str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment21 a21 = new Assignment21();
		String input = "nikita sanjay wani";
		int lengthOfStringWithoutSpace = a21.getCharCount(input);
		int spaceCount = input.length() - lengthOfStringWithoutSpace;
		System.out.println("Total spaces available in string are: " + spaceCount);
		System.out.println("Length of string without spaces: " + lengthOfStringWithoutSpace);
	}
}
