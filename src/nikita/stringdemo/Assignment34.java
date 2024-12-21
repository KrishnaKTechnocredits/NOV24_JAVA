/* print the frequency of all digit characters.
input : AAB2cBB2BAd2ed3dd
output : 
2 -> 3
3 -> 1
*/

package nikita.stringdemo;

public class Assignment34 {
	
	int getCharFreq(String str, char ch) {
		int count = 0;
		for (int i = 0; i<str.length(); i++) {
			char currentChar = str.charAt(i);
			if (ch == currentChar) {
				count++;
			}
		}
		return count;
	}
	
	void printFreqOfDigitChar(String input) {
		for(int i = 0; i<input.length(); i++) {
			char ch = input.charAt(i);
			int index = input.indexOf(ch);
			if(Character.isDigit(ch) && (index==i)) {
				int count = getCharFreq(input, ch);
				System.out.println(ch + "-->" + count);
			}
		}
	}
		
		public static void main(String[] args) 
		{
			Assignment34 a34 = new Assignment34();
			String input = "AAB2cBB2BAd2ed3dd";
			a34.printFreqOfDigitChar(input);
		}
	}
	