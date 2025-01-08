/*Assignment - 71 : 5th Jan'2025 [IMP]

return the word having highest digits in the given String .
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : C2red3i3t4s5*/

package pankaj;

public class Assignment71 {

	int getCountFromWord(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	void printResult(String str) {
		String[] arr = str.split(" ");
		int MaxCount = 0;
		String word = "";
		for (int i = 0; i < arr.length; i++) {

			int getDigit = getCountFromWord(arr[i]);
			if (MaxCount < getDigit) {
				MaxCount = getDigit;
				word = arr[i];
			}

		}
		System.out.println(word + " " + MaxCount);

	}

	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		Assignment71 A = new Assignment71();
		A.printResult(str);
		// System.out.println();

	}
}
