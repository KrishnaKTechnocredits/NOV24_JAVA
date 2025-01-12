package kavita;
/*return the word having highest digits in the given String .
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : C2red3i3t4s5
Time:12m*/
public class Assignment71 {
	void getHighestNumberOfDigitString(String str) {
		String[] words = str.split(" ");
		String maxDigitString = "";
		int maxCount = 0;

		for (int i = 0; i < words.length; i++) {
			String singleWord = words[i];
			int digitCount = 0;

			for (int j = 0; j < words[i].length(); j++) {
				if (Character.isDigit(words[i].charAt(j))) {
					digitCount++;
				}
			}

			if (digitCount > maxCount) {
				maxCount = digitCount;
				maxDigitString = singleWord;
			}

		}

		System.out.println(maxDigitString + " -- > " + maxCount);
	}

	public static void main(String[] args) {
		Assignment71 assignment71 = new Assignment71();
		String input = "H2i22 H1ello Techno C2red3i3t4s5";
		System.out.println("Input String is: "  +input);
		System.out.println("-----------------------------------------");
		assignment71.getHighestNumberOfDigitString(input);
	}
}
