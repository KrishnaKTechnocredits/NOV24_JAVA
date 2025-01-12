/* Print frequence of each character in a given string*/

package nikita.stringdemo;

public class Assignment32 {
	
	int getCharCount(String str, char ch) {
	int count = 0;
	for(int i = 0; i<str.length(); i++) {
		if(str.charAt(i) == ch) {
			count++;
		}
	}
	return count;
	}
	
	void printFreqOfAllChar(String input) {
		for(int i = 0; i<input.length(); i++) {
			char ch = input.charAt(i);
			int index = input.indexOf(ch);
			if (i == index) {
				int freqOfChar = getCharCount(input, ch);
				System.out.println(ch + "-->" + freqOfChar);
			}
		}
	}

	public static void main(String[] args) {
		Assignment32 a32 = new Assignment32();
		String input = "technocredits";
		a32.printFreqOfAllChar(input);

	}

}
