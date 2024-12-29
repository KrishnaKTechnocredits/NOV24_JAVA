package deepali.stringDemo;
//print the freq of each character.
//input : aakanksha
public class Assignment_32 {

	int getCount(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			Character chIndex = str.charAt(index);
			if (chIndex == ch) {
				count++;
			}
		}
		return count;
	}

	void getFrequencyOfCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			if (i == index) {
				int freuency = getCount(str, ch);
				System.out.println("Character count : " + ch + "->" + freuency);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_32 assignment = new Assignment_32();
		assignment.getFrequencyOfCharacter("aakanksha");
	}

}
