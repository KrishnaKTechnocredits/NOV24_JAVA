package rohan;

public class Assignment34 {

	public static void main(String[] args) {
		Assignment34 assignment = new Assignment34();
		assignment.CountDigitFrequency("AAB2cBB2BAd2ed3dd");
	}
	int DigitCount(String str , char ch) {
		int count =0;
		for(int i=0 ;i<str.length();i++) {
			char A = str.charAt(i);
			if(A==ch) {
				count++;
			}
		}
		return count;
	}
	void CountDigitFrequency(String str) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch) && str.indexOf(ch)==i) {
				System.out.println(ch+"->"+DigitCount(str, ch));
			}
		}
	}
	
}
