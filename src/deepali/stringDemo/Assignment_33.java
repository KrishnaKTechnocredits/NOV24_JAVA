package deepali.stringDemo;

//print the frequency of uppercase characters.
//AABcBBBAdeddd
public class Assignment_33 {

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

	void getFrequencyOfUpperCaseCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				int index = str.indexOf(ch);
				if (i == index) {
					int freuency = getCount(str, ch);
					System.out.println("Character count : " + ch + "->" + freuency);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment_33 assignment = new Assignment_33();
		assignment.getFrequencyOfUpperCaseCharacter("AABcBBBAdeddd");
	}

}
