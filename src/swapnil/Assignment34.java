package swapnil;

public class Assignment34 {
	void getFreqChar(String str) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
			 if(str.indexOf(ch)==i) {
				 int count= digitcase(str,ch);
		  System.out.println(ch+"->"+count);
			 }
			}
		}
	}

	int digitcase(String str,char ch) {
		int count = 0;
		for(int j=0;j<str.length();j++) {
			if (str.charAt(j)==ch){
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		assignment34.getFreqChar("AAB2cBB2BAd2ed3dd");

	}
}

