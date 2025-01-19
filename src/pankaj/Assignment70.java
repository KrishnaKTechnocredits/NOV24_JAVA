/*   Assignment - 70 : 5th Jan'2025 [IMP]

Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5 */

package pankaj;

public class Assignment70 {

	int getCount(String word) {

		int count = 0;
		for (int i = 0; i < word.length(); i++) {

			char ch = word.charAt(i);

			if (Character.isDigit(ch)) {

				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		Assignment70 A = new Assignment70();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		String[] strOne = str.split(" ");
		for (int i = 0; i < strOne.length; i++) {
			int digitCount = A.getCount(strOne[i]);
			System.out.println(strOne[i] + "::" + digitCount);
		}

	}

}
