/* print the frequency of uppercase characters.

input : AABcBBBAdeddd
output : 
A -> 3
B -> 4 */

package nikita.stringdemo;

public class Assignment33 {

	int getUPCaseCharFreq(String str, char ch) {
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			char currentChar = str.charAt(i);
			if(ch == currentChar) {
				count++;
			}
		}
		return count;
	}
	
	void printUpperCaseCharFreq (String input) {
		for(int i = 0 ; i<input.length(); i++) {
			char ch  = input.charAt(i);
			int index = input.indexOf(ch);
			if(Character.isUpperCase(ch) && i == index) {
				int count = getUPCaseCharFreq(input, ch);
				System.out.println(ch + "-->" + count);
			}
		}
	}
	public static void main(String[] args) {
		Assignment33 a33 = new Assignment33();
		String input = "AABcBBBAdeddd";
		a33.printUpperCaseCharFreq(input);
	}
}
