package anuja.string;

/*get frequency of all digit*/
public class Assignment34 {

	public void getFreqOfAllChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}

		}
		System.out.println(ch + " --> " + count);
		//return count;// get frequency
	}

	public void printFreqOfAllDigits(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(str.charAt(i)) && i == str.indexOf(ch)) {
				getFreqOfAllChar(str, ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		String input = "AAB2cBB2BAd2ed3dd";
		assignment34.printFreqOfAllDigits(input);
	}

}
