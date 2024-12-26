package Assignment_Array;

public class Assignment61 {
	
	String getRevereseString(String str) {
		String reverseString = "";
		for(int i = str.length()-1;i>=0;i--) {
			reverseString += str.charAt(i);
		}
		return reverseString;
	}
	
	void printStringInReverse(String[] str) {
		for(int i = 0;i<str.length;i++) {
			System.out.println(getRevereseString(str[i]));
		}
	}
	
	void printArrayInReverse(String[] str) {
		for(int i = str.length-1;i>=0;i--) {
			System.out.println(getRevereseString(str[i]));
		}
	}

	public static void main(String[] args) {
		String[] input = {"tech", "aashvi", "credits"};
		new Assignment61().printStringInReverse(input);
		
	}
}
