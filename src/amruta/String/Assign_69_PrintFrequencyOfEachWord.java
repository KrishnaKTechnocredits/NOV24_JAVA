/*
 * Assignment - 69 : 5th Jan'2025 [IMP]
Print frequency of each word from given String.

String str = "Hi Hello Hi Hi Hi Techno Credits Techno";

output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1
 */

package amruta.String;

public class Assign_69_PrintFrequencyOfEachWord {

	// LoopInsideLoop
	void printFrequencyOfWord(String str) {
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			String word = arr[i];
			if (!arr[i].isEmpty()) {
				for (int j = 0; j < arr.length; j++) {
					if (word.equals(arr[j])) {
						count++;
						arr[j] = "";
					}
				}
				System.out.println(word + " -> " + count);
			}
		}
	}

	// Modularized Code Logic
	int returnCount(String[] arr, String word) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].equals(word)) {
				count++;
				arr[index] = "";
			}
		}
		return count;
	}

	void findFrequency(String[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (!arr[index].isEmpty()) {
				System.out.print(arr[index] + " ----> ");
				count = returnCount(arr, arr[index]);
				System.out.println(count);
			}
		}
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		String[] arr = str.split(" ");
		Assign_69_PrintFrequencyOfEachWord a69 = new Assign_69_PrintFrequencyOfEachWord();
		a69.findFrequency(arr);
		System.out.println("--------------------------------------");
		a69.printFrequencyOfWord(str);
	}
}
