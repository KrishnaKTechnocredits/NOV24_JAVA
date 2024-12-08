package ravindra;

public class FrequencyOfDigitInCharecter {
	int count(String input,char ch) {
		int countOFDigit=0;
		for(int i=0;i<input.length();i++) {
		char ch1=input.charAt(i);
		if(ch1==ch) {
			if(Character.isDigit(ch1)) {
				countOFDigit++;
			}
		}
		}return countOFDigit;
	}
	
	void PrintFrequencyOfDigit(String input) {
		for(int index=0;index<input.length();index++) {
			char ch2=input.charAt(index);
			int ch3 = input.indexOf(ch2);
			if(index==ch3 && Character.isDigit(ch2)) {
				int s=count(input, ch2);
				System.out.println(ch2+"->"+s);
			}
		}
	}
		
	public static void main(String[] args) {
		String input="AAB2cBB2BAd2ed3dd";
		FrequencyOfDigitInCharecter frequencyOfDigitInCharecter=new FrequencyOfDigitInCharecter();
		frequencyOfDigitInCharecter.PrintFrequencyOfDigit(input);
	}
}
