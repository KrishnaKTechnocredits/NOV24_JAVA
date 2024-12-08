package krishna;

public class Assignment34 {
	
	int getDigitFreq(String str , char ch) {
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)== ch) {
				count++;
			}
		}
		return count;
	}

	void processData(String str) {
		for(int i = 0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i)) == i) {
				if(Character.isDigit(str.charAt(i))) {
					System.out.println("freq of digit " + str.charAt(i) + " in given string is : " + getDigitFreq(str, str.charAt(i)));
				}
			}
		}
	}

	public static void main(String[] args) {
		new Assignment34().processData("AAA11BB2222CCC");
	}
}
