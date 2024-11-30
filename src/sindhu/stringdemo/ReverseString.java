//Print all the characters of given string in reverse order. 

package sindhu.stringdemo;

public class ReverseString {
	void revString(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
	}
		
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.revString("te ch3no");
	}
}
