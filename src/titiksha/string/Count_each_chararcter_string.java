//Find count of each character in the given string :input -Technocredits
//logic of the program:
//we need to count of selected chararcter in the string
//we need to run loop so that it will perform same task for all characters in the string 

package titiksha.string;

public class Count_each_chararcter_string {
	int count = 0;
	int getCountOfCharacter(String str, char ch2) {
		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			if (ch == ch2) {
				count++;
			}
		}
		return count;
	}

	void getEachCharacterCount(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			Count_each_chararcter_string countofeachcharacter = new Count_each_chararcter_string();
			int freq = countofeachcharacter.getCountOfCharacter(str, ch);
			int index = str.indexOf(ch); //return the index of first occurance of character
			if (i == index) {
				System.out.println(ch + ":-->" + freq);
			}
		}

	}

	public static void main(String args[]) {
		Count_each_chararcter_string countofeachcharacter = new Count_each_chararcter_string();
		countofeachcharacter.getEachCharacterCount("TechnocreditsNovTitiksha");

	}

}
