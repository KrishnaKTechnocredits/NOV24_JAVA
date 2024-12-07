//Assignment - 34 : 7th Dec [15 mins]
//print the frequency of all digit characters.

package harshada.string;

public class StringAss11 {
	
	void findStringCharFreq(String str, char ch) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			char currentCh=str.charAt(i);
			if(currentCh==ch) {
				count++;
			}
		}System.out.println("Frequency of digit "+ch+"-> "+count);
	}
	
	void findDigitFreqInString(String str) {
		for(int i=0;i<str.length();i++) {
			char digit=str.charAt(i);
			int index=str.indexOf(digit);
			if(Character.isDigit(digit)&& i==index) {
				findStringCharFreq(str, digit);
			}
		}
	}
	
	public static void main(String[] args) {
		StringAss11 stringAss11=new StringAss11();
		stringAss11.findDigitFreqInString("AAB2cBB2BAd2ed3dd");
	}	
}
