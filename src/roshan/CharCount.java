package roshan;

public class CharCount {
	static int count = 0; // count was declared in loop

	int striCount(String str, char ch) {
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch) {             //is used to compare a specific character in the string str with the character ch
				count++;

			}
		}
		return count;

	}

	public static void main(String[] args) {
		CharCount charcount = new CharCount();
		charcount.striCount("aakanskha", 'a');
		System.out.println("The character 'a' appears " + count + " times.");
	}

}

/*
 * Assignment - 20 : 24th Nov'2024 [20 mins] [IMP] Find the given character
 * count from given string.
 * 
 * input : aakanskha, a output : Count of a in aakanskha is 4.
 * 
 * hint : int getCharFreq(String str, char ch){ return count; }
 */