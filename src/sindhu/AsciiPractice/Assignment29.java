//write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).

package sindhu.AsciiPractice;

public class Assignment29 {
	
	void getAsciiData(char ch) {
		int asciiVal = ch;
		System.out.println(ch +"->"+ asciiVal);
	}
	
	public static void main(String[] args) {
		Assignment29 assign29 = new Assignment29();
		System.out.println("Below are the Ascii values for the given characters :");
		for(char ch = 'A'; ch<='Z'; ch++) {
			assign29.getAsciiData(ch);
		}
		System.out.println(" ");
		for(char ch = 'a'; ch<='z'; ch++) {
			assign29.getAsciiData(ch);
		}
		System.out.println(" ");
		for(char ch = '0'; ch<='9'; ch++) {
			assign29.getAsciiData(ch);
		}
		
	}
}
