package kishor;

public class Assignment34_DigitFreq {
	
	int getFrequency(String str,char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch1 = str.charAt(i);
			if(ch==ch1) {
				count++;
			}
		}
		return count;
	}
	
	void printDigitFreq(String str) {
		for(int k=0;k<str.length();k++) {
			char ch2 = str.charAt(k);
			int index = str.indexOf(ch2);
			if(k==index && Character.isDigit(ch2)) {
				Assignment34_DigitFreq assignment34 = new Assignment34_DigitFreq();
				int ans=assignment34.getFrequency(str, ch2);
				System.out.println(ch2 + "->" +ans);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment34_DigitFreq assignment34 = new Assignment34_DigitFreq();
		assignment34.printDigitFreq("AAB2cBB2BAd2ed3dd");
	}
}
