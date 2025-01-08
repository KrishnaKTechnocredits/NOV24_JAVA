/*

 *Assignment - 69 : 5th Jan'2025 [IMP]
Print frequency of each word from given String.

String str = "Hi Hello Hi Hi Hi Techno Credits Techno";

output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1

 */

package rohan;

import java.util.Arrays;

public class Assignment_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_69 assignment = new Assignment_69();
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		assignment.Frequency(str);
	}

	void Frequency(String str) {
		String[] String = str.split(" ");
		// System.out.println(Arrays.toString(String));

		for (int i = 0; i < String.length; i++) {
			String word = String[i];
			int count = 0;
			if (!word.equals("")) {
				for (int j = 0; j < String.length; j++) {
					if (String[j].equals(word)) {
						String[j] = "";
						count++;
					}
				}
				System.out.println(word + "=>" + count);
			}

		}

	}

}
