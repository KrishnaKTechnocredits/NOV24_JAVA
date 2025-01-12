/*
 * Assignment - 70 : 5th Jan'2025 [IMP]

Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5
 */
package amruta.String;

public class Assign_70_PrintCountOfDigitInEachWord {

	// Loop inside loop
	void printCountOfEachWord(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < arr[index].length(); innerIndex++) {
				if (Character.isDigit(arr[index].charAt(innerIndex)))
					count++;
			}
			System.out.println(arr[index] + " ---> " + count);
		}
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

	void processArray(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int count = returnCountOfDigits(arr[index]);
			System.out.println(arr[index] + " ---> " + count);
		}
	}

	public static void main(String[] args) {
		String str = "2i22 H1ello Techno C2red3i3t4s5";
		new Assign_70_PrintCountOfDigitInEachWord().processArray(str);
		System.out.println("------------------------------------------------");
		new Assign_70_PrintCountOfDigitInEachWord().printCountOfEachWord(str);
	}
}
