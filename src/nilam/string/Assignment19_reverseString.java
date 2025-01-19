package nilam.string;

public class Assignment19_reverseString {
	
	void printReverseString(String str) {	
		for(int index=(str.length()-1);index>=0;index--) {
			System.out.print(str.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		String str="Technocredits";
		new Assignment19_reverseString().printReverseString(str);
	}
}
