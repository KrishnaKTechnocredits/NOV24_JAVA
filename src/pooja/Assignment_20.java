/*
Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
    return count;
}

*/
package pooja;

public class Assignment_20 {

	int getFrequencyOfChars(String str, char ch) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		System.out.println("The frequency of charcter 'a' in string aakansha is : "
				+ new Assignment_20().getFrequencyOfChars("aakansha", 'a'));
	}
}