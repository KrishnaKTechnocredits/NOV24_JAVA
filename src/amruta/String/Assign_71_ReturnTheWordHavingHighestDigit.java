/*
 * Assignment - 71 : 5th Jan'2025 [IMP]

return the word having highest digits in the given String .
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : C2red3i3t4s5
 */
package amruta.String;

public class Assign_71_ReturnTheWordHavingHighestDigit {

	// Loop inside loop
	void printCountOfEachWord(String str) {
		String[] arr = str.split(" ");
		int maxCount = 0;
		String maxDigitWord = "";
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < arr[index].length(); innerIndex++) {
				if (Character.isDigit(arr[index].charAt(innerIndex)))
					count++;
			}
			if (count >= maxCount) {
				maxCount = count;
				maxDigitWord = arr[index];
			}

			System.out.println(arr[index] + " ---> " + count);
		}

		System.out.println("\nString having maximum digit is " + " ---> " + maxDigitWord + " ---> " + maxCount);
	}

	// Modularized Code Logic
	int returnCountOfDigits(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				count++;
		}
		return count;
	}

	String processArray(String str) {
		String[] arr = str.split(" ");
		int maxCount = 0;
		String maxDigitWord = "";
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			count = returnCountOfDigits(arr[index]);
			if (count >= maxCount) {
				maxCount = count;
				maxDigitWord = arr[index];
			}
		}
		return maxDigitWord;
	}

	public static void main(String[] args) {
		String str = "2i22 H1ello Techno C2red3i3t4s5";
		Assign_71_ReturnTheWordHavingHighestDigit a71 = new Assign_71_ReturnTheWordHavingHighestDigit();
		System.out.println("------------------------------------------------------------");
		a71.printCountOfEachWord(str);
		System.out.println("------------------------------------------------------------");
		String word = a71.processArray(str);
		System.out.println("String having max digits is --> " + word);
	}
}
