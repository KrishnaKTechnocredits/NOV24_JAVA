package sindhu.stringdemo;

public class DigitInString {
	int count;
	int getDigitInString(String str) {
		for(int i=0; i<= str.length()-1; i++) {
			boolean flag = Character.isDigit(str.charAt(i));
			if(flag == true) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		DigitInString digitInString = new DigitInString();
		int cnt= digitInString.getDigitInString("aa1kan33ks4h5a");
		System.out.println("Total number of digits in given string are "+cnt);
	}
}
