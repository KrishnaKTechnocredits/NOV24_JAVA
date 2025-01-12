package harish.stringdemo;

/**
 * Assignment - 70 : 5th Jan'2025 [IMP]
 * 
 * Print count of digit in each word.
 * 
 * Input : String str = "H2i22 H1ello Techno C2red3i3t4s5";
 * 
 * Output : H2i22 -> 3 H1ello -> 1 Techno -> 0 C2red3i3t4s5 -> 5
 */

public class Assignment70 {

	private int getDigitFrequency(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	private void printDigitCount(String[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i] + " -> " + getDigitFrequency(input[i]));
		}
	}

	public static void main(String[] args) {
		String input = "H2i22 H1ello Techno C2red3i3t4s5";
		System.out.println("Input : " + input);
		String[] inputStringArray = input.split(" ");
		new Assignment70().printDigitCount(inputStringArray);
	}
}