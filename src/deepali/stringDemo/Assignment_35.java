package deepali.stringDemo;

//return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
//if both having same freqency then return "same".
public class Assignment_35 {

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

	void getFrequencyOfCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				int index = str.indexOf(ch);
				if (i == index) {
					int upperCaseFreuency = getDigitCount(str, ch);
					System.out.println("Character count : " + ch + "->" + upperCaseFreuency);
				}
				
			}
			if (Character.isLowerCase(ch)) {
				int index = str.indexOf(ch);
				if (i == index) {
					int upperCaseFreuency = getDigitCount(str, ch);
					System.out.println("Character count : " + ch + "->" + upperCaseFreuency);
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		Assignment_35 assignment = new Assignment_35();
		assignment.getFrequencyOfCharacter("teChnOcreDits");
	}

}
