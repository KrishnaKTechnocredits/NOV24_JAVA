package deepali.stringDemo;

//print the frequency of all digit characters.
//AABcBBBAdeddd
public class Assignment_34 {

	int getDigitCount(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			Character chIndex = str.charAt(index);
			if (chIndex == ch) {
				count++;
			}
		}
		return count;
	}

	void getFrequencyOfDighit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int index = str.indexOf(ch);
				if (i == index) {
					int freuency = getDigitCount(str, ch);
					System.out.println("Character count : " + ch + "->" + freuency);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment_34 assignment = new Assignment_34();
		assignment.getFrequencyOfDighit("AAB2cBB2BAd2ed3dd");
	}

}
