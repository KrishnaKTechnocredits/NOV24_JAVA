package reshma;
/* print the freq of each character.
input : aakanksha
a -> 4
k ->2
n->1
s->1
h->1
*/

public class Assignment32_PrintFreqOfChar {
	int getFreqOfChar(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch)
				count++;
		}
		return count;
	}

	void PrintFreqOfAllChar(String input) {
		int FreqOfChar = 0;
		for (int i = 0; i <input.length(); i++) {
			char ch = input.charAt(i);
			if (i == input.indexOf(ch)) {
				FreqOfChar = getFreqOfChar(input, ch);
				System.out.println("The freq of char " + ch + " is " + FreqOfChar);
			}
		}
	}

	public static void main(String[] args) {
		Assignment32_PrintFreqOfChar assignment32 = new Assignment32_PrintFreqOfChar();
		String input="aakanksha";
		assignment32.PrintFreqOfAllChar(input);
	}
}
