/*print the frequency of all digit characters.
 * String: AAB2cBB2BAd2ed3dd*/

package sindhu.StringAssignment;

public class Assignment34 {
	
	void getFreqOfDigit(String st, char c) {
		int count=0;
		for(int j=0; j<st.length(); j++) {
			char curntChar = st.charAt(j);
			if(curntChar == c ) {
				if(Character.isDigit(curntChar)) {
					count++;
				}else {
					return;
				}
			}
		}
		System.out.println("Frequency of digit "+c+" in the string is "+count);
	}

	void callGetFreqOfDigit(String strng) {
		for(int i=0; i<strng.length(); i++) {
			char ch = strng.charAt(i);
			if(i==strng.indexOf(ch)) {
				getFreqOfDigit(strng,ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment34 assign34 = new Assignment34();
		String str = "AAB2cBB2BAd2ed3dd";
		assign34.callGetFreqOfDigit(str);
	}
}
