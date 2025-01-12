/*
 * Assignment - 34 : 7th Dec [15 mins]
print the frequency of all digit characters.

int getCharFreq(String input, char ch){
	int count = 0;
	for(int index=0;index<input.length();index++){
		char currentCh = input.charAt(index);
		if(ch == currentCh)
			count++;
	}
	return count;
}

input : AAB2cBB2BAd2ed3dd
output : 
2 -> 3
3 -> 1

 */

package mayur;

public class Assignment34 {
	
	void displayDigitCharFreq(String str) {
		
		for (int i = 0;  i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				if (str.indexOf(ch)==i) {
					int count=0;
					for (int j = 0; j < str.length();j++) {
						if (str.charAt(j) == ch) {
							count++;
						}
					}
					System.out.println("count of character -"+ch+" --> "+count);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment34 assign34 = new Assignment34();
		assign34.displayDigitCharFreq("AAB2cBB2BAd2ed3dd");
	}
	
}
