package nitesh.string;
/*Assignment - 34 : 7th Dec [15 mins]
print the frequency of all digit characters.

input : AAB2cBB2BAd2ed3dd
output : 
2 -> 3
3 -> 1
*/
public class DigitFreqString {
	
	int getDigitFreq(String methodinput, char methodch) {
		int count =0;
		for(int i=0; i<methodinput.length();i++) {
			char ch = methodinput.charAt(i);
			if(methodch==ch) {
				count++;
			}					
		}
		return count;
	}
	
	void printDigitFreq(String str) {
		for(int index =0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)&& str.indexOf(ch)==index) {
				int freq = getDigitFreq(str,ch);
				System.out.println("Frequency of Digit Character " + ch + " is " +freq);
			}
		}
	}
	
	public static void main(String[] args) {
		DigitFreqString digitfreqstring = new DigitFreqString();
		digitfreqstring.printDigitFreq("AAB2cBB2BAd2ed3dd");
	}
}
