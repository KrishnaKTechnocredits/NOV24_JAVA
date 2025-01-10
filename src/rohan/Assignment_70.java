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

package rohan;

public class Assignment_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_70 assignment = new Assignment_70();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		assignment.StringNumCount(str);

	}

	int CountNumber(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	void StringNumCount(String str) {
		String[] input = str.split(" ");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i] + " -> " + CountNumber(input[i]));
		}
	}
}
