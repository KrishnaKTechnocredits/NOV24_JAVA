package nilam.CharacterClassMethods;

//write a method to return total number of digits from the given input.
public class Assignment22 {

	int printDigitCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		int count = assignment22.printDigitCount("aa1kan33ks4h5a");
		System.out.println("Total " + count + " digits are there in given input.");
	}
}
