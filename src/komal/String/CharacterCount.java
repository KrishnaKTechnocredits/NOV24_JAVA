//Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
//Find the given character count from given string. 
//
//input : aakanskha, a
//output : Count of a in aakanskha is 4.  		 
//
//hint : 
//int getCharFreq(String str, char ch){
//     return count;
//}

package komal.String;

public class CharacterCount {
	int count;

	int getCharacterFreq(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		CharacterCount characterCount = new CharacterCount();
		int charCount = characterCount.getCharacterFreq("aakanskha", 'a');
		System.out.print("Character count of a : " + charCount);
	}
}
