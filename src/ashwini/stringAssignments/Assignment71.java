package ashwini.stringAssignments;

/*
 Assignment - 71 : 5th Jan'2025 [IMP]

return the word having highest digits in the given String .
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : C2red3i3t4s5

 */
public class Assignment71 {
	int getTotalDigitInWord(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char singleword = word.charAt(i);
			if (Character.isDigit(singleword)) {
				count++;
			}
		}
		return count;
	}

	String getHighestDigitCountWord(String input) {
		String[] arr = input.split(" ");
		int maxCount = 0;
		String maxString = "";
		for (int index = 0; index < arr.length; index++) {
			int count = getTotalDigitInWord(arr[index]);
			if (maxCount < count) {
				maxCount = count;
				maxString = arr[index];
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		Assignment71 a71 = new Assignment71();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		String highestDigitWord = a71.getHighestDigitCountWord(str);
		System.out.println(highestDigitWord);
	}
}
